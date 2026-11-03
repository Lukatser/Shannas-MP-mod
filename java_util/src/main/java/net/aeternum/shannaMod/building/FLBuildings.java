package net.aeternum.shannaMod.building;

import net.aeternum.shannaMod.Config;
import net.aeternum.shannaMod.generation.BinLookupGenerator;
import net.aeternum.shannaMod.generation.ScaledModifierGenerator;
import net.aeternum.shannaMod.parsing.EventModifier;
import net.aeternum.shannaMod.parsing.Modifier;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NonNull;
import org.w3c.dom.events.Event;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FLBuildings {
    static void main() {
        FLBuildings flb = fromDefaultConfig()
                .setBuildingModifier(new String[]{"regimental_camp", "conscription_center"}, "land_forcelimit")
                .buildModifiers(4, 0.05, 5)
                .writeModifiers()
                .writeLogic();
        flb.setBuildingModifier(new String[]{"shipyard", "grand_shipyard"}, "naval_force_limit")
                .buildModifiers(4, 0.10, 5)
                .writeModifiers()
                .writeLogic();
    }


    private final Path modifierPath;
    private final Path logicPath;

    @NonNull
    private final Config cfg;
    @NonNull
    private String[] buildings;
    @NonNull
    private String modifier = "";

    private Map<Double, EventModifier> modifierMap;
    private int stepSize;
    private final long fileValue = (System.currentTimeMillis() * this.hashCode());

    public FLBuildings(@NonNull Config cfg) {
        this.cfg = cfg;

        modifierPath = cfg.eventModifiersPath().resolve("aet_flBuildings_scaledModifiers.generated.txt");
        logicPath = cfg.logicPath().resolve("aet_flBuildings.generated.txt");
    }

    @Contract(" -> new")
    public static @NonNull FLBuildings fromDefaultConfig() {
        return new FLBuildings(Config.readDefaultConfig());
    }

    public FLBuildings setBuildingModifier(String[] buildings, String modifier) {
        if(buildings == null || buildings.length != 2 || modifier == null) throw new IllegalArgumentException();
        this.buildings = buildings;
        this.modifier = modifier;
        return this;
    }

    public FLBuildings buildModifiers(int bitwidth, double flPerDevelopment, int stepSize) {
        cfg.checkBitWidth(bitwidth, FLBuildings.class);
        this.stepSize = stepSize;

        EventModifier em = new EventModifier("aet_flBuildings_" + modifier,
                new ArrayList<>(List.of(new Modifier(modifier, flPerDevelopment)))
        );
        List<Double> modifiers = new ArrayList<>();
        for(int i = 1; i < (1 << bitwidth); i++) {
            modifiers.add((double) i * stepSize);
        }

        ScaledModifierGenerator gen = ScaledModifierGenerator.fromConfig();
        modifierMap = gen.scaleModifiers(new EventModifier[]{em},
                modifiers, ScaledModifierGenerator.SIMPLE).entrySet().stream().map(e -> Map.entry(e.getKey(), e.getValue().getFirst()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return this;
    }

    public FLBuildings writeModifiers() {
        potentialAppendWrite(modifierPath, (writer) -> {
            try {
                List<EventModifier> combined = new ArrayList<>(modifierMap.values());
                combined.sort(EventModifier::compareTo);

                for (EventModifier modifier : combined) {
                    writer.write(asT0(modifier) + "\n");
                    writer.write(asT1(modifier) + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        return this;
    }

    public FLBuildings writeLogic() {
        StringBuilder sb = new StringBuilder();
        sb.append("aet_flBuildings_refresh_").append(modifier).append(" = {\n");

        BinLookupGenerator blg = new BinLookupGenerator(cfg);
        String table = blg.generate(
                new BinLookupGenerator.ValueInjection(){
                    @Override
                    public String genTriggerBlock(Double value, int depth) {
                        return "development = " + value.intValue() + "\n";
                    }

                    @Override
                    public String genEffectBlock(Double value, int depth) {
                        String effectBlock = """
                                if = {
                                    limit = {
                                        has_building = %s
                                    }
                                
                                    add_province_modifier = {
                                        name = %s
                                        duration = -1
                                        hidden = yes
                                    }
                                
                                    remove_province_modifier = %s
                                    remove_province_modifier = %s
                                    remove_province_modifier = %s
                                } else_if = {
                                    limit = {
                                        has_building = %s
                                    }
                                
                                    add_province_modifier = {
                                        name = %s
                                        duration = -1
                                        hidden = yes
                                    }
                                
                                    remove_province_modifier = %s
                                    remove_province_modifier = %s
                                    remove_province_modifier = %s
                                } else = {
                                    aet_flBuildings_%s_removeAllModifiers = yes
                                }"""
                                .formatted(
                                        buildings[0],
                                        asT0(modifierMap.get(value)).name(),
                                        asT0(modifierMap.get(value - stepSize)).name(),
                                        asT0(modifierMap.get(value + stepSize)).name(),
                                        asT1(modifierMap.get(value)).name(),

                                        buildings[1],
                                        asT1(modifierMap.get(value)).name(),
                                        asT1(modifierMap.get(value - stepSize)).name(),
                                        asT1(modifierMap.get(value + stepSize)).name(),
                                        asT0(modifierMap.get(value)).name(),

                                        modifier
                                )
                                .replace("    ", cfg.indent());

                        String[] lines = effectBlock.split("\n");
                        for(int i = 1; i < lines.length; i++) lines[i] = cfg.indent(depth) + lines[i];

                        return String.join("\n", lines) + "\n";
                    }
                }, new ArrayList<>(modifierMap.keySet().stream().sorted().toList())
        );

        String[] lines = table.split("\n");
        for(int i = 0; i < lines.length; i++) lines[i] = cfg.indent() + lines[i];
        sb.append(String.join("\n", lines));
        sb.append("\n}\n");

        sb.append("aet_flBuildings_").append(modifier).append("_removeAllModifiers = {\n");
        for(EventModifier em : modifierMap.values().stream().sorted().toList()) {
            sb.append(cfg.indent()).append("remove_province_modifier = ").append(asT0(em).name()).append("\n");
            sb.append(cfg.indent()).append("remove_province_modifier = ").append(asT1(em).name()).append("\n");
        }
        sb.append("}\n");

        String write = sb.toString();
        potentialAppendWrite(logicPath, (writer) -> {
            try {
                writer.write(write);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        return this;
    }

    private void potentialAppendWrite(Path path, Consumer<BufferedWriter> writeOperation) {
        boolean keepExisting = false;
        try {
            String firstLine = Files.readString(path);
            firstLine = firstLine.split("\n")[0].trim();
            long firstLineCode = Long.parseLong(firstLine.substring(1));
            keepExisting = firstLineCode == fileValue;
        } catch (Exception _) {}

        try(BufferedWriter writer = keepExisting ? Files.newBufferedWriter(path, StandardOpenOption.APPEND) : Files.newBufferedWriter(path)) {
            if(!keepExisting) writer.write("#" + fileValue + "\n");
            writeOperation.accept(writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Contract("_ -> new")
    private @NonNull EventModifier asT0(EventModifier modifier) {
        if(modifier == null) return EventModifier.NULLMODIFIER;
        return new EventModifier(modifier.name() + "_T0", modifier.modifiers());
    }

    @Contract("_ -> new")
    private @NonNull EventModifier asT1(EventModifier modifier) {
        if(modifier == null) return EventModifier.NULLMODIFIER;
        return new EventModifier(modifier.name() + "_T1", modifier.modifiers()).scale(2.0);
    }
}

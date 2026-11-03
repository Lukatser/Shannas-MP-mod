package net.aeternum.shannaMod.building;

import net.aeternum.shannaMod.Config;
import net.aeternum.shannaMod.generation.ScaledModifierGenerator;
import net.aeternum.shannaMod.parsing.EventModifier;
import net.aeternum.shannaMod.parsing.Modifier;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FLBuildings {
    static void main() {
        FLBuildings flb = fromDefaultConfig();
        flb.setBuildingModifier(new String[]{"building_one", "building_two"}, "force_limit");
        flb.buildModifiers(4, 0.05, 5);
    }


    @NonNull
    private final Config cfg;
    @NonNull
    private String[] buildings;
    @NonNull
    private String modifier = "";

    private Map<Double, EventModifier> modifierMap;

    public FLBuildings(@NonNull Config cfg) {
        this.cfg = cfg;
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
        return this;
    }

    public FLBuildings writeLogic() {
        return this;
    }
}

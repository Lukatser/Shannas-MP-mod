package net.aeternum.shannaMod;

import net.aeternum.shannaMod.building.eliteGuards.EliteGuardsBuffMultiplierBuilder;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    static void main() {
        EliteGuardsBuffMultiplierBuilder builder = new EliteGuardsBuffMultiplierBuilder(5)
                .generateScaledModifiers()
                .writeScaledModifiers()
                .writeLogic();
    }
}

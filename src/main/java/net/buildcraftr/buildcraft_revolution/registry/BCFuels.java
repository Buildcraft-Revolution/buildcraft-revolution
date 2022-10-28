package net.buildcraftr.buildcraft_revolution.registry;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static net.buildcraftr.buildcraft_revolution.registry.BCItems.BC_GEAR_WOOD;

public class BCFuels {
    public static void registerModFuels() {
        BuildcraftRevolution.LOGGER.info("Registering Fuels for " + BuildcraftRevolution.MOD_ID);
        FuelRegistry.INSTANCE.add(BC_GEAR_WOOD, 100);
    }
}

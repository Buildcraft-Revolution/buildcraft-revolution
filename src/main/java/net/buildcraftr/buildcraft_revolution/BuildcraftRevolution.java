package net.buildcraftr.buildcraft_revolution;

import net.buildcraftr.buildcraft_revolution.registry.BCFluids;
import net.buildcraftr.buildcraft_revolution.registry.BCBlocks;
import net.buildcraftr.buildcraft_revolution.registry.BCItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildcraftRevolution implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("BuildCraftRevolution");
	public static final String MOD_ID = "buildcraft_revolution";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		BCFluids.registerModFluids();
		BCBlocks.registerModBlocks();
		BCItems.register();
		LOGGER.info("Hello Fabric world!");
	}
}

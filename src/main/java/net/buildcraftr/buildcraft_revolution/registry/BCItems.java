package net.buildcraftr.buildcraft_revolution.registry;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCItems {

    public static void register()
    {
        BuildcraftRevolution.LOGGER.info("Registering Items for " + BuildcraftRevolution.MOD_ID);
    }

    private static Item registerItem(String name, Item item) {
        BuildcraftRevolution.LOGGER.info("registerBlock");
        return Registry.register(Registry.ITEM, new Identifier(BuildcraftRevolution.MOD_ID, name), item);
    }
}

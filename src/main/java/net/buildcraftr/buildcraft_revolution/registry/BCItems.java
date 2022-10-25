package net.buildcraftr.buildcraft_revolution.registry;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.buildcraftr.buildcraft_revolution.items.GearWood;
import net.buildcraftr.buildcraft_revolution.items.Wrench;
import net.buildcraftr.buildcraft_revolution.tab.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCItems {

    public static final Item BC_GEAR_WOOD = registerItem("gear_wood", new GearWood(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_STONE = registerItem("gear_stone", new GearWood(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_IRON = registerItem("gear_iron", new GearWood(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_GOLD = registerItem("gear_gold", new GearWood(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_DIAMOND = registerItem("gear_diamond", new GearWood(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));

    public static final Item BC_WRENCH = registerItem("wrench", new Wrench(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));

    public static void registerModItems()
    {
        BuildcraftRevolution.LOGGER.info("Registering Items for " + BuildcraftRevolution.MOD_ID);
    }

    private static Item registerItem(String name, Item item) {
        BuildcraftRevolution.LOGGER.info("registerBlock");
        return Registry.register(Registry.ITEM, new Identifier(BuildcraftRevolution.MOD_ID, name), item);
    }
}

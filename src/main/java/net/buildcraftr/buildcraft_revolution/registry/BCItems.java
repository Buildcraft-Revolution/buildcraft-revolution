package net.buildcraftr.buildcraft_revolution.registry;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.buildcraftr.buildcraft_revolution.items.*;
import net.buildcraftr.buildcraft_revolution.items.Chipset.*;
import net.buildcraftr.buildcraft_revolution.items.Gear.*;
import net.buildcraftr.buildcraft_revolution.items.Paintbrush.*;
import net.buildcraftr.buildcraft_revolution.tab.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCItems {

    // Register Items -------------------------------------------------------------
    //Misc
    public static final Item BC_WRENCH = registerItem("wrench", new Wrench(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PIPE_SEALANT = registerItem("pipe_sealant", new PipeSealant(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    //Gear
    public static final Item BC_GEAR_WOOD = registerItem("gear_wood", new GearWood(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_STONE = registerItem("gear_stone", new GearStone(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_IRON = registerItem("gear_iron", new GearIron(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_GOLD = registerItem("gear_gold", new GearGold(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_GEAR_DIAMOND = registerItem("gear_diamond", new GearDiamond(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    //Paintbrush
    public static final Item BC_PAINTBRUSH_CLEAN = registerItem("paintbrush_clean", new PaintbrushClean(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_WHITE = registerItem("paintbrush_white", new PaintbrushWhite(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_ORANGE = registerItem("paintbrush_orange", new PaintbrushOrange(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_MAGENTA = registerItem("paintbrush_magenta", new PaintbrushMagenta(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_LIGHT_BLUE = registerItem("paintbrush_lightblue", new PaintbrushLightBlue(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_YELLOW = registerItem("paintbrush_yellow", new PaintbrushYellow(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_LIME = registerItem("paintbrush_lime", new PaintbrushLime(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_PINK = registerItem("paintbrush_pink", new PaintbrushPink(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_GRAY = registerItem("paintbrush_gray", new PaintbrushGray(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_LIGHT_GRAY = registerItem("paintbrush_lightgray", new PaintbrushLightGray(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_CYAN = registerItem("paintbrush_cyan", new PaintbrushCyan(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_PURPLE = registerItem("paintbrush_purple", new PaintbrushPurple(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_BLUE = registerItem("paintbrush_blue", new PaintbrushBlue(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_BROWN = registerItem("paintbrush_brown", new PaintbrushBrown(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_GREEN = registerItem("paintbrush_green", new PaintbrushGreen(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_RED = registerItem("paintbrush_red", new PaintbrushRed(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    public static final Item BC_PAINTBRUSH_BLACK = registerItem("paintbrush_black", new PaintbrushBlack(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).maxCount(1)));
    //Chipset
    public static final Item BC_CHIPSET_REDSTONE = registerItem("chipset_redstone", new ChipsetRedstone(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_CHIPSET_IRON = registerItem("chipset_iron", new ChipsetIron(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_CHIPSET_GOLD = registerItem("chipset_gold", new ChipsetGold(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_CHIPSET_QUARTZ = registerItem("chipset_quartz", new ChipsetQuartz(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    public static final Item BC_CHIPSET_DIAMOND = registerItem("chipset_diamond", new ChipsetDiamond(new FabricItemSettings().group(CreativeTabs.TAB_ITEMS)));
    // [] --------------------------------------------------------------------- []

    public static void registerModItems()
    {
        BuildcraftRevolution.LOGGER.info("Registering Items for " + BuildcraftRevolution.MOD_ID);
    }

    private static Item registerItem(String name, Item item) {
        BuildcraftRevolution.LOGGER.info("registerBlock");
        return Registry.register(Registry.ITEM, new Identifier(BuildcraftRevolution.MOD_ID, name), item);
    }
}

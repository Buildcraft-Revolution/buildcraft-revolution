package net.buildcraftr.buildcraft_revolution.registry;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.buildcraftr.buildcraft_revolution.blocks.OilFluidBlock;
import net.buildcraftr.buildcraft_revolution.blocks.PumpBlock;
import net.buildcraftr.buildcraft_revolution.blocks.QuarryBlock;
import net.buildcraftr.buildcraft_revolution.tab.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCBlocks{

    //Quarry
    public static final Block BC_QUARRY = registerBlock("quarry", new QuarryBlock(), CreativeTabs.TAB_BLOCKS);
    public static final Block BC_PUMP = registerBlock("pump", new PumpBlock(), CreativeTabs.TAB_BLOCKS);
    public static final Block BC_OIL_BLOCK = registerBlock("oil", new OilFluidBlock(BCFluids.STILL_BC_OIL, FabricBlockSettings.copy(Blocks.WATER)), CreativeTabs.TAB_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        BuildcraftRevolution.LOGGER.info("registerBlock");
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BuildcraftRevolution.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        BuildcraftRevolution.LOGGER.info("registerBlockItem");
        return Registry.register(Registry.ITEM, new Identifier(BuildcraftRevolution.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        BuildcraftRevolution.LOGGER.info("Registering ModBlocks for " + BuildcraftRevolution.MOD_ID);
    }

//    public static Block registerBlock(ResourceLocation id, Block block) {
//        if (!Configs.BLOCK_CONFIG.getBooleanRoot(id.getPath(), true)) {
//            return block;
//        }
//        getBlockRegistry().register(id, block);
//        return block;
//    }

//    @SafeVarargs
//    public static Block registerBlock(String name, Block block, TagKey<Block>... tags) {
//        BuildcraftRevolution.LOGGER.info("registerBlock");
//        if (Configs.BLOCK_CONFIG.getBoolean("blocks", name, true)) {
//            BuildcraftRevolution.LOGGER.info("registerBlock true");
//            registerBlockDirectly(name, block);
//            if (tags.length > 0) {
//                BuildcraftRevolution.LOGGER.info("TagManager add");
//                TagManager.BLOCKS.add(block, tags);
//            }
//        }
//        return block;
//    }

//    public static void registerBlockDirectly(String name, Block block) {
//        registerBlock(name, block, true);
//        BuildcraftRevolution.LOGGER.info("registerBlockDirectly");
//    }

//    @SafeVarargs
//    private static <B extends Block> B registerBlock(String name, B block, boolean hasItem, TagKey<Block>... tags) {
//        final BlockRegistry blockRegistry = getBlockRegistry();
//        final ResourceLocation location = new ResourceLocation(BuildcraftRevolution.MOD_ID, name);
//        if (hasItem) {
//            blockRegistry.register(location, block);
//        } else {
//            blockRegistry.registerBlockOnly(location, block);
//        }
//        if (tags.length > 0) {
//            TagManager.BLOCKS.add(block, tags);
//        }
//        return block;
//    }
}

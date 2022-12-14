package net.buildcraftr.buildcraft_revolution.registry;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.buildcraftr.buildcraft_revolution.blocks.OilFluidBlock;
import net.buildcraftr.buildcraft_revolution.fluid.OilFluid;
import net.buildcraftr.buildcraft_revolution.tab.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCFluids {

    public static FlowableFluid STILL_BC_OIL;
    public static FlowableFluid FLOWING_BC_OIL;
    public static Block BC_OIL_BLOCK;
    public static Item BC_OIL_BUCKET;

    public static void registerModFluids(){
        BuildcraftRevolution.LOGGER.info("Registering Fluids for " + BuildcraftRevolution.MOD_ID);
        //Fluids
        STILL_BC_OIL = Registry.register(Registry.FLUID,
                new Identifier(BuildcraftRevolution.MOD_ID, "oil"), new OilFluid.Still());
        FLOWING_BC_OIL = Registry.register(Registry.FLUID,
                new Identifier(BuildcraftRevolution.MOD_ID, "oil_flow"), new OilFluid.Flowing());

        //Blocks
        BC_OIL_BLOCK = Registry.register(Registry.BLOCK,
                new Identifier(BuildcraftRevolution.MOD_ID,"oil_block"), new OilFluidBlock(STILL_BC_OIL, FabricBlockSettings.copy(Blocks.WATER)){});
        //Buckets
        BC_OIL_BUCKET = Registry.register(Registry.ITEM, new Identifier(BuildcraftRevolution.MOD_ID, "oil_bucket"),
                new BucketItem(BCFluids.STILL_BC_OIL, new FabricItemSettings().group(CreativeTabs.TAB_ITEMS).recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}

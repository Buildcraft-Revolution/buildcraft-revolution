package net.buildcraftr.buildcraft_revolution.tab;
import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.buildcraftr.buildcraft_revolution.registry.BCItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.stream.Collectors;

public class CreativeTabs {
    public static final ItemGroup TAB_BLOCKS;
    public static final ItemGroup TAB_ITEMS;

    static {
        TAB_BLOCKS = FabricItemGroupBuilder.build(new Identifier(BuildcraftRevolution.MOD_ID,
                "bcblocks"), () -> new ItemStack(Blocks.ANVIL));
        TAB_ITEMS = FabricItemGroupBuilder.build(new Identifier(BuildcraftRevolution.MOD_ID,
                "bcitems"), () -> new ItemStack(BCItems.BC_WRENCH));

    }

}

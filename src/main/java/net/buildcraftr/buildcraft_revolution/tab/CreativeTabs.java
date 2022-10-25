package net.buildcraftr.buildcraft_revolution.tab;
import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.stream.Collectors;

public class CreativeTabs {
    public static final ItemGroup TAB_BLOCKS;
    //public static final ItemGroup TAB_ITEMS = null;

    static {
        TAB_BLOCKS = FabricItemGroupBuilder.build(new Identifier(BuildcraftRevolution.MOD_ID,
                "bcblocks"), () -> new ItemStack(Blocks.ANVIL));

    }

}

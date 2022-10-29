package net.buildcraftr.buildcraft_revolution.blocks;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class TubeBlock extends Block {

    private final Block PARENT_BLOCK;

    public TubeBlock(Block parent) {
        super(FabricBlockSettings
                .of(Material.METAL)
                .hardness(1f)
                .resistance(10F)
                .mapColor(DyeColor.BLACK)
                .sounds(BlockSoundGroup.ANVIL)
        );
        this.PARENT_BLOCK = parent;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(4, 0, 4, 12, 16, 12);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        if (parentBlockExists(world, pos) && !world.isClient) {
            BuildcraftRevolution.LOGGER.info("block not destroyed");
            world.setBlockState(pos, state);
            BuildcraftRevolution.LOGGER.info(world.getBlockState(pos) + "");
        }
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
        if (parentBlockExists(world, pos) && !world.isClient()) {
            BuildcraftRevolution.LOGGER.info("block not destroyed");
            world.setBlockState(pos, state, Block.NOTIFY_NEIGHBORS);
            BuildcraftRevolution.LOGGER.info(world.getBlockState(pos) + "");
        }
    }

    public boolean parentBlockExists(WorldAccess world, BlockPos pos) {
        BlockPos i = pos.up();
        while (world.getBlockState(i).isOf(this)) {
            i = i.up();
        }
        return world.getBlockState(i).isOf(PARENT_BLOCK);
    }

}

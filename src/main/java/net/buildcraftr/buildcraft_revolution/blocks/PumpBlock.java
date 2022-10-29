package net.buildcraftr.buildcraft_revolution.blocks;

import net.buildcraftr.buildcraft_revolution.BuildcraftRevolution;
import net.buildcraftr.buildcraft_revolution.registry.BCBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class PumpBlock extends HorizontalFacingBlock {

    public PumpBlock() {
        super(FabricBlockSettings
                .of(Material.METAL)
                .hardness(10f)
                .resistance(10F)
                .requiresTool()
                .mapColor(DyeColor.BLACK)
                .sounds(BlockSoundGroup.ANVIL)
        );
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
        if (sourceBlock != BCBlocks.BC_PUMP_TUBE) {
            if (world.isReceivingRedstonePower(pos) && !world.isClient) {
                createTube(world, pos);
            } else {
                removeTube(world, pos);
            }
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        if (!world.isClient) {
            removeTube(world, pos);
        }
    }

    public static void createTube(World world, BlockPos pos) {
        BlockPos i = pos;
        BuildcraftRevolution.LOGGER.info("creating tube");
        while (world.getBlockState(i.down()).isOf(Blocks.AIR)) {
            world.setBlockState(i.down(), BCBlocks.BC_PUMP_TUBE.getDefaultState());
            i = i.down();
        }
    }

    public static void removeTube(World world, BlockPos pos) {
        BlockPos i = pos;
        BuildcraftRevolution.LOGGER.info("removing tube");
        while (world.getBlockState(i.down()).isOf(BCBlocks.BC_PUMP_TUBE)) {
            world.breakBlock(i.down(), false);
            i = i.down();
        }
    }

    public static void extendTube(World world, BlockPos pos) {
        int i = 1;
        while (world.getBlockState(pos.add(0, -i, 0)).isOf(BCBlocks.BC_PUMP_TUBE)) {
            i++;
        }
        world.setBlockState(pos.add(0, -i, 0), BCBlocks.BC_PUMP_TUBE.getDefaultState());
    }

}

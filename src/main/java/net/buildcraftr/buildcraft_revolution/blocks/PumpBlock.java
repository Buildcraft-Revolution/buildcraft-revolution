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
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
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
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        super.onUse(state, world, pos, player, hand, hit);
        if (hand == Hand.MAIN_HAND && !world.isClient) {
            BuildcraftRevolution.LOGGER.info("extending tube");
            createTube(state, world, pos);
        }
        return ActionResult.SUCCESS;
    }

    public static void createTube(BlockState state, World world, BlockPos pos) {
        int i = 1;
        while (world.getBlockState(pos.add(0, -i, 0)).isOf(Blocks.AIR)) {
            world.setBlockState(pos.add(0, -i, 0), BCBlocks.BC_PUMP_TUBE.getDefaultState());
            i++;
        }
    }

    public static void extendTube(BlockState state, World world, BlockPos pos) {
        int i = 1;
        while (world.getBlockState(pos.add(0, -i, 0)).isOf(BCBlocks.BC_PUMP_TUBE)) {
            i++;
        }
        world.setBlockState(pos.add(0, -i, 0), BCBlocks.BC_PUMP_TUBE.getDefaultState());
    }

}

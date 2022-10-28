package net.buildcraftr.buildcraft_revolution.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class OilFluidBlock extends FluidBlock {

    public OilFluidBlock(FlowableFluid fluid, Settings settings){
        super(fluid, settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if(entity instanceof LivingEntity) {
            entity.slowMovement(state, new Vec3d(0.3f, 0.4f, 0.3f));
        }
    }
}

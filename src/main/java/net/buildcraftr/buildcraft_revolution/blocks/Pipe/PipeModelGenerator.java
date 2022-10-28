package net.buildcraftr.buildcraft_revolution.blocks.Pipe;

import net.buildcraftr.buildcraft_revolution.registry.BCBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.MultipartBlockStateSupplier;
import net.minecraft.data.client.When;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class PipeModelGenerator extends FabricModelProvider {

    private PipeModelGenerator(FabricDataGenerator generator)
    {
        super(generator);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

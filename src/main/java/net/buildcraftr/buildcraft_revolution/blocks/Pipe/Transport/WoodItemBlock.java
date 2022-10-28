package net.buildcraftr.buildcraft_revolution.blocks.Pipe.Transport;

import net.buildcraftr.buildcraft_revolution.blocks.Pipe.AbstractPipeBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class WoodItemBlock extends AbstractPipeBlock {
    public WoodItemBlock() {
        super(FabricBlockSettings
                .of(Material.GLASS)
                .requiresTool()
                .strength(1.5f, 6.0f)
                .sounds(BlockSoundGroup.GLASS)
                .nonOpaque()
        );
    }
}

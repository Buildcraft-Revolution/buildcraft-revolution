package net.buildcraftr.buildcraft_revolution;

import net.buildcraftr.buildcraft_revolution.registry.BCBlocks;
import net.buildcraftr.buildcraft_revolution.registry.BCFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class BuildcraftRevolutionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(BCFluids.STILL_BC_OIL, BCFluids.FLOWING_BC_OIL,
                new SimpleFluidRenderHandler(
                        new Identifier(BuildcraftRevolution.MOD_ID,"fluid/oil_still"),
                        new Identifier(BuildcraftRevolution.MOD_ID,"fluid/oil_flow"),
                        0xFFFFFF
                ));
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(BuildcraftRevolution.MOD_ID,"fluid/oil_still"));
            registry.register(new Identifier(BuildcraftRevolution.MOD_ID,"fluid/oil_flow"));
        });
        BlockRenderLayerMap.INSTANCE.putBlock(BCBlocks.BC_WOOD_ITEM, RenderLayer.getTranslucent());
    }
}

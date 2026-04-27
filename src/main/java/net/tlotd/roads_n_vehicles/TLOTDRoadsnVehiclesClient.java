package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;
import net.tlotd.roads_n_vehicles.block.ModBlocks;
import net.tlotd.roads_n_vehicles.block.custom.entity.ModBlockEntities;
import net.tlotd.roads_n_vehicles.block.custom.entity.renderer.LicensePlateRenderer;
import net.tlotd.roads_n_vehicles.block.custom.entity.renderer.TownSignRenderer;
import net.tlotd.roads_n_vehicles.entity.ModEntities;
import net.tlotd.roads_n_vehicles.entity.client.*;

public class TLOTDRoadsnVehiclesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.TOWN_SIGN,
                RenderType.cutout()
        );

        BlockEntityRendererRegistry.register(
                ModBlockEntities.LICENSE_PLATE,
                LicensePlateRenderer::new
        );
        BlockEntityRendererRegistry.register(
                ModBlockEntities.TOWN_SIGN,
                TownSignRenderer::new
        );

        EntityRendererRegistry.register(
                ModEntities.MUSCLE_CAR_FIRECHARGE,
                MuscleCarFirechargeRenderer::new
        );
        EntityRendererRegistry.register(
                ModEntities.MUSCLE_CAR_STALLION,
                MuscleCarStallionRenderer::new
        );
        EntityModelLayerRegistry.registerModelLayer(
                ModModelLayers.MUSCLE_CAR_FIRECHARGE,
                MuscleCarFirechargeModel::createBodyLayer
        );
        EntityModelLayerRegistry.registerModelLayer(
                ModModelLayers.MUSCLE_CAR_STALLION,
                MuscleCarStallionModel::createBodyLayer
        );
    }
}
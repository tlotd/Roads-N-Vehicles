package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.tlotd.roads_n_vehicles.entity.ModEntities;
import net.tlotd.roads_n_vehicles.entity.client.*;
import net.tlotd.roads_n_vehicles.networking.TextureSyncNetworking;

public class TLOTDRoadsnVehiclesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MUSCLE_CAR_STALLION, MuscleCarStallionRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MUSCLE_CAR_STALLION, MuscleCarStallionModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MUSCLE_CAR_FIRECHARGE, MuscleCarFirechargeRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MUSCLE_CAR_FIRECHARGE, MuscleCarFirechargeModel::getTexturedModelData);
        TextureSyncNetworking.registerClientReceiver();
    }
}

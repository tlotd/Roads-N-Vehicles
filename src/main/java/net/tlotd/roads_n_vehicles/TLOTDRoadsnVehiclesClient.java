package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.tlotd.roads_n_vehicles.entity.ModEntities;
import net.tlotd.roads_n_vehicles.entity.client.ModModelLayers;
import net.tlotd.roads_n_vehicles.entity.client.MuscleCarModel;
import net.tlotd.roads_n_vehicles.entity.client.MuscleCarRenderer;

public class TLOTDRoadsnVehiclesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MUSCLE_CAR, MuscleCarRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MUSCLE_CAR, MuscleCarModel::getTexturedModelData);
    }
}

package net.tlotd.roads_n_vehicles.entity.client;


import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;

public class ModModelLayers {
    public static final ModelLayerLocation MUSCLE_CAR_FIRECHARGE =
            new ModelLayerLocation(
                    new ResourceLocation(TLOTDRoadsnVehicles.MOD_ID, "muscle_car_firecharge"),
                    "main"
            );
    public static final ModelLayerLocation MUSCLE_CAR_STALLION =
            new ModelLayerLocation(
                    new ResourceLocation(TLOTDRoadsnVehicles.MOD_ID, "muscle_car_stallion"),
                    "main"
            );
}
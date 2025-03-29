package net.tlotd.roads_n_vehicles.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;

public class ModModelLayers {
    public static final EntityModelLayer MUSCLE_CAR =
            new EntityModelLayer(new Identifier(TLOTDRoadsnVehicles.MOD_ID,"muscle_car"),"main");
}
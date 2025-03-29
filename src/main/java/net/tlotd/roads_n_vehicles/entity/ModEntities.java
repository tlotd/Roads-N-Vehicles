package net.tlotd.roads_n_vehicles.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.custom.MuscleCarEntity;

public class ModEntities {
    public static final EntityType<MuscleCarEntity> MUSCLE_CAR = Registry.register(Registries.ENTITY_TYPE, new Identifier(TLOTDRoadsnVehicles.MOD_ID, "muscle_car"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MuscleCarEntity::new)
            .dimensions(EntityDimensions.fixed(2,2)).build());
}
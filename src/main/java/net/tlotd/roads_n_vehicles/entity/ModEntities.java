package net.tlotd.roads_n_vehicles.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.custom.FirechargeEntity;
import net.tlotd.roads_n_vehicles.entity.custom.StallionEntity;

public class ModEntities {
    public static final EntityType<StallionEntity> MUSCLE_CAR_STALLION =
            Registry.register(
                    BuiltInRegistries.ENTITY_TYPE,
                    ResourceLocation.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "muscle_car_stallion"),
                    FabricEntityTypeBuilder.create(MobCategory.CREATURE, StallionEntity::new)
                            .dimensions(EntityDimensions.fixed(2.2f, 1.7f))
                            .build()
            );
    public static final EntityType<FirechargeEntity> MUSCLE_CAR_FIRECHARGE =
            Registry.register(
                    BuiltInRegistries.ENTITY_TYPE,
                    ResourceLocation.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "muscle_car_firecharge"),
                    FabricEntityTypeBuilder.create(MobCategory.CREATURE, FirechargeEntity::new)
                            .dimensions(EntityDimensions.fixed(2.2f, 1.7f))
                            .build()
            );
}
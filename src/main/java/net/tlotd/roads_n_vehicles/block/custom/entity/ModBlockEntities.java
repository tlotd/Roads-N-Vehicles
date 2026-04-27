package net.tlotd.roads_n_vehicles.block.custom.entity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<LicensePlateBlockEntity> LICENSE_PLATE =
            Registry.register(
                    BuiltInRegistries.BLOCK_ENTITY_TYPE,
                    new ResourceLocation(TLOTDRoadsnVehicles.MOD_ID, "license_plate"),
                    BlockEntityType.Builder.of(
                            LicensePlateBlockEntity::new,
                            ModBlocks.LICENSE_PLATE
                    ).build(null)
            );
    public static final BlockEntityType<TownSignBlockEntity> TOWN_SIGN =
            Registry.register(
                    BuiltInRegistries.BLOCK_ENTITY_TYPE,
                    new ResourceLocation(TLOTDRoadsnVehicles.MOD_ID, "town_sign"),
                    BlockEntityType.Builder.of(
                            TownSignBlockEntity::new,
                            ModBlocks.TOWN_SIGN
                    ).build(null)
            );
}
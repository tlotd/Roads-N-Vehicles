package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.tlotd.roads_n_vehicles.block.ModBlocks;
import net.tlotd.roads_n_vehicles.entity.ModEntities;
import net.tlotd.roads_n_vehicles.entity.custom.MuscleCarEntity;
import net.tlotd.roads_n_vehicles.item.ModItemGroups;
import net.tlotd.roads_n_vehicles.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TLOTDRoadsnVehicles implements ModInitializer {
	public static final String MOD_ID = "roads-n-vehicles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FabricDefaultAttributeRegistry.register(ModEntities.MUSCLE_CAR, MuscleCarEntity.createMuscleCarAttributes());
	}
}
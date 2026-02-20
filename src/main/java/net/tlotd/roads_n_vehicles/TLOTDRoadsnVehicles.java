package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ModInitializer;

import net.tlotd.roads_n_vehicles.block.ModBlocks;
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
		//ModCommands.registerCommands();
		//ModSounds.registerSounds();
		//FabricDefaultAttributeRegistry.register(ModEntities.MUSCLE_CAR_STALLION, MuscleCarEntity.createMuscleCarAttributes());
		//FabricDefaultAttributeRegistry.register(ModEntities.MUSCLE_CAR_FIRECHARGE, MuscleCarEntity.createMuscleCarAttributes());
		//ServerTextureSync.init();
		//if (CompatModsCheck.TLOTD) {
		//	TlotdAPI.registerTelevisionSignalBatch(
		//			new Identifier[]{
		//					Identifier.of(MOD_ID,"vhs_cassette_1")
		//			},
		//			ModBlocks.TELEVISION,
		//			ModBlocks.TELEVISION_ON,
		//			1
		//	);
		//	TlotdAPI.registerVideoGame(
		//			new TlotdAPI.VideoGame(Identifier.of(MOD_ID,"game_cartridge_1"),
		//					ModBlocks.TELEVISION_GAME, ModBlocks.COMPUTER_ON, 1)
		//	);
		//}
	}
}
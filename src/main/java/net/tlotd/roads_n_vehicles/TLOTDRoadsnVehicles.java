package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ModInitializer;

import net.tlotd.api.TlotdAPI;
import net.tlotd.roads_n_vehicles.block.ModBlocks;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import net.tlotd.roads_n_vehicles.item.ModItemGroups;
import net.tlotd.roads_n_vehicles.item.ModItems;
import net.tlotd.roads_n_vehicles.sound.ModSounds;
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
		ModSounds.registerSounds();
		if (CompatModsCheck.TLOTD) {
			TlotdAPI.registerTelevisionSignalBatchUnsafe(
					new String[] { MOD_ID }, new String[] { "vhs_cassette_1" },
					MOD_ID, "television",
					MOD_ID, "television_on",
					1
			);
			TlotdAPI.registerVideoGameBatchUnsafe(
					new String[] { MOD_ID }, new String[] { "game_cartridge_1" },
					MOD_ID, "television_game",
					MOD_ID, "computer_on",
					1
			);
		}
	}
}
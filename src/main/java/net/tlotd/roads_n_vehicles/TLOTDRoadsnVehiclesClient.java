package net.tlotd.roads_n_vehicles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.tlotd.roads_n_vehicles.block.ModBlocks;

public class TLOTDRoadsnVehiclesClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.putBlock(
				ModBlocks.TOWN_SIGN,
				ChunkSectionLayer.CUTOUT
		);
	}
}

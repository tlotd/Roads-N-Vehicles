package net.tlotd.roads_n_vehicles.sound;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;

public class ModSounds {

    public static final SoundEvent ENTITY_CAR_IDLE = register("entity_car_idle");
    public static final SoundEvent ENTITY_CAR_HORN = register("entity_car_horn");

    private static SoundEvent register(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering sounds for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}
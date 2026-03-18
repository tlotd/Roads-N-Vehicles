package net.tlotd.roads_n_vehicles.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;

public class ModSounds {
    public static final SoundEvent ENTITY_CAR_IDLE = registerSoundEvent("entity_car_idle");
    public static final SoundEvent ENTITY_CAR_HORN = registerSoundEvent("entity_car_horn");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TLOTDRoadsnVehicles.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering Sounds for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}

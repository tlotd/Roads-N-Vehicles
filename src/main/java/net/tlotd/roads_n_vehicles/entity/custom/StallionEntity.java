package net.tlotd.roads_n_vehicles.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.tlotd.roads_n_vehicles.item.ModItems;

public class StallionEntity extends VehicleEntity {
    public StallionEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }
    @Override
    public Item getDropItem() {
        return ModItems.MUSCLE_CAR_STALLION;
    }
}
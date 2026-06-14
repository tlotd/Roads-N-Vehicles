package net.tlotd.roads_n_vehicles.block.enum_property;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum PoliceLightsPart implements StringRepresentable {
    LEFT,
    CENTER,
    RIGHT;

    @Override
    public @NotNull String getSerializedName() {
        return name().toLowerCase();
    }
}
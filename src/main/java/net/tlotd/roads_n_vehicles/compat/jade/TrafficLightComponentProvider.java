package net.tlotd.roads_n_vehicles.compat.jade;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

import static net.tlotd.roads_n_vehicles.block.custom.TrafficLightBlock.STAGE;

public enum TrafficLightComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        int stage = accessor.getBlockState().getValue(STAGE);
        if (stage != 0) {
            ChatFormatting color;
            if (stage == 1) {
                color = ChatFormatting.RED;
            } else if (stage == 3) {
                color = ChatFormatting.GREEN;
            } else {
                color = ChatFormatting.YELLOW;
            }
            tooltip.add(Component.translatable("jade.roads-n-vehicles.traffic_light.stage_" + stage).withStyle(style -> style.withColor(color)));
        }
    }

    @Override
    public ResourceLocation getUid() {
        return ResourceLocation.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "traffic_light");
    }
}
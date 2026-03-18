package net.tlotd.roads_n_vehicles.compat.jade;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
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
        int stage = accessor.getBlockState().get(STAGE);
        if (stage != 0) {
            Formatting color = Formatting.YELLOW;
            if (stage == 1) {
                color = Formatting.RED;
            } else if (stage == 3) {
                color = Formatting.GREEN;
            }
            tooltip.add(Text.translatable("jade.roads-n-vehicles.traffic_light.stage_" + stage).formatted(color));
        }
    }

    @Override
    public Identifier getUid() {
        return new Identifier(TLOTDRoadsnVehicles.MOD_ID, "traffic_light");
    }
}
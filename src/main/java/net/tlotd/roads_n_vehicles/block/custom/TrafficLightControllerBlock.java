package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TrafficLightControllerBlock extends Block {

    public static final IntProperty STAGE = IntProperty.of("stage", 0, 4);

    public TrafficLightControllerBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(STAGE, 0));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(STAGE, 0);
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STAGE);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isClient) return;
        int power = world.getReceivedRedstonePower(pos);
        int lightState = mapPowerToLight(power);
        for (int i = 1; i <= 10; i++) {
            BlockPos checkPos = pos.up(i);
            BlockState checkState = world.getBlockState(checkPos);
            if (checkState.getBlock() instanceof TrafficLightBlock) {
                world.setBlockState(checkPos, checkState.with(TrafficLightBlock.STAGE, lightState), Block.NOTIFY_ALL);
                world.setBlockState(pos, state.with(TrafficLightControllerBlock.STAGE, lightState), Block.NOTIFY_ALL);
                break;
            }
        }
    }

    private int mapPowerToLight(int power) {
        if (power <= 0) return 0;
        if (power <= 3) return 1;
        if (power <= 7) return 2;
        if (power <= 11) return 3;
        return 4;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_2").formatted(Formatting.GRAY));
        tooltip.add(Text.literal(" ").append(Text.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_3")).formatted(Formatting.BLUE));
        tooltip.add(Text.literal(" ").append(Text.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_4")).formatted(Formatting.BLUE));
        tooltip.add(Text.literal(" ").append(Text.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_5")).formatted(Formatting.BLUE));
        tooltip.add(Text.literal(" ").append(Text.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_6")).formatted(Formatting.BLUE));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
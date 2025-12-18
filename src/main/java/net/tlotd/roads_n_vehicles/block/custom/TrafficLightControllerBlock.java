package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.List;

public class TrafficLightControllerBlock extends Block {

    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 4);

    public TrafficLightControllerBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(STAGE, 0));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return this.defaultBlockState().setValue(STAGE, 0);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(STAGE);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.isClientSide()) return;
        int power = level.getBestNeighborSignal(pos);
        int lightState = mapPowerToLight(power);
        for (int i = 1; i <= 10; i++) {
            BlockPos checkPos = pos.above(i);
            BlockState checkState = level.getBlockState(checkPos);
            if (checkState.getBlock() instanceof TrafficLightBlock) {
                level.setBlock(
                        checkPos,
                        checkState.setValue(TrafficLightBlock.STAGE, lightState),
                        Block.UPDATE_ALL
                );
                level.setBlock(
                        pos,
                        state.setValue(TrafficLightControllerBlock.STAGE, lightState),
                        Block.UPDATE_ALL
                );
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
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.empty());
        tooltip.add(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_2").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_3")).withStyle(ChatFormatting.BLUE));
        tooltip.add(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_4")).withStyle(ChatFormatting.BLUE));
        tooltip.add(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_5")).withStyle(ChatFormatting.BLUE));
        tooltip.add(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_6")).withStyle(ChatFormatting.BLUE));
        super.appendHoverText(stack, context, tooltip, flag);
    }
}
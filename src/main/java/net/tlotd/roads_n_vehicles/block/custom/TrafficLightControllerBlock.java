package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.Nullable;

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
    protected void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, @Nullable Orientation orientation, boolean bl) {
        if (level.isClientSide()) return;
        int power = level.getBestNeighborSignal(blockPos);
        int lightState = mapPowerToLight(power);
        for (int i = 1; i <= 10; i++) {
            BlockPos checkPos = blockPos.above(i);
            BlockState checkState = level.getBlockState(checkPos);
            if (checkState.getBlock() instanceof TrafficLightBlock) {
                level.setBlock(
                        checkPos,
                        checkState.setValue(TrafficLightBlock.STAGE, lightState),
                        Block.UPDATE_ALL
                );
                level.setBlock(
                        blockPos,
                        blockState.setValue(TrafficLightControllerBlock.STAGE, lightState),
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
}
package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tlotd.api.TlotdAPI;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import org.jetbrains.annotations.NotNull;

public class LicensePlateBlock extends SignBlock {

    public static final IntegerProperty PLATE = IntegerProperty.create("plate", 0, 127);
    public static final BooleanProperty ALTERNATIVE = BooleanProperty.create("alternative");
    public static final BooleanProperty CUSTOM = BooleanProperty.create("custom");

    private int getDefaultSkinFor(String uuid, boolean formerTLOTD) {
        return switch (uuid) {
            case "212aa6f5-69a9-47d9-9ad5-19b359744edf" -> 1;
            case "67148bd0-1a00-4bca-9d9e-ec246afbcf51" -> 2;
            case "53c68d22-726b-4a37-b92d-8d7c4670a87d" -> 3;
            case "660605b0-a3ac-404c-8f85-039cfddf36de" -> formerTLOTD ? 4 : 0; //AliaSophie
            case "0b026440-781b-40c3-bfee-78a2ee71f042" -> formerTLOTD ? 5 : 0; //Teneba
            case "d9ffb72a-f473-4ebc-936f-6f7d5d694145" -> 6;
            case "ebcc701d-5e03-4e57-9279-1dd595f6a4d4" -> formerTLOTD ? 7 : 0; //ISSO_21_
            case "9d978ae8-0368-442b-b4c4-fd27ad9f4888" -> formerTLOTD ? 8 : 0; //Akitorlp
            case "08c6cfba-40cd-43e2-a929-764e9fadc442" -> 9;
            case "d3018dca-9a16-43f0-8d72-19b93e33fa6b" -> 10;
            case "7c2b3137-729f-47af-b3f8-55a0994a8c61" -> formerTLOTD ? 11 : 0; //VANDAGR
            case "2dc144f0-3e65-4e80-978b-d6356e5d3008" -> 12;
            case "125cda9f-1a5b-40c5-b3a9-02c7988940f6" -> 13;
            case "9b293ed4-2a42-4db7-b615-246d81dc5d0f" -> 14;
            case "75fcce95-16a1-417b-801d-04ebb925d56b" -> 15;
            case "c639c27d-b32b-4785-805e-ba4889006a8b" -> 16;
            case "f31b18df-5db5-4e00-9adc-b66e89c69792" -> 17;
            case "4488478f-78d4-4885-be12-1f2179874912" -> 18;
            case "8365d4fc-c514-4c2e-a4e5-cf39fb26b0f0" -> 19;
            case "1987a906-540f-4ae8-90df-43504c06a6e7" -> 20;
            case "7af13cd9-4c28-4d48-a3f4-3cfbbce46438" -> 21;
            //case "????????-????-????-????-????????????" -> 22; Jxst_Freezy (dont know his ign)
            default -> 0;
        };
    }

    private boolean hasDefaultAlternate(String uuid, boolean formerTLOTD) {
        return switch (uuid) {
            case "212aa6f5-69a9-47d9-9ad5-19b359744edf",
                 "67148bd0-1a00-4bca-9d9e-ec246afbcf51",
                 "53c68d22-726b-4a37-b92d-8d7c4670a87d",
                 "d3018dca-9a16-43f0-8d72-19b93e33fa6b",
                 "125cda9f-1a5b-40c5-b3a9-02c7988940f6" -> true;
            case "ebcc701d-5e03-4e57-9279-1dd595f6a4d4" -> formerTLOTD;
            default -> false;
        };
    }

    public LicensePlateBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(PLATE, 0).setValue(ALTERNATIVE, false).setValue(CUSTOM, false).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        int plate = 0;
        boolean alternative = false;
        boolean formerTLOTD = false;
        boolean custom = false;
        int customTextureId = 0;
        Player player = context.getPlayer();
        ServerLevel world = null;
        if (player != null && !context.getLevel().isClientSide()) {
            if (context.getLevel() instanceof ServerLevel serverLevel) {
                world = serverLevel.getServer().getLevel(Level.OVERWORLD);
            }
        }
        if (world != null) {
            if (CompatModsCheck.TLOTD) {
                custom = TlotdAPI.hasCustomTexture(world.getServer(), player.getUUID());
                customTextureId = TlotdAPI.getCustomTexture(world.getServer(), player.getUUID());
                if (context.getLevel() instanceof ServerLevel serverLevel) {
                    formerTLOTD = TlotdAPI.formerTlotdRewards(serverLevel.getServer());
                }
            }
            if (custom) {
                plate = customTextureId;
            } else {
                plate = getDefaultSkinFor(player.getUUID().toString(), formerTLOTD);
                if (player.isShiftKeyDown() && (plate == 0 || hasDefaultAlternate(player.getUUID().toString(), formerTLOTD))) {
                    alternative = true;
                }
            }
        }
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER)).setValue(PLATE, plate).setValue(ALTERNATIVE, alternative).setValue(CUSTOM, custom);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PLATE, ALTERNATIVE, CUSTOM);
    }

    private static final VoxelShape WEST_SHAPE = Block.box(0, 6.375, 0, 0.5, 9.625, 16);
    private static final VoxelShape NORTH_SHAPE = Block.box(0, 6.375, 0, 16, 9.625, 0.5);
    private static final VoxelShape EAST_SHAPE = Block.box(15.5, 6.375, 0, 16, 9.625, 16);
    private static final VoxelShape SOUTH_SHAPE = Block.box(0, 6.375, 15.5, 16, 9.625, 16);

    protected @NotNull VoxelShape getShape(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, NORTH_SHAPE);
    }

}
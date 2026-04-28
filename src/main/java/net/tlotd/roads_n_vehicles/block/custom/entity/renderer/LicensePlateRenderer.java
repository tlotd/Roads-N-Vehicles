package net.tlotd.roads_n_vehicles.block.custom.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.tlotd.roads_n_vehicles.block.custom.LicensePlateBlock;
import net.tlotd.roads_n_vehicles.block.custom.entity.LicensePlateBlockEntity;

public class LicensePlateRenderer implements BlockEntityRenderer<LicensePlateBlockEntity> {

    public LicensePlateRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(LicensePlateBlockEntity be, float tickDelta, PoseStack matrices, MultiBufferSource buffer, int light, int overlay) {
        String text = be.getText();
        if (text == null || text.isEmpty()) return;
        Direction dir = be.getBlockState().getValue(LicensePlateBlock.FACING);
        Font font = Minecraft.getInstance().font;
        PlateParts parts = split(text);
        String prefixGlyph = PlateGlyphs.convert(parts.prefix, true);
        String mainGlyph = PlateGlyphs.convert(parts.main, true);
        matrices.pushPose();
        matrices.translate(0.5, 0.532, 0.5);
        switch (dir) {
            case NORTH -> matrices.translate(0, 0, -0.482);
            case SOUTH -> {
                matrices.mulPose(Axis.YP.rotationDegrees(180));
                matrices.translate(0, 0, -0.482);
            }
            case WEST -> {
                matrices.mulPose(Axis.YP.rotationDegrees(90));
                matrices.translate(0, 0, -0.482);
            }
            case EAST -> {
                matrices.mulPose(Axis.YP.rotationDegrees(-90));
                matrices.translate(0, 0, -0.482);
            }
        }
        matrices.scale(0.011f, -0.011f, 0.011f);
        float maxWidth = 70f;
        String fittedMainGlyph = font.plainSubstrByWidth(mainGlyph, (int) maxWidth);
        float mainX = -font.width(fittedMainGlyph) / 2f;
        if (!prefixGlyph.isEmpty()) {
            font.drawInBatch(prefixGlyph, -44.1f, 0, 0xFFFFFF, false, matrices.last().pose(), buffer, Font.DisplayMode.NORMAL, 0, light);
        }
        font.drawInBatch(fittedMainGlyph, mainX, 0, 0xFFFFFF, false, matrices.last().pose(), buffer, Font.DisplayMode.NORMAL, 0, light);
        matrices.popPose();
    }

    private static class PlateParts {
        String prefix;
        String main;
    }

    private static PlateParts split(String input) {
        PlateParts parts = new PlateParts();
        if (input.startsWith("[") && input.contains("]")) {
            int end = input.indexOf(']');
            parts.prefix = input.substring(0, end + 1);
            parts.main = input.substring(end + 1).trim();
        } else {
            parts.prefix = "";
            parts.main = input;
        }
        return parts;
    }
}
package net.tlotd.roads_n_vehicles.block.custom.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.tlotd.roads_n_vehicles.block.custom.TownSignBlock;
import net.tlotd.roads_n_vehicles.block.custom.entity.TownSignBlockEntity;

public class TownSignRenderer implements BlockEntityRenderer<TownSignBlockEntity> {

    public TownSignRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(TownSignBlockEntity be, float tickDelta, PoseStack matrices, MultiBufferSource buffer, int light, int overlay) {
        String text = be.getText();
        if (text == null || text.isEmpty()) return;
        Font font = Minecraft.getInstance().font;
        Direction dir = be.getBlockState().getValue(TownSignBlock.FACING);
        String[] parts = text.split("\\|", 2);
        String top = parts.length > 0 ? parts[0].trim() : "";
        String bottom = parts.length > 1 ? parts[1].trim() : "";
        matrices.pushPose();
        matrices.translate(0.5, 0.5, 0.5);
        switch (dir) {
            case NORTH -> matrices.translate(0, 0, 0.069);
            case SOUTH -> {
                matrices.mulPose(Axis.YP.rotationDegrees(180));
                matrices.translate(0, 0, 0.069);
            }
            case WEST -> {
                matrices.mulPose(Axis.YP.rotationDegrees(90));
                matrices.translate(0, 0, 0.069);
            }
            case EAST -> {
                matrices.mulPose(Axis.YP.rotationDegrees(-90));
                matrices.translate(0, 0, 0.069);
            }
        }
        float baseScale = 0.013f;
        matrices.scale(baseScale, -baseScale, baseScale);
        float smallScale = 0.75f;
        if (!top.isEmpty()) {
            float maxWidth = 77f;
            String fittedTop = font.plainSubstrByWidth(top, (int) maxWidth);
            float topX = -font.width(fittedTop) / 2f;
            font.drawInBatch(fittedTop, topX, -3, 0x000000, false, matrices.last().pose(), buffer, Font.DisplayMode.NORMAL, 0, light);
        }
        if (!bottom.isEmpty()) {
            matrices.pushPose();
            matrices.scale(smallScale, smallScale, smallScale);
            float maxWidth = 100f;
            String fittedBottom = font.plainSubstrByWidth(bottom, (int) maxWidth);
            float bottomX = -font.width(fittedBottom) / 2f;
            font.drawInBatch(fittedBottom, bottomX, 12, 0x000000, false, matrices.last().pose(), buffer, Font.DisplayMode.NORMAL, 0, light);
            matrices.popPose();
        }
        matrices.pushPose();
        matrices.translate(0, 0, -10.15);
        matrices.mulPose(Axis.YP.rotationDegrees(180));
        matrices.scale(smallScale, smallScale, smallScale);
        String line1 = "All Directions";
        float line1X = -font.width(line1) / 2f;
        font.drawInBatch(line1, line1X, -12, 0x000000, false, matrices.last().pose(), buffer, Font.DisplayMode.NORMAL, 0, light);
        if (!top.isEmpty()) {
            float maxWidth = 100f;
            String fittedTop = font.plainSubstrByWidth(top, (int) maxWidth);
            float line2X = -font.width(fittedTop) / 2f;
            font.drawInBatch(fittedTop, line2X, 19, 0x000000, false, matrices.last().pose(), buffer, Font.DisplayMode.NORMAL, 0, light);
        }
        matrices.popPose();
        matrices.popPose();
    }
}
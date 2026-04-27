package net.tlotd.roads_n_vehicles.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.custom.StallionEntity;

public class MuscleCarStallionRenderer extends EntityRenderer<StallionEntity> {

    private final MuscleCarStallionModel<StallionEntity> model;

    public MuscleCarStallionRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new MuscleCarStallionModel<>(context.bakeLayer(ModModelLayers.MUSCLE_CAR_STALLION));
    }

    @Override
    public void render(StallionEntity entity, float yaw, float tickDelta,
                       PoseStack matrices, MultiBufferSource vertexConsumers, int light) {
        matrices.pushPose();
        matrices.translate(0.0D, 1.5D, 0.0D);
        matrices.mulPose(Axis.YP.rotationDegrees(180.0F - yaw));
        matrices.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer buffer = vertexConsumers.getBuffer(model.renderType(getTextureLocation(entity)));
        model.renderToBuffer(matrices, buffer, light, OverlayTexture.NO_OVERLAY,
                1.0F, 1.0F, 1.0F, 1.0F);
        matrices.popPose();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public ResourceLocation getTextureLocation(StallionEntity entity) {
        return new ResourceLocation(TLOTDRoadsnVehicles.MOD_ID, "textures/entity/muscle_car/stallion.png");
    }
}
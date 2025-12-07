package net.tlotd.roads_n_vehicles.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.custom.MuscleCarEntity;

public class MuscleCarStallionRenderer extends MobEntityRenderer<MuscleCarEntity, MuscleCarStallionModel<MuscleCarEntity>> {
    private static final Identifier TEXTURE = new Identifier(TLOTDRoadsnVehicles.MOD_ID, "textures/entity/muscle_car_stallion/green.png");

    public MuscleCarStallionRenderer(EntityRendererFactory.Context context) {
        super(context, new MuscleCarStallionModel<>(context.getPart(ModModelLayers.MUSCLE_CAR_STALLION)), 1);
    }

    @Override
    public Identifier getTexture(MuscleCarEntity entity) {
        return TEXTURE;
    }
}

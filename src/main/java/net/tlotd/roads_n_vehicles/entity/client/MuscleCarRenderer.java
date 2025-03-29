package net.tlotd.roads_n_vehicles.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.custom.MuscleCarEntity;

public class MuscleCarRenderer extends MobEntityRenderer<MuscleCarEntity, MuscleCarModel<MuscleCarEntity>> {
    private static final Identifier TEXTURE = new Identifier(TLOTDRoadsnVehicles.MOD_ID, "textures/entity/muscle_car/green.png");

    public MuscleCarRenderer(EntityRendererFactory.Context context) {
        super(context, new MuscleCarModel<>(context.getPart(ModModelLayers.MUSCLE_CAR)), 1);
    }

    @Override
    public Identifier getTexture(MuscleCarEntity entity) {
        return TEXTURE;
    }
}

package net.tlotd.roads_n_vehicles.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.tlotd.roads_n_vehicles.entity.custom.StallionEntity;

public class MuscleCarStallionModel<T extends StallionEntity> extends EntityModel<T> {
	private final ModelPart body;

	public MuscleCarStallionModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 58).addBox(14.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 89).addBox(11.25F, -12.0F, 9.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(10.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 29).addBox(-15.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 12).addBox(-18.25F, -12.0F, 9.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 58).addBox(-19.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 132).addBox(-18.0F, -4.25F, 82.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(45, 192).addBox(-18.5F, -10.25F, 83.5F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(148, 152).addBox(0.5F, -10.25F, 83.5F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(81, 132).addBox(12.0F, -4.25F, 82.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-19.0F, -3.0F, 26.0F, 34.0F, 1.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(20, 19).addBox(-20.5F, -13.25F, 57.0F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(74, 41).addBox(-20.5F, -13.25F, 10.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(71, 103).addBox(-21.5F, -6.25F, 9.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 75).addBox(16.5F, -6.25F, 9.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(98, 76).addBox(-2.5F, -6.25F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(125, 21).addBox(-2.5F, -8.25F, 3.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(18, 75).addBox(-2.5F, -13.25F, 1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 98).addBox(-2.5F, -7.25F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 140).addBox(-14.0F, -14.25F, 7.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(-14.0F, -14.25F, 5.5F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 89).addBox(9.0F, -14.25F, 5.5F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 85).addBox(9.0F, -14.25F, 7.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(57, 136).addBox(-2.5F, -14.25F, 2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 140).addBox(-20.5F, -13.25F, 9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 63).addBox(-20.5F, -13.25F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 98).addBox(-20.5F, -13.25F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(15.5F, -13.25F, 10.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 132).addBox(15.5F, -13.25F, 9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 63).addBox(15.5F, -13.25F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 74).addBox(15.5F, -13.25F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(180, 72).addBox(-13.5F, -12.25F, 8.0F, 23.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(-13.5F, -14.25F, 4.0F, 23.0F, 1.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(159, 184).addBox(-20.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(91, 132).addBox(15.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(181, 40).addBox(-13.5F, -23.0F, 34.0F, 23.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(119, 12).addBox(-19.5F, -13.25F, 10.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(119, 0).addBox(9.5F, -13.25F, 10.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 203).addBox(-5.5F, -21.0F, 34.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(148, 150).addBox(-19.0F, -3.0F, 13.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 159).addBox(-18.0F, -3.0F, 12.0F, 32.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 78).addBox(-16.0F, -3.0F, 11.0F, 28.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(179, 78).addBox(-13.5F, -3.0F, 10.0F, 23.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-6.0F, -3.0F, 9.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 57).addBox(-19.5F, -9.25F, 16.0F, 35.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(147, 14).addBox(-19.5F, -6.0F, 26.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(150, 124).addBox(-19.0F, -4.0F, 26.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 23).addBox(-19.0F, -4.0F, 13.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 11).addBox(-19.5F, -6.0F, 13.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 49).addBox(-19.5F, -9.25F, 68.0F, 35.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(147, 8).addBox(-19.5F, -6.0F, 78.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 21).addBox(-19.0F, -4.0F, 78.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 126).addBox(-19.0F, -3.0F, 78.0F, 34.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(147, 5).addBox(-19.5F, -6.0F, 65.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 19).addBox(-19.0F, -4.0F, 65.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(74, 41).addBox(-20.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(15.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(42, 80).addBox(-20.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(15.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 38).addBox(-20.5F, -6.25F, 84.0F, 37.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 70).addBox(-20.5F, -13.25F, 83.0F, 37.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(192, 141).addBox(-10.0F, -4.25F, 83.0F, 16.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 140).addBox(-3.5F, -10.25F, 84.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 204).addBox(15.5F, -14.25F, 84.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 185).addBox(-20.5F, -14.25F, 84.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(146, 101).addBox(-19.5F, -13.25F, 82.5F, 35.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 79).addBox(-20.5F, -14.0F, 83.0F, 37.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 169).addBox(-20.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(102, 161).addBox(15.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(16, 179).addBox(15.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 190).addBox(15.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(62, 177).addBox(-20.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(107, 170).addBox(-20.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(38, 177).addBox(-20.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 89).addBox(15.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 103).addBox(-13.5F, -24.0F, 35.0F, 23.0F, 1.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(175, 172).addBox(9.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(171, 152).addBox(-19.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 89).addBox(-20.5F, -16.25F, 57.0F, 1.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(108, 12).addBox(-20.5F, -19.25F, 57.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(80, 41).addBox(-20.5F, -21.25F, 57.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(15.5F, -16.25F, 57.0F, 1.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(15.5F, -19.25F, 57.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(6, 41).addBox(15.5F, -21.25F, 57.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(125, 150).addBox(-20.5F, -13.25F, 26.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(74, 58).addBox(-20.5F, -6.25F, 47.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(18, 89).addBox(-20.5F, -13.25F, 47.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(15.5F, -13.25F, 57.0F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(15.5F, -6.25F, 47.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(18, 70).addBox(15.5F, -13.25F, 47.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(74, 58).addBox(17.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(7, 73).addBox(16.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 73).addBox(16.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 38).addBox(-21.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 67).addBox(-21.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 70).addBox(-22.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 140).addBox(15.5F, -13.25F, 26.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(191, 128).addBox(-19.5F, -11.25F, 47.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 190).addBox(-19.5F, -6.25F, 47.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 114).addBox(-19.5F, -10.25F, 58.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(183, 26).addBox(13.5F, -11.25F, 47.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(181, 42).addBox(13.5F, -6.25F, 47.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(104, 57).addBox(13.5F, -10.25F, 58.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 140).addBox(8.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 114).addBox(-15.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(206, 115).addBox(-21.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 150).addBox(-21.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 41).addBox(-21.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(105, 206).addBox(-21.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 148).addBox(-21.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(86, 58).addBox(-21.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(204, 112).addBox(-21.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(206, 180).addBox(-21.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(204, 108).addBox(-21.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(206, 177).addBox(-21.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 132).addBox(-21.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 124).addBox(12.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(206, 120).addBox(11.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(206, 103).addBox(11.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 58).addBox(11.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(173, 188).addBox(11.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(205, 84).addBox(11.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 83).addBox(11.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(66, 142).addBox(11.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(205, 90).addBox(11.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 41).addBox(11.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 132).addBox(11.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(178, 152).addBox(10.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(11.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(60, 196).addBox(10.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(206, 172).addBox(10.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 190).addBox(10.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(124, 161).addBox(10.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(127, 182).addBox(10.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(51, 155).addBox(10.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(165, 206).addBox(10.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(107, 161).addBox(10.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(148, 156).addBox(10.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 50).addBox(-19.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 29).addBox(-19.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(105, 141).addBox(-19.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(153, 206).addBox(-19.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(105, 132).addBox(-19.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 50).addBox(-19.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(91, 141).addBox(-19.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(181, 49).addBox(-19.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 132).addBox(-19.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-19.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-19.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(181, 57).addBox(-13.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 70).addBox(-16.0F, -3.0F, 71.0F, 28.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 74).addBox(-15.0F, -3.0F, 19.0F, 26.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(181, 42).addBox(6.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(31, 19).addBox(7.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(31, 0).addBox(-13.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 114).addBox(6.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 19).addBox(7.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(13, 114).addBox(-13.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-13.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(120, 145).addBox(-19.5F, -13.25F, 31.0F, 35.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 140).addBox(-19.5F, -7.85F, 63.1F, 35.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 17).addBox(-19.0F, -4.0F, 63.1F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 85).addBox(-19.5F, -11.39F, 66.6F, 35.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(68, 162).addBox(1.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(29, 159).addBox(-17.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(180, 57).addBox(2.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(23, 140).addBox(-4.0F, -5.0F, 41.0F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 98).addBox(-4.0F, -5.0F, 33.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(50, 94).addBox(-3.0F, -10.0F, 34.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-2.5F, -8.0F, 34.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 161).addBox(-3.0F, -8.0F, 42.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(24, 75).addBox(-2.5F, -7.5F, 41.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 177).addBox(-16.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 21.0F, -46.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 132).addBox(13.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 38).addBox(12.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.0F, 46.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 108).addBox(-16.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(192, 136).addBox(-17.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.0F, 46.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 140).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 50.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 58).addBox(12.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(93, 180).addBox(12.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(8.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(182, 65).addBox(8.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 70).addBox(4.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(184, 29).addBox(4.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(141, 181).addBox(3.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-6.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 70).addBox(-13.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 70).addBox(12.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 70).addBox(5.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(197, 42).addBox(3.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(197, 48).addBox(-15.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(100, 182).addBox(-15.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(142, 159).addBox(-4.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(189, 183).addBox(3.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 122).addBox(-3.5F, -15.0F, -11.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(171, 177).addBox(-3.5F, -23.0F, -11.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 63).addBox(-0.5F, -19.0F, -15.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(181, 206).addBox(8.5F, -28.5F, -36.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 206).addBox(8.5F, -29.5F, -37.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(206, 183).addBox(-27.5F, -28.5F, -36.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(177, 206).addBox(-27.5F, -29.5F, -37.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 104).addBox(-11.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 1.0472F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 125).addBox(10.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, -1.0472F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -19.75F, -15.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(129, 95).addBox(-17.5F, -18.4F, 2.3F, 35.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 132).addBox(-17.5F, 7.6F, -21.7F, 35.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 168).addBox(-19.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 179).addBox(-19.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 182).addBox(-19.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 204).addBox(-19.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 204).addBox(10.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(77, 188).addBox(10.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(77, 204).addBox(10.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(141, 198).addBox(10.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(22, 177).addBox(-19.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(187, 203).addBox(-19.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(201, 203).addBox(-19.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(173, 183).addBox(-19.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 184).addBox(10.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(63, 204).addBox(10.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(47, 196).addBox(10.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(91, 204).addBox(10.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(199, 31).addBox(-19.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 169).addBox(-19.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 169).addBox(-19.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(155, 201).addBox(-19.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(171, 201).addBox(-52.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(171, 166).addBox(-52.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(171, 172).addBox(-52.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(202, 157).addBox(-52.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(129, 85).addBox(-51.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, 0.0F, 52.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(148, 166).addBox(-19.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(201, 95).addBox(-19.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(115, 201).addBox(-19.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(171, 156).addBox(-19.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(171, 161).addBox(-52.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 202).addBox(-52.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(202, 152).addBox(-52.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 174).addBox(-52.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(117, 126).addBox(-51.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 83).addBox(-30.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 102).addBox(-45.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 70).addBox(-15.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 120).addBox(-51.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(44, 140).addBox(-6.0F, -37.15F, -31.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 150).addBox(-6.0F, -37.25F, -30.52F, 12.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.7854F, 0.1309F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(55, 140).addBox(5.0F, -37.15F, -31.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 197).addBox(-6.0F, -37.25F, -30.52F, 12.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.7854F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(118, 185).addBox(16.15F, -10.25F, -8.5F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, -0.1963F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(63, 188).addBox(-17.15F, -10.25F, -8.5F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.1963F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 89).addBox(19.25F, -19.25F, 3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(42, 93).addBox(-20.25F, -19.25F, 3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 132).addBox(-18.5F, -3.26F, -52.25F, 1.0F, 1.0F, 26.0F, new CubeDeformation(0.0F))
				.texOffs(66, 132).addBox(-18.5F, -2.26F, -51.85F, 1.0F, 2.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(146, 156).addBox(17.5F, -2.26F, -51.85F, 1.0F, 2.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-17.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(16.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(104, 41).addBox(-17.5F, -4.18F, -32.62F, 35.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(92, 132).addBox(17.5F, -3.26F, -52.25F, 1.0F, 1.0F, 26.0F, new CubeDeformation(0.0F))
				.texOffs(144, 81).addBox(-17.5F, -4.18F, -52.62F, 35.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(129, 90).addBox(-18.5F, -6.0F, -23.75F, 37.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 134).addBox(3.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 149).addBox(-10.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(104, 65).addBox(-18.5F, -21.1F, -15.8F, 37.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 75).addBox(17.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 70).addBox(-18.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 75).addBox(-18.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 0).addBox(-17.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 58).addBox(17.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 10).addBox(16.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 0).addBox(-17.0F, -19.75F, 32.5F, 34.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 46.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 70).addBox(-15.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 188).addBox(-15.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(18, 75).addBox(-15.0F, -12.5F, -42.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 19).addBox(-15.0F, -12.5F, -41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 93).addBox(-15.0F, -12.0F, -40.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-15.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(74, 41).addBox(14.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 201).addBox(14.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(74, 63).addBox(14.0F, -12.5F, -42.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(14.0F, -12.5F, -41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(14.0F, -12.0F, -40.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 41).addBox(14.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(108, 26).addBox(-18.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(108, 32).addBox(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 109).addBox(-54.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 0.0F, 104.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(128, 114).addBox(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 0.0F, 104.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(128, 119).addBox(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 0.0F, 52.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(128, 103).addBox(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(185, 192).addBox(-8.0F, -18.25F, -42.2F, 16.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(173, 192).addBox(-2.5F, -25.25F, -42.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, 52.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(23, 159).addBox(3.5F, -2.9F, -29.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 167).addBox(-10.5F, -0.9F, -28.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.1745F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 38).addBox(-6.0F, -6.75F, -47.82F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 103).addBox(-6.0F, -4.25F, -47.82F, 12.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(192, 148).addBox(-6.0F, -2.25F, -47.32F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, 52.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 108).addBox(-6.0F, -6.75F, -47.82F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 192).addBox(-6.0F, -4.25F, -47.82F, 12.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(192, 146).addBox(-6.0F, -2.25F, -47.32F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, 52.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(59, 140).addBox(-0.5F, -37.25F, -30.52F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(202, 162).addBox(0.5F, -37.25F, -30.52F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.7854F, 0.3927F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(138, 159).addBox(-0.5F, -37.25F, -30.52F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 203).addBox(-6.5F, -37.25F, -30.52F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.7854F, -0.3927F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 114).addBox(-0.5F, -37.25F, -30.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -17.0F, -23.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 80).addBox(-16.5F, -19.5F, -28.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(91, 149).addBox(-5.5F, -27.75F, -42.25F, 12.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 53.0F, 0.3927F, 0.1309F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(185, 197).addBox(-6.5F, -27.75F, -42.25F, 12.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 53.0F, 0.3927F, -0.1309F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(118, 169).addBox(-0.5F, -27.75F, -42.65F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 53.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 35).addBox(3.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 198).addBox(-6.5F, -6.25F, -47.25F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(124, 169).addBox(-11.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(199, 25).addBox(-1.5F, -6.25F, -47.25F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(108, 0).addBox(10.25F, -15.25F, -45.0F, 7.0F, 1.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 114).addBox(-17.25F, -15.25F, -45.0F, 7.0F, 1.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(39, 122).addBox(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 180).addBox(-6.0F, -5.25F, -47.82F, 12.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, 50.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(23, 155).addBox(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 114).addBox(-6.0F, -5.25F, -47.82F, 12.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, 50.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 156).addBox(-7.0F, -7.25F, -47.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, 50.0F, 0.0F, -0.3927F, 0.0873F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(148, 162).addBox(0.0F, -7.25F, -47.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, 50.0F, 0.0F, 0.3927F, -0.0873F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(104, 41).addBox(5.0F, -30.4F, -41.25F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.3927F, -0.1309F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(104, 49).addBox(-6.0F, -30.4F, -41.25F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.3927F, 0.1309F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(168, 181).addBox(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(188, 55).addBox(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition lights_r1 = body.addOrReplaceChild("lights_r1", CubeListBuilder.create().texOffs(36, 85).addBox(-17.9F, 5.52F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 87).addBox(-17.4F, 5.52F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 82).addBox(-17.9F, 0.9F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 82).addBox(-17.4F, 0.9F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 58).addBox(3.01F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 60).addBox(3.4F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 80).addBox(3.01F, -19.98F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 80).addBox(3.4F, -19.98F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition lights_r2 = body.addOrReplaceChild("lights_r2", CubeListBuilder.create().texOffs(80, 63).addBox(-4.0F, -20.0F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 65).addBox(-4.4F, -20.0F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 82).addBox(-4.0F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 67).addBox(-4.4F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 77).addBox(16.85F, 0.87F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 77).addBox(16.45F, 0.87F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 77).addBox(16.85F, 5.55F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 80).addBox(16.45F, 5.55F, -43.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition lights_r3 = body.addOrReplaceChild("lights_r3", CubeListBuilder.create().texOffs(108, 18).addBox(-4.25F, -35.0F, -30.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.7854F, -0.3927F, 0.0F));

		PartDefinition lights_r4 = body.addOrReplaceChild("lights_r4", CubeListBuilder.create().texOffs(29, 140).addBox(1.75F, -35.0F, -30.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.7854F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
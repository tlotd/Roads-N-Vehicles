package net.tlotd.roads_n_vehicles.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.tlotd.roads_n_vehicles.entity.custom.FirechargeEntity;

public class MuscleCarFirechargeModel<T extends FirechargeEntity> extends EntityModel<T> {
	private final ModelPart body;

	public MuscleCarFirechargeModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(29, 197).addBox(-18.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 0).addBox(-14.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 196).addBox(11.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 22).addBox(7.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-19.0F, -3.0F, 26.0F, 34.0F, 1.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(30, 90).addBox(-20.5F, -13.0F, 10.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 41).addBox(-20.5F, -12.25F, 5.0F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(42, 102).addBox(-21.5F, -6.25F, 5.0F, 15.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-6.5F, -6.25F, 5.0F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(42, 96).addBox(2.5F, -6.25F, 5.0F, 15.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(42, 77).addBox(15.5F, -13.0F, 10.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(33, 0).addBox(15.5F, -7.0F, 8.45F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(15.5F, -12.25F, 5.0F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(126, 87).addBox(-19.5F, -7.25F, 5.8F, 35.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 17).addBox(-19.5F, -11.25F, 5.8F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(14.5F, -11.25F, 5.8F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(42, 69).addBox(-19.5F, -12.25F, 5.8F, 35.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(122, 5).addBox(-20.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(108, 17).addBox(15.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(54, 77).addBox(-18.5F, -26.5F, 28.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(170, 132).addBox(-13.5F, -23.0F, 34.0F, 23.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(169, 176).addBox(-18.5F, -11.25F, 8.0F, 33.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(166, 108).addBox(-18.5F, -11.25F, 9.0F, 33.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(106, 113).addBox(-5.5F, -21.0F, 34.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-20.5F, -7.0F, 8.45F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(126, 79).addBox(-19.5F, -9.25F, 16.0F, 35.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(156, 144).addBox(-19.5F, -6.0F, 26.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 165).addBox(-19.0F, -4.0F, 26.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(156, 150).addBox(-19.5F, -4.0F, 13.0F, 35.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(146, 136).addBox(-19.5F, -3.0F, 10.0F, 35.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(150, 33).addBox(-19.5F, -3.0F, 8.45F, 35.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 156).addBox(-19.5F, -6.0F, 13.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(126, 71).addBox(-19.5F, -9.25F, 68.0F, 35.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(155, 147).addBox(-19.5F, -6.0F, 78.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 163).addBox(-19.0F, -4.0F, 78.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 136).addBox(-19.0F, -3.0F, 78.0F, 34.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(154, 141).addBox(-19.5F, -6.0F, 65.0F, 35.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 161).addBox(-19.0F, -4.0F, 65.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(-20.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(15.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(101, 41).addBox(-20.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(84, 77).addBox(15.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(150, 24).addBox(-20.5F, -7.25F, 84.0F, 37.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(101, 63).addBox(-6.5F, -4.25F, 83.0F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 63).addBox(-6.5F, -4.25F, 6.0F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(126, 93).addBox(-20.5F, -13.25F, 83.0F, 37.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 77).addBox(15.5F, -13.25F, 84.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 77).addBox(-20.5F, -13.25F, 84.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 125).addBox(-20.5F, -14.25F, 77.0F, 37.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 140).addBox(-19.5F, -13.25F, 82.5F, 35.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 176).addBox(-20.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(90, 167).addBox(15.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(132, 196).addBox(15.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 117).addBox(15.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(120, 125).addBox(-20.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 86).addBox(-20.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(105, 172).addBox(-20.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 170).addBox(15.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 113).addBox(-13.5F, -24.0F, 35.0F, 23.0F, 1.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(170, 112).addBox(9.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(60, 167).addBox(-19.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(42, 77).addBox(-20.5F, -13.25F, 26.0F, 1.0F, 8.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(112, 195).addBox(17.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 41).addBox(16.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 41).addBox(16.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-21.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 24).addBox(-21.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(106, 194).addBox(-22.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(15.5F, -13.25F, 26.0F, 1.0F, 8.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(62, 77).addBox(5.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-12.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(188, 50).addBox(-21.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 87).addBox(-21.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(146, 158).addBox(-21.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(188, 45).addBox(-21.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 79).addBox(-21.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(25, 158).addBox(-21.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 178).addBox(-21.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(185, 194).addBox(-21.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(146, 176).addBox(-21.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 194).addBox(-21.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 69).addBox(-21.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 21).addBox(12.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(82, 194).addBox(11.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 188).addBox(11.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 125).addBox(11.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(170, 127).addBox(11.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 193).addBox(11.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 84).addBox(11.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 31).addBox(11.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 188).addBox(11.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 125).addBox(11.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 10).addBox(11.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(152, 190).addBox(10.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(11.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(12, 193).addBox(10.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 193).addBox(10.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 176).addBox(10.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(105, 77).addBox(10.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(114, 191).addBox(10.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(136, 14).addBox(10.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 192).addBox(10.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 172).addBox(10.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 78).addBox(10.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(190, 41).addBox(-19.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-19.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(108, 26).addBox(-19.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(185, 189).addBox(-19.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(136, 5).addBox(-19.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(111, 188).addBox(-19.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(108, 9).addBox(-19.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(121, 63).addBox(-19.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(135, 27).addBox(-19.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-19.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-19.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(102, 188).addBox(-13.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(167, 180).addBox(-16.0F, -3.0F, 71.0F, 28.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(185, 158).addBox(-15.0F, -3.0F, 19.0F, 26.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(90, 188).addBox(6.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(134, 159).addBox(7.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 125).addBox(-13.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(188, 55).addBox(6.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 123).addBox(7.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(122, 5).addBox(-13.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(114, 92).addBox(-13.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 153).addBox(-19.5F, -13.25F, 31.0F, 35.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(150, 36).addBox(-19.5F, -7.85F, 63.1F, 35.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 159).addBox(-19.0F, -4.0F, 63.1F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(101, 45).addBox(-19.5F, -11.39F, 66.6F, 35.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(146, 158).addBox(1.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(25, 158).addBox(-17.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(152, 184).addBox(2.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(84, 77).addBox(-4.0F, -5.0F, 41.0F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(101, 54).addBox(-4.0F, -5.0F, 33.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(112, 177).addBox(-3.0F, -10.0F, 34.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-2.5F, -8.0F, 34.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(109, 102).addBox(-3.0F, -8.0F, 42.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(21, 41).addBox(-2.5F, -7.5F, 41.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(119, 181).addBox(-16.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 21.0F, -46.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 196).addBox(13.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 93).addBox(12.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.0F, 46.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 93).addBox(-16.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 196).addBox(-17.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.0F, 46.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 50.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 63).addBox(12.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(138, 36).addBox(12.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 117).addBox(8.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(59, 192).addBox(8.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(114, 130).addBox(4.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 196).addBox(4.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 90).addBox(3.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 21).addBox(-6.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-13.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 31).addBox(12.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 31).addBox(5.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 34).addBox(3.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 117).addBox(-15.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(84, 92).addBox(-15.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 188).addBox(-4.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 196).addBox(3.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 85).addBox(-3.5F, -15.0F, -11.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 93).addBox(-3.5F, -23.0F, -11.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(195, 168).addBox(-0.5F, -19.0F, -15.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(120, 88).addBox(-11.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 1.0472F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(126, 71).addBox(10.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, -1.0472F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -19.75F, -15.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 52.0F, 0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(150, 27).addBox(-17.5F, -18.4F, 2.3F, 35.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 16).addBox(-17.5F, 7.6F, -21.7F, 35.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 167).addBox(-19.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(170, 112).addBox(-19.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(170, 117).addBox(-19.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(185, 167).addBox(-19.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(185, 184).addBox(10.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 173).addBox(10.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(76, 187).addBox(10.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 176).addBox(10.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(127, 169).addBox(-19.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(64, 167).addBox(-19.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(146, 167).addBox(-19.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(170, 122).addBox(-19.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(112, 172).addBox(10.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(62, 187).addBox(10.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(125, 174).addBox(10.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 188).addBox(10.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 176).addBox(-19.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(122, 0).addBox(-19.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(122, 22).addBox(-19.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(112, 181).addBox(-19.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 183).addBox(-52.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 167).addBox(-52.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(112, 167).addBox(-52.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(185, 162).addBox(-52.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(150, 5).addBox(-51.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, 0.0F, 52.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 83).addBox(-19.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(62, 181).addBox(-19.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 181).addBox(-19.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 158).addBox(-19.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 163).addBox(-52.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 183).addBox(-52.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 183).addBox(-52.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 168).addBox(-52.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 142).addBox(-51.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 107).addBox(-30.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 113).addBox(-45.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 45).addBox(-15.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 158).addBox(-51.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 24).addBox(-18.5F, -17.5F, -27.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 24).addBox(17.5F, -17.5F, -27.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(17.5F, -19.5F, -45.25F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 69).addBox(-18.5F, -19.5F, -45.25F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(121, 156).addBox(-18.5F, -3.26F, -52.25F, 1.0F, 2.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-17.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(42, 77).addBox(16.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(126, 63).addBox(-17.5F, -4.18F, -32.62F, 35.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 158).addBox(17.5F, -3.26F, -52.25F, 1.0F, 2.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(72, 153).addBox(-17.5F, -4.18F, -52.62F, 35.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 105).addBox(3.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 105).addBox(-10.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 53.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 43).addBox(17.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 21).addBox(-18.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 43).addBox(-18.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 0).addBox(-17.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(17.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 10).addBox(16.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 69).addBox(5.0F, -21.62F, 33.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 69).addBox(-6.0F, -21.62F, 33.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 153).addBox(-17.0F, -19.75F, 32.5F, 34.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 46.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 10).addBox(-15.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(152, 181).addBox(-15.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(108, 1).addBox(-15.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(36, 31).addBox(14.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 185).addBox(14.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 69).addBox(14.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(126, 102).addBox(-18.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 134).addBox(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 148).addBox(-54.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 0.0F, 104.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 148).addBox(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 0.0F, 104.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(150, 0).addBox(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 0.0F, 52.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(78, 142).addBox(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 16).addBox(3.5F, -2.9F, -29.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 37).addBox(-10.5F, -0.9F, -28.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.1745F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 21).addBox(17.5F, -34.5F, -29.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 21).addBox(53.5F, -34.5F, -29.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 100).addBox(29.5F, -37.07F, -31.65F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 75).addBox(41.5F, -37.07F, -31.65F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 10).addBox(17.5F, -37.07F, -30.65F, 37.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-38.0F, -1.0F, 53.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -17.0F, -23.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 16).addBox(3.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 37).addBox(-11.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 75).addBox(-18.5F, -15.1F, -46.4F, 37.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(-18.5F, -15.1F, -46.0F, 37.0F, 1.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 52.0F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int j, int k) {
		body.render(poseStack, vertexConsumer, i, j, k);
	}
}
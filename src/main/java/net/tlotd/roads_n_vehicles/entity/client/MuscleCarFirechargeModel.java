package net.tlotd.roads_n_vehicles.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.tlotd.roads_n_vehicles.entity.custom.MuscleCarEntity;

public class MuscleCarFirechargeModel<T extends MuscleCarEntity> extends SinglePartEntityModel<T> {
	private final ModelPart muscle_car_firecharge;

	public MuscleCarFirechargeModel(ModelPart root) {
		this.muscle_car_firecharge = root.getChild("muscle_car_firecharge");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData muscle_car_firecharge = modelPartData.addChild("muscle_car_firecharge", ModelPartBuilder.create().uv(29, 197).cuboid(-18.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(140, 0).cuboid(-14.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(140, 196).cuboid(11.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(140, 22).cuboid(7.5F, -11.25F, 83.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-19.0F, -3.0F, 26.0F, 34.0F, 1.0F, 40.0F, new Dilation(0.0F))
		.uv(30, 90).cuboid(-20.5F, -13.0F, 10.0F, 1.0F, 11.0F, 4.0F, new Dilation(0.0F))
		.uv(14, 41).cuboid(-20.5F, -12.25F, 5.0F, 1.0F, 6.0F, 5.0F, new Dilation(0.0F))
		.uv(42, 102).cuboid(-21.5F, -6.25F, 5.0F, 15.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 58).cuboid(-6.5F, -6.25F, 5.0F, 9.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(42, 96).cuboid(2.5F, -6.25F, 5.0F, 15.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(42, 77).cuboid(15.5F, -13.0F, 10.0F, 1.0F, 11.0F, 4.0F, new Dilation(0.0F))
		.uv(33, 0).cuboid(15.5F, -7.0F, 8.45F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(15.5F, -12.25F, 5.0F, 1.0F, 6.0F, 5.0F, new Dilation(0.0F))
		.uv(126, 87).cuboid(-19.5F, -7.25F, 5.8F, 35.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(108, 17).cuboid(-19.5F, -11.25F, 5.8F, 1.0F, 4.0F, 5.0F, new Dilation(0.0F))
		.uv(108, 0).cuboid(14.5F, -11.25F, 5.8F, 1.0F, 4.0F, 5.0F, new Dilation(0.0F))
		.uv(42, 69).cuboid(-19.5F, -12.25F, 5.8F, 35.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(122, 5).cuboid(-20.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(108, 17).cuboid(15.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(54, 77).cuboid(-18.5F, -26.5F, 28.0F, 1.0F, 13.0F, 1.0F, new Dilation(0.0F))
		.uv(170, 132).cuboid(-13.5F, -23.0F, 34.0F, 23.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(169, 176).cuboid(-18.5F, -11.25F, 8.0F, 33.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(166, 108).cuboid(-18.5F, -11.25F, 9.0F, 33.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(106, 113).cuboid(-5.5F, -21.0F, 34.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-20.5F, -7.0F, 8.45F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 79).cuboid(-19.5F, -9.25F, 16.0F, 35.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(156, 144).cuboid(-19.5F, -6.0F, 26.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 165).cuboid(-19.0F, -4.0F, 26.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(156, 150).cuboid(-19.5F, -4.0F, 13.0F, 35.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(146, 136).cuboid(-19.5F, -3.0F, 10.0F, 35.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(150, 33).cuboid(-19.5F, -3.0F, 8.45F, 35.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(72, 156).cuboid(-19.5F, -6.0F, 13.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 71).cuboid(-19.5F, -9.25F, 68.0F, 35.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(155, 147).cuboid(-19.5F, -6.0F, 78.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 163).cuboid(-19.0F, -4.0F, 78.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(73, 136).cuboid(-19.0F, -3.0F, 78.0F, 34.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(154, 141).cuboid(-19.5F, -6.0F, 65.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 161).cuboid(-19.0F, -4.0F, 65.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(108, 0).cuboid(-20.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(15.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(101, 41).cuboid(-20.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(84, 77).cuboid(15.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(150, 24).cuboid(-20.5F, -7.25F, 84.0F, 37.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 63).cuboid(-6.5F, -4.25F, 83.0F, 9.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 63).cuboid(-6.5F, -4.25F, 6.0F, 9.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 93).cuboid(-20.5F, -13.25F, 83.0F, 37.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(75, 77).cuboid(15.5F, -13.25F, 84.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 77).cuboid(-20.5F, -13.25F, 84.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 125).cuboid(-20.5F, -14.25F, 77.0F, 37.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 140).cuboid(-19.5F, -13.25F, 82.5F, 35.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 176).cuboid(-20.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(90, 167).cuboid(15.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(132, 196).cuboid(15.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 117).cuboid(15.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(120, 125).cuboid(-20.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 86).cuboid(-20.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(105, 172).cuboid(-20.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 170).cuboid(15.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 113).cuboid(-13.5F, -24.0F, 35.0F, 23.0F, 1.0F, 22.0F, new Dilation(0.0F))
		.uv(170, 112).cuboid(9.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new Dilation(0.0F))
		.uv(60, 167).cuboid(-19.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new Dilation(0.0F))
		.uv(42, 77).cuboid(-20.5F, -13.25F, 26.0F, 1.0F, 8.0F, 40.0F, new Dilation(0.0F))
		.uv(112, 195).cuboid(17.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(14, 41).cuboid(16.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 41).cuboid(16.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 24).cuboid(-21.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(35, 24).cuboid(-21.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(106, 194).cuboid(-22.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 69).cuboid(15.5F, -13.25F, 26.0F, 1.0F, 8.0F, 40.0F, new Dilation(0.0F))
		.uv(62, 77).cuboid(5.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-12.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F))
		.uv(188, 50).cuboid(-21.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 87).cuboid(-21.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(146, 158).cuboid(-21.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(188, 45).cuboid(-21.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 79).cuboid(-21.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(25, 158).cuboid(-21.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 178).cuboid(-21.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(185, 194).cuboid(-21.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(146, 176).cuboid(-21.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 194).cuboid(-21.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 69).cuboid(-21.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(20, 21).cuboid(12.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(82, 194).cuboid(11.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 188).cuboid(11.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 125).cuboid(11.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(170, 127).cuboid(11.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 193).cuboid(11.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 84).cuboid(11.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 31).cuboid(11.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(14, 188).cuboid(11.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 125).cuboid(11.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 10).cuboid(11.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(152, 190).cuboid(10.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(11.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(12, 193).cuboid(10.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 193).cuboid(10.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 176).cuboid(10.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 77).cuboid(10.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(114, 191).cuboid(10.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(136, 14).cuboid(10.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 192).cuboid(10.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(91, 172).cuboid(10.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 78).cuboid(10.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(190, 41).cuboid(-19.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 31).cuboid(-19.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(108, 26).cuboid(-19.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(185, 189).cuboid(-19.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(136, 5).cuboid(-19.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(111, 188).cuboid(-19.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(108, 9).cuboid(-19.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(121, 63).cuboid(-19.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(135, 27).cuboid(-19.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-19.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-19.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(102, 188).cuboid(-13.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(167, 180).cuboid(-16.0F, -3.0F, 71.0F, 28.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(185, 158).cuboid(-15.0F, -3.0F, 19.0F, 26.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(90, 188).cuboid(6.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(134, 159).cuboid(7.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(82, 125).cuboid(-13.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(188, 55).cuboid(6.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 123).cuboid(7.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(122, 5).cuboid(-13.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(114, 92).cuboid(-13.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 153).cuboid(-19.5F, -13.25F, 31.0F, 35.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 36).cuboid(-19.5F, -7.85F, 63.1F, 35.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 159).cuboid(-19.0F, -4.0F, 63.1F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 45).cuboid(-19.5F, -11.39F, 66.6F, 35.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(146, 158).cuboid(1.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new Dilation(0.0F))
		.uv(25, 158).cuboid(-17.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new Dilation(0.0F))
		.uv(152, 184).cuboid(2.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(84, 77).cuboid(-4.0F, -5.0F, 41.0F, 4.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(101, 54).cuboid(-4.0F, -5.0F, 33.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(112, 177).cuboid(-3.0F, -10.0F, 34.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-2.5F, -8.0F, 34.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(109, 102).cuboid(-3.0F, -8.0F, 42.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(21, 41).cuboid(-2.5F, -7.5F, 41.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(119, 181).cuboid(-16.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 21.0F, -46.0F));

		ModelPartData cube_r1 = muscle_car_firecharge.addChild("cube_r1", ModelPartBuilder.create().uv(19, 196).cuboid(13.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(62, 93).cuboid(12.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 3.0F, 46.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r2 = muscle_car_firecharge.addChild("cube_r2", ModelPartBuilder.create().uv(72, 93).cuboid(-16.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(122, 196).cuboid(-17.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 3.0F, 46.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r3 = muscle_car_firecharge.addChild("cube_r3", ModelPartBuilder.create().uv(0, 69).cuboid(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 50.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r4 = muscle_car_firecharge.addChild("cube_r4", ModelPartBuilder.create().uv(16, 63).cuboid(12.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(138, 36).cuboid(12.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(32, 117).cuboid(8.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(59, 192).cuboid(8.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(114, 130).cuboid(4.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(9, 196).cuboid(4.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r5 = muscle_car_firecharge.addChild("cube_r5", ModelPartBuilder.create().uv(0, 90).cuboid(3.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new Dilation(0.0F))
				.uv(20, 21).cuboid(-6.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 31).cuboid(-13.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 31).cuboid(12.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 31).cuboid(5.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(108, 34).cuboid(3.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 117).cuboid(-15.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(84, 92).cuboid(-15.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.1963F, 0.0F, 0.0F));

		ModelPartData cube_r6 = muscle_car_firecharge.addChild("cube_r6", ModelPartBuilder.create().uv(42, 188).cuboid(-4.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(136, 196).cuboid(3.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 85).cuboid(-3.5F, -15.0F, -11.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 93).cuboid(-3.5F, -23.0F, -11.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(195, 168).cuboid(-0.5F, -19.0F, -15.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r7 = muscle_car_firecharge.addChild("cube_r7", ModelPartBuilder.create().uv(120, 88).cuboid(-11.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 1.0472F));

		ModelPartData cube_r8 = muscle_car_firecharge.addChild("cube_r8", ModelPartBuilder.create().uv(126, 71).cuboid(10.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, -1.0472F));

		ModelPartData cube_r9 = muscle_car_firecharge.addChild("cube_r9", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -19.75F, -15.25F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.1963F, 0.0F, 0.0F));

		ModelPartData cube_r10 = muscle_car_firecharge.addChild("cube_r10", ModelPartBuilder.create().uv(150, 27).cuboid(-17.5F, -18.4F, 2.3F, 35.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(150, 16).cuboid(-17.5F, 7.6F, -21.7F, 35.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = muscle_car_firecharge.addChild("cube_r11", ModelPartBuilder.create().uv(25, 167).cuboid(-19.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(170, 112).cuboid(-19.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(170, 117).cuboid(-19.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(185, 167).cuboid(-19.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(185, 184).cuboid(10.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 173).cuboid(10.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(76, 187).cuboid(10.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(25, 176).cuboid(10.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r12 = muscle_car_firecharge.addChild("cube_r12", ModelPartBuilder.create().uv(127, 169).cuboid(-19.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(64, 167).cuboid(-19.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(146, 167).cuboid(-19.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(170, 122).cuboid(-19.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(112, 172).cuboid(10.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(62, 187).cuboid(10.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(125, 174).cuboid(10.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 188).cuboid(10.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r13 = muscle_car_firecharge.addChild("cube_r13", ModelPartBuilder.create().uv(62, 176).cuboid(-19.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(122, 0).cuboid(-19.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(122, 22).cuboid(-19.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(112, 181).cuboid(-19.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 183).cuboid(-52.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(91, 167).cuboid(-52.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(112, 167).cuboid(-52.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(185, 162).cuboid(-52.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(150, 5).cuboid(-51.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(31.0F, 0.0F, 52.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r14 = muscle_car_firecharge.addChild("cube_r14", ModelPartBuilder.create().uv(105, 83).cuboid(-19.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(62, 181).cuboid(-19.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(91, 181).cuboid(-19.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 158).cuboid(-19.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 163).cuboid(-52.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(16, 183).cuboid(-52.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(32, 183).cuboid(-52.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 168).cuboid(-52.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 142).cuboid(-51.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(84, 107).cuboid(-30.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 113).cuboid(-45.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(113, 45).cuboid(-15.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new Dilation(0.0F))
				.uv(18, 158).cuboid(-51.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(31.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r15 = muscle_car_firecharge.addChild("cube_r15", ModelPartBuilder.create().uv(0, 24).cuboid(-18.5F, -17.5F, -27.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 24).cuboid(17.5F, -17.5F, -27.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(17.5F, -19.5F, -45.25F, 1.0F, 3.0F, 18.0F, new Dilation(0.0F))
				.uv(0, 69).cuboid(-18.5F, -19.5F, -45.25F, 1.0F, 3.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r16 = muscle_car_firecharge.addChild("cube_r16", ModelPartBuilder.create().uv(121, 156).cuboid(-18.5F, -3.26F, -52.25F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
				.uv(0, 21).cuboid(-17.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(42, 77).cuboid(16.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(126, 63).cuboid(-17.5F, -4.18F, -32.62F, 35.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(0, 158).cuboid(17.5F, -3.26F, -52.25F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
				.uv(72, 153).cuboid(-17.5F, -4.18F, -52.62F, 35.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r17 = muscle_car_firecharge.addChild("cube_r17", ModelPartBuilder.create().uv(0, 105).cuboid(3.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r18 = muscle_car_firecharge.addChild("cube_r18", ModelPartBuilder.create().uv(20, 105).cuboid(-10.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r19 = muscle_car_firecharge.addChild("cube_r19", ModelPartBuilder.create().uv(7, 43).cuboid(17.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(35, 21).cuboid(-18.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 43).cuboid(-18.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 0).cuboid(-17.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 41).cuboid(17.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 10).cuboid(16.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 69).cuboid(5.0F, -21.62F, 33.25F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(11, 69).cuboid(-6.0F, -21.62F, 33.25F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(146, 153).cuboid(-17.0F, -19.75F, 32.5F, 34.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 46.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r20 = muscle_car_firecharge.addChild("cube_r20", ModelPartBuilder.create().uv(36, 10).cuboid(-15.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(152, 181).cuboid(-15.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(108, 1).cuboid(-15.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.3927F));

		ModelPartData cube_r21 = muscle_car_firecharge.addChild("cube_r21", ModelPartBuilder.create().uv(36, 31).cuboid(14.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 185).cuboid(14.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(84, 69).cuboid(14.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData cube_r22 = muscle_car_firecharge.addChild("cube_r22", ModelPartBuilder.create().uv(126, 102).cuboid(-18.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r23 = muscle_car_firecharge.addChild("cube_r23", ModelPartBuilder.create().uv(0, 134).cuboid(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r24 = muscle_car_firecharge.addChild("cube_r24", ModelPartBuilder.create().uv(0, 148).cuboid(-54.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.0F, 0.0F, 104.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r25 = muscle_car_firecharge.addChild("cube_r25", ModelPartBuilder.create().uv(78, 148).cuboid(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.0F, 0.0F, 104.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r26 = muscle_car_firecharge.addChild("cube_r26", ModelPartBuilder.create().uv(150, 0).cuboid(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.0F, 0.0F, 52.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r27 = muscle_car_firecharge.addChild("cube_r27", ModelPartBuilder.create().uv(78, 142).cuboid(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r28 = muscle_car_firecharge.addChild("cube_r28", ModelPartBuilder.create().uv(20, 16).cuboid(3.5F, -2.9F, -29.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 37).cuboid(-10.5F, -0.9F, -28.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.1745F));

		ModelPartData cube_r29 = muscle_car_firecharge.addChild("cube_r29", ModelPartBuilder.create().uv(0, 21).cuboid(17.5F, -34.5F, -29.8F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 21).cuboid(53.5F, -34.5F, -29.8F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(118, 100).cuboid(29.5F, -37.07F, -31.65F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(119, 75).cuboid(41.5F, -37.07F, -31.65F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(150, 10).cuboid(17.5F, -37.07F, -30.65F, 37.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-38.0F, -1.0F, 53.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = muscle_car_firecharge.addChild("cube_r30", ModelPartBuilder.create().uv(20, 10).cuboid(-0.5F, -17.0F, -23.2F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r31 = muscle_car_firecharge.addChild("cube_r31", ModelPartBuilder.create().uv(0, 16).cuboid(3.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r32 = muscle_car_firecharge.addChild("cube_r32", ModelPartBuilder.create().uv(0, 37).cuboid(-11.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r33 = muscle_car_firecharge.addChild("cube_r33", ModelPartBuilder.create().uv(42, 75).cuboid(-18.5F, -15.1F, -46.4F, 37.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 41).cuboid(-18.5F, -15.1F, -46.0F, 37.0F, 1.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0436F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		muscle_car_firecharge.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return muscle_car_firecharge;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}
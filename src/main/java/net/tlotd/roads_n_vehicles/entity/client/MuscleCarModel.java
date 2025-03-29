package net.tlotd.roads_n_vehicles.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.tlotd.roads_n_vehicles.entity.custom.MuscleCarEntity;

public class MuscleCarModel<T extends MuscleCarEntity> extends SinglePartEntityModel<T> {
	private final ModelPart muscle_car;

	public MuscleCarModel(ModelPart root) {
		this.muscle_car = root.getChild("muscle_car");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData muscle_car = modelPartData.addChild("muscle_car", ModelPartBuilder.create().uv(0, 58).cuboid(14.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 89).cuboid(11.25F, -12.0F, 9.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(10.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 29).cuboid(-15.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(108, 12).cuboid(-18.25F, -12.0F, 9.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 58).cuboid(-19.25F, -11.0F, 9.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(55, 132).cuboid(-18.0F, -4.25F, 82.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(45, 192).cuboid(-18.5F, -10.25F, 83.5F, 14.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(148, 152).cuboid(0.5F, -10.25F, 83.5F, 14.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 132).cuboid(12.0F, -4.25F, 82.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-19.0F, -3.0F, 26.0F, 34.0F, 1.0F, 40.0F, new Dilation(0.0F))
		.uv(20, 19).cuboid(-20.5F, -13.25F, 57.0F, 1.0F, 8.0F, 9.0F, new Dilation(0.0F))
		.uv(74, 41).cuboid(-20.5F, -13.25F, 10.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(71, 103).cuboid(-21.5F, -6.25F, 9.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(30, 75).cuboid(16.5F, -6.25F, 9.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(98, 76).cuboid(-2.5F, -6.25F, 4.3F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(125, 21).cuboid(-2.5F, -8.25F, 3.8F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 75).cuboid(-2.5F, -13.25F, 1.8F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(12, 98).cuboid(-2.5F, -7.25F, 5.3F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 140).cuboid(-14.0F, -14.25F, 7.0F, 1.0F, 9.0F, 4.0F, new Dilation(0.0F))
		.uv(108, 0).cuboid(-14.0F, -14.25F, 5.5F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(18, 89).cuboid(9.0F, -14.25F, 5.5F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 85).cuboid(9.0F, -14.25F, 7.0F, 1.0F, 9.0F, 4.0F, new Dilation(0.0F))
		.uv(57, 136).cuboid(-2.5F, -14.25F, 2.3F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 140).cuboid(-20.5F, -13.25F, 9.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 63).cuboid(-20.5F, -13.25F, 8.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 98).cuboid(-20.5F, -13.25F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(15.5F, -13.25F, 10.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 132).cuboid(15.5F, -13.25F, 9.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 63).cuboid(15.5F, -13.25F, 8.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 74).cuboid(15.5F, -13.25F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(180, 72).cuboid(-13.5F, -12.25F, 8.0F, 23.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(-13.5F, -14.25F, 4.0F, 23.0F, 1.0F, 28.0F, new Dilation(0.0F))
		.uv(159, 184).cuboid(-20.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(91, 132).cuboid(15.5F, -13.25F, 14.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(181, 40).cuboid(-13.5F, -23.0F, 34.0F, 23.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(119, 12).cuboid(-19.5F, -13.25F, 10.0F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(119, 0).cuboid(9.5F, -13.25F, 10.0F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(138, 203).cuboid(-5.5F, -21.0F, 34.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(148, 150).cuboid(-19.0F, -3.0F, 13.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 159).cuboid(-18.0F, -3.0F, 12.0F, 32.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 78).cuboid(-16.0F, -3.0F, 11.0F, 28.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(179, 78).cuboid(-13.5F, -3.0F, 10.0F, 23.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-6.0F, -3.0F, 9.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 57).cuboid(-19.5F, -9.25F, 16.0F, 35.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(147, 14).cuboid(-19.5F, -6.0F, 26.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 124).cuboid(-19.0F, -4.0F, 26.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(147, 23).cuboid(-19.0F, -4.0F, 13.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(147, 11).cuboid(-19.5F, -6.0F, 13.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 49).cuboid(-19.5F, -9.25F, 68.0F, 35.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(147, 8).cuboid(-19.5F, -6.0F, 78.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(147, 21).cuboid(-19.0F, -4.0F, 78.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 126).cuboid(-19.0F, -3.0F, 78.0F, 34.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(147, 5).cuboid(-19.5F, -6.0F, 65.0F, 35.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(147, 19).cuboid(-19.0F, -4.0F, 65.0F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(74, 41).cuboid(-20.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(15.5F, -13.25F, 66.0F, 1.0F, 5.0F, 12.0F, new Dilation(0.0F))
		.uv(42, 80).cuboid(-20.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 70).cuboid(15.5F, -13.25F, 78.0F, 1.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(108, 38).cuboid(-20.5F, -6.25F, 84.0F, 37.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 70).cuboid(-20.5F, -13.25F, 83.0F, 37.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(192, 141).cuboid(-10.0F, -4.25F, 83.0F, 16.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 140).cuboid(-3.5F, -10.25F, 84.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 204).cuboid(15.5F, -14.25F, 84.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(132, 185).cuboid(-20.5F, -14.25F, 84.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(146, 101).cuboid(-19.5F, -13.25F, 82.5F, 35.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 79).cuboid(-20.5F, -14.0F, 83.0F, 37.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 169).cuboid(-20.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(102, 161).cuboid(15.5F, -23.0F, 37.0F, 1.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(16, 179).cuboid(15.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(132, 190).cuboid(15.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(62, 177).cuboid(-20.5F, -22.25F, 38.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(107, 170).cuboid(-20.5F, -14.25F, 33.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(38, 177).cuboid(-20.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 89).cuboid(15.5F, -22.25F, 56.0F, 1.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 103).cuboid(-13.5F, -24.0F, 35.0F, 23.0F, 1.0F, 22.0F, new Dilation(0.0F))
		.uv(175, 172).cuboid(9.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new Dilation(0.0F))
		.uv(171, 152).cuboid(-19.5F, -24.0F, 38.0F, 6.0F, 1.0F, 19.0F, new Dilation(0.0F))
		.uv(0, 89).cuboid(-20.5F, -16.25F, 57.0F, 1.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(108, 12).cuboid(-20.5F, -19.25F, 57.0F, 1.0F, 3.0F, 9.0F, new Dilation(0.0F))
		.uv(80, 41).cuboid(-20.5F, -21.25F, 57.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 70).cuboid(15.5F, -16.25F, 57.0F, 1.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(108, 0).cuboid(15.5F, -19.25F, 57.0F, 1.0F, 3.0F, 9.0F, new Dilation(0.0F))
		.uv(6, 41).cuboid(15.5F, -21.25F, 57.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(125, 150).cuboid(-20.5F, -13.25F, 26.0F, 1.0F, 8.0F, 21.0F, new Dilation(0.0F))
		.uv(74, 58).cuboid(-20.5F, -6.25F, 47.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(18, 89).cuboid(-20.5F, -13.25F, 47.0F, 1.0F, 3.0F, 10.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(15.5F, -13.25F, 57.0F, 1.0F, 8.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 58).cuboid(15.5F, -6.25F, 47.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(18, 70).cuboid(15.5F, -13.25F, 47.0F, 1.0F, 3.0F, 10.0F, new Dilation(0.0F))
		.uv(74, 58).cuboid(17.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(7, 73).cuboid(16.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 73).cuboid(16.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 38).cuboid(-21.0F, -12.25F, 55.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 67).cuboid(-21.0F, -12.25F, 52.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 70).cuboid(-22.0F, -12.25F, 52.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 140).cuboid(15.5F, -13.25F, 26.0F, 1.0F, 8.0F, 21.0F, new Dilation(0.0F))
		.uv(191, 128).cuboid(-19.5F, -11.25F, 47.0F, 2.0F, 1.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 190).cuboid(-19.5F, -6.25F, 47.0F, 2.0F, 1.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 114).cuboid(-19.5F, -10.25F, 58.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(183, 26).cuboid(13.5F, -11.25F, 47.0F, 2.0F, 1.0F, 12.0F, new Dilation(0.0F))
		.uv(181, 42).cuboid(13.5F, -6.25F, 47.0F, 2.0F, 1.0F, 12.0F, new Dilation(0.0F))
		.uv(104, 57).cuboid(13.5F, -10.25F, 58.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 140).cuboid(8.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 114).cuboid(-15.0F, -3.25F, 78.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F))
		.uv(206, 115).cuboid(-21.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 150).cuboid(-21.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 41).cuboid(-21.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 206).cuboid(-21.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 148).cuboid(-21.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(86, 58).cuboid(-21.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(204, 112).cuboid(-21.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(206, 180).cuboid(-21.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(204, 108).cuboid(-21.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(206, 177).cuboid(-21.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 132).cuboid(-21.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 124).cuboid(12.0F, -4.5F, 69.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(206, 120).cuboid(11.5F, -3.0F, 68.75F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(206, 103).cuboid(11.5F, -4.0F, 67.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 58).cuboid(11.5F, -6.0F, 68.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(173, 188).cuboid(11.5F, 0.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(205, 84).cuboid(11.5F, -3.0F, 74.25F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 83).cuboid(11.5F, -5.25F, 71.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(66, 142).cuboid(11.5F, -7.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(205, 90).cuboid(11.5F, -4.0F, 76.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 41).cuboid(11.5F, -6.0F, 75.0F, 6.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 132).cuboid(11.5F, 1.0F, 70.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(178, 152).cuboid(10.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(11.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(60, 196).cuboid(10.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(206, 172).cuboid(10.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 190).cuboid(10.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(124, 161).cuboid(10.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(127, 182).cuboid(10.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(51, 155).cuboid(10.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(165, 206).cuboid(10.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(107, 161).cuboid(10.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(148, 156).cuboid(10.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 50).cuboid(-19.5F, -5.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 29).cuboid(-19.5F, -7.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(105, 141).cuboid(-19.5F, -3.0F, 22.25F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(153, 206).cuboid(-19.5F, -4.0F, 24.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 132).cuboid(-19.5F, -6.0F, 23.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 50).cuboid(-19.5F, 0.25F, 19.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(91, 141).cuboid(-19.5F, -3.0F, 16.75F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(181, 49).cuboid(-19.5F, -4.0F, 15.0F, 5.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(91, 132).cuboid(-19.5F, -6.0F, 16.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-19.5F, 1.0F, 18.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-19.0F, -4.5F, 17.5F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(181, 57).cuboid(-13.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(42, 70).cuboid(-16.0F, -3.0F, 71.0F, 28.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(42, 74).cuboid(-15.0F, -3.0F, 19.0F, 26.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(181, 42).cuboid(6.5F, -3.5F, 18.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(31, 19).cuboid(7.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(31, 0).cuboid(-13.0F, -9.0F, 19.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(70, 114).cuboid(6.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 19).cuboid(7.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(13, 114).cuboid(-13.5F, -3.5F, 70.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-13.0F, -9.0F, 71.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(120, 145).cuboid(-19.5F, -13.25F, 31.0F, 35.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(120, 140).cuboid(-19.5F, -7.85F, 63.1F, 35.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(147, 17).cuboid(-19.0F, -4.0F, 63.1F, 34.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 85).cuboid(-19.5F, -11.39F, 66.6F, 35.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(68, 162).cuboid(1.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new Dilation(0.0F))
		.uv(29, 159).cuboid(-17.0F, -8.0F, 40.0F, 12.0F, 3.0F, 15.0F, new Dilation(0.0F))
		.uv(180, 57).cuboid(2.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(23, 140).cuboid(-4.0F, -5.0F, 41.0F, 4.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(0, 98).cuboid(-4.0F, -5.0F, 33.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(50, 94).cuboid(-3.0F, -10.0F, 34.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-2.5F, -8.0F, 34.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 161).cuboid(-3.0F, -8.0F, 42.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(24, 75).cuboid(-2.5F, -7.5F, 41.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(29, 177).cuboid(-16.0F, -5.0F, 41.0F, 10.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 21.0F, -46.0F));

		ModelPartData cube_r1 = muscle_car.addChild("cube_r1", ModelPartBuilder.create().uv(192, 132).cuboid(13.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(26, 38).cuboid(12.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 3.0F, 46.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r2 = muscle_car.addChild("cube_r2", ModelPartBuilder.create().uv(26, 108).cuboid(-16.0F, -17.25F, -19.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(192, 136).cuboid(-17.5F, -19.25F, -18.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 3.0F, 46.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r3 = muscle_car.addChild("cube_r3", ModelPartBuilder.create().uv(44, 140).cuboid(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 50.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r4 = muscle_car.addChild("cube_r4", ModelPartBuilder.create().uv(0, 58).cuboid(12.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(93, 180).cuboid(12.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 63).cuboid(8.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(182, 65).cuboid(8.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(18, 70).cuboid(4.5F, 5.0F, -25.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(184, 29).cuboid(4.0F, 4.0F, -23.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r5 = muscle_car.addChild("cube_r5", ModelPartBuilder.create().uv(141, 181).cuboid(3.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 70).cuboid(-6.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(7, 70).cuboid(-13.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(18, 70).cuboid(12.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 70).cuboid(5.0F, -19.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(197, 42).cuboid(3.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(197, 48).cuboid(-15.0F, -22.5F, -1.0F, 12.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(100, 182).cuboid(-15.0F, -17.5F, -1.0F, 12.0F, 12.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.1963F, 0.0F, 0.0F));

		ModelPartData cube_r6 = muscle_car.addChild("cube_r6", ModelPartBuilder.create().uv(142, 159).cuboid(-4.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(189, 183).cuboid(3.5F, -22.0F, -11.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(65, 122).cuboid(-3.5F, -15.0F, -11.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(171, 177).cuboid(-3.5F, -23.0F, -11.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(74, 63).cuboid(-0.5F, -19.0F, -15.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(181, 206).cuboid(8.5F, -28.5F, -36.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(119, 206).cuboid(8.5F, -29.5F, -37.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
				.uv(206, 183).cuboid(-27.5F, -28.5F, -36.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(177, 206).cuboid(-27.5F, -29.5F, -37.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r7 = muscle_car.addChild("cube_r7", ModelPartBuilder.create().uv(36, 104).cuboid(-11.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, 1.0472F));

		ModelPartData cube_r8 = muscle_car.addChild("cube_r8", ModelPartBuilder.create().uv(39, 125).cuboid(10.0F, -12.5F, -14.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.3927F, 0.0F, -1.0472F));

		ModelPartData cube_r9 = muscle_car.addChild("cube_r9", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -19.75F, -15.25F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 52.0F, 0.1963F, 0.0F, 0.0F));

		ModelPartData cube_r10 = muscle_car.addChild("cube_r10", ModelPartBuilder.create().uv(129, 95).cuboid(-17.5F, -18.4F, 2.3F, 35.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(120, 132).cuboid(-17.5F, 7.6F, -21.7F, 35.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = muscle_car.addChild("cube_r11", ModelPartBuilder.create().uv(68, 168).cuboid(-19.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 179).cuboid(-19.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(22, 182).cuboid(-19.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(14, 204).cuboid(-19.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(28, 204).cuboid(10.5F, -9.41F, 15.08F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(77, 188).cuboid(10.5F, -12.95F, 11.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(77, 204).cuboid(10.5F, -17.05F, 15.55F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(141, 198).cuboid(10.5F, -12.5F, 18.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r12 = muscle_car.addChild("cube_r12", ModelPartBuilder.create().uv(22, 177).cuboid(-19.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(187, 203).cuboid(-19.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(201, 203).cuboid(-19.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(173, 183).cuboid(-19.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 184).cuboid(10.5F, 7.5F, 12.99F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(63, 204).cuboid(10.5F, 2.94F, 17.1F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(47, 196).cuboid(10.5F, 7.05F, 20.65F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(91, 204).cuboid(10.5F, 10.59F, 17.54F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r13 = muscle_car.addChild("cube_r13", ModelPartBuilder.create().uv(199, 31).cuboid(-19.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 169).cuboid(-19.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(22, 169).cuboid(-19.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(155, 201).cuboid(-19.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(171, 201).cuboid(-52.5F, 2.94F, 17.1F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(171, 166).cuboid(-52.5F, 7.05F, 20.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(171, 172).cuboid(-52.5F, 7.5F, 12.99F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(202, 157).cuboid(-52.5F, 10.59F, 17.54F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(129, 85).cuboid(-51.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(31.0F, 0.0F, 52.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r14 = muscle_car.addChild("cube_r14", ModelPartBuilder.create().uv(148, 166).cuboid(-19.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(201, 95).cuboid(-19.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(115, 201).cuboid(-19.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(171, 156).cuboid(-19.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(171, 161).cuboid(-52.5F, -12.95F, 11.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(47, 202).cuboid(-52.5F, -17.05F, 15.55F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(202, 152).cuboid(-52.5F, -9.41F, 15.08F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 174).cuboid(-52.5F, -12.5F, 18.65F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(117, 126).cuboid(-51.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(18, 83).cuboid(-30.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(18, 102).cuboid(-45.5F, -2.254F, -28.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(12, 70).cuboid(-15.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 120).cuboid(-51.5F, -12.5F, -24.0F, 1.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(31.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r15 = muscle_car.addChild("cube_r15", ModelPartBuilder.create().uv(44, 140).cuboid(-6.0F, -37.15F, -31.1F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(120, 150).cuboid(-6.0F, -37.25F, -30.52F, 12.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.7854F, 0.1309F, 0.0F));

		ModelPartData cube_r16 = muscle_car.addChild("cube_r16", ModelPartBuilder.create().uv(55, 140).cuboid(5.0F, -37.15F, -31.1F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(89, 197).cuboid(-6.0F, -37.25F, -30.52F, 12.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.7854F, -0.1309F, 0.0F));

		ModelPartData cube_r17 = muscle_car.addChild("cube_r17", ModelPartBuilder.create().uv(118, 185).cuboid(16.15F, -10.25F, -8.5F, 1.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, -0.1963F, 0.0F));

		ModelPartData cube_r18 = muscle_car.addChild("cube_r18", ModelPartBuilder.create().uv(63, 188).cuboid(-17.15F, -10.25F, -8.5F, 1.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.1963F, 0.0F));

		ModelPartData cube_r19 = muscle_car.addChild("cube_r19", ModelPartBuilder.create().uv(0, 89).cuboid(19.25F, -19.25F, 3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, -0.1745F, 0.0F));

		ModelPartData cube_r20 = muscle_car.addChild("cube_r20", ModelPartBuilder.create().uv(42, 93).cuboid(-20.25F, -19.25F, 3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.1745F, 0.0F));

		ModelPartData cube_r21 = muscle_car.addChild("cube_r21", ModelPartBuilder.create().uv(38, 132).cuboid(-18.5F, -3.26F, -52.25F, 1.0F, 1.0F, 26.0F, new Dilation(0.0F))
				.uv(66, 132).cuboid(-18.5F, -2.26F, -51.85F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
				.uv(146, 156).cuboid(17.5F, -2.26F, -51.85F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-17.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(0, 19).cuboid(16.5F, -4.18F, -50.62F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(104, 41).cuboid(-17.5F, -4.18F, -32.62F, 35.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(92, 132).cuboid(17.5F, -3.26F, -52.25F, 1.0F, 1.0F, 26.0F, new Dilation(0.0F))
				.uv(144, 81).cuboid(-17.5F, -4.18F, -52.62F, 35.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(129, 90).cuboid(-18.5F, -6.0F, -23.75F, 37.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r22 = muscle_car.addChild("cube_r22", ModelPartBuilder.create().uv(0, 134).cuboid(3.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r23 = muscle_car.addChild("cube_r23", ModelPartBuilder.create().uv(44, 149).cuboid(-10.5F, -23.0F, -21.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r24 = muscle_car.addChild("cube_r24", ModelPartBuilder.create().uv(104, 65).cuboid(-18.5F, -21.1F, -15.8F, 37.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r25 = muscle_car.addChild("cube_r25", ModelPartBuilder.create().uv(30, 75).cuboid(17.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(30, 70).cuboid(-18.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 75).cuboid(-18.5F, -19.75F, 32.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 0).cuboid(-17.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(74, 58).cuboid(17.0F, -19.75F, 32.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 10).cuboid(16.5F, -19.75F, 32.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(147, 0).cuboid(-17.0F, -19.75F, 32.5F, 34.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 46.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r26 = muscle_car.addChild("cube_r26", ModelPartBuilder.create().uv(36, 70).cuboid(-15.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(88, 188).cuboid(-15.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(18, 75).cuboid(-15.0F, -12.5F, -42.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 19).cuboid(-15.0F, -12.5F, -41.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 93).cuboid(-15.0F, -12.0F, -40.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 70).cuboid(-15.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.3927F));

		ModelPartData cube_r27 = muscle_car.addChild("cube_r27", ModelPartBuilder.create().uv(74, 41).cuboid(14.0F, -12.0F, 31.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(126, 201).cuboid(14.0F, -12.0F, 26.0F, 1.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(74, 63).cuboid(14.0F, -12.5F, -42.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 19).cuboid(14.0F, -12.5F, -41.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 89).cuboid(14.0F, -12.0F, -40.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(62, 41).cuboid(14.0F, -12.0F, -26.0F, 1.0F, 4.0F, 40.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData cube_r28 = muscle_car.addChild("cube_r28", ModelPartBuilder.create().uv(108, 26).cuboid(-18.5F, 10.4F, -37.6F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r29 = muscle_car.addChild("cube_r29", ModelPartBuilder.create().uv(108, 32).cuboid(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 104.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r30 = muscle_car.addChild("cube_r30", ModelPartBuilder.create().uv(128, 109).cuboid(-54.5F, -20.5F, -19.9F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.0F, 0.0F, 104.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r31 = muscle_car.addChild("cube_r31", ModelPartBuilder.create().uv(128, 114).cuboid(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.0F, 0.0F, 104.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r32 = muscle_car.addChild("cube_r32", ModelPartBuilder.create().uv(128, 119).cuboid(-54.5F, -29.5F, -7.4F, 37.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.0F, 0.0F, 52.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r33 = muscle_car.addChild("cube_r33", ModelPartBuilder.create().uv(128, 103).cuboid(-18.5F, 25.4F, -26.7F, 37.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r34 = muscle_car.addChild("cube_r34", ModelPartBuilder.create().uv(185, 192).cuboid(-8.0F, -18.25F, -42.2F, 16.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(173, 192).cuboid(-2.5F, -25.25F, -42.2F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 52.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r35 = muscle_car.addChild("cube_r35", ModelPartBuilder.create().uv(23, 159).cuboid(3.5F, -2.9F, -29.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(124, 167).cuboid(-10.5F, -0.9F, -28.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.5236F, 0.0F, 0.1745F));

		ModelPartData cube_r36 = muscle_car.addChild("cube_r36", ModelPartBuilder.create().uv(0, 38).cuboid(-6.0F, -6.75F, -47.82F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 103).cuboid(-6.0F, -4.25F, -47.82F, 12.0F, 1.0F, 5.0F, new Dilation(0.0F))
				.uv(192, 148).cuboid(-6.0F, -2.25F, -47.32F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 52.0F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r37 = muscle_car.addChild("cube_r37", ModelPartBuilder.create().uv(0, 108).cuboid(-6.0F, -6.75F, -47.82F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 192).cuboid(-6.0F, -4.25F, -47.82F, 12.0F, 1.0F, 5.0F, new Dilation(0.0F))
				.uv(192, 146).cuboid(-6.0F, -2.25F, -47.32F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 52.0F, 0.0F, -0.1309F, 0.0F));

		ModelPartData cube_r38 = muscle_car.addChild("cube_r38", ModelPartBuilder.create().uv(59, 140).cuboid(-0.5F, -37.25F, -30.52F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(202, 162).cuboid(0.5F, -37.25F, -30.52F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData cube_r39 = muscle_car.addChild("cube_r39", ModelPartBuilder.create().uv(138, 159).cuboid(-0.5F, -37.25F, -30.52F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 203).cuboid(-6.5F, -37.25F, -30.52F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData cube_r40 = muscle_car.addChild("cube_r40", ModelPartBuilder.create().uv(39, 114).cuboid(-0.5F, -37.25F, -30.8F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r41 = muscle_car.addChild("cube_r41", ModelPartBuilder.create().uv(0, 29).cuboid(-0.5F, -17.0F, -23.2F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 80).cuboid(-16.5F, -19.5F, -28.0F, 1.0F, 13.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r42 = muscle_car.addChild("cube_r42", ModelPartBuilder.create().uv(91, 149).cuboid(-5.5F, -27.75F, -42.25F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -3.0F, 53.0F, 0.3927F, 0.1309F, 0.0F));

		ModelPartData cube_r43 = muscle_car.addChild("cube_r43", ModelPartBuilder.create().uv(185, 197).cuboid(-6.5F, -27.75F, -42.25F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -3.0F, 53.0F, 0.3927F, -0.1309F, 0.0F));

		ModelPartData cube_r44 = muscle_car.addChild("cube_r44", ModelPartBuilder.create().uv(118, 169).cuboid(-0.5F, -27.75F, -42.65F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -3.0F, 53.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r45 = muscle_car.addChild("cube_r45", ModelPartBuilder.create().uv(0, 35).cuboid(3.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(23, 198).cuboid(-6.5F, -6.25F, -47.25F, 8.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r46 = muscle_car.addChild("cube_r46", ModelPartBuilder.create().uv(124, 169).cuboid(-11.5F, -23.0F, -21.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(199, 25).cuboid(-1.5F, -6.25F, -47.25F, 8.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r47 = muscle_car.addChild("cube_r47", ModelPartBuilder.create().uv(108, 0).cuboid(10.25F, -15.25F, -45.0F, 7.0F, 1.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData cube_r48 = muscle_car.addChild("cube_r48", ModelPartBuilder.create().uv(0, 114).cuboid(-17.25F, -15.25F, -45.0F, 7.0F, 1.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData cube_r49 = muscle_car.addChild("cube_r49", ModelPartBuilder.create().uv(39, 122).cuboid(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(62, 180).cuboid(-6.0F, -5.25F, -47.82F, 12.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -8.0F, 50.0F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r50 = muscle_car.addChild("cube_r50", ModelPartBuilder.create().uv(23, 155).cuboid(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(39, 114).cuboid(-6.0F, -5.25F, -47.82F, 12.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -8.0F, 50.0F, 0.0F, -0.1309F, 0.0F));

		ModelPartData cube_r51 = muscle_car.addChild("cube_r51", ModelPartBuilder.create().uv(0, 156).cuboid(-7.0F, -7.25F, -47.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -8.0F, 50.0F, 0.0F, -0.3927F, 0.0873F));

		ModelPartData cube_r52 = muscle_car.addChild("cube_r52", ModelPartBuilder.create().uv(148, 162).cuboid(0.0F, -7.25F, -47.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -8.0F, 50.0F, 0.0F, 0.3927F, -0.0873F));

		ModelPartData cube_r53 = muscle_car.addChild("cube_r53", ModelPartBuilder.create().uv(104, 41).cuboid(5.0F, -30.4F, -41.25F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.3927F, -0.1309F, 0.0F));

		ModelPartData cube_r54 = muscle_car.addChild("cube_r54", ModelPartBuilder.create().uv(104, 49).cuboid(-6.0F, -30.4F, -41.25F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.3927F, 0.1309F, 0.0F));

		ModelPartData cube_r55 = muscle_car.addChild("cube_r55", ModelPartBuilder.create().uv(168, 181).cuboid(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r56 = muscle_car.addChild("cube_r56", ModelPartBuilder.create().uv(188, 55).cuboid(-6.0F, -6.25F, -47.32F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 53.0F, 0.0F, -0.1309F, 0.0F));

		ModelPartData lights_r1 = muscle_car.addChild("lights_r1", ModelPartBuilder.create().uv(36, 85).cuboid(-17.9F, 5.52F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 87).cuboid(-17.4F, 5.52F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 82).cuboid(-17.9F, 0.9F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 82).cuboid(-17.4F, 0.9F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(80, 58).cuboid(3.01F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(80, 60).cuboid(3.4F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 80).cuboid(3.01F, -19.98F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 80).cuboid(3.4F, -19.98F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData lights_r2 = muscle_car.addChild("lights_r2", ModelPartBuilder.create().uv(80, 63).cuboid(-4.0F, -20.0F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(80, 65).cuboid(-4.4F, -20.0F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 82).cuboid(-4.0F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(96, 67).cuboid(-4.4F, -15.3F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 77).cuboid(16.85F, 0.87F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(30, 77).cuboid(16.45F, 0.87F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 77).cuboid(16.85F, 5.55F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 80).cuboid(16.45F, 5.55F, -43.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData lights_r3 = muscle_car.addChild("lights_r3", ModelPartBuilder.create().uv(108, 18).cuboid(-4.25F, -35.0F, -30.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData lights_r4 = muscle_car.addChild("lights_r4", ModelPartBuilder.create().uv(29, 140).cuboid(1.75F, -35.0F, -30.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 52.0F, 0.7854F, 0.3927F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		muscle_car.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return muscle_car;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}
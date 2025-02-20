package net.fishyhard.musithy.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBoombox<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("musithy", "model_boombox"), "main");
	public final ModelPart boombox;

	public ModelBoombox(ModelPart root) {
		this.boombox = root.getChild("boombox");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition boombox = partdefinition.addOrReplaceChild("boombox", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -3.0F, -4.0F, 16.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition handle = boombox.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(0, 21).addBox(-8.0F, -11.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(7.0F, -11.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-7.0F, -11.0F, -1.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition bone = boombox.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 19).addBox(-7.0F, -11.0F, -3.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).texOffs(4, 0).addBox(6.0F, -11.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(3.0F, 4.0F, -1.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition Buttons = boombox.addOrReplaceChild("Buttons",
				CubeListBuilder.create().texOffs(0, 26).addBox(2.0F, -9.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 25).addBox(4.0F, -8.4F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 25)
						.addBox(1.0F, -8.4F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-1.0F, -9.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-2.0F, -9.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-3.0F, -9.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(0.0F, -9.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(1.0F, -8.5F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.3F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		boombox.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}

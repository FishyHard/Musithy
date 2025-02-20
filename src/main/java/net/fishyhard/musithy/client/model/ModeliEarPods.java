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
public class ModeliEarPods<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("musithy", "modeli_ear_pods"), "main");
	public final ModelPart Head;

	public ModeliEarPods(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(3.0F, -30.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false).texOffs(20, 16).mirror()
				.addBox(3.0F, -30.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 25.2F, -2.0F, -0.0446F, 0.2092F, -0.0093F));
		PartDefinition bone2 = Head.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0).addBox(17.1017F, -30.0F, -4.6978F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(20, 16).addBox(17.1017F, -30.0F, -5.6978F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-22.0F, 25.2F, -2.0F, -0.0446F, -0.2092F, 0.0093F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}

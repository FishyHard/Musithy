
package net.fishyhard.musithy.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.fishyhard.musithy.procedures.RetroBoomboxEntityShakingConditionProcedure;
import net.fishyhard.musithy.entity.RetroBoomboxPlayEntity;
import net.fishyhard.musithy.client.model.ModelBoombox;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RetroBoomboxPlayRenderer extends MobRenderer<RetroBoomboxPlayEntity, ModelBoombox<RetroBoomboxPlayEntity>> {
	public RetroBoomboxPlayRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBoombox<RetroBoomboxPlayEntity>(context.bakeLayer(ModelBoombox.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<RetroBoomboxPlayEntity, ModelBoombox<RetroBoomboxPlayEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("musithy:textures/entities/boombox_play.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, RetroBoomboxPlayEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RetroBoomboxPlayEntity entity) {
		return ResourceLocation.parse("musithy:textures/entities/boombox.png");
	}

	@Override
	protected boolean isShaking(RetroBoomboxPlayEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return RetroBoomboxEntityShakingConditionProcedure.execute();
	}
}

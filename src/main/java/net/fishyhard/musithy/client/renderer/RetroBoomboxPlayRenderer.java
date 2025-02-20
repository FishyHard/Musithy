
package net.fishyhard.musithy.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.fishyhard.musithy.procedures.RetroBoomboxEntityShakingConditionProcedure;
import net.fishyhard.musithy.entity.RetroBoomboxPlayEntity;
import net.fishyhard.musithy.client.model.ModelBoombox;

public class RetroBoomboxPlayRenderer extends MobRenderer<RetroBoomboxPlayEntity, ModelBoombox<RetroBoomboxPlayEntity>> {
	public RetroBoomboxPlayRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBoombox(context.bakeLayer(ModelBoombox.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<RetroBoomboxPlayEntity, ModelBoombox<RetroBoomboxPlayEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("musithy:textures/entities/boombox_play.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RetroBoomboxPlayEntity entity) {
		return new ResourceLocation("musithy:textures/entities/boombox.png");
	}

	@Override
	protected boolean isShaking(RetroBoomboxPlayEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return RetroBoomboxEntityShakingConditionProcedure.execute();
	}
}

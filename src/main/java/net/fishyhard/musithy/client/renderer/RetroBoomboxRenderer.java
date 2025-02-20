
package net.fishyhard.musithy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.fishyhard.musithy.entity.RetroBoomboxEntity;
import net.fishyhard.musithy.client.model.ModelBoombox;

public class RetroBoomboxRenderer extends MobRenderer<RetroBoomboxEntity, ModelBoombox<RetroBoomboxEntity>> {
	public RetroBoomboxRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBoombox<RetroBoomboxEntity>(context.bakeLayer(ModelBoombox.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(RetroBoomboxEntity entity) {
		return ResourceLocation.parse("musithy:textures/entities/boombox.png");
	}
}

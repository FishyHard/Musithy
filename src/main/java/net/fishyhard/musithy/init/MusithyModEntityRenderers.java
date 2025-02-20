
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.fishyhard.musithy.client.renderer.RetroBoomboxRenderer;
import net.fishyhard.musithy.client.renderer.RetroBoomboxPlayRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MusithyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MusithyModEntities.RETRO_BOOMBOX_PLAY.get(), RetroBoomboxPlayRenderer::new);
		event.registerEntityRenderer(MusithyModEntities.RETRO_BOOMBOX.get(), RetroBoomboxRenderer::new);
	}
}

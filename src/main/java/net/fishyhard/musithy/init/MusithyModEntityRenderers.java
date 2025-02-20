
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.fishyhard.musithy.client.renderer.RetroBoomboxRenderer;
import net.fishyhard.musithy.client.renderer.RetroBoomboxPlayRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MusithyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MusithyModEntities.RETRO_BOOMBOX.get(), RetroBoomboxRenderer::new);
		event.registerEntityRenderer(MusithyModEntities.RETRO_BOOMBOX_PLAY.get(), RetroBoomboxPlayRenderer::new);
	}
}

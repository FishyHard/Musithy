
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.fishyhard.musithy.client.model.Modelvbl_heapdhones;
import net.fishyhard.musithy.client.model.ModeliEarPods;
import net.fishyhard.musithy.client.model.ModelBoombox;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MusithyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvbl_heapdhones.LAYER_LOCATION, Modelvbl_heapdhones::createBodyLayer);
		event.registerLayerDefinition(ModelBoombox.LAYER_LOCATION, ModelBoombox::createBodyLayer);
		event.registerLayerDefinition(ModeliEarPods.LAYER_LOCATION, ModeliEarPods::createBodyLayer);
	}
}

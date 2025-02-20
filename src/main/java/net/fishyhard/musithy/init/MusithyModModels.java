
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.fishyhard.musithy.client.model.Modelvbl_heapdhones;
import net.fishyhard.musithy.client.model.ModeliEarPods;
import net.fishyhard.musithy.client.model.ModelBoombox;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MusithyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvbl_heapdhones.LAYER_LOCATION, Modelvbl_heapdhones::createBodyLayer);
		event.registerLayerDefinition(ModelBoombox.LAYER_LOCATION, ModelBoombox::createBodyLayer);
		event.registerLayerDefinition(ModeliEarPods.LAYER_LOCATION, ModeliEarPods::createBodyLayer);
	}
}

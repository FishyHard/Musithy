package net.fishyhard.musithy.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.fishyhard.musithy.client.renderer.VBLHeadphonesWhiteRenderer;
import net.fishyhard.musithy.client.renderer.VBLHeadphonesRenderer;
import net.fishyhard.musithy.client.renderer.VBLHeadphonesRedRenderer;
import net.fishyhard.musithy.client.renderer.VBLHeadphonesPurpleRenderer;
import net.fishyhard.musithy.client.renderer.VBLHeadphonesBlueRenderer;
import net.fishyhard.musithy.client.renderer.IEarPodsRenderer;
import net.fishyhard.musithy.client.model.Modelvbl_heapdhones;
import net.fishyhard.musithy.client.model.ModeliEarPods;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusithyModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(MusithyModLayerDefinitions.VBL_HEADPHONES_BLUE, Modelvbl_heapdhones::createBodyLayer);
		evt.registerLayerDefinition(MusithyModLayerDefinitions.VBL_HEADPHONES, Modelvbl_heapdhones::createBodyLayer);
		evt.registerLayerDefinition(MusithyModLayerDefinitions.VBL_HEADPHONES_RED, Modelvbl_heapdhones::createBodyLayer);
		evt.registerLayerDefinition(MusithyModLayerDefinitions.VBL_HEADPHONES_PURPLE, Modelvbl_heapdhones::createBodyLayer);
		evt.registerLayerDefinition(MusithyModLayerDefinitions.VBL_HEADPHONES_WHITE, Modelvbl_heapdhones::createBodyLayer);
		evt.registerLayerDefinition(MusithyModLayerDefinitions.I_EAR_PODS, ModeliEarPods::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(MusithyModItems.VBL_HEADPHONES_BLUE.get(), VBLHeadphonesBlueRenderer::new);
		CuriosRendererRegistry.register(MusithyModItems.VBL_HEADPHONES.get(), VBLHeadphonesRenderer::new);
		CuriosRendererRegistry.register(MusithyModItems.VBL_HEADPHONES_RED.get(), VBLHeadphonesRedRenderer::new);
		CuriosRendererRegistry.register(MusithyModItems.VBL_HEADPHONES_PURPLE.get(), VBLHeadphonesPurpleRenderer::new);
		CuriosRendererRegistry.register(MusithyModItems.VBL_HEADPHONES_WHITE.get(), VBLHeadphonesWhiteRenderer::new);
		CuriosRendererRegistry.register(MusithyModItems.I_EAR_PODS.get(), IEarPodsRenderer::new);
	}
}

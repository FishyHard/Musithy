package net.fishyhard.musithy.init;

import top.theillusivec4.curios.api.SlotTypePreset;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.CuriosApi;

import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.InterModComms;
import net.neoforged.bus.api.SubscribeEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MusithyModCuriosSlots {
	@SubscribeEvent
	public static void enqueueIMC(final InterModEnqueueEvent event) {
		InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> SlotTypePreset.HEAD.getMessageBuilder().size(1).build());
	}
}

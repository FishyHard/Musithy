
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.fishyhard.musithy.client.gui.MusithyAppScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MusithyModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MusithyModMenus.MUSITHY_APP.get(), MusithyAppScreen::new);
	}
}

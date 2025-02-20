
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusithyModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("musithy", "headphones"),
				builder -> builder.title(Component.translatable("item_group.musithy.headphones")).icon(() -> new ItemStack(MusithyModItems.VBL_HEADPHONES.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MusithyModItems.VBL_HEADPHONES_BLUE.get());
					tabData.accept(MusithyModItems.VBL_HEADPHONES.get());
					tabData.accept(MusithyModItems.VBL_HEADPHONES_RED.get());
					tabData.accept(MusithyModItems.VBL_HEADPHONES_PURPLE.get());
					tabData.accept(MusithyModItems.VBL_HEADPHONES_WHITE.get());
					tabData.accept(MusithyModItems.I_EAR_PODS.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("musithy", "boomboxes"),
				builder -> builder.title(Component.translatable("item_group.musithy.boomboxes")).icon(() -> new ItemStack(MusithyModItems.RETRO_BOOMBOX_ITEM.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MusithyModItems.RETRO_BOOMBOX_ITEM.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("musithy", "cassette_tapes"),
				builder -> builder.title(Component.translatable("item_group.musithy.cassette_tapes")).icon(() -> new ItemStack(MusithyModItems.CASSETTE_TAPE_G.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MusithyModItems.CASSETTE_TAPE_G.get());
					tabData.accept(MusithyModItems.CASSETTE_TAPE_ENTER_THE_PORTAL.get());
					tabData.accept(MusithyModItems.CASSETTE_TAPE_SUNDIAL_3.get());
					tabData.accept(MusithyModItems.CASSETTE_TAPE_SUNDIAL_4.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("musithy", "nether_cassette_tapes"),
				builder -> builder.title(Component.translatable("item_group.musithy.nether_cassette_tapes")).icon(() -> new ItemStack(MusithyModItems.CASSETTE_TAPE_DETERMINE_YOUR_FATE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MusithyModItems.CASSETTE_TAPE_DETERMINE_YOUR_FATE.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("musithy", "end_cassette_tapes"),
				builder -> builder.title(Component.translatable("item_group.musithy.end_cassette_tapes")).icon(() -> new ItemStack(MusithyModItems.CASSETTE_TAPE_MEET_THE_CONDUCTOR.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MusithyModItems.CASSETTE_TAPE_MEET_THE_CONDUCTOR.get());
				})

		);
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.fishyhard.musithy.MusithyMod;

public class MusithyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MusithyMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HEADPHONES = REGISTRY.register("headphones",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.musithy.headphones")).icon(() -> new ItemStack(MusithyModItems.VBL_HEADPHONES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MusithyModItems.VBL_HEADPHONES.get());
				tabData.accept(MusithyModItems.VBL_HEADPHONES_BLUE.get());
				tabData.accept(MusithyModItems.VBL_HEADPHONES_RED.get());
				tabData.accept(MusithyModItems.VBL_HEADPHONES_PURPLE.get());
				tabData.accept(MusithyModItems.VBL_HEADPHONES_WHITE.get());
				tabData.accept(MusithyModItems.I_EAR_PODS.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BOOMBOXES = REGISTRY.register("boomboxes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.musithy.boomboxes")).icon(() -> new ItemStack(MusithyModItems.RETRO_BOOMBOX_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MusithyModItems.RETRO_BOOMBOX_ITEM.get());
			}).withTabsBefore(HEADPHONES.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CASSETTE_TAPES = REGISTRY.register("cassette_tapes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.musithy.cassette_tapes")).icon(() -> new ItemStack(MusithyModItems.CASSETTE_TAPE_G.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MusithyModItems.CASSETTE_TAPE_G.get());
				tabData.accept(MusithyModItems.CASSETTE_TAPE_ENTER_THE_PORTAL.get());
				tabData.accept(MusithyModItems.CASSETTE_TAPE_SUNDIAL_3.get());
				tabData.accept(MusithyModItems.CASSETTE_TAPE_SUNDIAL_4.get());
			}).withTabsBefore(BOOMBOXES.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NETHER_CASSETTE_TAPES = REGISTRY.register("nether_cassette_tapes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.musithy.nether_cassette_tapes")).icon(() -> new ItemStack(MusithyModItems.CASSETTE_TAPE_DETERMINE_YOUR_FATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MusithyModItems.CASSETTE_TAPE_DETERMINE_YOUR_FATE.get());
			}).withTabsBefore(CASSETTE_TAPES.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> END_CASSETTE_TAPES = REGISTRY.register("end_cassette_tapes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.musithy.end_cassette_tapes")).icon(() -> new ItemStack(MusithyModItems.CASSETTE_TAPE_MEET_THE_CONDUCTOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MusithyModItems.CASSETTE_TAPE_MEET_THE_CONDUCTOR.get());
			}).withTabsBefore(NETHER_CASSETTE_TAPES.getId()).build());
}

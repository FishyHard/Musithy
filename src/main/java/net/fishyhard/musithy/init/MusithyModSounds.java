
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.fishyhard.musithy.MusithyMod;

public class MusithyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MusithyMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MEET_THE_CONDUCTOR = REGISTRY.register("meet_the_conductor", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("musithy", "meet_the_conductor")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTER_THE_PORTAL = REGISTRY.register("enter_the_portal", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("musithy", "enter_the_portal")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SUNDIAL_4 = REGISTRY.register("sundial_4", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("musithy", "sundial_4")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DETERMINE_YOUR_FATE = REGISTRY.register("determine_your_fate", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("musithy", "determine_your_fate")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SUNDIAL_3 = REGISTRY.register("sundial_3", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("musithy", "sundial_3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> G = REGISTRY.register("g", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("musithy", "g")));
}

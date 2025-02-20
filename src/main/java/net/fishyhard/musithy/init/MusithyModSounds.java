
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.fishyhard.musithy.MusithyMod;

public class MusithyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MusithyMod.MODID);
	public static final RegistryObject<SoundEvent> MEET_THE_CONDUCTOR = REGISTRY.register("meet_the_conductor", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("musithy", "meet_the_conductor")));
	public static final RegistryObject<SoundEvent> ENTER_THE_PORTAL = REGISTRY.register("enter_the_portal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("musithy", "enter_the_portal")));
	public static final RegistryObject<SoundEvent> SUNDIAL_4 = REGISTRY.register("sundial_4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("musithy", "sundial_4")));
	public static final RegistryObject<SoundEvent> DETERMINE_YOUR_FATE = REGISTRY.register("determine_your_fate", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("musithy", "determine_your_fate")));
	public static final RegistryObject<SoundEvent> SUNDIAL_3 = REGISTRY.register("sundial_3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("musithy", "sundial_3")));
	public static final RegistryObject<SoundEvent> G = REGISTRY.register("g", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("musithy", "g")));
}

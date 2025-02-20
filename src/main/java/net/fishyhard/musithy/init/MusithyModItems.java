
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.fishyhard.musithy.item.VBLHeadphonesWhiteItem;
import net.fishyhard.musithy.item.VBLHeadphonesRedItem;
import net.fishyhard.musithy.item.VBLHeadphonesPurpleItem;
import net.fishyhard.musithy.item.VBLHeadphonesItem;
import net.fishyhard.musithy.item.VBLHeadphonesBlueItem;
import net.fishyhard.musithy.item.RetroBoomboxItemItem;
import net.fishyhard.musithy.item.IEarPodsItem;
import net.fishyhard.musithy.item.CassetteTapeSundial4Item;
import net.fishyhard.musithy.item.CassetteTapeSundial3Item;
import net.fishyhard.musithy.item.CassetteTapeMeetTheConductorItem;
import net.fishyhard.musithy.item.CassetteTapeGItem;
import net.fishyhard.musithy.item.CassetteTapeEnterThePortalItem;
import net.fishyhard.musithy.item.CassetteTapeDetermineYourFateItem;
import net.fishyhard.musithy.MusithyMod;

public class MusithyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MusithyMod.MODID);
	public static final RegistryObject<Item> VBL_HEADPHONES_BLUE = REGISTRY.register("vbl_headphones_blue", () -> new VBLHeadphonesBlueItem());
	public static final RegistryObject<Item> VBL_HEADPHONES = REGISTRY.register("vbl_headphones", () -> new VBLHeadphonesItem());
	public static final RegistryObject<Item> VBL_HEADPHONES_RED = REGISTRY.register("vbl_headphones_red", () -> new VBLHeadphonesRedItem());
	public static final RegistryObject<Item> VBL_HEADPHONES_PURPLE = REGISTRY.register("vbl_headphones_purple", () -> new VBLHeadphonesPurpleItem());
	public static final RegistryObject<Item> VBL_HEADPHONES_WHITE = REGISTRY.register("vbl_headphones_white", () -> new VBLHeadphonesWhiteItem());
	public static final RegistryObject<Item> I_EAR_PODS = REGISTRY.register("i_ear_pods", () -> new IEarPodsItem());
	public static final RegistryObject<Item> RETRO_BOOMBOX_ITEM = REGISTRY.register("retro_boombox_item", () -> new RetroBoomboxItemItem());
	public static final RegistryObject<Item> CASSETTE_TAPE_G = REGISTRY.register("cassette_tape_g", () -> new CassetteTapeGItem());
	public static final RegistryObject<Item> CASSETTE_TAPE_ENTER_THE_PORTAL = REGISTRY.register("cassette_tape_enter_the_portal", () -> new CassetteTapeEnterThePortalItem());
	public static final RegistryObject<Item> CASSETTE_TAPE_DETERMINE_YOUR_FATE = REGISTRY.register("cassette_tape_determine_your_fate", () -> new CassetteTapeDetermineYourFateItem());
	public static final RegistryObject<Item> CASSETTE_TAPE_MEET_THE_CONDUCTOR = REGISTRY.register("cassette_tape_meet_the_conductor", () -> new CassetteTapeMeetTheConductorItem());
	public static final RegistryObject<Item> CASSETTE_TAPE_SUNDIAL_3 = REGISTRY.register("cassette_tape_sundial_3", () -> new CassetteTapeSundial3Item());
	public static final RegistryObject<Item> CASSETTE_TAPE_SUNDIAL_4 = REGISTRY.register("cassette_tape_sundial_4", () -> new CassetteTapeSundial4Item());
}

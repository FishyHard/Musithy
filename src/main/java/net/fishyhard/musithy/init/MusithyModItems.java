
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

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
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MusithyMod.MODID);
	public static final DeferredItem<Item> VBL_HEADPHONES = REGISTRY.register("vbl_headphones", VBLHeadphonesItem::new);
	public static final DeferredItem<Item> VBL_HEADPHONES_BLUE = REGISTRY.register("vbl_headphones_blue", VBLHeadphonesBlueItem::new);
	public static final DeferredItem<Item> VBL_HEADPHONES_RED = REGISTRY.register("vbl_headphones_red", VBLHeadphonesRedItem::new);
	public static final DeferredItem<Item> VBL_HEADPHONES_PURPLE = REGISTRY.register("vbl_headphones_purple", VBLHeadphonesPurpleItem::new);
	public static final DeferredItem<Item> VBL_HEADPHONES_WHITE = REGISTRY.register("vbl_headphones_white", VBLHeadphonesWhiteItem::new);
	public static final DeferredItem<Item> I_EAR_PODS = REGISTRY.register("i_ear_pods", IEarPodsItem::new);
	public static final DeferredItem<Item> RETRO_BOOMBOX_ITEM = REGISTRY.register("retro_boombox_item", RetroBoomboxItemItem::new);
	public static final DeferredItem<Item> CASSETTE_TAPE_G = REGISTRY.register("cassette_tape_g", CassetteTapeGItem::new);
	public static final DeferredItem<Item> CASSETTE_TAPE_ENTER_THE_PORTAL = REGISTRY.register("cassette_tape_enter_the_portal", CassetteTapeEnterThePortalItem::new);
	public static final DeferredItem<Item> CASSETTE_TAPE_DETERMINE_YOUR_FATE = REGISTRY.register("cassette_tape_determine_your_fate", CassetteTapeDetermineYourFateItem::new);
	public static final DeferredItem<Item> CASSETTE_TAPE_MEET_THE_CONDUCTOR = REGISTRY.register("cassette_tape_meet_the_conductor", CassetteTapeMeetTheConductorItem::new);
	public static final DeferredItem<Item> CASSETTE_TAPE_SUNDIAL_3 = REGISTRY.register("cassette_tape_sundial_3", CassetteTapeSundial3Item::new);
	public static final DeferredItem<Item> CASSETTE_TAPE_SUNDIAL_4 = REGISTRY.register("cassette_tape_sundial_4", CassetteTapeSundial4Item::new);
	// Start of user code block custom items
	// End of user code block custom items
}

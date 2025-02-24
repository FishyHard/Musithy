
package net.fishyhard.musithy.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.fishyhard.musithy.procedures.BubbleEquippedTickProcedure;

public class VBLHeadphonesItem extends Item implements ICurioItem {
	public VBLHeadphonesItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		BubbleEquippedTickProcedure.execute(slotContext.entity());
	}
}


package net.fishyhard.musithy.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VBLHeadphonesPurpleItem extends Item implements ICurioItem {
	public VBLHeadphonesPurpleItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}

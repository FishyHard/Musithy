
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.fishyhard.musithy.world.inventory.MusithyAppMenu;
import net.fishyhard.musithy.MusithyMod;

public class MusithyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MusithyMod.MODID);
	public static final RegistryObject<MenuType<MusithyAppMenu>> MUSITHY_APP = REGISTRY.register("musithy_app", () -> IForgeMenuType.create(MusithyAppMenu::new));
}

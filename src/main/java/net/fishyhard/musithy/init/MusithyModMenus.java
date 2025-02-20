
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.fishyhard.musithy.world.inventory.MusithyAppMenu;
import net.fishyhard.musithy.MusithyMod;

public class MusithyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, MusithyMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MusithyAppMenu>> MUSITHY_APP = REGISTRY.register("musithy_app", () -> IMenuTypeExtension.create(MusithyAppMenu::new));
}

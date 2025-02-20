package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class LibraryDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).MusithyApp == 1) {
			return true;
		}
		return false;
	}
}

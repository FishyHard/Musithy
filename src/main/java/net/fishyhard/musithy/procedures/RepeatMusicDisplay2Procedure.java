package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class RepeatMusicDisplay2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).RepeatMusic == 1) {
			return true;
		}
		return false;
	}
}

package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class LibraryButtonPressProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
			_vars.MusithyApp = 1;
			_vars.syncPlayerVariables(entity);
		}
	}
}

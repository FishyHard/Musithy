package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class CloseGUIProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
			_vars.MusithyApp = 0;
			_vars.syncPlayerVariables(entity);
		}
	}
}

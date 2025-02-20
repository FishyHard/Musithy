package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class RepeatButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).RepeatMusic == 0) {
			{
				MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
				_vars.RepeatMusic = 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).RepeatMusic == 1) {
			{
				MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
				_vars.RepeatMusic = 2;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).RepeatMusic == 2) {
			{
				MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
				_vars.RepeatMusic = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}

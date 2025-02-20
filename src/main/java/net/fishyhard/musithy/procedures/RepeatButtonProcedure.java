package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class RepeatButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MusithyModVariables.PlayerVariables())).RepeatMusic == 0) {
			{
				double _setval = 1;
				entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RepeatMusic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MusithyModVariables.PlayerVariables())).RepeatMusic == 1) {
			{
				double _setval = 2;
				entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RepeatMusic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MusithyModVariables.PlayerVariables())).RepeatMusic == 2) {
			{
				double _setval = 0;
				entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RepeatMusic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

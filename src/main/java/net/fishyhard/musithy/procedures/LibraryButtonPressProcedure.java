package net.fishyhard.musithy.procedures;

import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.network.MusithyModVariables;

public class LibraryButtonPressProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1;
			entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MusithyApp = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

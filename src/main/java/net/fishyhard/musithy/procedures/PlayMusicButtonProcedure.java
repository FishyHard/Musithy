package net.fishyhard.musithy.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.fishyhard.musithy.network.MusithyModVariables;

public class PlayMusicButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).MusicPlaying == false) {
			if (world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music.end")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music.end")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			{
				MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
				_vars.MusicPlaying = true;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(MusithyModVariables.PLAYER_VARIABLES).MusicPlaying == true) {
			{
				MusithyModVariables.PlayerVariables _vars = entity.getData(MusithyModVariables.PLAYER_VARIABLES);
				_vars.MusicPlaying = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}

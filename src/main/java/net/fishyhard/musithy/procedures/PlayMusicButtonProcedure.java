package net.fishyhard.musithy.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.fishyhard.musithy.network.MusithyModVariables;

public class PlayMusicButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MusithyModVariables.PlayerVariables())).MusicPlaying == false) {
			if (world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music.end")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music.end")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MusicPlaying = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MusithyModVariables.PlayerVariables())).MusicPlaying == true) {
			{
				boolean _setval = false;
				entity.getCapability(MusithyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MusicPlaying = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

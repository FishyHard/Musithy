package net.fishyhard.musithy.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class MusithyCloseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(Blocks.AIR.asItem(), lv).isPresent() : false) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}

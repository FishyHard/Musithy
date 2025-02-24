
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.fishyhard.musithy.entity.RetroBoomboxPlayEntity;
import net.fishyhard.musithy.entity.RetroBoomboxEntity;
import net.fishyhard.musithy.MusithyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MusithyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MusithyMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<RetroBoomboxEntity>> RETRO_BOOMBOX = register("retro_boombox",
			EntityType.Builder.<RetroBoomboxEntity>of(RetroBoomboxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<RetroBoomboxPlayEntity>> RETRO_BOOMBOX_PLAY = register("retro_boombox_play",
			EntityType.Builder.<RetroBoomboxPlayEntity>of(RetroBoomboxPlayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.7f, 0.7f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		RetroBoomboxEntity.init(event);
		RetroBoomboxPlayEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RETRO_BOOMBOX.get(), RetroBoomboxEntity.createAttributes().build());
		event.put(RETRO_BOOMBOX_PLAY.get(), RetroBoomboxPlayEntity.createAttributes().build());
	}
}

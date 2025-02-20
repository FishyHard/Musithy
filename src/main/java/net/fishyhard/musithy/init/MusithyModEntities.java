
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fishyhard.musithy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.fishyhard.musithy.entity.RetroBoomboxPlayEntity;
import net.fishyhard.musithy.entity.RetroBoomboxEntity;
import net.fishyhard.musithy.MusithyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusithyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MusithyMod.MODID);
	public static final RegistryObject<EntityType<RetroBoomboxPlayEntity>> RETRO_BOOMBOX_PLAY = register("retro_boombox_play", EntityType.Builder.<RetroBoomboxPlayEntity>of(RetroBoomboxPlayEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RetroBoomboxPlayEntity::new).fireImmune().sized(0.7f, 0.7f));
	public static final RegistryObject<EntityType<RetroBoomboxEntity>> RETRO_BOOMBOX = register("retro_boombox", EntityType.Builder.<RetroBoomboxEntity>of(RetroBoomboxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RetroBoomboxEntity::new).fireImmune().sized(0.7f, 0.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RetroBoomboxPlayEntity.init();
			RetroBoomboxEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RETRO_BOOMBOX_PLAY.get(), RetroBoomboxPlayEntity.createAttributes().build());
		event.put(RETRO_BOOMBOX.get(), RetroBoomboxEntity.createAttributes().build());
	}
}

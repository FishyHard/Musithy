
package net.fishyhard.musithy.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.fishyhard.musithy.procedures.MusithyOnKeyPressedProcedure;
import net.fishyhard.musithy.MusithyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record MusithyMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<MusithyMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MusithyMod.MODID, "key_musithy"));
	public static final StreamCodec<RegistryFriendlyByteBuf, MusithyMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, MusithyMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new MusithyMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<MusithyMessage> type() {
		return TYPE;
	}

	public static void handleData(final MusithyMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			MusithyOnKeyPressedProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MusithyMod.addNetworkMessage(MusithyMessage.TYPE, MusithyMessage.STREAM_CODEC, MusithyMessage::handleData);
	}
}

package net.fishyhard.musithy.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.fishyhard.musithy.world.inventory.MusithyAppMenu;
import net.fishyhard.musithy.procedures.RepeatMusicDisplayProcedure;
import net.fishyhard.musithy.procedures.RepeatMusicDisplay3Procedure;
import net.fishyhard.musithy.procedures.RepeatMusicDisplay2Procedure;
import net.fishyhard.musithy.procedures.MusithyDisplayProcedure;
import net.fishyhard.musithy.procedures.LibraryDisplayProcedure;
import net.fishyhard.musithy.network.MusithyAppButtonMessage;
import net.fishyhard.musithy.MusithyMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MusithyAppScreen extends AbstractContainerScreen<MusithyAppMenu> {
	private final static HashMap<String, Object> guistate = MusithyAppMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_repeat_invisible_button;
	ImageButton imagebutton_play_button_gui;
	ImageButton imagebutton_repeat_button;
	ImageButton imagebutton_repeat1_button;
	ImageButton imagebutton_norepeat_button;
	ImageButton imagebutton_library_gui;
	ImageButton imagebutton_button_invisible;

	public MusithyAppScreen(MusithyAppMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 272;
		this.imageHeight = 175;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		if (LibraryDisplayProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("musithy:textures/screens/musithyappguilibrary.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 272, 175, 272, 175);
		}
		if (MusithyDisplayProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("musithy:textures/screens/musithyappgui.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 272, 175, 272, 175);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		if (MusithyDisplayProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.musithy.musithy_app.label_library"), 25, 50, -3355444);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_repeat_invisible_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11, 0, 0, 11, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_repeat_invisible_button.png"), 10, 22, e -> {
			if (true) {
				MusithyMod.PACKET_HANDLER.sendToServer(new MusithyAppButtonMessage(0, x, y, z));
				MusithyAppButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_repeat_invisible_button", imagebutton_repeat_invisible_button);
		this.addRenderableWidget(imagebutton_repeat_invisible_button);
		imagebutton_play_button_gui = new ImageButton(this.leftPos + 127, this.topPos + 153, 16, 16, 0, 0, 16, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_play_button_gui.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_play_button_gui", imagebutton_play_button_gui);
		this.addRenderableWidget(imagebutton_play_button_gui);
		imagebutton_repeat_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11, 0, 0, 11, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_repeat_button.png"), 10, 22, e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (RepeatMusicDisplay2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_repeat_button", imagebutton_repeat_button);
		this.addRenderableWidget(imagebutton_repeat_button);
		imagebutton_repeat1_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11, 0, 0, 11, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_repeat1_button.png"), 10, 22, e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (RepeatMusicDisplay3Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_repeat1_button", imagebutton_repeat1_button);
		this.addRenderableWidget(imagebutton_repeat1_button);
		imagebutton_norepeat_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11, 0, 0, 11, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_norepeat_button.png"), 10, 22, e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (RepeatMusicDisplayProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_norepeat_button", imagebutton_norepeat_button);
		this.addRenderableWidget(imagebutton_norepeat_button);
		imagebutton_library_gui = new ImageButton(this.leftPos + 7, this.topPos + 46, 16, 16, 0, 0, 16, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_library_gui.png"), 16, 32, e -> {
			if (MusithyDisplayProcedure.execute(entity)) {
				MusithyMod.PACKET_HANDLER.sendToServer(new MusithyAppButtonMessage(5, x, y, z));
				MusithyAppButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (MusithyDisplayProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_library_gui", imagebutton_library_gui);
		this.addRenderableWidget(imagebutton_library_gui);
		imagebutton_button_invisible = new ImageButton(this.leftPos + 7, this.topPos + 8, 32, 32, 0, 0, 32, new ResourceLocation("musithy:textures/screens/atlas/imagebutton_button_invisible.png"), 32, 64, e -> {
			if (true) {
				MusithyMod.PACKET_HANDLER.sendToServer(new MusithyAppButtonMessage(6, x, y, z));
				MusithyAppButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_invisible", imagebutton_button_invisible);
		this.addRenderableWidget(imagebutton_button_invisible);
	}
}

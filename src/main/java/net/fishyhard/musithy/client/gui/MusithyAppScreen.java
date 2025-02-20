package net.fishyhard.musithy.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.fishyhard.musithy.world.inventory.MusithyAppMenu;
import net.fishyhard.musithy.procedures.RepeatMusicDisplayProcedure;
import net.fishyhard.musithy.procedures.RepeatMusicDisplay3Procedure;
import net.fishyhard.musithy.procedures.RepeatMusicDisplay2Procedure;
import net.fishyhard.musithy.procedures.MusithyDisplayProcedure;
import net.fishyhard.musithy.procedures.LibraryDisplayProcedure;
import net.fishyhard.musithy.network.MusithyAppButtonMessage;

import java.util.HashMap;

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
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		if (LibraryDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("musithy:textures/screens/musithyappguilibrary.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 272, 175, 272, 175);
		}
		if (MusithyDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("musithy:textures/screens/musithyappgui.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 272, 175, 272, 175);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		if (MusithyDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.musithy.musithy_app.label_library"), 25, 50, -3355444, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_repeat_invisible_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/repeat_invisible_button.png"), ResourceLocation.parse("musithy:textures/screens/repeat_invisible_button.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new MusithyAppButtonMessage(0, x, y, z));
						MusithyAppButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_repeat_invisible_button", imagebutton_repeat_invisible_button);
		this.addRenderableWidget(imagebutton_repeat_invisible_button);
		imagebutton_play_button_gui = new ImageButton(this.leftPos + 127, this.topPos + 153, 16, 16,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/play_button_gui.png"), ResourceLocation.parse("musithy:textures/screens/play_button_gui_hover.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_play_button_gui", imagebutton_play_button_gui);
		this.addRenderableWidget(imagebutton_play_button_gui);
		imagebutton_repeat_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/repeat_button.png"), ResourceLocation.parse("musithy:textures/screens/repeat_button.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (RepeatMusicDisplay2Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_repeat_button", imagebutton_repeat_button);
		this.addRenderableWidget(imagebutton_repeat_button);
		imagebutton_repeat1_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/repeat1_button.png"), ResourceLocation.parse("musithy:textures/screens/repeat1_button.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (RepeatMusicDisplay3Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_repeat1_button", imagebutton_repeat1_button);
		this.addRenderableWidget(imagebutton_repeat1_button);
		imagebutton_norepeat_button = new ImageButton(this.leftPos + 153, this.topPos + 155, 10, 11,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/norepeat_button.png"), ResourceLocation.parse("musithy:textures/screens/norepeat_button.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (RepeatMusicDisplayProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_norepeat_button", imagebutton_norepeat_button);
		this.addRenderableWidget(imagebutton_norepeat_button);
		imagebutton_library_gui = new ImageButton(this.leftPos + 7, this.topPos + 46, 16, 16,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/library_gui.png"), ResourceLocation.parse("musithy:textures/screens/library_gui_hover.png")), e -> {
					if (MusithyDisplayProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new MusithyAppButtonMessage(5, x, y, z));
						MusithyAppButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (MusithyDisplayProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_library_gui", imagebutton_library_gui);
		this.addRenderableWidget(imagebutton_library_gui);
		imagebutton_button_invisible = new ImageButton(this.leftPos + 7, this.topPos + 8, 32, 32,
				new WidgetSprites(ResourceLocation.parse("musithy:textures/screens/button_invisible.png"), ResourceLocation.parse("musithy:textures/screens/button_invisible.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new MusithyAppButtonMessage(6, x, y, z));
						MusithyAppButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_button_invisible", imagebutton_button_invisible);
		this.addRenderableWidget(imagebutton_button_invisible);
	}
}

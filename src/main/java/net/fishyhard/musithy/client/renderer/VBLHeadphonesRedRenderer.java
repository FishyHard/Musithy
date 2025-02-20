package net.fishyhard.musithy.client.renderer;

import top.theillusivec4.curios.api.client.ICurioRenderer;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.fishyhard.musithy.init.MusithyModLayerDefinitions;
import net.fishyhard.musithy.client.model.Modelvbl_heapdhones;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VBLHeadphonesRedRenderer implements ICurioRenderer {
	private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath("musithy", "textures/entities/vbl_headphone_red.png");
	private final Modelvbl_heapdhones model;

	public VBLHeadphonesRedRenderer() {
		this.model = new Modelvbl_heapdhones(Minecraft.getInstance().getEntityModels().bakeLayer(MusithyModLayerDefinitions.VBL_HEADPHONES_RED));
	}

	@Override
	public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer, int light, float limbSwing,
			float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		LivingEntity entity = slotContext.entity();
		ICurioRenderer.translateIfSneaking(matrixStack, entity);
		ICurioRenderer.rotateIfSneaking(matrixStack, entity);
		this.model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
		this.model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, RenderType.armorCutoutNoCull(TEXTURE), false);
		this.model.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY);
	}
}

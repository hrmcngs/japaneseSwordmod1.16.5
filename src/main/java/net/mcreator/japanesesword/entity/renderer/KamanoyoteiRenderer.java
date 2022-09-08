package net.mcreator.japanesesword.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.japanesesword.item.KamanoyoteiItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class KamanoyoteiRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(KamanoyoteiItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<KamanoyoteiItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("japanesesword:textures/entities/kuro.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(KamanoyoteiItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelcustom_model();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(KamanoyoteiItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public Modelcustom_model() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(7, 2).addBox(-0.5F, -3.0F, 5.25F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(8, 15).addBox(-0.5F, -5.0F, 4.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(15, 4).addBox(-0.5F, -6.0F, 3.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(4, 15).addBox(-0.5F, -7.0F, 2.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 14).addBox(-0.5F, -8.0F, 1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 12).addBox(-0.5F, -9.0F, 0.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 0).addBox(-0.5F, -10.0F, -0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 5).addBox(-0.5F, -11.0F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(16, 11).addBox(-0.5F, -11.0F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 8).addBox(-0.5F, -11.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(12, 0).addBox(-0.5F, -13.0F, -4.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-0.5F, -13.0F, -5.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(-0.5F, -14.0F, -5.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(15, 15).addBox(-0.5F, -13.0F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(16, 8).addBox(-0.5F, -13.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(7, 8).addBox(-0.5F, -14.0F, -0.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(16, 0).addBox(-0.5F, -15.0F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 5).addBox(-0.5F, -16.0F, -1.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-0.5F, -15.0F, -1.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(10, 0).addBox(-0.5F, -15.0F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 12).addBox(-0.5F, -14.0F, -2.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(12, 17).addBox(-0.5F, -4.0F, 5.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}

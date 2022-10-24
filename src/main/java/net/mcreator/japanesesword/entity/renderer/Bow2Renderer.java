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

import net.mcreator.japanesesword.item.Bow2Item;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Bow2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Bow2Item.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<Bow2Item.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("japanesesword:textures/entities/aroow12.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(Bow2Item.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelarooow();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(Bow2Item.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.4.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelarooow extends EntityModel<Entity> {
		private final ModelRenderer bone3;
		private final ModelRenderer bone2;
		private final ModelRenderer bone;

		public Modelarooow() {
			textureWidth = 32;
			textureHeight = 32;
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.5F, -0.5F, 0.0F);
			bone3.addChild(bone2);
			bone2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 0.0F, 14.0F, 0.0F, false);
			bone2.setTextureOffset(5, 2).addBox(0.0F, -1.0F, 5.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(2, 3).addBox(-2.0F, -1.0F, -5.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(0, 3).addBox(-3.0F, -1.0F, -6.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(2, 0).addBox(1.0F, -1.0F, -6.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -5.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(5, 0).addBox(-2.0F, -1.0F, 5.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(bone);
			bone.setTextureOffset(0, 6).addBox(0.0F, -3.0F, -5.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 5).addBox(0.0F, -4.0F, -6.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(0.0F, -2.0F, -6.0F, 0.0F, 1.0F, 14.0F, 0.0F, false);
			bone.setTextureOffset(6, 4).addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 4).addBox(0.0F, 0.0F, -6.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(6, 5).addBox(0.0F, -3.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 3).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}

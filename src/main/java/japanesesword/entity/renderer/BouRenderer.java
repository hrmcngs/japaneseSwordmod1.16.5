package japanesesword.entity.renderer;

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

import japanesesword.item.BouItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BouRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BouItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<BouItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("japanesesword:textures/entities/arrows.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(BouItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelarrow2();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(BouItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelarrow2 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;

		public Modelarrow2() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 23.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, -2.3562F);
			body_r1.setTextureOffset(0, 0).addBox(-1.2F, -1.2F, 0.0F, 1.0F, 1.0F, 13.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 0.7854F);
			body_r2.setTextureOffset(0, 0).addBox(-2.5F, -2.5F, 12.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);
			body_r2.setTextureOffset(0, 0).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 16.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, 0.0F, -0.7854F);
			body_r3.setTextureOffset(0, 0).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 16.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}

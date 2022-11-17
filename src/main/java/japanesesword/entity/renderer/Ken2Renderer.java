
package japanesesword.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import japanesesword.entity.Ken2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Ken2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Ken2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelkkakakkakakkakkakakkaka(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("japanesesword:textures/entities/kuro.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.4.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelkkakakkakakkakkakakkaka extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone4;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;

		public Modelkkakakkakakkakkakakkaka() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -13.0F, -18.0F);
			setRotationAngle(bone, -2.3562F, 0.0F, 0.0F);
			bone.setTextureOffset(44, 10).addBox(-1.0F, -6.0F, -24.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -4.0F, 4.0F);
			bone.addChild(bone4);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(bone2);
			bone2.setTextureOffset(32, 48).addBox(-1.0F, -8.0F, -20.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(48, 48).addBox(-1.0F, -6.0F, -22.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(44, 0).addBox(-1.0F, -4.0F, -24.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(16, 16).addBox(-1.0F, -2.0F, -22.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(0, 22).addBox(-1.0F, -12.0F, -16.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(0, 16).addBox(-1.0F, -10.0F, -18.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -6.0F, 6.0F);
			bone4.addChild(bone3);
			bone3.setTextureOffset(14, 40).addBox(-1.0F, -8.0F, -22.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone3.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -24.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			bone3.setTextureOffset(46, 24).addBox(-1.0F, -2.0F, -16.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			bone3.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -14.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone3.setTextureOffset(46, 36).addBox(-1.0F, -12.0F, -26.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			bone3.setTextureOffset(0, 6).addBox(-1.0F, -14.0F, -26.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone3.setTextureOffset(0, 16).addBox(-1.0F, -6.0F, -18.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone5);
			bone5.setTextureOffset(32, 24).addBox(-1.0F, -24.0F, -6.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone5.setTextureOffset(32, 36).addBox(-1.0F, -22.0F, -8.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone5.setTextureOffset(0, 30).addBox(-1.0F, -28.0F, -2.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone5.setTextureOffset(30, 12).addBox(-1.0F, -26.0F, -4.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone5.setTextureOffset(18, 28).addBox(-1.0F, -30.0F, 0.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, -4.0F, 4.0F);
			bone.addChild(bone6);
			bone6.setTextureOffset(18, 0).addBox(-1.0F, -28.0F, -2.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone6.setTextureOffset(16, 16).addBox(-1.0F, -30.0F, 0.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			bone6.setTextureOffset(0, 42).addBox(-1.0F, -34.0F, 4.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			bone6.setTextureOffset(32, 0).addBox(-1.0F, -32.0F, 2.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
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

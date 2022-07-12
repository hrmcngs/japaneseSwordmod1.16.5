
package net.mcreator.japanesesword.entity.renderer;

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

import net.mcreator.japanesesword.entity.ZanngekimobEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ZanngekimobRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ZanngekimobEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelzanngeki(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("japanesesword:textures/katanadaisuki.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelzanngeki extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public Modelzanngeki() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 6).addBox(2.0F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 8).addBox(5.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(7, 3).addBox(-5.0F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(7, 5).addBox(-7.0F, -2.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(7, 7).addBox(4.0F, -2.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 2).addBox(-4.0F, -4.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 4).addBox(1.0F, -4.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(9, 1).addBox(-8.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
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

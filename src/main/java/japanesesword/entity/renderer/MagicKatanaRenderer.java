
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

import japanesesword.entity.MagicKatanaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MagicKatanaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MagicKatanaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmazickatana(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("japanesesword:textures/entities/magickatana.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.6.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelmazickatana extends EntityModel<Entity> {
		private final ModelRenderer bone43;
		private final ModelRenderer bone29;
		private final ModelRenderer bone30;
		private final ModelRenderer bone31;
		private final ModelRenderer bone32;
		private final ModelRenderer bone33;
		private final ModelRenderer bone34;
		private final ModelRenderer bone35;
		private final ModelRenderer bone36;
		private final ModelRenderer bone37;
		private final ModelRenderer bone38;
		private final ModelRenderer bone39;
		private final ModelRenderer bone15;
		private final ModelRenderer bone16;
		private final ModelRenderer bone17;
		private final ModelRenderer bone18;
		private final ModelRenderer bone19;
		private final ModelRenderer bone20;
		private final ModelRenderer bone21;
		private final ModelRenderer bone22;
		private final ModelRenderer bone26;
		private final ModelRenderer bone27;
		private final ModelRenderer bone28;
		private final ModelRenderer bone10;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		private final ModelRenderer bone9;
		private final ModelRenderer bone11;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone12;
		private final ModelRenderer bone13;
		private final ModelRenderer bone14;

		public Modelmazickatana() {
			textureWidth = 64;
			textureHeight = 64;
			bone43 = new ModelRenderer(this);
			bone43.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone29 = new ModelRenderer(this);
			bone29.setRotationPoint(-6.0F, 0.0F, -3.0F);
			bone43.addChild(bone29);
			setRotationAngle(bone29, 0.0F, -1.5708F, 0.0F);
			bone30 = new ModelRenderer(this);
			bone30.setRotationPoint(-4.0F, -4.0F, 4.0F);
			bone29.addChild(bone30);
			setRotationAngle(bone30, 0.0F, 0.7854F, 1.2217F);
			bone31 = new ModelRenderer(this);
			bone31.setRotationPoint(-7.0F, -8.0F, 0.0F);
			bone30.addChild(bone31);
			bone31.setTextureOffset(0, 26).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone31.setTextureOffset(11, 25).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone31.setTextureOffset(22, 24).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone31.setTextureOffset(0, 24).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone31.setTextureOffset(11, 23).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone31.setTextureOffset(20, 28).addBox(-1.0F, -6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone32 = new ModelRenderer(this);
			bone32.setRotationPoint(1.0F, 0.0F, 0.0F);
			bone30.addChild(bone32);
			bone32.setTextureOffset(22, 22).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone32.setTextureOffset(22, 20).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone32.setTextureOffset(16, 30).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone32.setTextureOffset(27, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone32.setTextureOffset(22, 18).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone32.setTextureOffset(22, 16).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone32.setTextureOffset(22, 14).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone33 = new ModelRenderer(this);
			bone33.setRotationPoint(-2.0F, -3.0F, 0.0F);
			bone30.addChild(bone33);
			bone33.setTextureOffset(22, 12).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone33.setTextureOffset(22, 10).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone33.setTextureOffset(22, 8).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone34 = new ModelRenderer(this);
			bone34.setRotationPoint(0.0F, -5.0F, -4.0F);
			bone29.addChild(bone34);
			setRotationAngle(bone34, -0.1745F, -0.3054F, 0.8727F);
			bone35 = new ModelRenderer(this);
			bone35.setRotationPoint(-5.0F, -5.0F, 0.0F);
			bone34.addChild(bone35);
			bone35.setTextureOffset(22, 6).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone35.setTextureOffset(22, 4).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone35.setTextureOffset(22, 2).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone35.setTextureOffset(22, 0).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone35.setTextureOffset(0, 28).addBox(0.0F, -5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone36 = new ModelRenderer(this);
			bone36.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone34.addChild(bone36);
			bone36.setTextureOffset(0, 22).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone36.setTextureOffset(11, 21).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone36.setTextureOffset(0, 30).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone36.setTextureOffset(11, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone36.setTextureOffset(0, 20).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone36.setTextureOffset(11, 19).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone36.setTextureOffset(0, 18).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone37 = new ModelRenderer(this);
			bone37.setRotationPoint(0.0F, -2.0F, 0.0F);
			bone29.addChild(bone37);
			setRotationAngle(bone37, 0.0F, 0.1309F, 0.3491F);
			bone38 = new ModelRenderer(this);
			bone38.setRotationPoint(-5.0F, -5.0F, 0.0F);
			bone37.addChild(bone38);
			bone38.setTextureOffset(11, 17).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone38.setTextureOffset(0, 16).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone38.setTextureOffset(11, 15).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone38.setTextureOffset(0, 14).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone38.setTextureOffset(11, 27).addBox(0.0F, -5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone39 = new ModelRenderer(this);
			bone39.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone37.addChild(bone39);
			bone39.setTextureOffset(11, 13).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone39.setTextureOffset(0, 12).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone39.setTextureOffset(29, 29).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone39.setTextureOffset(7, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone39.setTextureOffset(11, 11).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone39.setTextureOffset(11, 9).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone39.setTextureOffset(11, 7).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(0.0F, 0.0F, 3.0F);
			bone43.addChild(bone15);
			setRotationAngle(bone15, 0.0F, -1.1345F, 0.0F);
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(-4.0F, -4.0F, 4.0F);
			bone15.addChild(bone16);
			setRotationAngle(bone16, 0.0F, 0.7854F, 1.2217F);
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(-7.0F, -8.0F, 0.0F);
			bone16.addChild(bone17);
			bone17.setTextureOffset(0, 26).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone17.setTextureOffset(11, 25).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone17.setTextureOffset(22, 24).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone17.setTextureOffset(0, 24).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone17.setTextureOffset(11, 23).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone17.setTextureOffset(20, 28).addBox(-1.0F, -6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone18 = new ModelRenderer(this);
			bone18.setRotationPoint(1.0F, 0.0F, 0.0F);
			bone16.addChild(bone18);
			bone18.setTextureOffset(22, 22).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone18.setTextureOffset(22, 20).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone18.setTextureOffset(16, 30).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone18.setTextureOffset(27, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone18.setTextureOffset(22, 18).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone18.setTextureOffset(22, 16).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone18.setTextureOffset(22, 14).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone19 = new ModelRenderer(this);
			bone19.setRotationPoint(-2.0F, -3.0F, 0.0F);
			bone16.addChild(bone19);
			bone19.setTextureOffset(22, 12).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone19.setTextureOffset(22, 10).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone19.setTextureOffset(22, 8).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone20 = new ModelRenderer(this);
			bone20.setRotationPoint(0.0F, -5.0F, -4.0F);
			bone15.addChild(bone20);
			setRotationAngle(bone20, -0.1745F, -0.3054F, 0.8727F);
			bone21 = new ModelRenderer(this);
			bone21.setRotationPoint(-5.0F, -5.0F, 0.0F);
			bone20.addChild(bone21);
			bone21.setTextureOffset(22, 6).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone21.setTextureOffset(22, 4).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone21.setTextureOffset(22, 2).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone21.setTextureOffset(22, 0).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone21.setTextureOffset(0, 28).addBox(0.0F, -5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone22 = new ModelRenderer(this);
			bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone20.addChild(bone22);
			bone22.setTextureOffset(0, 22).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone22.setTextureOffset(11, 21).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone22.setTextureOffset(0, 30).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone22.setTextureOffset(11, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone22.setTextureOffset(0, 20).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone22.setTextureOffset(11, 19).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone22.setTextureOffset(0, 18).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone26 = new ModelRenderer(this);
			bone26.setRotationPoint(1.0F, -6.0F, 1.0F);
			bone15.addChild(bone26);
			setRotationAngle(bone26, 0.0F, 0.0F, 1.309F);
			bone27 = new ModelRenderer(this);
			bone27.setRotationPoint(-5.0F, -5.0F, 0.0F);
			bone26.addChild(bone27);
			bone27.setTextureOffset(11, 5).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone27.setTextureOffset(11, 3).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone27.setTextureOffset(11, 1).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone27.setTextureOffset(0, 10).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone27.setTextureOffset(22, 26).addBox(0.0F, -5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone28 = new ModelRenderer(this);
			bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone26.addChild(bone28);
			bone28.setTextureOffset(0, 8).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone28.setTextureOffset(0, 6).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone28.setTextureOffset(9, 29).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone28.setTextureOffset(24, 30).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone28.setTextureOffset(0, 4).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone28.setTextureOffset(0, 2).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone28.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 0.0F, -4.0F);
			bone43.addChild(bone10);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-4.0F, -4.0F, 4.0F);
			bone10.addChild(bone7);
			setRotationAngle(bone7, 0.0F, 0.7854F, 1.2217F);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(-7.0F, -8.0F, 0.0F);
			bone7.addChild(bone8);
			bone8.setTextureOffset(0, 26).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(11, 25).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(22, 24).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(0, 24).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(11, 23).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(20, 28).addBox(-1.0F, -6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(1.0F, 0.0F, 0.0F);
			bone7.addChild(bone9);
			bone9.setTextureOffset(22, 22).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(22, 20).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(16, 30).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(27, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(22, 18).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(22, 16).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(22, 14).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(-2.0F, -3.0F, 0.0F);
			bone7.addChild(bone11);
			bone11.setTextureOffset(22, 12).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone11.setTextureOffset(22, 10).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone11.setTextureOffset(22, 8).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -5.0F, -3.0F);
			bone10.addChild(bone4);
			setRotationAngle(bone4, -0.1745F, -0.3054F, 0.8727F);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-5.0F, -5.0F, 0.0F);
			bone4.addChild(bone5);
			bone5.setTextureOffset(22, 6).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(22, 4).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(22, 2).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(22, 0).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(0, 28).addBox(0.0F, -5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(bone6);
			bone6.setTextureOffset(0, 22).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(11, 21).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(0, 30).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(11, 31).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(0, 20).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(11, 19).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(0, 18).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(1.0F, -6.0F, 1.0F);
			bone10.addChild(bone12);
			setRotationAngle(bone12, 0.0F, 0.0F, 1.309F);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(-5.0F, -5.0F, 0.0F);
			bone12.addChild(bone13);
			bone13.setTextureOffset(11, 5).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(11, 3).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(11, 1).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(0, 10).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(22, 26).addBox(0.0F, -5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone12.addChild(bone14);
			bone14.setTextureOffset(0, 8).addBox(2.0F, -2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(0, 6).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(9, 29).addBox(4.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(24, 30).addBox(5.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(0, 4).addBox(1.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(0, 2).addBox(0.0F, -4.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone43.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}

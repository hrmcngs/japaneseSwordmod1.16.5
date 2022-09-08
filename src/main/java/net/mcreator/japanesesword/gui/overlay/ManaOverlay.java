
package net.mcreator.japanesesword.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.japanesesword.procedures.Manna6Procedure;
import net.mcreator.japanesesword.procedures.Manab9Procedure;
import net.mcreator.japanesesword.procedures.Manab8Procedure;
import net.mcreator.japanesesword.procedures.Manab7Procedure;
import net.mcreator.japanesesword.procedures.Manab6Procedure;
import net.mcreator.japanesesword.procedures.Manab5Procedure;
import net.mcreator.japanesesword.procedures.Manab4Procedure;
import net.mcreator.japanesesword.procedures.Manab3Procedure;
import net.mcreator.japanesesword.procedures.Manab2Procedure;
import net.mcreator.japanesesword.procedures.Manab1Procedure;
import net.mcreator.japanesesword.procedures.Manab10Procedure;
import net.mcreator.japanesesword.procedures.Mana9Procedure;
import net.mcreator.japanesesword.procedures.Mana8Procedure;
import net.mcreator.japanesesword.procedures.Mana7Procedure;
import net.mcreator.japanesesword.procedures.Mana5Procedure;
import net.mcreator.japanesesword.procedures.Mana4Procedure;
import net.mcreator.japanesesword.procedures.Mana3Procedure;
import net.mcreator.japanesesword.procedures.Mana2Procedure;
import net.mcreator.japanesesword.procedures.Mana1Procedure;
import net.mcreator.japanesesword.procedures.Mana10Procedure;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber
public class ManaOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (true) {
				if (Manab1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/mana.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -229, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/mana.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -194, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/mana.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -174, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/mana.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -156, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/mana.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -135, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manaa.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -112, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manaa.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -90, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manaa.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -67, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manaa.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -46, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manab10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manaa.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -23, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -213, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -194, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -174, posY + -135, 0, 0, 16, 16, 16, 16);
				}
				if (Mana4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -156, posY + -135, 0, 0, 16, 16, 16, 16);
				}
				if (Mana5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -135, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Manna6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -112, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -90, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -67, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -46, posY + -136, 0, 0, 16, 16, 16, 16);
				}
				if (Mana10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/screens/manekara.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -23, posY + -136, 0, 0, 16, 16, 16, 16);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}

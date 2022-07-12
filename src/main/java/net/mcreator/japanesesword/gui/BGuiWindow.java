
package net.mcreator.japanesesword.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BGuiWindow extends ContainerScreen<BGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BGui.guistate;

	public BGuiWindow(BGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 167;
	}

	private static final ResourceLocation texture = new ResourceLocation("japanesesword:textures/b.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager()
				.bindTexture(new ResourceLocation("japanesesword:textures/sukurinsiyotuto_2022-05-08_16.41.14.png"));
		this.blit(ms, this.guiLeft + 16, this.guiTop + 15, 0, 0, 34, 34, 34, 34);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("japanesesword:textures/abc.png"));
		this.blit(ms, this.guiLeft + 101, this.guiTop + 14, 0, 0, 40, 37, 40, 37);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 114, 40, 20, new StringTextComponent("民間人"), e -> {
			if (true) {
				JapaneseswordMod.PACKET_HANDLER.sendToServer(new BGui.ButtonPressedMessage(0, x, y, z));
				BGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 129, this.guiTop + 114, 35, 20, new StringTextComponent("剣士"), e -> {
			if (true) {
				JapaneseswordMod.PACKET_HANDLER.sendToServer(new BGui.ButtonPressedMessage(1, x, y, z));
				BGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 72, this.guiTop + 114, 40, 20, new StringTextComponent("吸血鬼"), e -> {
			if (true) {
				JapaneseswordMod.PACKET_HANDLER.sendToServer(new BGui.ButtonPressedMessage(2, x, y, z));
				BGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}

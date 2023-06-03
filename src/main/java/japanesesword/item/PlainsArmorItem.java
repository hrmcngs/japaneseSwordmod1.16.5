
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import japanesesword.itemgroup.VillagerTabItemGroup;

import japanesesword.JapaneseswordModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@JapaneseswordModElements.ModElement.Tag
public class PlainsArmorItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:plains_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("japanesesword:plains_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("japanesesword:plains_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("japanesesword:plains_armor_boots")
	public static final Item boots = null;

	public PlainsArmorItem(JapaneseswordModElements instance) {
		super(instance, 514);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1, 2, 3, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 2;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "plains_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(VillagerTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelarmor_layer_3_Converted().body;
				armorModel.bipedLeftArm = new Modelarmor_layer_3_Converted().left_arm;
				armorModel.bipedRightArm = new Modelarmor_layer_3_Converted().right_arm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "japanesesword:textures/entities/plains_layer_3.png";
			}
		}.setRegistryName("plains_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(VillagerTabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "japanesesword:textures/models/armor/plains__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("plains_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(VillagerTabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "japanesesword:textures/models/armor/plains__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("plains_armor_boots"));
	}

	// Made with Blockbench 4.7.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelarmor_layer_3_Converted extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_shoe;
		private final ModelRenderer right_shoe;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;

		public Modelarmor_layer_3_Converted() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(28, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
			head.setTextureOffset(20, 18).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.75F, false);
			body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, 0.6F, false);
			left_shoe = new ModelRenderer(this);
			left_shoe.setRotationPoint(1.9F, 12.0F, 0.0F);
			left_shoe.setTextureOffset(40, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, true);
			right_shoe = new ModelRenderer(this);
			right_shoe.setRotationPoint(-1.9F, 12.0F, 0.0F);
			right_shoe.setTextureOffset(40, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
			left_arm.setTextureOffset(24, 34).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, true);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			right_arm.setTextureOffset(24, 34).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_shoe.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_shoe.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}

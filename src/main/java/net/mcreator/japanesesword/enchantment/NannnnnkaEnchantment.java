
package net.mcreator.japanesesword.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class NannnnnkaEnchantment extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:nannnnnka")
	public static final Enchantment enchantment = null;

	public NannnnnkaEnchantment(JapaneseswordModElements instance) {
		super(instance, 91);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("nannnnnka"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 15;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 5;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}

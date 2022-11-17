
package japanesesword.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import japanesesword.item.TubanoatukatanaItem;
import japanesesword.item.TantouItem;
import japanesesword.item.NgsoItem;
import japanesesword.item.NgskItem;
import japanesesword.item.KazarinoarukatabaItem;
import japanesesword.item.GoukinntouItem;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class DemonizedEnchantment extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:demonized")
	public static final Enchantment enchantment = null;

	public DemonizedEnchantment(JapaneseswordModElements instance) {
		super(instance, 344);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("demonized"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == NgsoItem.block)
				return true;
			if (stack.getItem() == NgskItem.block)
				return true;
			if (stack.getItem() == Items.WOODEN_SWORD)
				return true;
			if (stack.getItem() == Items.STONE_SWORD)
				return true;
			if (stack.getItem() == Items.IRON_SWORD)
				return true;
			if (stack.getItem() == Items.GOLDEN_SWORD)
				return true;
			if (stack.getItem() == Items.DIAMOND_SWORD)
				return true;
			if (stack.getItem() == TantouItem.block)
				return true;
			if (stack.getItem() == TubanoatukatanaItem.block)
				return true;
			if (stack.getItem() == GoukinntouItem.block)
				return true;
			if (stack.getItem() == KazarinoarukatabaItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
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
			return false;
		}
	}
}

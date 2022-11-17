
package japanesesword.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import japanesesword.item.YuugenkennItem;
import japanesesword.item.OtachibloodcurseItem;
import japanesesword.item.NorooinokatanaItem;
import japanesesword.item.NoroiItem;
import japanesesword.item.NoKamaroiItem;
import japanesesword.item.NaihuItem;
import japanesesword.item.KogatanaItem;
import japanesesword.item.KamaItem;
import japanesesword.item.JapaneseSwordItem;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class KillEnchantment extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:kill")
	public static final Enchantment enchantment = null;

	public KillEnchantment(JapaneseswordModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("kill"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 10;
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
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == JapaneseSwordItem.block)
				return true;
			if (stack.getItem() == NaihuItem.block)
				return true;
			if (stack.getItem() == YuugenkennItem.block)
				return true;
			if (stack.getItem() == NorooinokatanaItem.block)
				return true;
			if (stack.getItem() == KamaItem.block)
				return true;
			if (stack.getItem() == NoroiItem.block)
				return true;
			if (stack.getItem() == NoKamaroiItem.block)
				return true;
			if (stack.getItem() == OtachibloodcurseItem.block)
				return true;
			if (stack.getItem() == KogatanaItem.block)
				return true;
			return false;
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

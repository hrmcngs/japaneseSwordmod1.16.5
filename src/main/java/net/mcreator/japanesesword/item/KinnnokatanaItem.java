
package net.mcreator.japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.japanesesword.itemgroup.BukiItemGroup;
import net.mcreator.japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class KinnnokatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:kinnnokatana")
	public static final Item block = null;

	public KinnnokatanaItem(JapaneseswordModElements instance) {
		super(instance, 303);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 9;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT), new ItemStack(KinnnokatanaItem.block));
			}
		}, 3, 96f, new Item.Properties().group(BukiItemGroup.tab)) {
		}.setRegistryName("kinnnokatana"));
	}
}

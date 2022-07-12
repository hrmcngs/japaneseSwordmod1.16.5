
package net.mcreator.japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class SyabelItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:syabel")
	public static final Item block = null;

	public SyabelItem(JapaneseswordModElements instance) {
		super(instance, 229);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return -2f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DaiazyuiItem.block), new ItemStack(SyabelItem.block));
			}
		}, 1, 4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("syabel"));
	}
}

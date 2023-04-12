
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class AxeswordItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:axesword")
	public static final Item block = null;

	public AxeswordItem(JapaneseswordModElements instance) {
		super(instance, 231);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NItem.block), new ItemStack(AxeswordItem.block));
			}
		}, 1, 6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("axesword"));
	}
}

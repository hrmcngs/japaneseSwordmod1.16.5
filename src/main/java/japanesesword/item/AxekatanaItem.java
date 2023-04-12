
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
public class AxekatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:axekatana")
	public static final Item block = null;

	public AxekatanaItem(JapaneseswordModElements instance) {
		super(instance, 227);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AxekatanaItem.block), new ItemStack(DaiazyuiItem.block));
			}
		}, 1, -4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("axekatana"));
	}
}

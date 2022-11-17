
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import japanesesword.itemgroup.BukiItemGroup;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class TubanoatukatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:tubanoatukatana")
	public static final Item block = null;

	public TubanoatukatanaItem(JapaneseswordModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.GOLD_NUGGET));
			}
		}, 3, 1f, new Item.Properties().group(BukiItemGroup.tab)) {
		}.setRegistryName("tubanoatukatana"));
	}
}

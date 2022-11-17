
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import japanesesword.itemgroup.BukiItemGroup;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class KyoukadaiyamonndonokatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:kyoukadaiyamonndonokatana")
	public static final Item block = null;

	public KyoukadaiyamonndonokatanaItem(JapaneseswordModElements instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DaiazyuiItem.block), new ItemStack(KyoukadaiyamonndonokatanaItem.block));
			}
		}, 3, 4f, new Item.Properties().group(BukiItemGroup.tab)) {
		}.setRegistryName("kyoukadaiyamonndonokatana"));
	}
}

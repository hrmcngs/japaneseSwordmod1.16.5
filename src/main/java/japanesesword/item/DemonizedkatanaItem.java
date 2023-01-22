
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import japanesesword.itemgroup.BukiItemGroup;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class DemonizedkatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:demonizedkatana")
	public static final Item block = null;

	public DemonizedkatanaItem(JapaneseswordModElements instance) {
		super(instance, 390);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.5f, new Item.Properties().group(BukiItemGroup.tab)) {
		}.setRegistryName("demonizedkatana"));
	}
}

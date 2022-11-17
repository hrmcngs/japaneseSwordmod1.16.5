
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class Naihu2Item extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:naihu_2")
	public static final Item block = null;

	public Naihu2Item(JapaneseswordModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
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
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().group(null)) {
		}.setRegistryName("naihu_2"));
	}
}

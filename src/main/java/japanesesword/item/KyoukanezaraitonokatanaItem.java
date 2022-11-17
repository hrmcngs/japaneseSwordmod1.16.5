
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
public class KyoukanezaraitonokatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:kyoukanezaraitonokatana")
	public static final Item block = null;

	public KyoukanezaraitonokatanaItem(JapaneseswordModElements instance) {
		super(instance, 148);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(KyoukanezaraitonokatanaItem.block), new ItemStack(NItem.block));
			}
		}, 3, 96f, new Item.Properties().group(BukiItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("kyoukanezaraitonokatana"));
	}
}

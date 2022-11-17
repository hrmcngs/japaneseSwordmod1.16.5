
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class TuruhasiItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:turuhasi")
	public static final Item block = null;

	public TuruhasiItem(JapaneseswordModElements instance) {
		super(instance, 228);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DaiazyuiItem.block), new ItemStack(TuruhasiItem.block));
			}
		}, 1, 4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("turuhasi"));
	}
}

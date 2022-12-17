
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BowItem;

import japanesesword.JapaneseswordModElements;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;

@JapaneseswordModElements.ModElement.Tag
public class TestBowItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:test_bow")
	public static final Item block = null;

	public TestBowItem(JapaneseswordModElements instance) {
		super(instance, 376);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("test_bow");
		}
}
      
}

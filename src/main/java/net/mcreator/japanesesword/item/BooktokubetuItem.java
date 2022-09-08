
package net.mcreator.japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.japanesesword.itemgroup.BukiItemGroup;
import net.mcreator.japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class BooktokubetuItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:booktokubetu")
	public static final Item block = null;

	public BooktokubetuItem(JapaneseswordModElements instance) {
		super(instance, 210);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BukiItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("booktokubetu");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

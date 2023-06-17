
package japanesesword.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class VillagerItemsItemGroup extends JapaneseswordModElements.ModElement {
	public VillagerItemsItemGroup(JapaneseswordModElements instance) {
		super(instance, 518);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvillager_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.EMERALD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}

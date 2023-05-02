
package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class MusicdiscUNItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:musicdisc_un")
	public static final Item block = null;

	public MusicdiscUNItem(JapaneseswordModElements instance) {
		super(instance, 332);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, JapaneseswordModElements.sounds.get(new ResourceLocation("japanesesword:un")), new Item.Properties().group(null).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("musicdisc_un");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}

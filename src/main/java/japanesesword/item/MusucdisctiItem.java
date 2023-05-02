
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
public class MusucdisctiItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:musucdiscti")
	public static final Item block = null;

	public MusucdisctiItem(JapaneseswordModElements instance) {
		super(instance, 182);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, JapaneseswordModElements.sounds.get(new ResourceLocation("japanesesword:ti")), new Item.Properties().group(null).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("musucdiscti");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}


package japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ArrowItem;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class Arrow001Item extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:arrow_001")
	public static final Item Arrow = null;
   public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
      ArrowEntity arrowentity = new ArrowEntity(worldIn, shooter);
      arrowentity.setPotionEffect(stack);
      return arrowentity;
   }

   public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
      int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
      return enchant <= 0 ? false : this.getClass() == ArrowItem.class;
   }
	}

package japanesesword.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.item.MagicBookItem;

import japanesesword.JapaneseswordMod;

public class NamaenaninisiyoukanaProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Namaenaninisiyoukana!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == MagicBookItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == MagicBookItem.block;
	}
}

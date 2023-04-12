package japanesesword.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.potion.GPotionEffect;

import japanesesword.item.TokubetunoItem;

import japanesesword.JapaneseswordMod;

public class TokubetunoYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TokubetunoYoukuritukusitatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(GPotionEffect.potion, (int) 300, (int) 1, (true), (false)));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(TokubetunoItem.block, (int) 50);
	}
}

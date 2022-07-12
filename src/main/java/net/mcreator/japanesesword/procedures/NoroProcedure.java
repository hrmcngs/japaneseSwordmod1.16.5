package net.mcreator.japanesesword.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.potion.SupuidokyoukaPotionEffect;
import net.mcreator.japanesesword.item.NorooinokatanaItem;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;
import java.util.Collection;

public class NoroProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure Noro!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Noro!");
			return;
		}
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == NorooinokatanaItem.block
				&& new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == SupuidokyoukaPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
			entity.setMotion((Math.sin(Math.toRadians(entity.rotationYaw + 180)) * 10), y, (Math.cos(Math.toRadians(entity.rotationYaw)) * 10));
		}
	}
}

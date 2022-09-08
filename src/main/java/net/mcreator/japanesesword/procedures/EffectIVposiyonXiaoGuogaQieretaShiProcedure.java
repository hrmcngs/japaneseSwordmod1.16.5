package net.mcreator.japanesesword.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.potion.EffectIIIPotionEffect;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class EffectIVposiyonXiaoGuogaQieretaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure EffectIVposiyonXiaoGuogaQieretaShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(EffectIIIPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
	}
}

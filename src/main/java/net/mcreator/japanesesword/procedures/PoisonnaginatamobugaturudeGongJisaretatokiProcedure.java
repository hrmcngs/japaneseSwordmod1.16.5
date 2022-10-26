package net.mcreator.japanesesword.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class PoisonnaginatamobugaturudeGongJisaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency sourceentity for procedure PoisonnaginatamobugaturudeGongJisaretatoki!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1, (false), (false)));
	}
}

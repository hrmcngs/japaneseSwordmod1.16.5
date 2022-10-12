package net.mcreator.japanesesword.procedures;

import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Random;
import java.util.Map;

public class UgokasuehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure UgokasuehuekutogaYouXiaoShinoteituku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion((MathHelper.nextDouble(new Random(), 0, 1)), 1, (MathHelper.nextDouble(new Random(), 0, 1)));
	}
}

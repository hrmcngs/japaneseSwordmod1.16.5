package net.mcreator.japanesesword.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class Doku2posiyonnoXiaoGuogaKaiShiShiYongsaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Doku2posiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1e+49);
	}
}

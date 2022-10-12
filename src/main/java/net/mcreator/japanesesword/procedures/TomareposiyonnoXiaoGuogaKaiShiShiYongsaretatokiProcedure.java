package net.mcreator.japanesesword.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class TomareposiyonnoXiaoGuogaKaiShiShiYongsaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TomareposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double kao = 0;
		double kaooo = 0;
		entity.setMotion(0, 0, 0);
	}
}

package net.mcreator.japanesesword.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordModVariables;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class Manab1Procedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Manab1!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return !((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).mana <= 1);
	}
}

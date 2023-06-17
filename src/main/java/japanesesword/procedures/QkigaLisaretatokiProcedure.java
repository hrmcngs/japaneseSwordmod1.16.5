package japanesesword.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordMod;

public class QkigaLisaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure QkigaLisaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("\u81EA\u52D5\u653B\u6483")) {
			entity.getPersistentData().putBoolean("\u81EA\u52D5\u653B\u6483", false);
		}
	}
}

package japanesesword.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordMod;

public class SouleffectehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure SouleffectehuekutogaYouXiaoShinoteituku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"particle minecraft:soul ~ ~1 ~ 0.5 0.5 0.5 0.1 1 normal @s");
			}
		}
	}
}

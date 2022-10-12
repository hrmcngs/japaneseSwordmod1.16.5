package net.mcreator.japanesesword.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class TossinFeibiDaoJugaenteiteiniDangtatutatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("immediatesourceentity") == null) {
			if (!dependencies.containsKey("immediatesourceentity"))
				JapaneseswordMod.LOGGER
						.warn("Failed to load dependency immediatesourceentity for procedure TossinFeibiDaoJugaenteiteiniDangtatutatoki!");
			return;
		}
		Entity immediatesourceentity = (Entity) dependencies.get("immediatesourceentity");
		{
			Entity _ent = immediatesourceentity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/kill @s");
			}
		}
		{
			Entity _ent = immediatesourceentity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/deta merge entity @s (Health:0)");
			}
		}
	}
}

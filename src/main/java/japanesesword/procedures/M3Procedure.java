package japanesesword.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class M3Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure M3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double r = 0;
		double deg = 0;
		{
			double _setval = 4;
			entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.f = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "\u65AC\u6483\u2022\u602A";
			entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.nanndarou = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}

package japanesesword.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordMod;

public class KagekaposiyonXiaoGuogaQieretaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure KagekaposiyonXiaoGuogaQieretaShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("creative") == true) {
			entity.getPersistentData().putBoolean("creative", (false));
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.CREATIVE);
			entity.fallDistance = (float) (0);
		}
		if (entity.getPersistentData().getBoolean("adventure") == true) {
			entity.getPersistentData().putBoolean("adventure", (false));
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.ADVENTURE);
			entity.fallDistance = (float) (0);
		}
		if (entity.getPersistentData().getBoolean("surval") == true) {
			entity.getPersistentData().putBoolean("surval", (false));
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
			entity.fallDistance = (float) (0);
		}
		if (entity.getPersistentData().getBoolean("spectar") == true) {
			entity.getPersistentData().putBoolean("spectar", (false));
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
			entity.fallDistance = (float) (0);
		}
	}
}

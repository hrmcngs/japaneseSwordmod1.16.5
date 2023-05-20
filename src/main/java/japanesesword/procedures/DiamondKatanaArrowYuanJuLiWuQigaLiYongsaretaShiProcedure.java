package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordMod;

public class DiamondKatanaArrowYuanJuLiWuQigaLiYongsaretaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure DiamondKatanaArrowYuanJuLiWuQigaLiYongsaretaShi!");
			return;
		}
		if (dependencies.get("immediatesourceentity") == null) {
			if (!dependencies.containsKey("immediatesourceentity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency immediatesourceentity for procedure DiamondKatanaArrowYuanJuLiWuQigaLiYongsaretaShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity immediatesourceentity = (Entity) dependencies.get("immediatesourceentity");
		world.addParticle(ParticleTypes.END_ROD, (immediatesourceentity.getPosX()), (immediatesourceentity.getPosY()), (immediatesourceentity.getPosZ()), 0, 0, 0);
	}
}

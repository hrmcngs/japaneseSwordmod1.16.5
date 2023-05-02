package japanesesword.procedures;

import net.minecraft.util.math.RayTraceContext;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collections;

import japanesesword.JapaneseswordMod;

public class TossinFeibiDaoJugaFeindeiruJianProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		if (dependencies.get("immediatesourceentity") == null) {
			if (!dependencies.containsKey("immediatesourceentity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency immediatesourceentity for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity immediatesourceentity = (Entity) dependencies.get("immediatesourceentity");
		double Radius = 0;
		double zPos = 0;
		double yPos = 0;
		double loop = 0;
		double rad_now = 0;
		double xPos = 0;
		double slot = 0;
		double dis = 0;
		immediatesourceentity.getPersistentData().putBoolean("battozyutu", (true));
		immediatesourceentity.setMotion(
				(entity.world
						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20), RayTraceContext.BlockMode.OUTLINE,
								RayTraceContext.FluidMode.NONE, entity))
						.getPos().getX()
						- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0), RayTraceContext.BlockMode.OUTLINE,
								RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
				(entity.world
						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20), RayTraceContext.BlockMode.OUTLINE,
								RayTraceContext.FluidMode.NONE, entity))
						.getPos().getY()
						- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0), RayTraceContext.BlockMode.OUTLINE,
								RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
				(entity.world
						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20), RayTraceContext.BlockMode.OUTLINE,
								RayTraceContext.FluidMode.NONE, entity))
						.getPos().getZ()
						- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0), RayTraceContext.BlockMode.OUTLINE,
								RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((immediatesourceentity.getPosX()), (immediatesourceentity.getPosY()), (immediatesourceentity.getPosZ()));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((immediatesourceentity.getPosX()), (immediatesourceentity.getPosY()), (immediatesourceentity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		loop = Math.toRadians(entity.rotationYaw + 0);
	}
}

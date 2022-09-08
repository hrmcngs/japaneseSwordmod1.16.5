package net.mcreator.japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class Arrow1ehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double dis = 0;
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArrowEntity || entityiterator instanceof SpectralArrowEntity || entityiterator instanceof TridentEntity
						|| entityiterator instanceof FireballEntity || entityiterator instanceof DragonFireballEntity
						|| entityiterator instanceof SnowballEntity || entityiterator instanceof EggEntity) {
					if (!(entityiterator.getPosX() + entityiterator.getPosY() + entityiterator.getPosZ() == 0)) {
						if (entityiterator.getPersistentData().getBoolean("Check") == false) {
							entityiterator.getPersistentData().putBoolean("Check", (true));
							dis = Math.sqrt(Math.pow(entityiterator.getPosX() - entity.getPosX(), 2)
									+ Math.pow(entityiterator.getPosY() - entity.getPosY(), 2)
									+ Math.pow(entityiterator.getPosZ() - entity.getPosZ(), 2));
							if (dis <= 2) {
								entityiterator.getPersistentData().putBoolean("My arrow", (true));
							} else {
								entityiterator.getPersistentData().putBoolean("My arrow", (false));
							}
						}
						if (entityiterator.getPersistentData().getBoolean("My arrow") == false) {
							if (entityiterator.getPersistentData().getBoolean("Check2") == false) {
								entityiterator.getPersistentData().putBoolean("Check2", (true));
								entityiterator.setMotion(0, 0, 0);
								entityiterator.rotationYaw = (float) ((entityiterator.rotationYaw + 180));
								entity.setRenderYawOffset(entity.rotationYaw);
								entity.prevRotationYaw = entity.rotationYaw;
								if (entity instanceof LivingEntity) {
									((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
									((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
									((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
								}
								entityiterator.rotationPitch = (float) (0);
							} else {
								entityiterator.setMotion((Math.sin(Math.toRadians(entity.getPersistentData().getDouble("yaw") + 180)) * 0.75), 0,
										(Math.cos(Math.toRadians(entity.getPersistentData().getDouble("yaw"))) * 0.75));
							}
						}
					}
				}
			}
		}
	}
}

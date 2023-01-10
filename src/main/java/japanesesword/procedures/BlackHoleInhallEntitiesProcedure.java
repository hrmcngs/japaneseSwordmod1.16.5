package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.entity.BlackHoleKillEntity;
import japanesesword.entity.BlackHoleEntity;

import japanesesword.JapaneseswordMod;

public class BlackHoleInhallEntitiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure BlackHoleInhallEntities!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure BlackHoleInhallEntities!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure BlackHoleInhallEntities!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure BlackHoleInhallEntities!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure BlackHoleInhallEntities!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double sphereRadius = 0;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double sqaureDistance = 0;
		sphereRadius = 20;
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - ((sphereRadius * 2) / 2d), y - ((sphereRadius * 2) / 2d), z - ((sphereRadius * 2) / 2d),
									x + ((sphereRadius * 2) / 2d), y + ((sphereRadius * 2) / 2d), z + ((sphereRadius * 2) / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity instanceof BlackHoleEntity.CustomEntity) {
					if (!(entityiterator instanceof BlackHoleKillEntity.CustomEntity) && !(entityiterator instanceof BlackHoleEntity.CustomEntity)
							&& !(entityiterator instanceof PlayerEntity)) {
						dx = (entity.getPosX() - entityiterator.getPosX());
						dy = (entity.getPosY() - entityiterator.getPosY());
						dz = (entity.getPosZ() - entityiterator.getPosZ());
						sqaureDistance = (dx * dx + dy * dy + dz * dz);
						if (sqaureDistance <= sphereRadius * sphereRadius) {
							entityiterator.setMotion((dx / 20), (dy / 20), (dz / 20));
							entityiterator.attackEntityFrom(DamageSource.OUT_OF_WORLD, (float) 10);
							if (sqaureDistance <= (sphereRadius / 4) * (sphereRadius / 4)) {
								if (!entityiterator.world.isRemote())
									entityiterator.remove();
							}
						}
					}
				}
				if (entity instanceof BlackHoleKillEntity.CustomEntity) {
					if (!(entityiterator instanceof BlackHoleKillEntity.CustomEntity) && !(entityiterator instanceof BlackHoleEntity.CustomEntity)
							&& !(entityiterator instanceof PlayerEntity)) {
						dx = (entity.getPosX() - entityiterator.getPosX());
						dy = (entity.getPosY() - entityiterator.getPosY());
						dz = (entity.getPosZ() - entityiterator.getPosZ());
						sqaureDistance = (dx * dx + dy * dy + dz * dz);
						if (sqaureDistance <= sphereRadius * sphereRadius) {
							entityiterator.setMotion((dx / 20), (dy / 20), (dz / 20));
							{
								Entity _ent = entityiterator;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager()
											.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager().handleCommand(
											_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
											"/deta merge entity @s (Health:0)");
								}
							}
							if (sqaureDistance <= (sphereRadius / 4) * (sphereRadius / 4)) {
								if (!entityiterator.world.isRemote())
									entityiterator.remove();
							}
						}
					}
				}
			}
		}
	}
}

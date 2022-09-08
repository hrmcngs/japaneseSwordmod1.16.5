package net.mcreator.japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class TerepotoehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure TerepotoehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure TerepotoehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure TerepotoehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure TerepotoehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TerepotoehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double xRabius = 0;
		double rad = 0;
		double rad_now = 0;
		double degree = 0;
		double x_pos = 0;
		double z_pos = 0;
		double dis = 0;
		if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			entity.getPersistentData().putDouble("yaw", (Math.toRadians(entity.rotationYaw) + Math.random() * 360));
			entity.getPersistentData().putDouble("yaw2", (Math.random() * 360));
			dis = 1;
			for (int index0 = 0; index0 < (int) (7); index0++) {
				degree = (entity.getPersistentData().getDouble("yaw"));
				rad = 1.75;
				rad_now = (entity.getPersistentData().getDouble("yaw2"));
				for (int index1 = 0; index1 < (int) (70); index1++) {
					x_pos = (x + Math.cos(rad_now) * Math.cos(degree) * rad * dis);
					xRabius = (y + 1 + Math.sin(rad_now) * rad * dis);
					z_pos = (z + Math.cos(rad_now) * Math.sin(degree) * rad * dis);
					world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, x_pos, xRabius, z_pos, 0.01, 0.01, 0.01);
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x_pos - (3 / 2d), xRabius - (3 / 2d),
								z_pos - (3 / 2d), x_pos + (3 / 2d), xRabius + (3 / 2d), z_pos + (3 / 2d)), null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x_pos, xRabius, z_pos)).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof MobEntity) {
									entityiterator.setFire((int) 10);
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
								}
							}
						}
					}
					degree = (degree + Math.toRadians(2.5));
					rad_now = (rad_now + Math.toRadians(2.5));
				}
				dis = (dis + 0.05);
			}
		} else {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			entity.getPersistentData().putDouble("yaw", (Math.toRadians(entity.rotationYaw) + Math.random() * 360));
			entity.getPersistentData().putDouble("yaw2", (Math.random() * 360));
			dis = 1;
			for (int index2 = 0; index2 < (int) (7); index2++) {
				degree = (entity.getPersistentData().getDouble("yaw"));
				rad = 1.75;
				rad_now = (entity.getPersistentData().getDouble("yaw2"));
				for (int index3 = 0; index3 < (int) (70); index3++) {
					x_pos = (x + Math.cos(rad_now) * Math.cos(degree) * rad * dis);
					xRabius = (y + 1 + Math.sin(rad_now) * rad * dis);
					z_pos = (z + Math.cos(rad_now) * Math.sin(degree) * rad * dis);
					world.addParticle(ParticleTypes.FLAME, x_pos, xRabius, z_pos, 0.01, 0.01, 0.01);
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x_pos - (3 / 2d), xRabius - (3 / 2d),
								z_pos - (3 / 2d), x_pos + (3 / 2d), xRabius + (3 / 2d), z_pos + (3 / 2d)), null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x_pos, xRabius, z_pos)).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof MobEntity) {
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 15);
									entityiterator.setFire((int) 10);
								}
							}
						}
					}
					degree = (degree + Math.toRadians(2.5));
					rad_now = (rad_now + Math.toRadians(2.5));
				}
				dis = (dis + 0.05);
			}
		}
	}
}

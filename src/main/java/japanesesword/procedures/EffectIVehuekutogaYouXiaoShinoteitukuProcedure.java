package japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.item.PoisonnaginataItem;
import japanesesword.item.NaginataItem;
import japanesesword.item.KatanakatanaItem;

import japanesesword.enchantment.KillEnchantment;

import japanesesword.JapaneseswordMod;

public class EffectIVehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure EffectIVehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure EffectIVehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure EffectIVehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		Entity entity = (Entity) dependencies.get("entity");
		double xRadius = 0;
		double zRadius = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		entity.getPersistentData().putDouble("loop_left", (entity.getPersistentData().getDouble("loop_left")));
		xRadius = 3;
		zRadius = 3;
		entity.getPersistentData().putDouble("Y", (y + 3));
		for (int index0 = 0; index0 < (int) (16); index0++) {
			X = (entity.getPersistentData().getDouble("X") + Math.cos(entity.getPersistentData().getDouble("loop_left")) * xRadius);
			Y = (entity.getPersistentData().getDouble("Y"));
			Z = (entity.getPersistentData().getDouble("Z") + Math.sin(entity.getPersistentData().getDouble("loop_left")) * zRadius);
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.639 0.000 0.361 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.447 0.000 0.639 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.690 0.090 0.090 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, X, Y, Z, (int) 5, 0.2, 0.2, 0.2, 0);
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(X - (3 / 2d), Y - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), Y + (3 / 2d), Z + (3 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(X, Y, Z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0)) {
							if (entityiterator instanceof MobEntity) {
								entityiterator.setFire((int) 15);
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
						} else {
							if (entityiterator instanceof MobEntity) {
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == KatanakatanaItem.block) {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								} else {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == NaginataItem.block) {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
								} else {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == PoisonnaginataItem.block) {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1, (false), (false)));
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
								} else {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1, (false), (false)));
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
							}
						}
					}
				}
			}
			entity.getPersistentData().putDouble("loop_left", (entity.getPersistentData().getDouble("loop_left") + Math.toRadians(5)));
			entity.getPersistentData().putDouble("Y", (entity.getPersistentData().getDouble("Y") - 0.1666666666666667));
		}
		entity.getPersistentData().putDouble("loop_right", (entity.getPersistentData().getDouble("loop_right")));
		xRadius = 3;
		zRadius = 3;
		entity.getPersistentData().putDouble("Y", (y + 3));
		for (int index1 = 0; index1 < (int) (16); index1++) {
			X = (entity.getPersistentData().getDouble("X") + Math.cos(entity.getPersistentData().getDouble("loop_right")) * xRadius);
			Y = (entity.getPersistentData().getDouble("Y"));
			Z = (entity.getPersistentData().getDouble("Z") + Math.sin(entity.getPersistentData().getDouble("loop_right")) * zRadius);
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.639 0.000 0.361 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.447 0.000 0.639 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.690 0.090 0.090 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, X, Y, Z, (int) 5, 0.2, 0.2, 0.2, 0);
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(X - (3 / 2d), Y - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), Y + (3 / 2d), Z + (3 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(X, Y, Z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0)) {
							if (entityiterator instanceof MobEntity) {
								entityiterator.setFire((int) 15);
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
						} else {
							if (entityiterator instanceof MobEntity) {
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == KatanakatanaItem.block) {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								} else {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == NaginataItem.block) {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
								} else {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == PoisonnaginataItem.block) {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1, (false), (false)));
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
								} else {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1, (false), (false)));
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
							}
						}
					}
				}
			}
			entity.getPersistentData().putDouble("loop_right", (entity.getPersistentData().getDouble("loop_right") - Math.toRadians(5)));
			entity.getPersistentData().putDouble("Y", (entity.getPersistentData().getDouble("Y") - 0.1666666666666667));
		}
	}
}

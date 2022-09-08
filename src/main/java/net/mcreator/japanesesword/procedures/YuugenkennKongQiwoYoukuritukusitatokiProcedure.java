package net.mcreator.japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.japanesesword.potion.KurutaimunasiPotionEffect;
import net.mcreator.japanesesword.item.YuugenkennItem;
import net.mcreator.japanesesword.item.NaihuItem;
import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.JapaneseswordModVariables;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

public class YuugenkennKongQiwoYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure YuugenkennKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure YuugenkennKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure YuugenkennKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure YuugenkennKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure YuugenkennKongQiwoYoukuritukusitatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double deg = 0;
		double r = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == YuugenkennItem.block) {
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 2) {
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
						if (!(entityiterator == entity)) {
							if (entity instanceof MobEntity) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(
														_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
											}
										}
									} else {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == YuugenkennItem.block) {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 50);
										} else {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
										}
									}
								}
							}
						}
					}
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, (entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
							(int) 5, 0.1, 0.1, 0.1, 0);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 3) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 200, (int) 4, (true), (true)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 200, (int) 2, (true), (true)));
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(YuugenkennItem.block, (int) 200);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 4) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 1, (int) 10, (true), (true)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 1, (int) 10, (true), (true)));
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(YuugenkennItem.block, (int) 10);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 5) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == YuugenkennItem.block) {
					{
						Entity _shootFrom = entity;
						World projectileLevel = _shootFrom.world;
						if (!projectileLevel.isRemote()) {
							ProjectileEntity _entityToSpawn = new Object() {
								public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
									AbstractArrowEntity entityToSpawn = new NaihuItem.ArrowCustomEntity(NaihuItem.arrow, world);
									entityToSpawn.setShooter(shooter);
									entityToSpawn.setDamage(damage);
									entityToSpawn.setKnockbackStrength(knockback);
									entityToSpawn.setSilent(true);

									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 2, 1);
							_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
							_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
							projectileLevel.addEntity(_entityToSpawn);
						}
					}
				}
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(YuugenkennItem.block, (int) 2);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 6) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (entity instanceof MobEntity) {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()),
											(entityiterator.getPosY() + 1), (entityiterator.getPosZ()), (int) 5, 0.1, 0.1, 0.1, 0);
								}
								if (!(entityiterator == entity)) {
									if (entity instanceof MobEntity) {
										if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
												((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)) != 0)) {
											{
												Entity _ent = entityiterator;
												if (!_ent.world.isRemote && _ent.world.getServer() != null) {
													_ent.world.getServer().getCommandManager().handleCommand(
															_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
												}
											}
										} else {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == YuugenkennItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 50);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
											}
										}
									}
								}
							}
						}
					}
				}
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(YuugenkennItem.block, (int) 10);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 7) {
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
						for (int index0 = 0; index0 < (int) (10); index0++) {
							if (!(entityiterator == entity)) {
								if (entity instanceof MobEntity) {
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()),
												(entityiterator.getPosY() + 1), (entityiterator.getPosZ()), (int) 5, 0.1, 0.1, 0.1, 0);
									}
									if (!(entityiterator == entity)) {
										if (entity instanceof MobEntity) {
											if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
													((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY)) != 0)) {
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
													}
												}
											} else {
												if (((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemOffhand()
														: ItemStack.EMPTY).getItem() == YuugenkennItem.block) {
													entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 50);
												} else {
													entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
												}
											}
										}
									}
								}
							}
						}
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entityiterator.getPosX()), (entityiterator.getPosY() + 5), (entityiterator.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entityiterator.getPosX()), (entityiterator.getPosY() + 5),
										(entityiterator.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
					}
				}
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(YuugenkennItem.block, (int) 60);
				}
			}
		}
	}
}

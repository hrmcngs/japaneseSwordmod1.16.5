package net.mcreator.japanesesword.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.japanesesword.potion.UgokasuPotionEffect;
import net.mcreator.japanesesword.potion.TomarePotionEffect;
import net.mcreator.japanesesword.potion.MatuPotionEffect;
import net.mcreator.japanesesword.potion.KurutaimunasiPotionEffect;
import net.mcreator.japanesesword.item.TossinItem;
import net.mcreator.japanesesword.item.ReaItem;
import net.mcreator.japanesesword.item.NgskItem;
import net.mcreator.japanesesword.item.BookbloodItem;
import net.mcreator.japanesesword.entity.KenEntity;
import net.mcreator.japanesesword.entity.Ken2Entity;
import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.JapaneseswordModVariables;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collection;

public class NgskYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure NgskYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure NgskYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure NgskYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure NgskYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NgskYoukuritukusitatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double loop = 0;
		double XRadius2 = 0;
		double ZRadius2 = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Y_pos = 0;
		double Zknockback = 0;
		double Yknockback = 0;
		double Xknockback = 0;
		double dis = 0;
		double zRadius = 0;
		double xRadius6 = 0;
		double zRadius6 = 0;
		double zRadius5 = 0;
		double xRadius5 = 0;
		double Z2 = 0;
		double Z3 = 0;
		double X2 = 0;
		double Z4 = 0;
		double X3 = 0;
		double Z5 = 0;
		double X4 = 0;
		double Z6 = 0;
		double X5 = 0;
		double X6 = 0;
		double zRaduis3 = 0;
		double loop2 = 0;
		double loop3 = 0;
		double loop6 = 0;
		double xRadius = 0;
		double loop4 = 0;
		double loop5 = 0;
		double xRaduis4 = 0;
		double Y2 = 0;
		double Y3 = 0;
		double xRaduis3 = 0;
		double Y4 = 0;
		double zRaduis4 = 0;
		double Y5 = 0;
		double Y6 = 0;
		double angle = 0;
		double Numerical_value = 0;
		double yaw = 0;
		if (NgskItem.block == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()) {
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 2) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				loop = Math.toRadians(entity.rotationYaw);
				XRadius2 = 3;
				ZRadius2 = 3;
				Y_pos = (y + 2);
				for (int index0 = 0; index0 < (int) (36); index0++) {
					X = (x + Math.cos(loop) * XRadius2);
					Y = Y_pos;
					Z = (z + Math.sin(loop) * ZRadius2);
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
					}
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == BookbloodItem.block) {
						if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SOUL_FIRE_FLAME, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
							}
						} else {
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
							}
						}
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
										((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == BookbloodItem.block) {
										if (entityiterator instanceof MobEntity) {
											entityiterator.setFire((int) 15);
											{
												Entity _ent = entityiterator;
												if (!_ent.world.isRemote && _ent.world.getServer() != null) {
													_ent.world.getServer().getCommandManager().handleCommand(
															_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
											{
												Entity _ent = entityiterator;
												if (!_ent.world.isRemote && _ent.world.getServer() != null) {
													_ent.world.getServer().getCommandManager().handleCommand(
															_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
								} else {
									if (entityiterator instanceof MobEntity) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == NgskItem.block) {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
										} else {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											entityiterator.setFire((int) 15);
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
									}
								}
							}
						}
					}
					loop = (loop + Math.toRadians(5));
					Y_pos = (Y_pos - 0.0555555555555556);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 60);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 3) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(MatuPotionEffect.potion, (int) 1, (int) 1, (true), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(TomarePotionEffect.potion, (int) 20, (int) 1, (true), (false)));
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(MatuPotionEffect.potion, (int) 1, (int) 1, (true), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.addPotionEffect(new EffectInstance(TomarePotionEffect.potion, (int) 20, (int) 1, (true), (false)));
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;

							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(new EffectInstance(MatuPotionEffect.potion, (int) 1, (int) 1, (true), (false)));
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(new EffectInstance(TomarePotionEffect.potion, (int) 10, (int) 1, (true), (false)));
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (entity instanceof LivingEntity)
											((LivingEntity) entity)
													.addPotionEffect(new EffectInstance(MatuPotionEffect.potion, (int) 1, (int) 1, (true), (false)));
										if (entity instanceof LivingEntity)
											((LivingEntity) entity).addPotionEffect(
													new EffectInstance(TomarePotionEffect.potion, (int) 10, (int) 1, (true), (false)));
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;

											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (entity instanceof LivingEntity)
													((LivingEntity) entity).addPotionEffect(
															new EffectInstance(MatuPotionEffect.potion, (int) 1, (int) 1, (true), (false)));
												if (entity instanceof LivingEntity)
													((LivingEntity) entity).addPotionEffect(
															new EffectInstance(TomarePotionEffect.potion, (int) 10, (int) 1, (true), (false)));
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private IWorld world;

													public void start(IWorld world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														entity.setMotion(0, 0, 0);
														{
															Entity _shootFrom = entity;
															World projectileLevel = _shootFrom.world;
															if (!projectileLevel.isRemote()) {
																ProjectileEntity _entityToSpawn = new Object() {
																	public ProjectileEntity getArrow(World world, Entity shooter, float damage,
																			int knockback, byte piercing) {
																		AbstractArrowEntity entityToSpawn = new TossinItem.ArrowCustomEntity(
																				TossinItem.arrow, world);
																		entityToSpawn.setShooter(shooter);
																		entityToSpawn.setDamage(damage);
																		entityToSpawn.setKnockbackStrength(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.setPierceLevel(piercing);

																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 0, 0, (byte) 10);
																_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1,
																		_shootFrom.getPosZ());
																_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y,
																		_shootFrom.getLookVec().z, 1, 0);
																projectileLevel.addEntity(_entityToSpawn);
															}
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 5);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 10);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 10);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 10);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 20);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 70);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 4) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 1, (int) 10, (true), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 1, (int) 10, (true), (false)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 10);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 5) {
				if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new Ken2Entity.CustomEntity(Ken2Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) (entity.rotationYaw), (float) (entity.rotationPitch));
						entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
						entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new KenEntity.CustomEntity(KenEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) (entity.rotationYaw), (float) (entity.rotationPitch));
						entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
						entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 15);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 6) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == ReaItem.block) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					loop = Math.toRadians(entity.rotationYaw);
					xRadius = 3;
					zRadius = 3;
					loop2 = Math.toRadians(entity.rotationYaw);
					loop = 5;
					loop = 5;
					loop3 = Math.toRadians(entity.rotationYaw);
					xRaduis3 = 8;
					zRaduis3 = 8;
					loop4 = Math.toRadians(entity.rotationYaw);
					xRaduis4 = 10;
					zRaduis4 = 10;
					loop5 = Math.toRadians(entity.rotationYaw);
					xRadius5 = 15;
					zRadius5 = 15;
					loop6 = Math.toRadians(entity.rotationYaw);
					xRadius6 = 20;
					zRadius6 = 20;
					for (int index1 = 0; index1 < (int) (36); index1++) {
						X = (x + Math.cos(loop) * xRadius);
						Y = (y + 1);
						Z = (z + Math.sin(loop) * zRadius);
						X2 = (x + Math.cos(loop2) * loop);
						Y2 = (y + 1);
						Z2 = (z + Math.sin(loop2) * loop);
						X3 = (x + Math.cos(loop3) * xRaduis3);
						Y3 = (y + 1);
						Z3 = (z + Math.sin(loop3) * zRaduis3);
						X4 = (x + Math.cos(loop4) * xRaduis4);
						Y4 = (y + 1);
						Z4 = (z + Math.sin(loop4) * zRaduis4);
						X5 = (x + Math.cos(loop5) * xRadius5);
						Y5 = (y + 1);
						Z5 = (z + Math.sin(loop5) * zRadius5);
						X6 = (x + Math.cos(loop6) * xRadius6);
						Y6 = (y + 1);
						Z6 = (z + Math.sin(loop6) * zRadius6);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X2, Y2, Z2, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X2, Y2, Z2, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X2, Y2, Z2, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X3, Y3, Z3, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X3, Y3, Z3, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X3, Y3, Z3, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X4, Y4, Z4, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X4, Y4, Z4, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X4, Y4, Z4, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X5, Y5, Z5, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X5, Y5, Z5, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X5, Y5, Z5, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X6, Y6, Z6, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X6, Y6, Z6, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X6, Y6, Z6, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), Y - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), Y + (3 / 2d), Z + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, Y, Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X2 - (3 / 2d), Y2 - (3 / 2d), Z2 - (3 / 2d), X2 + (3 / 2d), Y2 + (3 / 2d), Z2 + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X2, Y2, Z2)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X3 - (3 / 2d), Y3 - (3 / 2d), Z3 - (3 / 2d), X3 + (3 / 2d), Y3 + (3 / 2d), Z3 + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X3, Y3, Z3)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X4 - (3 / 2d), Y4 - (3 / 2d), Z4 - (3 / 2d), X4 + (3 / 2d), Y4 + (3 / 2d), Z4 + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X4, Y4, Z4)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X5 - (3 / 2d), Y5 - (3 / 2d), Z5 - (3 / 2d), X5 + (3 / 2d), Y5 + (3 / 2d), Z5 + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X5, Y5, Z5)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X6 - (3 / 2d), Y6 - (3 / 2d), Z6 - (3 / 2d), X6 + (3 / 2d), Y6 + (3 / 2d), Z6 + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X6, Y6, Z6)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						loop = (loop + Math.toRadians(5));
						loop2 = (loop2 + Math.toRadians(5));
						loop3 = (loop3 + Math.toRadians(5));
						loop4 = (loop4 + Math.toRadians(5));
						loop5 = (loop5 + Math.toRadians(5));
						loop6 = (loop6 + Math.toRadians(5));
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
							((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 80);
					}
				} else {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					loop = Math.toRadians(entity.rotationYaw - 180);
					XRadius2 = 3;
					ZRadius2 = 3;
					Y_pos = (y + 5);
					for (int index2 = 0; index2 < (int) (36); index2++) {
						X = (x + Math.cos(loop) * XRadius2);
						Y = Y_pos;
						Z = (z + Math.sin(loop) * ZRadius2);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X, Y, Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.FIREWORK, X, Y, Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 1.000 0.953 0.278 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem() == BookbloodItem.block) {
							if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
									((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.SOUL_FIRE_FLAME, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
								}
							} else {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), Y - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), Y + (3 / 2d), Z + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, Y, Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						loop = (loop - Math.toRadians(5));
						Y_pos = (Y_pos - 0.1666666666666667);
					}
					loop = Math.toRadians(entity.rotationYaw);
					XRadius2 = 3;
					ZRadius2 = 3;
					Y_pos = (y + 5);
					for (int index3 = 0; index3 < (int) (36); index3++) {
						X = (x + Math.cos(loop) * XRadius2);
						Y = Y_pos;
						Z = (z + Math.sin(loop) * ZRadius2);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X, Y, Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.FIREWORK, X, Y, Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 1.000 0.914 0.129 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.941 1.000 0.412 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, Y, Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.980 1.000 0.729 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem() == BookbloodItem.block) {
							if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
									((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.SOUL_FIRE_FLAME, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
								}
							} else {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, X, Y, Z, (int) 3, 0.1, 0.1, 0.1, 0);
								}
							}
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), Y - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), Y + (3 / 2d), Z + (3 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, Y, Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NgskItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
							}
						}
						loop = (loop + Math.toRadians(5));
						Y_pos = (Y_pos - 0.1666666666666667);
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
							((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 50);
					}
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
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
							if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == BookbloodItem.block) {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, (int) 5, 3, 3, 3, 1);
								}
								if (entityiterator instanceof MobEntity) {
									if (!(entityiterator == entity)) {
										if (entityiterator instanceof LivingEntity)
											((LivingEntity) entityiterator).addPotionEffect(
													new EffectInstance(UgokasuPotionEffect.potion, (int) 240, (int) 1, (true), (false)));
										entityiterator.setFire((int) 15);
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(
														_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
							} else {
								if (entityiterator instanceof MobEntity) {
									if (!(entityiterator == entity)) {
										if (entityiterator instanceof LivingEntity)
											((LivingEntity) entityiterator).addPotionEffect(
													new EffectInstance(UgokasuPotionEffect.potion, (int) 240, (int) 1, (true), (false)));
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(
														_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
						} else {
							if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == NgskItem.block) {
								if (entityiterator instanceof MobEntity) {
									if (!(entityiterator == entity)) {
										if (entityiterator instanceof LivingEntity)
											((LivingEntity) entityiterator).addPotionEffect(
													new EffectInstance(UgokasuPotionEffect.potion, (int) 240, (int) 1, (true), (false)));
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
									}
								}
							} else {
								if (entityiterator instanceof MobEntity) {
									if (!(entityiterator == entity)) {
										if (entityiterator instanceof LivingEntity)
											((LivingEntity) entityiterator).addPotionEffect(
													new EffectInstance(UgokasuPotionEffect.potion, (int) 240, (int) 1, (true), (false)));
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
									}
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
										.getItem() == BookbloodItem.block) {
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, x, y, z, (int) 5, 3, 3, 3, 1);
									}
									if (entityiterator instanceof MobEntity) {
										if (!(entityiterator == entity)) {
											entityiterator.setFire((int) 15);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 10);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 8) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				Numerical_value = 1;
				yaw = (entity.rotationYaw);
				angle = (entity.rotationPitch);
				for (int index4 = 0; index4 < (int) (100); index4++) {
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))) - (5 / 2d),
										((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))) - (5 / 2d),
										(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw))) - (5 / 2d),
										(x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))) + (5 / 2d),
										((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))) + (5 / 2d),
										(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw))) + (5 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
										((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
										(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
										((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == BookbloodItem.block) {
										if (entityiterator instanceof MobEntity) {
											if (!(entityiterator == entity)) {
												entityiterator.setFire((int) 15);
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									} else {
										if (entityiterator instanceof MobEntity) {
											if (!(entityiterator == entity)) {
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
								} else {
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == NgskItem.block) {
										if (entityiterator instanceof MobEntity) {
											if (!(entityiterator == entity)) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											}
										}
									} else {
										if (entityiterator instanceof MobEntity) {
											if (!(entityiterator == entity)) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												if (!(entityiterator == entity)) {
													entityiterator.setFire((int) 15);
												}
											}
										}
									}
								}
							}
						}
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^0.3 ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
														((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
														(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"particle minecraft:dust 0.385 0 0.213 1 ^-0.3 ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^0.6 ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
														((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
														(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"particle minecraft:dust 0.385 0 0.213 1 ^-0.6 ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^0.9 ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
														((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
														(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"particle minecraft:dust 0.385 0 0.213 1 ^-0.9 ^ ^ 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^0.3 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^0.6 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
												((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
												(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(), "particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^0.9 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
														((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
														(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^-0.3 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
														((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
														(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^-0.6 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
														((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
														(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw)))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"particle minecraft:dust 0.385 0 0.213 1 ^ ^ ^-0.9 0.01 0.01 0.01 0 10");
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK,
								(x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
								((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
								(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw))), (int) 1, 0.01, 0.01, 0.01,
								0.75);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING,
								(x - Numerical_value * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(yaw))),
								((y + 1) - Numerical_value * Math.sin(Math.toRadians(angle))),
								(z + Numerical_value * Math.cos(Math.toRadians(angle)) * Math.cos(Math.toRadians(yaw))), (int) 15, 0.01, 0.01, 0.01,
								0.75);
					}
					Numerical_value = (Numerical_value + 0.2);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NgskItem.block, (int) 50);
				}
			}
		}
	}
}

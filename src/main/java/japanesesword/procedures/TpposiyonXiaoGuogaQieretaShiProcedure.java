package japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

import japanesesword.potion.Tp1PotionEffect;

import japanesesword.item.PoisonbookItem;
import japanesesword.item.BookbloodItem;

import japanesesword.enchantment.KillEnchantment;
import japanesesword.enchantment.DemonizedEnchantment;

import japanesesword.JapaneseswordMod;

public class TpposiyonXiaoGuogaQieretaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure TpposiyonXiaoGuogaQieretaShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure TpposiyonXiaoGuogaQieretaShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure TpposiyonXiaoGuogaQieretaShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure TpposiyonXiaoGuogaQieretaShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TpposiyonXiaoGuogaQieretaShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((entity.getPersistentData().getDouble("X")), (entity.getPersistentData().getDouble("Y")),
					(entity.getPersistentData().getDouble("Z")));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPersistentData().getDouble("X")),
						(entity.getPersistentData().getDouble("Y")), (entity.getPersistentData().getDouble("Z")), _ent.rotationYaw,
						_ent.rotationPitch, Collections.emptySet());
			}
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof MobEntity) {
						if (!(new Object() {
							boolean check(Entity _entity) {
								if (_entity instanceof LivingEntity) {
									Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
									for (EffectInstance effect : effects) {
										if (effect.getPotion() == Tp1PotionEffect.potion)
											return true;
									}
								}
								return false;
							}
						}.check(entityiterator))) {
							if (!(new Object() {
								boolean check(Entity _entity) {
									if (_entity instanceof LivingEntity) {
										Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
										for (EffectInstance effect : effects) {
											if (effect.getPotion() == Effects.GLOWING)
												return true;
										}
									}
									return false;
								}
							}.check(entityiterator))) {
								if (!(entityiterator == entity)) {
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block
												|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
														.getItem() == PoisonbookItem.block) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												if (entityiterator instanceof MobEntity) {
													if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
															((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemMainhand()
																	: ItemStack.EMPTY)) > 0) {
														if (entity instanceof LivingEntity)
															((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHealth()
																	: -1)
																	+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																			((entity instanceof LivingEntity)
																					? ((LivingEntity) entity).getHeldItemMainhand()
																					: ItemStack.EMPTY))));
													}
													entityiterator.setFire((int) 15);
													{
														Entity _ent = entityiterator;
														if (!_ent.world.isRemote && _ent.world.getServer() != null) {
															_ent.world.getServer().getCommandManager().handleCommand(
																	_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																	"/kill @s");
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
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == PoisonbookItem.block) {
												if (entityiterator instanceof MobEntity) {
													if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
															((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemMainhand()
																	: ItemStack.EMPTY)) > 0) {
														if (entity instanceof LivingEntity)
															((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHealth()
																	: -1)
																	+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																			((entity instanceof LivingEntity)
																					? ((LivingEntity) entity).getHeldItemMainhand()
																					: ItemStack.EMPTY))));
													}
													if (entityiterator instanceof LivingEntity)
														((LivingEntity) entityiterator)
																.addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
													entityiterator.setFire((int) 15);
													{
														Entity _ent = entityiterator;
														if (!_ent.world.isRemote && _ent.world.getServer() != null) {
															_ent.world.getServer().getCommandManager().handleCommand(
																	_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																	"/kill @s");
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
												if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
														((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)) > 0) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity).setHealth(
																(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
																		+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																				((entity instanceof LivingEntity)
																						? ((LivingEntity) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY))));
												}
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
													.getItem() == ((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY).getItem()) {
												if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
														((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)) > 0) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity).setHealth(
																(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
																		+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																				((entity instanceof LivingEntity)
																						? ((LivingEntity) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY))));
												}
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 30);
											} else {
												if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
														((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)) > 0) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity).setHealth(
																(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
																		+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																				((entity instanceof LivingEntity)
																						? ((LivingEntity) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY))));
												}
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 15);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == BookbloodItem.block) {
												if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
														((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)) > 0) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity).setHealth(
																(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
																		+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																				((entity instanceof LivingEntity)
																						? ((LivingEntity) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY))));
												}
												entityiterator.setFire((int) 15);
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == PoisonbookItem.block) {
												if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
														((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)) > 0) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity).setHealth(
																(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
																		+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																				((entity instanceof LivingEntity)
																						? ((LivingEntity) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY))));
												}
												if (entityiterator instanceof LivingEntity)
													((LivingEntity) entityiterator)
															.addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
											}
										}
									}
								}
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager()
											.handleCommand(
													new CommandSource(ICommandSource.DUMMY,
															new Vector3d((entityiterator.getPosX()), (entityiterator.getPosY()),
																	(entityiterator.getPosZ())),
															Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
															((World) world).getServer(), null).withFeedbackDisabled(),
													"particle item redstone ~ ~1 ~ 0.5 0.5 0.5 0.3 100 force");
								}
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager()
											.handleCommand(
													new CommandSource(ICommandSource.DUMMY,
															new Vector3d((entityiterator.getPosX()), (entityiterator.getPosY()),
																	(entityiterator.getPosZ())),
															Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
															((World) world).getServer(), null).withFeedbackDisabled(),
													"particle dust 0.600 0.157 0.110 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
								}
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager()
											.handleCommand(
													new CommandSource(ICommandSource.DUMMY,
															new Vector3d((entityiterator.getPosX()), (entityiterator.getPosY()),
																	(entityiterator.getPosZ())),
															Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
															((World) world).getServer(), null).withFeedbackDisabled(),
													"particle dust 0.000 0.000 0.000 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
								}
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager()
											.handleCommand(
													new CommandSource(ICommandSource.DUMMY,
															new Vector3d((entityiterator.getPosX()), (entityiterator.getPosY()),
																	(entityiterator.getPosZ())),
															Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
															((World) world).getServer(), null).withFeedbackDisabled(),
													"particle dust 0.722 0.086 0.086 1 ~ ~ ~ 0.1 0.1 0.1 0 10");
								}
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 3, 0.1, 0.1, 0.1, 0.2);
								}
							}
						}
					}
				}
			}
		}
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.disableDamage = (false);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
	}
}

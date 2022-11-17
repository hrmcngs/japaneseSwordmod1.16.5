package net.mcreator.japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
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

import net.mcreator.japanesesword.item.PoisonbookItem;
import net.mcreator.japanesesword.item.BookbloodItem;
import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.enchantment.DemonizedEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ZidoukougekioProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure Zidoukougekio!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure Zidoukougekio!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure Zidoukougekio!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure Zidoukougekio!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Zidoukougekio!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("\u81EA\u52D5\u653B\u6483")) {
			if ((EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0)
					&& entity.isSneaking()) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (3 / 2d), y - (3 / 2d), z - (3 / 2d), x + (3 / 2d), y + (3 / 2d), z + (3 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if (!(entityiterator == entity)) {
							if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
									((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
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
													((LivingEntity) entity).setHealth(
															(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
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
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == PoisonbookItem.block) {
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
											if (entityiterator instanceof LivingEntity)
												((LivingEntity) entityiterator)
														.addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
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
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 1);
									if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) > 0) {
										if (entity instanceof LivingEntity)
											((LivingEntity) entity)
													.setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
															+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																	((entity instanceof LivingEntity)
																			? ((LivingEntity) entity).getHeldItemMainhand()
																			: ItemStack.EMPTY))));
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
											((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
									}
								}
							}
						}
					}
				}
			}
			if ((EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)
					&& entity.isSneaking()) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (3 / 2d), y - (3 / 2d), z - (3 / 2d), x + (3 / 2d), y + (3 / 2d), z + (3 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, x, y, z, (int) 5, 3, 3, 3, 1);
						}
						if (!(entityiterator == entity)) {
							if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
									((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
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
													((LivingEntity) entity).setHealth(
															(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
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
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == PoisonbookItem.block) {
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
											if (entityiterator instanceof LivingEntity)
												((LivingEntity) entityiterator)
														.addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
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
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 1);
									if (EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) > 0) {
										if (entity instanceof LivingEntity)
											((LivingEntity) entity)
													.setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
															+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
																	((entity instanceof LivingEntity)
																			? ((LivingEntity) entity).getHeldItemMainhand()
																			: ItemStack.EMPTY))));
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
											((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

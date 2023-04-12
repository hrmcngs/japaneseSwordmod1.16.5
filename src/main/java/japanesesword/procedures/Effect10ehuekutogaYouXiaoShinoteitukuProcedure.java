package japanesesword.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
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

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

import japanesesword.item.PoisonbookItem;
import japanesesword.item.NgsoItem;
import japanesesword.item.DemonizedkatanaItem;
import japanesesword.item.DemonScytheItem;
import japanesesword.item.BookbloodItem;

import japanesesword.enchantment.KillEnchantment;
import japanesesword.enchantment.DemonizedEnchantment;

import japanesesword.JapaneseswordMod;

public class Effect10ehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure Effect10ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure Effect10ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure Effect10ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure Effect10ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Effect10ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), (int) 100);
		loop = 0;
		particleAmount = 10;
		xRadius = 4;
		zRadius = 4;
		while (loop < particleAmount) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.ASH, (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius),
						(y + entity.getPersistentData().getDouble("Y")), (z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), (int) 5,
						0.1, 0.1, 0.1, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.SPIT, (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius),
						(y + entity.getPersistentData().getDouble("Y")), (z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), (int) 5,
						0.1, 0.1, 0.1, 0);
			}
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == NgsoItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == NgsoItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == DemonScytheItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == DemonScytheItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == DemonizedkatanaItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == DemonizedkatanaItem.block) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB((x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius) - (5 / 2d),
											(y + entity.getPersistentData().getDouble("Y")) - (5 / 2d),
											(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius) - (5 / 2d),
											(x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius) + (5 / 2d),
											(y + entity.getPersistentData().getDouble("Y")) + (5 / 2d),
											(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius) + (5 / 2d)),
									null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf((x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius),
									(y + entity.getPersistentData().getDouble("Y")),
									(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
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
											{
												Entity _ent = entityiterator;
												_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
												if (_ent instanceof ServerPlayerEntity) {
													((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
															(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
												}
											}
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
											{
												Entity _ent = entityiterator;
												_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
												if (_ent instanceof ServerPlayerEntity) {
													((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
															(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
												}
											}
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
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
														(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
											}
										}
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
									{
										Entity _ent = entityiterator;
										_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
													(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
										}
									}
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
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 1);
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
				loop = (loop + 1);
				entity.getPersistentData().putDouble("Y", (entity.getPersistentData().getDouble("Y") + 0.2));
			} else {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB((x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius) - (3 / 2d),
											(y + entity.getPersistentData().getDouble("Y")) - (3 / 2d),
											(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius) - (3 / 2d),
											(x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius) + (3 / 2d),
											(y + entity.getPersistentData().getDouble("Y")) + (3 / 2d),
											(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius) + (3 / 2d)),
									null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf((x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius),
									(y + entity.getPersistentData().getDouble("Y")),
									(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
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
											{
												Entity _ent = entityiterator;
												_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
												if (_ent instanceof ServerPlayerEntity) {
													((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
															(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
												}
											}
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
											{
												Entity _ent = entityiterator;
												_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
												if (_ent instanceof ServerPlayerEntity) {
													((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
															(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
												}
											}
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
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
														(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
											}
										}
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
									{
										Entity _ent = entityiterator;
										_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()),
													(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
										}
									}
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
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 1);
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
				loop = (loop + 1);
				entity.getPersistentData().putDouble("Y", (entity.getPersistentData().getDouble("Y") + 0.2));
			}
		}
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
				entity.setMotion(0, 1, 0);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 5);
	}
}

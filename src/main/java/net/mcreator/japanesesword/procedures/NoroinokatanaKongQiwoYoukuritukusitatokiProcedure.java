package net.mcreator.japanesesword.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
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

import net.mcreator.japanesesword.potion.KurutaimunasiPotionEffect;
import net.mcreator.japanesesword.item.NorooinokatanaItem;
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

public class NoroinokatanaKongQiwoYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure NoroinokatanaKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure NoroinokatanaKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure NoroinokatanaKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure NoroinokatanaKongQiwoYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NoroinokatanaKongQiwoYoukuritukusitatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double deg = 0;
		double r = 0;
		double ycoordinate = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double XRadius2 = 0;
		double ZRadius2 = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Y_pos = 0;
		double Radius = 0;
		double zPos = 0;
		double yPos = 0;
		double rad_now = 0;
		double xPos = 0;
		double slot = 0;
		double dis = 0;
		double Zknockback = 0;
		double Yknockback = 0;
		double Xknockback = 0;
		double rad = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == NorooinokatanaItem.block) {
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 6) {
				if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					loop = Math.toRadians(entity.rotationYaw - 180);
					XRadius2 = 3;
					ZRadius2 = 3;
					Y_pos = (y + 3);
					for (int index0 = 0; index0 < (int) (36); index0++) {
						X = (x + Math.cos(loop) * XRadius2);
						Y = Y_pos;
						Z = (z + Math.sin(loop) * ZRadius2);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 2), Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANT, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 1.000 0.953 0.278 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), (Y + 2) - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), (Y + 2) + (3 / 2d), Z + (3 / 2d)),
									null).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, (Y + 2), Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
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
							}
						}
						loop = (loop - Math.toRadians(5));
						Y_pos = (Y_pos - 0.1666666666666667);
						entity.setMotion(0, 0, 0);
					}
				} else {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					loop = Math.toRadians(entity.rotationYaw - 180);
					XRadius2 = 3;
					ZRadius2 = 3;
					Y_pos = (y + 3);
					for (int index1 = 0; index1 < (int) (36); index1++) {
						X = (x + Math.cos(loop) * XRadius2);
						Y = Y_pos;
						Z = (z + Math.sin(loop) * ZRadius2);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 2), Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.WITCH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 1.000 0.953 0.278 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), (Y + 2) - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), (Y + 2) + (3 / 2d), Z + (3 / 2d)),
									null).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, (Y + 2), Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof MobEntity) {
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == NorooinokatanaItem.block) {
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
									} else {
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
									}
								}
							}
						}
						loop = (loop - Math.toRadians(5));
						Y_pos = (Y_pos - 0.1666666666666667);
						entity.setMotion(0, 0, 0);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 20);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 10);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 5) {
				if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new JapaneseswordModVariables.PlayerVariables())).f == 6) {
					if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
							((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0)
							|| (EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
									((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						loop = Math.toRadians(entity.rotationYaw - 180);
						XRadius2 = 3;
						ZRadius2 = 3;
						Y_pos = (y + 3);
						for (int index2 = 0; index2 < (int) (36); index2++) {
							X = (x + Math.cos(loop) * XRadius2);
							Y = Y_pos;
							Z = (z + Math.sin(loop) * ZRadius2);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 2), Z, (int) 3, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 1.000 0.953 0.278 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(X - (3 / 2d), (Y + 2) - (3 / 2d),
										Z - (3 / 2d), X + (3 / 2d), (Y + 2) + (3 / 2d), Z + (3 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(X, (Y + 2), Z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
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
								}
							}
							loop = (loop - Math.toRadians(5));
							Y_pos = (Y_pos - 0.1666666666666667);
							entity.setMotion(0, 0, 0);
						}
						loop = Math.toRadians(entity.rotationYaw - 180);
						XRadius2 = 3;
						ZRadius2 = 3;
						Y_pos = (y + 3);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						for (int index3 = 0; index3 < (int) (36); index3++) {
							X = (x + Math.cos(loop) * XRadius2);
							Y = Y_pos;
							Z = (z + Math.sin(loop) * ZRadius2);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 2), Z, (int) 3, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 1.000 0.914 0.129 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.941 1.000 0.412 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.980 1.000 0.729 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(X - (3 / 2d), (Y + 2) - (3 / 2d),
										Z - (3 / 2d), X + (3 / 2d), (Y + 2) + (3 / 2d), Z + (3 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(X, (Y + 2), Z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
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
								}
							}
							loop = (loop + Math.toRadians(5));
							Y_pos = (Y_pos - 0.1666666666666667);
							entity.setMotion(0, 0, 0);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
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
								((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 20);
						}
					} else {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						loop = Math.toRadians(entity.rotationYaw - 180);
						XRadius2 = 3;
						ZRadius2 = 3;
						Y_pos = (y + 3);
						for (int index4 = 0; index4 < (int) (36); index4++) {
							X = (x + Math.cos(loop) * XRadius2);
							Y = Y_pos;
							Z = (z + Math.sin(loop) * ZRadius2);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 2), Z, (int) 3, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 1.000 0.953 0.278 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.965 1.000 0.490 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(X - (3 / 2d), (Y + 2) - (3 / 2d),
										Z - (3 / 2d), X + (3 / 2d), (Y + 2) + (3 / 2d), Z + (3 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(X, (Y + 2), Z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof MobEntity) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == NorooinokatanaItem.block) {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
										} else {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
									}
								}
							}
							loop = (loop - Math.toRadians(5));
							Y_pos = (Y_pos - 0.1666666666666667);
							entity.setMotion(0, 0, 0);
						}
						loop = Math.toRadians(entity.rotationYaw - 180);
						XRadius2 = 3;
						ZRadius2 = 3;
						Y_pos = (y + 3);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						for (int index5 = 0; index5 < (int) (36); index5++) {
							X = (x + Math.cos(loop) * XRadius2);
							Y = Y_pos;
							Z = (z + Math.sin(loop) * ZRadius2);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 2), Z, (int) 3, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0.2);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.TOTEM_OF_UNDYING, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 1.000 0.914 0.129 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.941 1.000 0.412 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(X, (Y + 2), Z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"particle minecraft:dust 0.980 1.000 0.729 1 ~ ~ ~ 0.2 0.2 0.2 1 10");
							}
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(X - (3 / 2d), (Y + 2) - (3 / 2d),
										Z - (3 / 2d), X + (3 / 2d), (Y + 2) + (3 / 2d), Z + (3 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(X, (Y + 2), Z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof MobEntity) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == NorooinokatanaItem.block) {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
										} else {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
									}
								}
							}
							loop = (loop + Math.toRadians(5));
							Y_pos = (Y_pos - 0.1666666666666667);
							entity.setMotion(0, 0, 0);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
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
							((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 20);
					}
				}
				if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new JapaneseswordModVariables.PlayerVariables())).f == 5) {
					loop = 0;
					particleAmount = 20;
					xRadius = 2;
					zRadius = 2;
					while (loop < particleAmount) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.HEART,
									(x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius),
									(y + entity.getPersistentData().getDouble("Y")),
									(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), (int) 5, 0.1, 0.1, 0.1, 0);
						}
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
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 6);
								}
							}
						}
						loop = (loop + 1);
						entity.getPersistentData().putDouble("Y", (entity.getPersistentData().getDouble("Y") + 0.2));
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 30, (int) 5, (true), (true)));
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 2) {
				if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					loop = Math.toRadians(entity.rotationYaw);
					XRadius2 = 3;
					ZRadius2 = 3;
					Y_pos = (y + 1);
					for (int index7 = 0; index7 < (int) (36); index7++) {
						X = (x + Math.cos(loop) * XRadius2);
						Y = Y_pos;
						Z = (z + Math.sin(loop) * ZRadius2);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 1), Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 1), Z, (int) 5, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANT, X, (Y + 1), Z, (int) 5, 0.1, 0.1, 0.1, 0);
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), (Y + 1) - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), (Y + 1) + (3 / 2d), Z + (3 / 2d)),
									null).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, (Y + 1), Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
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
							}
						}
						loop = (loop + Math.toRadians(5));
						Y_pos = (Y_pos - 0.0555555555555556);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
							((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 10);
					}
				} else {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					loop = Math.toRadians(entity.rotationYaw);
					XRadius2 = 3;
					ZRadius2 = 3;
					Y_pos = (y + 1);
					for (int index8 = 0; index8 < (int) (36); index8++) {
						X = (x + Math.cos(loop) * XRadius2);
						Y = Y_pos;
						Z = (z + Math.sin(loop) * ZRadius2);
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, X, (Y + 1), Z, (int) 3, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ASH, X, (Y + 1), Z, (int) 5, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.WITCH, X, (Y + 2), Z, (int) 5, 0.1, 0.1, 0.1, 0);
						}
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(X - (3 / 2d), (Y + 1) - (3 / 2d), Z - (3 / 2d), X + (3 / 2d), (Y + 1) + (3 / 2d), Z + (3 / 2d)),
									null).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(X, (Y + 1), Z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (entityiterator instanceof MobEntity) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == NorooinokatanaItem.block) {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
										} else {
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
									}
								}
							}
						}
						loop = (loop + Math.toRadians(5));
						Y_pos = (Y_pos - 0.0555555555555556);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g2")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("japanesesword:g")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
							((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 10);
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
						for (int index9 = 0; index9 < (int) (10); index9++) {
							if (!(entityiterator == entity)) {
								if (entity instanceof MobEntity) {
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()),
												(entityiterator.getPosY() + 1), (entityiterator.getPosZ()), (int) 5, 0.1, 0.1, 0.1, 0);
									}
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
											{
												Entity _ent = entityiterator;
												if (!_ent.world.isRemote && _ent.world.getServer() != null) {
													_ent.world.getServer().getCommandManager().handleCommand(
															_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
															"/deta merge entity @s (Health:0)");
												}
											}
										} else {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == NorooinokatanaItem.block) {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
											} else {
												entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 60);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 3) {
				entity.setMotion(
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
								RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX() - entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0,
														entity.getLook(1f).z * 0),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getX()),
						(entity.world
								.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
								.getPos().getY()
								- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(entity.world
								.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
												entity.getLook(1f).z * 10),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
								.getPos().getZ()
								- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
				entity.fallDistance = (float) (0);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.SWEEP_ATTACK, (entity.getPosX()), (entity.getPosY() + 1), (entity.getPosZ()),
							(int) 5, 0.1, 0.1, 0.1, 0);
				}
				for (int index10 = 0; index10 < (int) (20); index10++) {
					for (int index11 = 0; index11 < (int) (20); index11++) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
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
												{
													Entity _ent = entityiterator;
													if (!_ent.world.isRemote && _ent.world.getServer() != null) {
														_ent.world.getServer().getCommandManager().handleCommand(
																_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																"/deta merge entity @s (Health:0)");
													}
												}
											} else {
												if (((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemOffhand()
														: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
													entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
												} else {
													entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
												}
											}
										}
									}
								}
							}
						}
						entity.fallDistance = (float) (0);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 5);
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(NorooinokatanaItem.block, (int) 30);
				}
			}
		}
	}
}

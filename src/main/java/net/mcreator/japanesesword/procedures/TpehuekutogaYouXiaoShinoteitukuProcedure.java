package net.mcreator.japanesesword.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.japanesesword.potion.TpPotionEffect;
import net.mcreator.japanesesword.item.BookbloodItem;
import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

public class TpehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure TpehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure TpehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure TpehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure TpehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TpehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TpPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			entity.getPersistentData().putDouble("totalTarget", 0);
			entity.getPersistentData().putDouble("CurrentTarget", 0);
			entity.getPersistentData().putDouble("Timer", 0);
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!((!(entityiterator == entity) || !(entity instanceof ItemEntity)) && entity instanceof LivingEntity)) {
						entity.getPersistentData().putDouble("totalTarget", (entity.getPersistentData().getDouble("totalTarget") + 1));
						entityiterator.getPersistentData().putDouble("targetQueue", (entity.getPersistentData().getDouble("targetQueue")));
						entityiterator.setCustomName(new StringTextComponent(("Im target" + entity.getPersistentData().getDouble("totalTarget"))));
					}
				}
			}
			for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("totalTarget")); index0++) {
				entity.getPersistentData().putDouble("Timer", (entity.getPersistentData().getDouble("Timer") + 3));
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
						entity.getPersistentData().putDouble("CurrentTarget", (entity.getPersistentData().getDouble("CurrentTarget") + 1));
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entity.getPersistentData().getDouble("CurrentTarget") == entityiterator.getPersistentData()
										.getDouble("targetQueue")) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity)
												.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 30, (int) 1, (true), (false)));
									{
										Entity _ent = entity;
										_ent.setPositionAndUpdate((entityiterator.getPosX()), (entityiterator.getPosY()), (entityiterator.getPosZ()));
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation((entityiterator.getPosX()),
													(entityiterator.getPosY()), (entityiterator.getPosZ()), _ent.rotationYaw, _ent.rotationPitch,
													Collections.emptySet());
										}
									}
									world.addParticle(ParticleTypes.SWEEP_ATTACK, x, (y + 1.65), z, 0, 1, 0);
									if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
											.getItem() == BookbloodItem.block) {
										if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
												((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)) != 0)) {
											world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, x, (y + 1.65), z, 0, 1, 0);
											world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, (x + 1.65), (y + 1.65), z, 0, 1, 0);
											world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, x, (y + 1.65), (z + 1.65), 0, 1, 0);
											world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, (x + 1.65), (y + 1.65), (z + 1.65), 0, 1, 0);
										} else {
											world.addParticle(ParticleTypes.FLAME, x, (y + 1.65), z, 0, 1, 0);
											world.addParticle(ParticleTypes.FLAME, (x + 1.65), (y + 1.65), z, 0, 1, 0);
											world.addParticle(ParticleTypes.FLAME, x, (y + 1.65), (z + 1.65), 0, 1, 0);
											world.addParticle(ParticleTypes.FLAME, (x + 1.65), (y + 1.65), (z + 1.65), 0, 1, 0);
										}
									}
									if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
											((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)) != 0)) {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												if (!(entityiterator == entity)) {
													entity.setFire((int) 15);
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
												if (!(entityiterator == entity)) {
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
										}
									} else {
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (entityiterator instanceof MobEntity) {
												if (!(entityiterator == entity)) {
													entity.setFire((int) 15);
													entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
												}
											}
										} else {
											if (entityiterator instanceof MobEntity) {
												if (!(entityiterator == entity)) {
													entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
												}
											}
										}
									}
								}
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) (entity.getPersistentData().getDouble("Timer")));
			}
		}
	}
}

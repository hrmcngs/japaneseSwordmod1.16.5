package net.mcreator.japanesesword.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.potion.RenngekiPotionEffect;
import net.mcreator.japanesesword.potion.KurutaimunasiPotionEffect;
import net.mcreator.japanesesword.item.TokinohonnItem;
import net.mcreator.japanesesword.item.KogatanaItem;
import net.mcreator.japanesesword.JapaneseswordModVariables;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

public class KogatanaenteiteigaaitemuwoZhentutaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure KogatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure KogatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure KogatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure KogatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure KogatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == KogatanaItem.block) {
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 2) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(RenngekiPotionEffect.potion,
							(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 2),
							(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 3) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(RenngekiPotionEffect.potion,
							(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 3),
							(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 4) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(RenngekiPotionEffect.potion,
							(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 4),
							(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 5) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(RenngekiPotionEffect.potion,
							(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 5),
							(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 6) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(RenngekiPotionEffect.potion,
							(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 6),
							(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 7) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(RenngekiPotionEffect.potion,
							(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 7),
							(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 8) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == TokinohonnItem.block) {
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (30 / 2d), y - (30 / 2d), z - (30 / 2d), x + (30 / 2d), y + (30 / 2d), z + (30 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 255, (false), (false)));
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 255, (false), (false)));
								entityiterator.rotationYaw = (float) (0);
								entity.setRenderYawOffset(entity.rotationYaw);
								entity.prevRotationYaw = entity.rotationYaw;
								if (entity instanceof LivingEntity) {
									((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
									((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
									((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
								}
								entityiterator.rotationPitch = (float) (75);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 1);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 2);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 3);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 4);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 5);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 6);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 7);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 8);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 9);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 10);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 11);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 12);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 13);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 14);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 15);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 16);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 17);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 18);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 19);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 21);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 22);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 23);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 24);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 25);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 26);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 27);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 28);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 29);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 30);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 31);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 32);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 33);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 34);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 35);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 36);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 37);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 38);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 39);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 40);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 41);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 42);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 43);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 44);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 45);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 46);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 47);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 48);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 49);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 50);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 51);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 52);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 53);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 54);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 55);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 56);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 57);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 58);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 59);
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
										entityiterator.setMotion(0, 0, 0);
										{
											Entity _ent = entityiterator;
											_ent.setPositionAndUpdate(x, y, z);
											if (_ent instanceof ServerPlayerEntity) {
												((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw,
														_ent.rotationPitch, Collections.emptySet());
											}
										}
										entityiterator.rotationYaw = (float) (0);
										entity.setRenderYawOffset(entity.rotationYaw);
										entity.prevRotationYaw = entity.rotationYaw;
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
											((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
											((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
										}
										entityiterator.rotationPitch = (float) (75);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 60);
							}
						}
					}
				} else {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(
										new EffectInstance(RenngekiPotionEffect.potion,
												(int) ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto * 8),
												(int) 1, (true), (true)));
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
						((PlayerEntity) entity).getCooldownTracker().setCooldown(KogatanaItem.block, (int) 100);
				}
			}
		}
	}
}

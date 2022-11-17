package japanesesword.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collection;

import japanesesword.potion.SupuidokyoukaPotionEffect;
import japanesesword.potion.KurutaimunasiPotionEffect;

import japanesesword.item.NorooinokatanaItem;

import japanesesword.enchantment.KillEnchantment;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class NorooinokatanaenteiteigaaitemuwoZhentutaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure NorooinokatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure NorooinokatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure NorooinokatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure NorooinokatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NorooinokatanaenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double Radius = 0;
		double zPos = 0;
		double yPos = 0;
		double loop = 0;
		double rad_now = 0;
		double xPos = 0;
		double slot = 0;
		double dis = 0;
		double zknockback = 0;
		double yknockback = 0;
		double XRadius2 = 0;
		double ZRadius2 = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double xknockback = 0;
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SupuidokyoukaPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
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
							(int) 1, 0.1, 0.1, 0.1, 0);
				}
				for (int index0 = 0; index0 < (int) (10); index0++) {
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
							for (int index1 = 0; index1 < (int) (10); index1++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
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
							for (int index2 = 0; index2 < (int) (10); index2++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
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
							for (int index3 = 0; index3 < (int) (10); index3++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
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
							for (int index4 = 0; index4 < (int) (10); index4++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
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
							for (int index5 = 0; index5 < (int) (10); index5++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 60);
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
							for (int index6 = 0; index6 < (int) (10); index6++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 70);
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
							for (int index7 = 0; index7 < (int) (10); index7++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 80);
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
							for (int index8 = 0; index8 < (int) (10); index8++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 90);
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
							for (int index9 = 0; index9 < (int) (10); index9++) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)),
											null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (entity instanceof LivingEntity) {
												if (!(entityiterator == entity)) {
													if (entity instanceof LivingEntity) {
														if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
																((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)) != 0)) {
															{
																Entity _ent = entityiterator;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"/kill @s");
																}
															}
														} else {
															if (((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemOffhand()
																	: ItemStack.EMPTY).getItem() == NorooinokatanaItem.block) {
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
								entity.fallDistance = (float) (0);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 100);
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

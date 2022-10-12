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
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class TossinFeibiDaoJugaFeindeiruJianProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		if (dependencies.get("immediatesourceentity") == null) {
			if (!dependencies.containsKey("immediatesourceentity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency immediatesourceentity for procedure TossinFeibiDaoJugaFeindeiruJian!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity immediatesourceentity = (Entity) dependencies.get("immediatesourceentity");
		double Radius = 0;
		double zPos = 0;
		double yPos = 0;
		double loop = 0;
		double rad_now = 0;
		double xPos = 0;
		double slot = 0;
		double dis = 0;
		immediatesourceentity.getPersistentData().putBoolean("battozyutu", (true));
		immediatesourceentity
				.setMotion(
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX() - entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0,
														entity.getLook(1f).z * 0),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getX()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0,
														entity.getLook(1f).z * 0),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getY()),
						(entity.world
								.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20,
												entity.getLook(1f).z * 20),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
								.getPos().getZ()
								- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((immediatesourceentity.getPosX()), (immediatesourceentity.getPosY()), (immediatesourceentity.getPosZ()));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((immediatesourceentity.getPosX()), (immediatesourceentity.getPosY()),
						(immediatesourceentity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		loop = Math.toRadians(entity.rotationYaw + new Random().nextInt(200 + 1) - new Random().nextInt(120 + 1));
		Radius = 1;
		rad_now = ((Math.random() - 180) * 480);
		for (int index0 = 0; index0 < (int) (36); index0++) {
			Radius = 1;
			for (int index1 = 0; index1 < (int) (4); index1++) {
				xPos = (x + Math.cos(loop) * Radius);
				yPos = (y + 1 + Math.sin(loop) * Math.sin(rad_now) * (-1) * Radius);
				zPos = (z + Math.sin(loop) * Radius);
				if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0)) {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"particle minecraft:dust 0.000 0.000 0.000 0.0 ~ ~ ~ 0.01 0.01 0.01 1 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"particle minecraft:dust 0.000 0.000 0.000 0.0 ~ ~ ~ 0.01 0.01 0.01 1 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"particle minecraft:dust 0.000 0.000 0.000 0.0 ~ ~ ~ 0.01 0.01 0.01 1 10");
					}
				} else {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"particle minecraft:dust 0.059 0.059 0.059 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"particle minecraft:dust 0.188 0.000 0.000 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"particle minecraft:dust 0.549 0.000 0.000 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
					}
				}
				{
					List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(xPos - (3 / 2d), yPos - (3 / 2d), zPos - (3 / 2d), xPos + (3 / 2d), yPos + (3 / 2d), zPos + (3 / 2d)),
							null).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(xPos, yPos, zPos)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (entityiterator instanceof MobEntity) {
								if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
										((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0)) {
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
								} else {
									if (!(entityiterator == entity)) {
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
									}
								}
								slot = (entityiterator.getPosX() - entity.getPosX());
								slot = (entityiterator.getPosY() - entity.getPosY());
								slot = (entityiterator.getPosZ() - entity.getPosZ());
								dis = (Math.abs(slot) + Math.abs(slot) + Math.abs(slot));
								if (Radius != 0) {
									slot = ((slot / dis) * 0.1);
									slot = Math.min((slot / dis) * 0, 2);
									slot = ((slot / dis) * 0.1);
								} else {
									slot = 0;
									slot = 0;
									slot = 0;
								}
								entityiterator.setMotion(slot, slot, slot);
							}
						}
					}
				}
				Radius = (Radius + 0.25);
			}
			loop = (loop + Math.toRadians(5));
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
				{
					Entity _ent = immediatesourceentity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager()
								.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
					}
				}
				{
					Entity _ent = immediatesourceentity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/deta merge entity @s (Health:0)");
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 5);
	}
}

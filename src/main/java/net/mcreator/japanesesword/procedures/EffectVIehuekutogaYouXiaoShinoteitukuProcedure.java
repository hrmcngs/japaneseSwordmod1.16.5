package net.mcreator.japanesesword.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.japanesesword.item.TuvaItem;
import net.mcreator.japanesesword.item.PoisonnaginataItem;
import net.mcreator.japanesesword.item.PoisonbookItem;
import net.mcreator.japanesesword.item.NaginataItem;
import net.mcreator.japanesesword.item.Katana1Item;
import net.mcreator.japanesesword.item.BookbloodItem;
import net.mcreator.japanesesword.enchantment.KillEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class EffectVIehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure EffectVIehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure EffectVIehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure EffectVIehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure EffectVIehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure EffectVIehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double xPos = 0;
		double dis = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Katana1Item.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == Katana1Item.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == TuvaItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == TuvaItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == PoisonnaginataItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == PoisonnaginataItem.block) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
						SoundCategory.NEUTRAL, (float) 0.5, (float) 0.8);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
						SoundCategory.NEUTRAL, (float) 0.5, (float) 0.8, false);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			entity.getPersistentData().putDouble("yaw",
					Math.toRadians(entity.rotationYaw + new Random().nextInt(200 + 1) - new Random().nextInt(120 + 1)));
			entity.getPersistentData().putDouble("yaw2", (Math.random() * 360));
			dis = 1;
			for (int index0 = 0; index0 < (int) (7); index0++) {
				degree = (entity.getPersistentData().getDouble("yaw"));
				rad = 1.75;
				rad_now = (entity.getPersistentData().getDouble("yaw2"));
				for (int index1 = 0; index1 < (int) (70); index1++) {
					x_pos = (x + Math.cos(rad_now) * Math.cos(degree) * rad * dis);
					y_pos = (y + 1 + Math.sin(rad_now) * rad * dis);
					z_pos = (z + Math.cos(rad_now) * Math.sin(degree) * rad * dis);
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == BookbloodItem.block) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x_pos, y_pos, z_pos), Vector2f.ZERO, (ServerWorld) world, 4,
											"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.059 0.059 0.059 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x_pos, y_pos, z_pos), Vector2f.ZERO, (ServerWorld) world, 4,
											"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.188 0.000 0.000 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x_pos, y_pos, z_pos), Vector2f.ZERO, (ServerWorld) world, 4,
											"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0.549 0.000 0.000 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
						}
					} else {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x_pos, y_pos, z_pos), Vector2f.ZERO, (ServerWorld) world, 4,
											"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"particle minecraft:dust 0 0 0 0.5 ~ ~ ~ 0.01 0.01 0.01 1 7");
						}
					}
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x_pos - (9 / 2d), y_pos - (9 / 2d),
								z_pos - (9 / 2d), x_pos + (9 / 2d), y_pos + (9 / 2d), z_pos + (9 / 2d)), null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x_pos, y_pos, z_pos)).collect(Collectors.toList());
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
												if (((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemOffhand()
														: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block
														&& ((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block) {
													if (entityiterator instanceof LivingEntity)
														((LivingEntity) entityiterator)
																.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));
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
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == PoisonnaginataItem.block
													&& ((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block) {
												if (entityiterator instanceof LivingEntity)
													((LivingEntity) entityiterator)
															.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));
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
												.getItem() == NaginataItem.block
												&& ((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == NaginataItem.block
												|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
														.getItem() == Katana1Item.block
														&& ((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getItem() == Katana1Item.block
												|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
														.getItem() == PoisonnaginataItem.block
														&& ((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == PoisonnaginataItem.block
													&& ((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block) {
												if (entityiterator instanceof LivingEntity)
													((LivingEntity) entityiterator)
															.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));
											}
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
										} else {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == PoisonnaginataItem.block
													&& ((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block) {
												if (entityiterator instanceof LivingEntity)
													((LivingEntity) entityiterator)
															.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));
											}
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == BookbloodItem.block) {
											if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
													.getItem() == PoisonnaginataItem.block
													&& ((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY).getItem() == PoisonnaginataItem.block) {
												if (entityiterator instanceof LivingEntity)
													((LivingEntity) entityiterator)
															.addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));
											}
											entityiterator.setFire((int) 15);
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
										if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem() == PoisonbookItem.block) {
											if (entityiterator instanceof LivingEntity)
												((LivingEntity) entityiterator)
														.addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
											entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
										}
									}
								}
							}
						}
					}
					degree = (degree + Math.toRadians(2.5));
					rad_now = (rad_now + Math.toRadians(2.5));
				}
				dis = (dis + 0.05);
			}
		}
	}
}

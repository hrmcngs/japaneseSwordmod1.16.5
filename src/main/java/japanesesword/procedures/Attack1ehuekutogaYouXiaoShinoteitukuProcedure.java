package japanesesword.procedures;

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

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collection;

import japanesesword.item.PoisonbookItem;
import japanesesword.item.BookbloodItem;

import japanesesword.enchantment.KillEnchantment;

import japanesesword.JapaneseswordMod;

public class Attack1ehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure Attack1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure Attack1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure Attack1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure Attack1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Attack1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double zknockback = 0;
		double yknockback = 0;
		double xknockback = 0;
		double dis = 0;
		double xmob = 0;
		double a = 0;
		double r = 0;
		double b = 0;
		double s = 0;
		double c = 0;
		double nokku = 0;
		double ymob = 0;
		double zmob = 0;
		entity.getPersistentData().putDouble("X", (x + Math.sin(Math.toRadians(entity.rotationYaw + 180)) * 2));
		entity.getPersistentData().putDouble("Z", (z + Math.cos(Math.toRadians(entity.rotationYaw)) * 2));
		entity.setMotion(0, 0.9, 0);
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, (entity.getPersistentData().getDouble("X")), (y + 1),
					(entity.getPersistentData().getDouble("Z")), (int) 10, 0.1, 0.1, 0.1, 0);
		}
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
					new AxisAlignedBB((entity.getPersistentData().getDouble("X")) - (5 / 2d), (y + 1) - (5 / 2d),
							(entity.getPersistentData().getDouble("Z")) - (5 / 2d), (entity.getPersistentData().getDouble("X")) + (5 / 2d),
							(y + 1) + (5 / 2d), (entity.getPersistentData().getDouble("Z")) + (5 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPersistentData().getDouble("X")), (y + 1), (entity.getPersistentData().getDouble("Z"))))
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
									entityiterator.setFire((int) 15);
									{
										Entity _ent = entityiterator;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager()
													.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									if (entity instanceof LivingEntity)
										((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
									entityiterator.setFire((int) 15);
									{
										Entity _ent = entityiterator;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager()
													.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager()
												.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
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
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) ((8 * (1 + new Object() {
								int check(Entity _entity) {
									if (_entity instanceof LivingEntity) {
										Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
										for (EffectInstance effect : effects) {
											if (effect.getPotion() == Effects.STRENGTH)
												return effect.getAmplifier();
										}
									}
									return 0;
								}
							}.check(entity))) / 1));
							if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == BookbloodItem.block) {
								entityiterator.setFire((int) 15);
							}
							if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == PoisonbookItem.block) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
							}
						}
					}
					if (entityiterator instanceof MobEntity) {
						xknockback = (entityiterator.getPosX() - entity.getPosX());
						yknockback = (entityiterator.getPosY() - entity.getPosY());
						zknockback = (entityiterator.getPosZ() - entity.getPosZ());
						dis = (Math.abs(xknockback) + Math.abs(yknockback) + Math.abs(zknockback));
						if (dis != 0) {
							xknockback = ((xknockback / dis) * 3);
							yknockback = Math.min((yknockback / dis) * 3, 2);
							zknockback = ((zknockback / dis) * 3);
						} else {
							xknockback = 0;
							yknockback = 0;
							zknockback = 0;
						}
						entityiterator.setMotion(xknockback, yknockback, zknockback);
					}
				}
			}
		}
	}
}

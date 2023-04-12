package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Hand;
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

import japanesesword.potion.SlicePotionEffect;
import japanesesword.potion.KillSlicePotionEffect;

import japanesesword.item.PoisonbookItem;
import japanesesword.item.DemonKatanaItem;
import japanesesword.item.BookbloodItem;

import japanesesword.enchantment.KillEnchantment;

import japanesesword.JapaneseswordMod;

public class DemonKatanamobugaturudeGongJisaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure DemonKatanamobugaturudeGongJisaretatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure DemonKatanamobugaturudeGongJisaretatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure DemonKatanamobugaturudeGongJisaretatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure DemonKatanamobugaturudeGongJisaretatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure DemonKatanamobugaturudeGongJisaretatoki!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DemonKatanamobugaturudeGongJisaretatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double loop = 0;
		double XRadius2 = 0;
		double ZRadius2 = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Y_pos = 0;
		double xmob = 0;
		double a = 0;
		double r = 0;
		double b = 0;
		double s = 0;
		double c = 0;
		double nokku = 0;
		double ymob = 0;
		double zmob = 0;
		double i = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == DemonKatanaItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == DemonKatanaItem.block) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.addPotionEffect(new EffectInstance(KillSlicePotionEffect.potion, (int) 120, (int) 5, (true), (false)));
			} else {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(SlicePotionEffect.potion, (int) 120, (int) 5, (true), (false)));
			}
			for (int index0 = 0; index0 < (int) (10); index0++) {
				world.addParticle(ParticleTypes.SWEEP_ATTACK, (x + 3 * entity.getLookVec().x + 2 * (Math.random() - 0.5)),
						(y + 1 + 3 * entity.getLookVec().y + 2 * (Math.random() - 0.5)), (z + 3 * entity.getLookVec().z + 2 * (Math.random() - 0.5)),
						0, 1, 0);
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB((x + 3 * entity.getLookVec().x) - (3 / 2d), (y + 1 + 3 * entity.getLookVec().y) - (3 / 2d),
										(z + 3 * entity.getLookVec().z) - (3 / 2d), (x + 3 * entity.getLookVec().x) + (3 / 2d),
										(y + 1 + 3 * entity.getLookVec().y) + (3 / 2d), (z + 3 * entity.getLookVec().z) + (3 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((x + 3 * entity.getLookVec().x), (y + 1 + 3 * entity.getLookVec().y), (z + 3 * entity.getLookVec().z)))
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
										if (entity instanceof LivingEntity)
											((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
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
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
										.getItem() == DemonKatanaItem.block) {
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 12);
								} else {
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
										.getItem() == BookbloodItem.block) {
									entityiterator.setFire((int) 15);
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
								if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
										.getItem() == PoisonbookItem.block) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 1));
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								}
							}
						}
					}
				}
			}
		}
	}
}

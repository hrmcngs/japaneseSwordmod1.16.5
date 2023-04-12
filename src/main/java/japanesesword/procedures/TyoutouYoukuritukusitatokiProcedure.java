package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.potion.MagickatanaeffectPotionEffect;
import japanesesword.potion.HanekaesuPotionEffect;

import japanesesword.item.UdewaItem;

import japanesesword.enchantment.KillEnchantment;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class TyoutouYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure TyoutouYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure TyoutouYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure TyoutouYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure TyoutouYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure TyoutouYoukuritukusitatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double r = 0;
		double alpha = 0;
		double beta = 0;
		double hakkatteru = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
				.getItem() == UdewaItem.body) {
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 2) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				r = 1;
				alpha = (entity.rotationYaw);
				beta = (entity.rotationPitch);
				for (int index0 = 0; index0 < (int) (10); index0++) {
					{
						List<Entity> _entfound = world
								.getEntitiesWithinAABB(Entity.class,
										new AxisAlignedBB((x - r * Math.cos(Math.toRadians(beta)) * Math.sin(Math.toRadians(alpha))) - (1 / 2d),
												((y + 1) - r * Math.sin(Math.toRadians(beta))) - (1 / 2d),
												(z + r * Math.cos(Math.toRadians(beta)) * Math.cos(Math.toRadians(alpha))) - (1 / 2d),
												(x - r * Math.cos(Math.toRadians(beta)) * Math.sin(Math.toRadians(alpha))) + (1 / 2d),
												((y + 1) - r * Math.sin(Math.toRadians(beta))) + (1 / 2d),
												(z + r * Math.cos(Math.toRadians(beta)) * Math.cos(Math.toRadians(alpha))) + (1 / 2d)),
										null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf((x - r * Math.cos(Math.toRadians(beta)) * Math.sin(Math.toRadians(alpha))),
										((y + 1) - r * Math.sin(Math.toRadians(beta))),
										(z + r * Math.cos(Math.toRadians(beta)) * Math.cos(Math.toRadians(alpha)))))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment,
										((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
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
								} else {
									if (entityiterator instanceof MobEntity) {
										entityiterator.setFire((int) 15);
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
									}
								}
							}
						}
					}
					world.addParticle(ParticleTypes.FLAME, (x - r * Math.cos(Math.toRadians(beta)) * Math.sin(Math.toRadians(alpha))),
							((y + 1) - r * Math.sin(Math.toRadians(beta))),
							(z + r * Math.cos(Math.toRadians(beta)) * Math.cos(Math.toRadians(alpha))), 0, 0, 0);
					r = (r + 0.2);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 3) {
				entity.getPersistentData().putDouble("magickatanaX", x);
				entity.getPersistentData().putDouble("magickatanaZ", z);
				entity.getPersistentData().putDouble("magickatanaYpos", y);
				entity.getPersistentData().putDouble("magickatanaRotation", (entity.rotationYaw));
				entity.getPersistentData().putDouble("magickatanaRadius", 4);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(MagickatanaeffectPotionEffect.potion, (int) 5, (int) 1, (true), (false)));
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 4) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(HanekaesuPotionEffect.potion, (int) 5, (int) 1, (true), (false)));
			}
		}
	}
}

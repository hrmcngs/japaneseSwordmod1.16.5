package japanesesword.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import java.util.Map;

import japanesesword.potion.Arrow2PotionEffect;

import japanesesword.item.DemonScytheItem;
import japanesesword.item.BooktokubetuItem;

import japanesesword.enchantment.HasiruEnchantment;
import japanesesword.enchantment.DemonizedEnchantment;
import japanesesword.enchantment.AnsiEnchantment;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class DemonizedkatanaturuwoShoudeChituteiruJiannoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure DemonizedkatanaturuwoShoudeChituteiruJiannoteituku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 4) {
			{
				String _setval = "\u65AC\u6483(\u602A)";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((EnchantmentHelper.getEnchantmentLevel(AnsiEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 200, (int) 1, (true), (false)));
		}
		if ((EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Arrow2PotionEffect.potion, (int) 1, (int) 1, (true), (false)));
		}
		if ((EnchantmentHelper.getEnchantmentLevel(HasiruEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)
				&& 2 <= EnchantmentHelper.getEnchantmentLevel(HasiruEnchantment.enchantment,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1,
						(int) (EnchantmentHelper.getEnchantmentLevel(HasiruEnchantment.enchantment,
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))),
						(true), (false)));
		} else {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1, (int) 2, (true), (false)));
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 6
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == BooktokubetuItem.block) {
			{
				String _setval = "\u7A81\u9032";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 5
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == DemonScytheItem.block) {
			{
				String _setval = "\u5F15\u304D\u5BC4\u305B";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

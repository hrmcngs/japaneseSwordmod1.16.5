package net.mcreator.japanesesword.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.japanesesword.item.NaginataItem;
import net.mcreator.japanesesword.enchantment.HasiruEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class NaginataturuwoShoudeChituteiruJiannoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NaginataturuwoShoudeChituteiruJiannoteituku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == NaginataItem.block) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 240, (int) 255, (true), (true)));
			if ((EnchantmentHelper.getEnchantmentLevel(HasiruEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1, (int) 9, (true), (true)));
			} else {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1, (int) 4, (true), (true)));
			}
		}
	}
}

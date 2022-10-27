package net.mcreator.japanesesword.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.japanesesword.enchantment.DemonizedEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class DemonnizedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Demonnized!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).setHealth((float) (((sourceentity instanceof LivingEntity)
						? ((LivingEntity) sourceentity).getHealth()
						: -1)
						+ EnchantmentHelper.getEnchantmentLevel(DemonizedEnchantment.enchantment,
								((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))));
		}
	}
}

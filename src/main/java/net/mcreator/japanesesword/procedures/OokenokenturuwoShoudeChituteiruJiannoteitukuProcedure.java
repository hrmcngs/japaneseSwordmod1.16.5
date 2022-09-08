package net.mcreator.japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.japanesesword.potion.Arrow1PotionEffect;
import net.mcreator.japanesesword.enchantment.YawoEnchantment;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class OokenokenturuwoShoudeChituteiruJiannoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure OokenokenturuwoShoudeChituteiruJiannoteituku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((EnchantmentHelper.getEnchantmentLevel(YawoEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Arrow1PotionEffect.potion, (int) 1, (int) 1, (true), (false)));
		}
		if ((((entity instanceof ServerPlayerEntity) && (entity.world instanceof ServerWorld))
				? ((ServerPlayerEntity) entity).getAdvancements()
						.getProgress(((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
								.getAdvancement(new ResourceLocation("japanesesword:kennkaku")))
						.isDone()
				: false)
				|| (((entity instanceof ServerPlayerEntity) && (entity.world instanceof ServerWorld))
						? ((ServerPlayerEntity) entity).getAdvancements()
								.getProgress(((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
										.getAdvancement(new ResourceLocation("japanesesword:ounozisseki")))
								.isDone()
						: false)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1, (int) 1, (true), (false)));
		}
	}
}

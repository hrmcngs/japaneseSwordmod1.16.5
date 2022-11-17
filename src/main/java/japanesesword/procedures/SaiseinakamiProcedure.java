package japanesesword.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import java.util.Map;
import java.util.HashMap;

import japanesesword.enchantment.SaiseiEnchantment;

import japanesesword.JapaneseswordMod;

public class SaiseinakamiProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingHurtEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Saiseinakami!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((EnchantmentHelper.getEnchantmentLevel(SaiseiEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS) : ItemStack.EMPTY)) != 0)
				|| (EnchantmentHelper.getEnchantmentLevel(SaiseiEnchantment.enchantment,
						((entity instanceof LivingEntity)
								? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST)
								: ItemStack.EMPTY)) != 0)
				|| (EnchantmentHelper.getEnchantmentLevel(SaiseiEnchantment.enchantment,
						((entity instanceof LivingEntity)
								? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD)
								: ItemStack.EMPTY)) != 0)
				|| (EnchantmentHelper.getEnchantmentLevel(SaiseiEnchantment.enchantment,
						((entity instanceof LivingEntity)
								? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET)
								: ItemStack.EMPTY)) != 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 0.1, (int) 255));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 0.1, (int) 255));
		}
	}
}

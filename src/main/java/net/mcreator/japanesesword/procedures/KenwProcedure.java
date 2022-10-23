package net.mcreator.japanesesword.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.item.KatanakatanaItem;
import net.mcreator.japanesesword.item.Katana1Item;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class KenwProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntitySpawned(EntityJoinWorldEvent event) {
			Entity entity = event.getEntity();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Kenw!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double kakuritu = 0;
		if (entity instanceof WitherSkeletonEntity || entity instanceof SkeletonEntity) {
			kakuritu = (new Random().nextInt(10 + 1));
			if (kakuritu == 4) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(Katana1Item.block);
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(KatanakatanaItem.block);
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
		}
	}
}

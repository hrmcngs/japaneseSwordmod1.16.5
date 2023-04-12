package japanesesword.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import japanesesword.item.NorooinokatanaItem;
import japanesesword.item.NoroharetakatanaItem;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class NoroharetakatanamobugaturudeGongJisaretatokiProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingAttackEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				Entity immediatesourceentity = event.getSource().getImmediateSource();
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
				dependencies.put("immediatesourceentity", immediatesourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NoroharetakatanamobugaturudeGongJisaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).c + 1);
			entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.c = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).c == 4) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(NoroharetakatanaItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			{
				ItemStack _isc = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				final ItemStack _setstack = new ItemStack(NorooinokatanaItem.block);
				final int _sltid = (int) (0);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				double _setval = ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new JapaneseswordModVariables.PlayerVariables())).c - 4);
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.c = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

package japanesesword.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.item.NorooinokatanaItem;
import japanesesword.item.NoroiItem;
import japanesesword.item.NoKamaroiItem;
import japanesesword.item.KamaItem;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class NankaProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Nanka!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto + 1);
			entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.kaunnto = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 2) {
			{
				String _setval = "\u65AC\u6483(\u5370)";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 3) {
			{
				String _setval = "\u5F37\u5316\u2160";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 4) {
			{
				String _setval = "\u56DE\u5FA9";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 5) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == KamaItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == NoKamaroiItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == NorooinokatanaItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == NoroiItem.block) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == NoKamaroiItem.block
						&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == NoroiItem.block
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem() == KamaItem.block
								&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == NorooinokatanaItem.block) {
					{
						double _setval = 6;
						entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.f = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "\u00A74\u00A7k\u5200\u5927\u597D\u304D";
						entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.nanndarou = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == NoroiItem.block
							|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == NorooinokatanaItem.block) {
						{
							double _setval = 5;
							entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.f = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "\u30AC\u30FC\u30C9";
							entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nanndarou = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == KamaItem.block
							|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == NoKamaroiItem.block) {
						{
							double _setval = 4;
							entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.f = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "\u5F15\u304D\u5BC4\u305B";
							entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nanndarou = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else {
				{
					String _setval = "\u9060\u8DDD\u96E2\u653B\u6483";
					entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.nanndarou = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 6) {
			{
				String _setval = "\u7BC4\u56F2\u653B\u6483";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 7) {
			{
				String _setval = "\u4E0A\u653B\u6483";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 8) {
			{
				String _setval = "\u65AC\u6483(\u5C01) ";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto == 9) {
			{
				String _setval = "\u7A7A\u4E2D\u653B\u6483";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JapaneseswordModVariables.PlayerVariables())).kaunnto >= 9) {
			{
				String _setval = "\u65AC\u6483 ";
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nanndarou = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.kaunnto = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

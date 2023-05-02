package japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class KesukomandogaShiXingsaretaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure KesukomandogaShiXingsaretaShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof ServerPlayerEntity) && (entity.world instanceof ServerWorld))
				? ((ServerPlayerEntity) entity).getAdvancements().getProgress(((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager().getAdvancement(new ResourceLocation("japanesesword:deleted_mod_element"))).isDone()
				: false) {
			{
				double _setval = 0;
				entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.c = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

package net.mcreator.japanesesword.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.japanesesword.item.KamanoyoteiItem;
import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Random;
import java.util.Map;

public class NoKamaroienteiteigaaitemuwoZhentutaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NoKamaroienteiteigaaitemuwoZhentutaShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isSneaking()) {
			if (entity instanceof LivingEntity) {
				LivingEntity _ent = (LivingEntity) entity;
				if (!_ent.world.isRemote()) {
					KamanoyoteiItem.shoot(_ent.world, _ent, new Random(), 1, 1, 0);
				}
			}
		}
	}
}

package japanesesword.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.JapaneseswordMod;

public class NoKamaroienteiteigaaitemuwoZhentutaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure NoKamaroienteiteigaaitemuwoZhentutaShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isSneaking()) {
			{
				Entity _shootFrom = entity;
				World projectileLevel = _shootFrom.world;
				if (!projectileLevel.isRemote()) {
					ProjectileEntity _entityToSpawn = new Object() {
						public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
							AbstractArrowEntity entityToSpawn = new KamanoyoteiItem.ArrowCustomEntity(KamanoyoteiItem.arrow, world);
							entityToSpawn.setShooter(shooter);
							entityToSpawn.setDamage(damage);
							entityToSpawn.setKnockbackStrength(knockback);

							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 1, 0);
					_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
					_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 0);
					projectileLevel.addEntity(_entityToSpawn);
				}
			}
		}
	}
}

package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

import japanesesword.potion.NoMagicKatanaPotionEffect;

import japanesesword.JapaneseswordMod;
import japanesesword.entity.KillMagicKatanaEntity;
import japanesesword.entity.MagicKatanaEntity;

public class MagicKatanaenteiteinotitukuGengXinShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure MagicKatanaenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure MagicKatanaenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure MagicKatanaenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure MagicKatanaenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure MagicKatanaenteiteinotitukuGengXinShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(0, 0, 0);
		if (entity.getPersistentData().getBoolean("upmagickatana") == true) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((entity.getPersistentData().getDouble("magickatanaX")), (entity.getPersistentData().getDouble("magickatanaY")), (entity.getPersistentData().getDouble("magickatanaZ")));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPersistentData().getDouble("magickatanaX")), (entity.getPersistentData().getDouble("magickatanaY")), (entity.getPersistentData().getDouble("magickatanaZ")),
							_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
			entity.getPersistentData().putDouble("magickatanaY", (entity.getPersistentData().getDouble("magickatanaY") + 0.6));
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (!(entityiterator instanceof MagicKatanaEntity.CustomEntity) && !(entityiterator instanceof KillMagicKatanaEntity.CustomEntity)) {
							if (!(new Object() {
								boolean check(Entity _entity) {
									if (_entity instanceof LivingEntity) {
										Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
										for (EffectInstance effect : effects) {
											if (effect.getPotion() == NoMagicKatanaPotionEffect.potion)
												return true;
										}
									}
									return false;
								}
							}.check(entityiterator))) {
								if (entity instanceof KillMagicKatanaEntity.CustomEntity) {
									if (entityiterator instanceof MobEntity) {
										if (entityiterator instanceof LivingEntity)
											((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 2, (int) 3, (true), (false)));
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/deta merge entity @s (Health:0)");
											}
										}
									}
								} else if (entity instanceof MagicKatanaEntity.CustomEntity) {
									if (entityiterator instanceof MobEntity) {
										if (entityiterator instanceof LivingEntity)
											((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 2, (int) 3, (true), (false)));
										entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
									}
								}
							}
						}
					}
				}
			}
		} else {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((entity.getPersistentData().getDouble("magickatanaX")), (entity.getPersistentData().getDouble("magickatanaY")), (entity.getPersistentData().getDouble("magickatanaZ")));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPersistentData().getDouble("magickatanaX")), (entity.getPersistentData().getDouble("magickatanaY")), (entity.getPersistentData().getDouble("magickatanaZ")),
							_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
			entity.getPersistentData().putDouble("magickatanaY", (entity.getPersistentData().getDouble("magickatanaY") - 0.3));
		}
	}
}

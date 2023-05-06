package japanesesword.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.Entity;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.JapaneseswordMod;

public class Arrow1ehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure Arrow1ehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double dis1 = 0;
		double dis2 = 0;
		double dis3 = 0;
		double dis4 = 0;
		double dis5 = 0;
		double count = 0;
		double count2 = 0;
		double count3 = 0;
		double count4 = 0;
		double a = 0;
		double r = 0;
		double b = 0;
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (1 / 2d), y - (1 / 2d), z - (1 / 2d), x + (1 / 2d), y + (1 / 2d), z + (1 / 2d)), null).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
				}
			}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArrowEntity || entityiterator instanceof SpectralArrowEntity || entityiterator instanceof TridentEntity || entityiterator instanceof FireballEntity || entityiterator instanceof DragonFireballEntity
						|| entityiterator instanceof SnowballEntity || entityiterator instanceof EggEntity) {
					if (MathHelper.nextDouble(new Random(), 1, 50) == 1) {
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundCategory.PLAYERS, (float) 1,
									(float) 1);
						} else {
							((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundCategory.PLAYERS, (float) 1, (float) 1, false);
						}
						if (!(entityiterator.getPosX() + entityiterator.getPosY() + entityiterator.getPosZ() == 0)) {
							if (entityiterator.getPersistentData().getBoolean("Check") == false) {
								entityiterator.getPersistentData().putBoolean("Check", (true));
								dis1 = Math.sqrt(Math.pow(entityiterator.getPosX() - entity.getPosX(), 0.4) + Math.pow(entityiterator.getPosY() - entity.getPosY(), 0.4) + Math.pow(entityiterator.getPosZ() - entity.getPosZ(), 0.4));
								if (dis1 <= 0.4) {
									entityiterator.getPersistentData().putBoolean("My arrow", (true));
								} else {
									entityiterator.getPersistentData().putBoolean("My arrow", (false));
								}
								if (entityiterator.getPersistentData().getBoolean("battozyutu") == false && entityiterator.getPersistentData().getBoolean("My arrow") == false) {
									if (entityiterator.getPersistentData().getBoolean("Check2") == false) {
										entityiterator.getPersistentData().putBoolean("Check2", (true));
										world.addParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()), (entityiterator.getPosY() + MathHelper.nextDouble(new Random(), -0.1, 0.5)), (entityiterator.getPosZ()), 0, 1, 0);
										entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()), ((-1.5) * entityiterator.getMotion().getZ()));
									} else {
										world.addParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()), (entityiterator.getPosY() + MathHelper.nextDouble(new Random(), -0.1, 0.5)), (entityiterator.getPosZ()), 0, 1, 0);
										entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()), ((-1.5) * entityiterator.getMotion().getZ()));
									}
								}
							}
						}
					}
				}
			}
		}
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
				}
			}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArrowEntity || entityiterator instanceof SpectralArrowEntity || entityiterator instanceof TridentEntity || entityiterator instanceof FireballEntity || entityiterator instanceof DragonFireballEntity
						|| entityiterator instanceof SnowballEntity || entityiterator instanceof EggEntity) {
					if (MathHelper.nextDouble(new Random(), 1, 50) == 1) {
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundCategory.PLAYERS, (float) 1,
									(float) 1);
						} else {
							((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundCategory.PLAYERS, (float) 1, (float) 1, false);
						}
						if (!(entityiterator.getPosX() + entityiterator.getPosY() + entityiterator.getPosZ() == 0)) {
							if (entityiterator.getPersistentData().getBoolean("Check") == false) {
								entityiterator.getPersistentData().putBoolean("Check", (true));
								dis1 = Math.sqrt(Math.pow(entityiterator.getPosX() - entity.getPosX(), 0.4) + Math.pow(entityiterator.getPosY() - entity.getPosY(), 0.4) + Math.pow(entityiterator.getPosZ() - entity.getPosZ(), 0.4));
								if (dis1 <= 0.8) {
									entityiterator.getPersistentData().putBoolean("My arrow", (true));
								} else {
									entityiterator.getPersistentData().putBoolean("My arrow", (false));
								}
								if (entityiterator.getPersistentData().getBoolean("battozyutu") == false && entityiterator.getPersistentData().getBoolean("My arrow") == false) {
									if (entityiterator.getPersistentData().getBoolean("Check2") == false) {
										entityiterator.getPersistentData().putBoolean("Check2", (true));
										world.addParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()), (entityiterator.getPosY() + MathHelper.nextDouble(new Random(), -0.1, 0.5)), (entityiterator.getPosZ()), 0, 1, 0);
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/particle dust 0.639 0.169 0.169 1 ~ ~0.5 ~ 0.3 0.1 0.3 0.1 10 force");
											}
										}
										entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()), ((-1.5) * entityiterator.getMotion().getZ()));
									} else {
										world.addParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()), (entityiterator.getPosY() + MathHelper.nextDouble(new Random(), -0.1, 0.5)), (entityiterator.getPosZ()), 0, 1, 0);
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/particle dust 0.639 0.169 0.169 1 ~ ~0.5 ~ 0.3 0.1 0.3 0.1 10 force");
											}
										}
										entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()), ((-1.5) * entityiterator.getMotion().getZ()));
									}
								}
							}
						}
					}
				}
			}
		}
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (3 / 2d), y - (3 / 2d), z - (3 / 2d), x + (3 / 2d), y + (3 / 2d), z + (3 / 2d)), null).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
				}
			}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArrowEntity || entityiterator instanceof SpectralArrowEntity || entityiterator instanceof TridentEntity || entityiterator instanceof FireballEntity || entityiterator instanceof DragonFireballEntity
						|| entityiterator instanceof SnowballEntity || entityiterator instanceof EggEntity) {
					if (MathHelper.nextDouble(new Random(), 1, 50) == 1) {
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundCategory.PLAYERS, (float) 1,
									(float) 1);
						} else {
							((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundCategory.PLAYERS, (float) 1, (float) 1, false);
						}
						if (!(entityiterator.getPosX() + entityiterator.getPosY() + entityiterator.getPosZ() == 0)) {
							if (entityiterator.getPersistentData().getBoolean("Check") == false) {
								entityiterator.getPersistentData().putBoolean("Check", (true));
								dis1 = Math.sqrt(Math.pow(entityiterator.getPosX() - entity.getPosX(), 0.4) + Math.pow(entityiterator.getPosY() - entity.getPosY(), 0.4) + Math.pow(entityiterator.getPosZ() - entity.getPosZ(), 0.4));
								if (dis1 <= 1.2) {
									entityiterator.getPersistentData().putBoolean("My arrow", (true));
								} else {
									entityiterator.getPersistentData().putBoolean("My arrow", (false));
								}
								if (entityiterator.getPersistentData().getBoolean("battozyutu") == false && entityiterator.getPersistentData().getBoolean("My arrow") == false) {
									if (entityiterator.getPersistentData().getBoolean("Check2") == false) {
										entityiterator.getPersistentData().putBoolean("Check2", (true));
										world.addParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()), (entityiterator.getPosY() + MathHelper.nextDouble(new Random(), -0.1, 0.5)), (entityiterator.getPosZ()), 0, 1, 0);
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/particle dust 0.639 0.169 0.169 1 ~ ~0.5 ~ 0.3 0.1 0.3 0.1 10 force");
											}
										}
										entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()), ((-1.5) * entityiterator.getMotion().getZ()));
									} else {
										world.addParticle(ParticleTypes.SWEEP_ATTACK, (entityiterator.getPosX()), (entityiterator.getPosY() + MathHelper.nextDouble(new Random(), -0.1, 0.5)), (entityiterator.getPosZ()), 0, 1, 0);
										{
											Entity _ent = entityiterator;
											if (!_ent.world.isRemote && _ent.world.getServer() != null) {
												_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/particle dust 0.639 0.169 0.169 1 ~ ~0.5 ~ 0.3 0.1 0.3 0.1 10 force");
											}
										}
										entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()), ((-1.5) * entityiterator.getMotion().getZ()));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

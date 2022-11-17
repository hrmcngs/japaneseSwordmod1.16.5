package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.entity.KenEntity;
import japanesesword.entity.Ken2Entity;

import japanesesword.JapaneseswordMod;

public class KenenteiteinotitukuGengXinShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure KenenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure KenenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure KenenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure KenenteiteinotitukuGengXinShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure KenenteiteinotitukuGengXinShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double Y = 0;
		if (entity instanceof KenEntity.CustomEntity) {
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator.getUniqueID().toString()).equals(entity.getPersistentData().getString("UUID"))
							&& entityiterator instanceof MobEntity) {
						entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
					}
				}
			}
		}
		if (entity instanceof Ken2Entity.CustomEntity) {
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator.getUniqueID().toString()).equals(entity.getPersistentData().getString("UUID"))
							&& entityiterator instanceof MobEntity) {
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/kill @s");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/deta merge entity @s (Health:0)");
							}
						}
					}
				}
			}
		}
		world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x, y + 1, z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x, y + 2, z), Blocks.AIR.getDefaultState(), 3);
		Y = 0;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			world.setBlockState(new BlockPos(x + 1, y + Y, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x - 1, y + Y, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + Y, z + 1), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + Y, z - 1), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x + 1, y + Y, z - 1), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x - 1, y + Y, z + 1), Blocks.AIR.getDefaultState(), 3);
			Y = (Y + 1);
		}
	}
}

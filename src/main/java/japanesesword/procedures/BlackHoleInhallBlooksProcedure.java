package japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.Random;
import java.util.Map;

import japanesesword.JapaneseswordMod;

public class BlackHoleInhallBlooksProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure BlackHoleInhallBlooks!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure BlackHoleInhallBlooks!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure BlackHoleInhallBlooks!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure BlackHoleInhallBlooks!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double sphereRadius = 0;
		double ct2 = 0;
		double ct = 0;
		double ct3 = 0;
		double cx = 0;
		double cy = 0;
		double cz = 0;
		double shiftAmt = 0;
		double squareOfDistance = 0;
		BlockState blockToInhall = Blocks.AIR.getDefaultState();
		sphereRadius = 16;
		shiftAmt = (sphereRadius / 2 == Math.round(sphereRadius) / 2 ? 1 : 0);
		for (int index0 = 0; index0 < (int) (Math.round(sphereRadius)); index0++) {
			for (int index1 = 0; index1 < (int) (Math.round(sphereRadius)); index1++) {
				for (int index2 = 0; index2 < (int) (Math.round(sphereRadius)); index2++) {
					squareOfDistance = (ct * ct + ct2 * ct2 + ct3 * ct3);
					if (squareOfDistance < sphereRadius * sphereRadius) {
						if (MathHelper.nextInt(new Random(), 0, (int) (sphereRadius * sphereRadius)) == 0) {
							cx = (x + (MathHelper.nextInt(new Random(), 1, (int) (sphereRadius * 2)) - Math.round(sphereRadius)) - shiftAmt);
							cy = (y + (MathHelper.nextInt(new Random(), 1, (int) (sphereRadius * 2)) - Math.round(sphereRadius)) - shiftAmt);
							cz = (z + (MathHelper.nextInt(new Random(), 1, (int) (sphereRadius * 2)) - Math.round(sphereRadius)) - shiftAmt);
							blockToInhall = (world.getBlockState(new BlockPos(cx, cy, cz)));
							world.setBlockState(new BlockPos(cx, cy, cz), Blocks.AIR.getDefaultState(), 3);
							if (world instanceof ServerWorld) {
								FallingBlockEntity blockToSpawn = new FallingBlockEntity((World) world, (cx + 0.5), (cy + 0.75), (cz + 0.5),
										(blockToInhall));
								blockToSpawn.fallTime = 1;
								world.addEntity(blockToSpawn);
							}
						}
						world.setBlockState(new BlockPos(x - (ct + shiftAmt), y - (ct2 + shiftAmt), z - (ct3 + shiftAmt)),
								Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + ct, y - (ct2 + shiftAmt), z - (ct3 + shiftAmt)), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + ct, y + ct2, z - (ct3 + shiftAmt)), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - (ct + shiftAmt), y + ct2, z - (ct3 + shiftAmt)), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - (ct + shiftAmt), y + ct2, z + ct3), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - (ct + shiftAmt), y - (ct2 + shiftAmt), z + ct3), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + ct, y - (ct2 + shiftAmt), z + ct3), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + ct, y + ct2, z + ct3), Blocks.AIR.getDefaultState(), 3);
					}
					ct3 = (ct3 + 1);
				}
				ct3 = 0;
				ct2 = (ct2 + 1);
			}
			ct2 = 0;
			ct = (ct + 1);
		}
		ct = 0;
	}
}

package net.mcreator.japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.japanesesword.JapaneseswordMod;

import java.util.Map;

public class MatuposiyonnoXiaoGuogaKaiShiShiYongsaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure MatuposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure MatuposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure MatuposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure MatuposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure MatuposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double deta = 0;
		double r = 0;
		double alpha = 0;
		r = 1;
		alpha = (entity.rotationYaw);
		deta = (entity.rotationPitch);
		for (int index0 = 0; index0 < (int) (100); index0++) {
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY,
								new Vector3d((x - r * Math.cos(Math.toRadians(deta)) * Math.sin(Math.toRadians(alpha))),
										((y + 1) - r * Math.sin(Math.toRadians(deta))),
										(z + r * Math.cos(Math.toRadians(deta)) * Math.cos(Math.toRadians(alpha)))),
								Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
								.withFeedbackDisabled(),
						"particle minecraft:dust 0.059 0.059 0.059 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY,
								new Vector3d((x - r * Math.cos(Math.toRadians(deta)) * Math.sin(Math.toRadians(alpha))),
										((y + 1) - r * Math.sin(Math.toRadians(deta))),
										(z + r * Math.cos(Math.toRadians(deta)) * Math.cos(Math.toRadians(alpha)))),
								Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
								.withFeedbackDisabled(),
						"particle minecraft:dust 0.188 0.000 0.000 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY,
								new Vector3d((x - r * Math.cos(Math.toRadians(deta)) * Math.sin(Math.toRadians(alpha))),
										((y + 1) - r * Math.sin(Math.toRadians(deta))),
										(z + r * Math.cos(Math.toRadians(deta)) * Math.cos(Math.toRadians(alpha)))),
								Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
								.withFeedbackDisabled(),
						"particle minecraft:dust 0.549 0.000 0.000 0.5 ~ ~ ~ 0.01 0.01 0.01 1 10");
			}
			r = (r + 0.2);
		}
	}
}

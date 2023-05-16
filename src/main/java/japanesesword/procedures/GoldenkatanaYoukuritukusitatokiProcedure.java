package japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.enchantment.KillEnchantment;

import japanesesword.JapaneseswordMod;

public class GoldenkatanaYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure GoldenkatanaYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure GoldenkatanaYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure GoldenkatanaYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure GoldenkatanaYoukuritukusitatoki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure GoldenkatanaYoukuritukusitatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double zPos = 0;
		double yPos = 0;
		double yknockback = 0;
		double xPos = 0;
		double dis = 0;
		double zknockback = 0;
		double rad = 0;
		double rad_now = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double radius = 0;
		double xknockback = 0;
		radius = (MathHelper.nextDouble(new Random(), -1, 1));
		X = (x + Math.sin(Math.toRadians(entity.rotationYaw + 180)) * 1 + Math.sin(Math.toRadians(entity.rotationYaw + 90)) * radius);
		Y = (y + 1.5 + Math.sin(Math.toRadians(entity.rotationPitch + MathHelper.nextDouble(new Random(), -15, 15))) * (-1));
		Z = (z + Math.cos(Math.toRadians(entity.rotationYaw)) * 1 + Math.cos(Math.toRadians(entity.rotationYaw + 90)) * radius);
		rad = Math.toRadians(entity.rotationYaw);
		dis = 0.1;
		rad_now = Math.toRadians(entity.rotationYaw);
		for (int index0 = 0; index0 < (int) (36); index0++) {
			xPos = (X + Math.cos(rad_now) * Math.cos(rad) * dis);
			yPos = (Y + Math.sin(rad_now) * dis);
			zPos = (Z + Math.cos(rad_now) * Math.sin(rad) * dis);
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.99 1 0.32 1 ~ ~ ~ 0.01 0.01 0.01 1 1 force");
			}
			rad_now = (rad_now + Math.toRadians(10));
		}
		dis = 0;
		for (int index1 = 0; index1 < (int) (100); index1++) {
			xPos = (X + Math.sin(Math.toRadians(entity.rotationYaw + 180)) * dis);
			yPos = (Y + Math.sin(Math.toRadians(entity.rotationPitch)) * dis * (-1));
			zPos = (Z + Math.cos(Math.toRadians(entity.rotationYaw)) * dis);
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(xPos, yPos, zPos), Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"particle dust 0.99 1 0.32 1 ~ ~ ~ 0.01 0.01 0.01 1 1 force");
			}
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(xPos - (1 / 2d), yPos - (1 / 2d), zPos - (1 / 2d), xPos + (1 / 2d), yPos + (1 / 2d), zPos + (1 / 2d)), null).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(xPos, yPos, zPos)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (entityiterator instanceof MobEntity || entityiterator instanceof EnderCrystalEntity) {
							if ((EnchantmentHelper.getEnchantmentLevel(KillEnchantment.enchantment, ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
								{
									Entity _ent = entityiterator;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "kill @s");
									}
								}
								{
									Entity _ent = entityiterator;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/deta merge entity @s (Health:0)");
									}
								}
								xknockback = (entityiterator.getPosX() - entity.getPosX());
								yknockback = (entityiterator.getPosY() - entity.getPosY());
								zknockback = (entityiterator.getPosZ() - entity.getPosZ());
								dis = (Math.abs(xknockback) + Math.abs(yknockback) + Math.abs(zknockback));
								if (dis != 0) {
									xknockback = ((xknockback / dis) * 3);
									yknockback = Math.min((yknockback / dis) * 3, 2);
									zknockback = ((zknockback / dis) * 3);
								} else {
									xknockback = 0;
									yknockback = 0;
									zknockback = 0;
								}
							} else {
								entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
								xknockback = (entityiterator.getPosX() - entity.getPosX());
								yknockback = (entityiterator.getPosY() - entity.getPosY());
								zknockback = (entityiterator.getPosZ() - entity.getPosZ());
								dis = (Math.abs(xknockback) + Math.abs(yknockback) + Math.abs(zknockback));
								if (dis != 0) {
									xknockback = ((xknockback / dis) * 3);
									yknockback = Math.min((yknockback / dis) * 3, 2);
									zknockback = ((zknockback / dis) * 3);
								} else {
									xknockback = 0;
									yknockback = 0;
									zknockback = 0;
								}
							}
						}
					}
				}
			}
			dis = (dis + 0.5);
		}
	}
}

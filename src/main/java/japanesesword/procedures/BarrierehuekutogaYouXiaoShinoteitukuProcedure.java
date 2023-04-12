package japanesesword.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import japanesesword.item.TyoutouItem;

import japanesesword.JapaneseswordMod;

public class BarrierehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure BarrierehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency x for procedure BarrierehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency y for procedure BarrierehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency z for procedure BarrierehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure BarrierehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double a = 0;
		double r = 0;
		double b = 0;
		double dis1 = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == TyoutouItem.block) {
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
						new AxisAlignedBB(x - (1.5 / 2d), (y + 1) - (1.5 / 2d), z - (1.5 / 2d), x + (1.5 / 2d), (y + 1) + (1.5 / 2d), z + (1.5 / 2d)),
						null).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, (y + 1), z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ArrowEntity || entityiterator instanceof SpectralArrowEntity
							|| entityiterator instanceof TridentEntity || entityiterator instanceof FireballEntity
							|| entityiterator instanceof DragonFireballEntity || entityiterator instanceof SnowballEntity
							|| entityiterator instanceof SmallFireballEntity || entityiterator instanceof EggEntity) {
						entityiterator.getPersistentData().putBoolean("barrier", (true));
					}
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == TyoutouItem.block) {
			r = 1.5;
			a = (Math.random() * 12);
			b = 90;
			for (int index0 = 0; index0 < (int) (30); index0++) {
				for (int index1 = 0; index1 < (int) (16); index1++) {
					b = (b + 12);
				}
				b = 90;
				a = (a + 12);
			}
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
						new AxisAlignedBB(x - (4 / 2d), (y + 1) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 1) + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, (y + 1), z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getPersistentData().getBoolean("barrier")) {
						if (!(entityiterator == entity)) {
							entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()),
									((-1.5) * entityiterator.getMotion().getZ()));
						}
					}
				}
			}
		}
	}
}

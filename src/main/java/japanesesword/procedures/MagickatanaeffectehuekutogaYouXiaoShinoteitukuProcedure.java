package japanesesword.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import java.util.Map;

import japanesesword.item.UdewaItem;
import japanesesword.item.TyoutouItem;

import japanesesword.entity.MagicKatanaEntity;
import japanesesword.entity.KillMagicKatanaEntity;

import japanesesword.JapaneseswordMod;

public class MagickatanaeffectehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency world for procedure MagickatanaeffectehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure MagickatanaeffectehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("magickatanaXpos",
				(entity.getPersistentData().getDouble("magickatanaX")
						+ Math.sin(Math.toRadians(entity.getPersistentData().getDouble("magickatanaRotation") + 180))
								* entity.getPersistentData().getDouble("magickatanaRadius")));
		entity.getPersistentData().putDouble("magickatanaZpos",
				(entity.getPersistentData().getDouble("magickatanaX")
						+ Math.cos(Math.toRadians(entity.getPersistentData().getDouble("magickatanaRotation")))
								* entity.getPersistentData().getDouble("magickatanaRadius")));
		for (int index0 = 0; index0 < (int) (50); index0++) {
			if (world
					.getBlockState(new BlockPos(entity.getPersistentData().getDouble("magickatanaXpos"),
							entity.getPersistentData().getDouble("magickatanaYpos"), entity.getPersistentData().getDouble("magickatanaZpos")))
					.isSolid()) {
				entity.getPersistentData().putDouble("magickatanaYpos", (entity.getPersistentData().getDouble("magickatanaYpos") + 1));
			} else {
				break;
			}
		}
		for (int index1 = 0; index1 < (int) (50); index1++) {
			if (world
					.getBlockState(new BlockPos(entity.getPersistentData().getDouble("magickatanaXpos"),
							entity.getPersistentData().getDouble("magickatanaYpos"), entity.getPersistentData().getDouble("magickatanaZpos")))
					.isSolid()) {
				entity.getPersistentData().putDouble("magickatanaYpos", (entity.getPersistentData().getDouble("magickatanaYpos") - 0.1));
				break;
			}
			entity.getPersistentData().putDouble("magickatanaYpos", (entity.getPersistentData().getDouble("magickatanaYpos") - 0.5));
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == TyoutouItem.block
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
						.getItem() == UdewaItem.body) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new KillMagicKatanaEntity.CustomEntity(KillMagicKatanaEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((entity.getPersistentData().getDouble("magickatanaXpos")),
						(entity.getPersistentData().getDouble("magickatanaYpos") + 3), (entity.getPersistentData().getDouble("magickatanaZpos")),
						(float) (entity.rotationYaw), (float) 0);
				entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
				entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new MagicKatanaEntity.CustomEntity(MagicKatanaEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((entity.getPersistentData().getDouble("magickatanaXpos")),
						(entity.getPersistentData().getDouble("magickatanaYpos") + 3), (entity.getPersistentData().getDouble("magickatanaZpos")),
						(float) (entity.rotationYaw), (float) 0);
				entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
				entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
		entity.getPersistentData().putDouble("magickatanaRadius", (entity.getPersistentData().getDouble("magickatanaRadius") + 4));
	}
}

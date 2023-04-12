
package japanesesword.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorldReader;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ActionResultType;
import net.minecraft.pathfinding.SwimmerPathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OwnerHurtTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.AgeableEntity;

import japanesesword.item.TiItem;
import japanesesword.item.KatanakatanaItem;
import japanesesword.item.Katana1Item;
import japanesesword.item.HannyouItem;

import japanesesword.entity.renderer.WhitePersonRenderer;

import japanesesword.JapaneseswordModElements;

@JapaneseswordModElements.ModElement.Tag
public class WhitePersonEntity extends JapaneseswordModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("white_person").setRegistryName("white_person");

	public WhitePersonEntity(JapaneseswordModElements instance) {
		super(instance, 420);
		FMLJavaModLoadingContext.get().getModEventBus().register(new WhitePersonRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("white_person_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}

	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 20);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 20);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 10);
			ammma = ammma.createMutableAttribute(Attributes.FOLLOW_RANGE, 16);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 5);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 1);
			ammma = ammma.createMutableAttribute(ForgeMod.SWIM_SPEED.get(), 0.5);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends TameableEntity implements IRangedAttackMob {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Katana1Item.block));
			this.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(KatanakatanaItem.block));
			this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(HannyouItem.helmet));
			this.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(HannyouItem.body));
			this.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(HannyouItem.legs));
			this.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(HannyouItem.boots));
			this.setPathPriority(PathNodeType.WATER, 0);
			this.moveController = new MovementController(this) {
				@Override
				public void tick() {
					if (CustomEntity.this.isInWater())
						CustomEntity.this.setMotion(CustomEntity.this.getMotion().add(0, 0.005, 0));
					if (this.action == MovementController.Action.MOVE_TO && !CustomEntity.this.getNavigator().noPath()) {
						double dx = this.posX - CustomEntity.this.getPosX();
						double dy = this.posY - CustomEntity.this.getPosY();
						double dz = this.posZ - CustomEntity.this.getPosZ();
						float f = (float) (MathHelper.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
						float f1 = (float) (this.speed * CustomEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						CustomEntity.this.rotationYaw = this.limitAngle(CustomEntity.this.rotationYaw, f, 10);
						CustomEntity.this.renderYawOffset = CustomEntity.this.rotationYaw;
						CustomEntity.this.rotationYawHead = CustomEntity.this.rotationYaw;
						if (CustomEntity.this.isInWater()) {
							CustomEntity.this.setAIMoveSpeed((float) CustomEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
							float f2 = -(float) (MathHelper.atan2(dy, MathHelper.sqrt(dx * dx + dz * dz)) * (180F / Math.PI));
							f2 = MathHelper.clamp(MathHelper.wrapDegrees(f2), -85, 85);
							CustomEntity.this.rotationPitch = this.limitAngle(CustomEntity.this.rotationPitch, f2, 5);
							float f3 = MathHelper.cos(CustomEntity.this.rotationPitch * (float) (Math.PI / 180.0));
							CustomEntity.this.setMoveForward(f3 * f1);
							CustomEntity.this.setMoveVertical((float) (f1 * dy));
						} else {
							CustomEntity.this.setAIMoveSpeed(f1 * 0.05F);
						}
					} else {
						CustomEntity.this.setAIMoveSpeed(0);
						CustomEntity.this.setMoveVertical(0);
						CustomEntity.this.setMoveForward(0);
					}
				}
			};
			this.navigator = new SwimmerPathNavigator(this, this.world);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
				@Override
				protected double getAttackReachSqr(LivingEntity entity) {
					return (double) (4.0 + entity.getWidth() * entity.getWidth());
				}
			});
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new OwnerHurtByTargetGoal(this));
			this.goalSelector.addGoal(6, new OwnerHurtTargetGoal(this));
			this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
				@Override
				public boolean shouldContinueExecuting() {
					return this.shouldExecute();
				}
			});
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof AbstractArrowEntity)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			if (source.getDamageType().equals("trident"))
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public ActionResultType func_230254_b_(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			ActionResultType retval = ActionResultType.func_233537_a_(this.world.isRemote());
			Item item = itemstack.getItem();
			if (itemstack.getItem() instanceof SpawnEggItem) {
				retval = super.func_230254_b_(sourceentity, hand);
			} else if (this.world.isRemote()) {
				retval = (this.isTamed() && this.isOwner(sourceentity) || this.isBreedingItem(itemstack))
						? ActionResultType.func_233537_a_(this.world.isRemote())
						: ActionResultType.PASS;
			} else {
				if (this.isTamed()) {
					if (this.isOwner(sourceentity)) {
						if (item.isFood() && this.isBreedingItem(itemstack) && this.getHealth() < this.getMaxHealth()) {
							this.consumeItemFromStack(sourceentity, itemstack);
							this.heal((float) item.getFood().getHealing());
							retval = ActionResultType.func_233537_a_(this.world.isRemote());
						} else if (this.isBreedingItem(itemstack) && this.getHealth() < this.getMaxHealth()) {
							this.consumeItemFromStack(sourceentity, itemstack);
							this.heal(4);
							retval = ActionResultType.func_233537_a_(this.world.isRemote());
						} else {
							retval = super.func_230254_b_(sourceentity, hand);
						}
					}
				} else if (this.isBreedingItem(itemstack)) {
					this.consumeItemFromStack(sourceentity, itemstack);
					if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
						this.setTamedBy(sourceentity);
						this.world.setEntityState(this, (byte) 7);
					} else {
						this.world.setEntityState(this, (byte) 6);
					}
					this.enablePersistence();
					retval = ActionResultType.func_233537_a_(this.world.isRemote());
				} else {
					retval = super.func_230254_b_(sourceentity, hand);
					if (retval == ActionResultType.SUCCESS || retval == ActionResultType.CONSUME)
						this.enablePersistence();
				}
			}
			return retval;
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			ArrowEntity entityarrow = new ArrowEntity(this.world, this);
			double d0 = target.getPosY() + (double) target.getEyeHeight() - 1.1;
			double d1 = target.getPosX() - this.getPosX();
			double d3 = target.getPosZ() - this.getPosZ();
			entityarrow.shoot(d1, d0 - entityarrow.getPosY() + (double) MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1.6F, 12.0F);
			world.addEntity(entityarrow);
		}

		@Override
		public AgeableEntity func_241840_a(ServerWorld serverWorld, AgeableEntity ageable) {
			CustomEntity retval = (CustomEntity) entity.create(serverWorld);
			retval.onInitialSpawn(serverWorld, serverWorld.getDifficultyForLocation(new BlockPos(retval.getPosition())), SpawnReason.BREEDING,
					(ILivingEntityData) null, (CompoundNBT) null);
			return retval;
		}

		@Override
		public boolean isBreedingItem(ItemStack stack) {
			if (stack == null)
				return false;
			if (TiItem.block == stack.getItem())
				return true;
			return false;
		}

		@Override
		public boolean canBreatheUnderwater() {
			return true;
		}

		@Override
		public boolean isNotColliding(IWorldReader world) {
			return world.checkNoEntityCollision(this);
		}

		@Override
		public boolean isPushedByWater() {
			return false;
		}
	}
}

package japanesesword.procedures;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;
import java.util.Collection;

import japanesesword.potion.KurutaimunasiPotionEffect;
import japanesesword.potion.KagekaPotionEffect;
import japanesesword.potion.BarrierPotionEffect;
import japanesesword.potion.Arrow343PotionEffect;

import japanesesword.item.StreyOuterArmorItem;
import japanesesword.item.MagickswordItem;
import japanesesword.item.MagicBookItem;
import japanesesword.item.DemonizedkatanaItem;
import japanesesword.item.DemonizedKatana1Item;

import japanesesword.JapaneseswordModVariables;

import japanesesword.JapaneseswordMod;

public class MagicBookYoukuritukusitatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JapaneseswordMod.LOGGER.warn("Failed to load dependency entity for procedure MagicBookYoukuritukusitatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == MagicBookItem.block) {
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).mana == 2) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new MagickswordItem.ArrowCustomEntity(MagickswordItem.arrow, world);

								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 5, 0);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(MagicBookItem.block, (int) 25);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).mana == 3) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == DemonizedKatana1Item.block
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem() == DemonizedKatana1Item.block
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == DemonizedkatanaItem.block
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem() == DemonizedkatanaItem.block
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET) : ItemStack.EMPTY)
								.getItem() == StreyOuterArmorItem.boots
								&& ((entity instanceof LivingEntity)
										? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS)
										: ItemStack.EMPTY).getItem() == StreyOuterArmorItem.legs
								&& ((entity instanceof LivingEntity)
										? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST)
										: ItemStack.EMPTY).getItem() == StreyOuterArmorItem.body
								&& ((entity instanceof LivingEntity)
										? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD)
										: ItemStack.EMPTY).getItem() == StreyOuterArmorItem.helmet) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == DemonizedKatana1Item.block
							|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == DemonizedKatana1Item.block
							|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == DemonizedkatanaItem.block
							|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
									.getItem() == DemonizedkatanaItem.block) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.addPotionEffect(new EffectInstance(Arrow343PotionEffect.potion, (int) 300, (int) 1, (true), (false)));
					}
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()
							&& ((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS)
									: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
							&& ((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST)
									: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
							&& ((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD)
									: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.addPotionEffect(new EffectInstance(KagekaPotionEffect.potion, (int) 300, (int) 1, (true), (false)));
					}
					if (!(new Object() {
						boolean check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
										return true;
								}
							}
							return false;
						}
					}.check(entity))) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).getCooldownTracker().setCooldown(MagicBookItem.block, (int) 300);
					}
				} else {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 1, (int) 1, (true), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 1, (int) 1, (true), (false)));
					if (!(new Object() {
						boolean check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
										return true;
								}
							}
							return false;
						}
					}.check(entity))) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).getCooldownTracker().setCooldown(MagicBookItem.block, (int) 50);
					}
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).mana == 4) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 300, (int) 1, (true), (false)));
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(MagicBookItem.block, (int) 300);
				}
			}
			if ((entity.getCapability(JapaneseswordModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JapaneseswordModVariables.PlayerVariables())).mana == 5) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(BarrierPotionEffect.potion, (int) 300, (int) 1, (true), (false)));
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == KurutaimunasiPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(MagicBookItem.block, (int) 300);
				}
			}
		}
	}
}

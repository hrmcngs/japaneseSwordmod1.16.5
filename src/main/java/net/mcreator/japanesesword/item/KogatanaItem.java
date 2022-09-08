
package net.mcreator.japanesesword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.japanesesword.procedures.KogatanaenteiteigaaitemuwoZhentutaShiProcedure;
import net.mcreator.japanesesword.itemgroup.BukiItemGroup;
import net.mcreator.japanesesword.JapaneseswordModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@JapaneseswordModElements.ModElement.Tag
public class KogatanaItem extends JapaneseswordModElements.ModElement {
	@ObjectHolder("japanesesword:kogatana")
	public static final Item block = null;

	public KogatanaItem(JapaneseswordModElements instance) {
		super(instance, 247);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AncientbooksItem.block));
			}
		}, 3, 96f, new Item.Properties().group(BukiItemGroup.tab)) {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				KogatanaenteiteigaaitemuwoZhentutaShiProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("kogatana"));
	}
}

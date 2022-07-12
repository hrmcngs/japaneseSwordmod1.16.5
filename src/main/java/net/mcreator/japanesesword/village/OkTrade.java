
package net.mcreator.japanesesword.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.mcreator.japanesesword.item.TubanoatukatanaItem;
import net.mcreator.japanesesword.item.TiItem;
import net.mcreator.japanesesword.item.OtachibloodcurseItem;
import net.mcreator.japanesesword.item.OtachiItem;
import net.mcreator.japanesesword.item.NoroiItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OkTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(5).add(new BasicTrade(new ItemStack(TiItem.block, (int) (64)), new ItemStack(OtachiItem.block),
					new ItemStack(OtachibloodcurseItem.block), 1, 343, 0f));
			trades.get(5).add(new BasicTrade(new ItemStack(TiItem.block, (int) (64)), new ItemStack(TubanoatukatanaItem.block),
					new ItemStack(NoroiItem.block), 1, 343, 0f));
		}
	}
}


package japanesesword.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.block.Blocks;

import java.util.List;

import japanesesword.item.TubanoatukatanaItem;
import japanesesword.item.TiItem;
import japanesesword.item.ReaItem;
import japanesesword.item.OtachibloodcurseItem;
import japanesesword.item.OtachiItem;
import japanesesword.item.NoroiItem;

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
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(5).add(new BasicTrade(new ItemStack(Blocks.EMERALD_BLOCK, (int) (64)), new ItemStack(Blocks.BEACON, (int) (64)),
					new ItemStack(ReaItem.block), 1, 343, 1f));
		}
	}
}
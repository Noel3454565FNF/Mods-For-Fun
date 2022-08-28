
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DondCheouEtAutreTrucsChelouModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.AMETHYST_CLUSTER, 6),

					new ItemStack(DondCheouEtAutreTrucsChelouModItems.SCARY.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.AMETHYST_CLUSTER, 20),

					new ItemStack(DondCheouEtAutreTrucsChelouModItems.SUSSYITEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(DondCheouEtAutreTrucsChelouModItems.SUSSYITEM.get()),

					new ItemStack(DondCheouEtAutreTrucsChelouModItems.SUSSYSWORD.get()), 10, 5, 0.05f));
		}
	}
}

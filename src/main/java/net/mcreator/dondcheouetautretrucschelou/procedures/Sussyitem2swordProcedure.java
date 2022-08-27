package net.mcreator.dondcheouetautretrucschelou.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Sussyitem2swordProcedure {
	@SubscribeEvent
	public static void onItemSmelted(PlayerEvent.ItemSmeltedEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		(new ItemStack(DondCheouEtAutreTrucsChelouModItems.SUSSYSWORD.get())).enchant(Enchantments.KNOCKBACK, 20);
	}
}

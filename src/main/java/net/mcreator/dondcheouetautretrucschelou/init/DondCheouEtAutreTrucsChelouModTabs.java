
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DondCheouEtAutreTrucsChelouModTabs {
	public static CreativeModeTab TAB_DIDSQUESUS_1;

	public static void load() {
		TAB_DIDSQUESUS_1 = new CreativeModeTab("tabdidsquesus_1") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DondCheouEtAutreTrucsChelouModItems.SCARY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

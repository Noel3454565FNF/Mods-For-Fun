
package net.mcreator.dondcheouetautretrucschelou.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModSounds;

public class ULTIMATEItem extends RecordItem {
	public ULTIMATEItem() {
		super(0, DondCheouEtAutreTrucsChelouModSounds.REGISTRY.get(new ResourceLocation("dond_cheou_et_autre_trucs_chelou:andtropophibia-remix")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}

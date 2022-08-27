
package net.mcreator.dondcheouetautretrucschelou.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModTabs;
import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModSounds;

import java.util.List;

public class ScaryItem extends RecordItem {
	public ScaryItem() {
		super(0, DondCheouEtAutreTrucsChelouModSounds.REGISTRY.get(new ResourceLocation("dond_cheou_et_autre_trucs_chelou:sussy-song")),
				new Item.Properties().tab(DondCheouEtAutreTrucsChelouModTabs.TAB_DIDSQUESUS_1).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("don't do this"));
		list.add(new TextComponent("because is very scray"));
	}
}

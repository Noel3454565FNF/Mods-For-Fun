
package net.mcreator.dondcheouetautretrucschelou.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PateItem extends Item {
	public PateItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(6).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-0.5f)

						.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return -0.2F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("this item is used to craft pasta"));
	}
}

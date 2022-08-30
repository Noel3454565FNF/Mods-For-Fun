
package net.mcreator.dondcheouetautretrucschelou.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.dondcheouetautretrucschelou.procedures.Abandonned_pastaProcedure;

public class PastaItem extends Item {
	public PastaItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f)

						.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Abandonned_pastaProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		Abandonned_pastaProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}

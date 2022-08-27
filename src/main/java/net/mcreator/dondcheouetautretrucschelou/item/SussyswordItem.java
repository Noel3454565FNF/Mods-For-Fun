
package net.mcreator.dondcheouetautretrucschelou.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;

import net.mcreator.dondcheouetautretrucschelou.procedures.Sussyitem2swordProcedure;
import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModItems;

public class SussyswordItem extends SwordItem {
	public SussyswordItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.AMETHYST_CLUSTER), new ItemStack(DondCheouEtAutreTrucsChelouModItems.SCARY.get()));
			}
		}, 3, -1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		Sussyitem2swordProcedure.execute(

		);
	}
}

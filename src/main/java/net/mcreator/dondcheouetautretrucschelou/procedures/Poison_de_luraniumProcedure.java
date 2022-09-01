package net.mcreator.dondcheouetautretrucschelou.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModItems;

public class Poison_de_luraniumProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(DondCheouEtAutreTrucsChelouModItems.URANIUM.get()))
				: false) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"effect minecraft:nausea ");
			}
			entity.hurt(DamageSource.GENERIC, 1);
		}
	}
}

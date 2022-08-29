package net.mcreator.dondcheouetautretrucschelou.procedures;

import net.minecraft.world.entity.Entity;

public class Cooked_pastaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"say its smell good");
		}
	}
}

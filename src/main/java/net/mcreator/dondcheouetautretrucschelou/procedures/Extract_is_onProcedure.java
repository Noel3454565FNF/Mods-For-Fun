package net.mcreator.dondcheouetautretrucschelou.procedures;

import net.minecraft.world.entity.Entity;

public class Extract_is_onProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"execute run function dond_cheou_et_autre_trucs_chelou:dt_extractor_in_action");
		}
	}
}

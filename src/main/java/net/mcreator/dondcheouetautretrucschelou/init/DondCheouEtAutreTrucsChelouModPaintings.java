
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DondCheouEtAutreTrucsChelouModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(80, 80).setRegistryName("sans"));
		event.getRegistry().register(new Motive(80, 80).setRegistryName("sussypeinture"));
		event.getRegistry().register(new Motive(80, 80).setRegistryName("kd_bpicture"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("hommagepicture"));
	}
}

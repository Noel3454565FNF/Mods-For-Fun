
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DondCheouEtAutreTrucsChelouModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("dond_cheou_et_autre_trucs_chelou", "sussy-song"),
				new SoundEvent(new ResourceLocation("dond_cheou_et_autre_trucs_chelou", "sussy-song")));
		REGISTRY.put(new ResourceLocation("dond_cheou_et_autre_trucs_chelou", "you_are_a_murderer"),
				new SoundEvent(new ResourceLocation("dond_cheou_et_autre_trucs_chelou", "you_are_a_murderer")));
		REGISTRY.put(new ResourceLocation("dond_cheou_et_autre_trucs_chelou", "andtropophibia-remix"),
				new SoundEvent(new ResourceLocation("dond_cheou_et_autre_trucs_chelou", "andtropophibia-remix")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}

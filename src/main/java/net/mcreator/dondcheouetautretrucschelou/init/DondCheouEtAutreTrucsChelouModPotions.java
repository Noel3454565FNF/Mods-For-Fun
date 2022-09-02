
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.dondcheouetautretrucschelou.DondCheouEtAutreTrucsChelouMod;

public class DondCheouEtAutreTrucsChelouModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, DondCheouEtAutreTrucsChelouMod.MODID);
	public static final RegistryObject<Potion> POTIONSUS = REGISTRY.register("potionsus",
			() -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 100, 10, false, true)));
	public static final RegistryObject<Potion> DTPOTION = REGISTRY.register("dtpotion",
			() -> new Potion(new MobEffectInstance(DondCheouEtAutreTrucsChelouModMobEffects.DT.get(), 3600, 0, false, true)));
}

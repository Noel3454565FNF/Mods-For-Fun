
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dondcheouetautretrucschelou.item.UraniumItem;
import net.mcreator.dondcheouetautretrucschelou.item.SussyswordItem;
import net.mcreator.dondcheouetautretrucschelou.item.SussyitemItem;
import net.mcreator.dondcheouetautretrucschelou.item.ScaryItem;
import net.mcreator.dondcheouetautretrucschelou.item.PateItem;
import net.mcreator.dondcheouetautretrucschelou.item.PastaItem;
import net.mcreator.dondcheouetautretrucschelou.item.KnifeItem;
import net.mcreator.dondcheouetautretrucschelou.item.ForgestickItem;
import net.mcreator.dondcheouetautretrucschelou.item.ExplodeitemItem;
import net.mcreator.dondcheouetautretrucschelou.item.BolofpastawithappleItem;
import net.mcreator.dondcheouetautretrucschelou.item.BolofpastaItem;
import net.mcreator.dondcheouetautretrucschelou.DondCheouEtAutreTrucsChelouMod;

public class DondCheouEtAutreTrucsChelouModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DondCheouEtAutreTrucsChelouMod.MODID);
	public static final RegistryObject<Item> SCARY = REGISTRY.register("scary", () -> new ScaryItem());
	public static final RegistryObject<Item> SUSSYITEM = REGISTRY.register("sussyitem", () -> new SussyitemItem());
	public static final RegistryObject<Item> FORGESTICK = REGISTRY.register("forgestick", () -> new ForgestickItem());
	public static final RegistryObject<Item> SUSSYSWORD = REGISTRY.register("sussysword", () -> new SussyswordItem());
	public static final RegistryObject<Item> EXPLODEITEM = REGISTRY.register("explodeitem", () -> new ExplodeitemItem());
	public static final RegistryObject<Item> PATE = REGISTRY.register("pate", () -> new PateItem());
	public static final RegistryObject<Item> PASTA = REGISTRY.register("pasta", () -> new PastaItem());
	public static final RegistryObject<Item> BOLOFPASTA = REGISTRY.register("bolofpasta", () -> new BolofpastaItem());
	public static final RegistryObject<Item> BOLOFPASTAWITHAPPLE = REGISTRY.register("bolofpastawithapple", () -> new BolofpastawithappleItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
}

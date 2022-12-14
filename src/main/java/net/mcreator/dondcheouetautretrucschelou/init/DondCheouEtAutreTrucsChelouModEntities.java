
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dondcheouetautretrucschelou.entity.MagicalboneEntity;
import net.mcreator.dondcheouetautretrucschelou.entity.DTextractoractivateEntity;
import net.mcreator.dondcheouetautretrucschelou.DondCheouEtAutreTrucsChelouMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DondCheouEtAutreTrucsChelouModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES,
			DondCheouEtAutreTrucsChelouMod.MODID);
	public static final RegistryObject<EntityType<MagicalboneEntity>> MAGICALBONE = register("projectile_magicalbone",
			EntityType.Builder.<MagicalboneEntity>of(MagicalboneEntity::new, MobCategory.MISC).setCustomClientFactory(MagicalboneEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DTextractoractivateEntity>> D_TEXTRACTORACTIVATE = register("projectile_d_textractoractivate",
			EntityType.Builder.<DTextractoractivateEntity>of(DTextractoractivateEntity::new, MobCategory.MISC)
					.setCustomClientFactory(DTextractoractivateEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dondcheouetautretrucschelou.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DondCheouEtAutreTrucsChelouModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DondCheouEtAutreTrucsChelouModEntities.MAGICALBONE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DondCheouEtAutreTrucsChelouModEntities.D_TEXTRACTORACTIVATE.get(), ThrownItemRenderer::new);
	}
}

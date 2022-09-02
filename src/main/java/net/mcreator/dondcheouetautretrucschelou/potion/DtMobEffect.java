
package net.mcreator.dondcheouetautretrucschelou.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.dondcheouetautretrucschelou.procedures.DT_when_useProcedure;

public class DtMobEffect extends MobEffect {
	public DtMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.dond_cheou_et_autre_trucs_chelou.dt";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DT_when_useProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

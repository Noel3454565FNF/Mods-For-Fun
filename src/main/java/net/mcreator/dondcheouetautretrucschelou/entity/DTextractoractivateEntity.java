
package net.mcreator.dondcheouetautretrucschelou.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.dondcheouetautretrucschelou.procedures.Extract_is_onProcedure;
import net.mcreator.dondcheouetautretrucschelou.init.DondCheouEtAutreTrucsChelouModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DTextractoractivateEntity extends AbstractArrow implements ItemSupplier {
	public DTextractoractivateEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(DondCheouEtAutreTrucsChelouModEntities.D_TEXTRACTORACTIVATE.get(), world);
	}

	public DTextractoractivateEntity(EntityType<? extends DTextractoractivateEntity> type, Level world) {
		super(type, world);
	}

	public DTextractoractivateEntity(EntityType<? extends DTextractoractivateEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DTextractoractivateEntity(EntityType<? extends DTextractoractivateEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.TIPPED_ARROW);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.BOW);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		Extract_is_onProcedure.execute(entity);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static DTextractoractivateEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		DTextractoractivateEntity entityarrow = new DTextractoractivateEntity(DondCheouEtAutreTrucsChelouModEntities.D_TEXTRACTORACTIVATE.get(),
				entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static DTextractoractivateEntity shoot(LivingEntity entity, LivingEntity target) {
		DTextractoractivateEntity entityarrow = new DTextractoractivateEntity(DondCheouEtAutreTrucsChelouModEntities.D_TEXTRACTORACTIVATE.get(),
				entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(1);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}

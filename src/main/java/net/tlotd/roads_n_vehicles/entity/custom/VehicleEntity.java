package net.tlotd.roads_n_vehicles.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.tlotd.roads_n_vehicles.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public abstract class VehicleEntity extends Entity {

    public VehicleEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    private int hornCooldown = 0;

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        builder.define(DATA_ID_HURT, 0);
        builder.define(DATA_ID_HURTDIR, 1);
        builder.define(DATA_ID_DAMAGE, 0.0F);
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {
    }

    public void tick() {
        if (hornCooldown > 0) {
            hornCooldown--;
        }
        if (!this.isNoGravity()) {
            this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.08, 0.0));
        }
        this.move(MoverType.SELF, this.getDeltaMovement());
        this.setDeltaMovement(this.getDeltaMovement().scale(0.98));

        if (this.getHurtTime() > 0) {
            this.setHurtTime(this.getHurtTime() - 1);
        }
        if (this.getDamage() > 0.0F) {
            this.setDamage(this.getDamage() - 1.0F);
        }
        super.tick();
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        return this.getPassengers().size() < 2;
    }

    @Nullable
    public LivingEntity getControllingPassenger() {
        Entity entity = this.getFirstPassenger();
        return entity instanceof LivingEntity living ? living : null;
    }

    @Override
    public InteractionResult interact(Player player, InteractionHand hand) {
        if (player.getVehicle() == this && this.getControllingPassenger() == player) {
            if (!level().isClientSide) {
                if (hornCooldown == 0) {
                    level().playSound(
                            null,
                            blockPosition(),
                            ModSounds.ENTITY_CAR_HORN,
                            SoundSource.PLAYERS,
                            1.0f,
                            1.0f
                    );
                    hornCooldown = 20;
                }
            }
            return InteractionResult.sidedSuccess(level().isClientSide);
        }
        if (!player.isSecondaryUseActive() && this.getPassengers().size() < 2) {
            if (!level().isClientSide) {
                player.startRiding(this);
            }
            return InteractionResult.sidedSuccess(level().isClientSide);
        }
        return InteractionResult.PASS;
    }

    @Override
    protected void positionRider(Entity passenger, MoveFunction move) {
        if (!this.hasPassenger(passenger)) return;
        int index = this.getPassengers().indexOf(passenger);
        float xOffset = (index == 0) ? 0.55F : -0.55F;
        float zOffset = -0.3F;
        Vec3 offset = new Vec3(xOffset, 0.0, zOffset).yRot(-this.getYRot() * ((float)Math.PI / 180F));
        Vec3 base = this.getPassengerAttachmentPoint(passenger, passenger.getDimensions(passenger.getPose()), 1.0F);
        move.accept(
                passenger,
                this.getX() + offset.x + base.x,
                this.getY() + base.y,
                this.getZ() + offset.z + base.z
        );
    }

    @Override
    protected Vec3 getPassengerAttachmentPoint(Entity passenger, EntityDimensions dimensions, float scale) {
        return new Vec3(0.0, 0.2, 0.0);
    }

    @Override
    public boolean isControlledByLocalInstance() {
        return this.getControllingPassenger() instanceof Player;
    }

    @Override
    public boolean isPickable() {
        return true;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    public boolean isAttackable() {
        return true;
    }

    @Override
    public ItemStack getPickResult() {
        return new ItemStack(this.getDropItem());
    }

    protected void destroy(DamageSource damageSource) {
        this.spawnAtLocation(this.getDropItem());
    }

    public boolean hurt(DamageSource damageSource, float f) {
        if (this.isInvulnerableTo(damageSource)) {
            return false;
        } else if (!this.level().isClientSide && !this.isRemoved()) {
            this.setHurtDir(-this.getHurtDir());
            this.setHurtTime(10);
            this.setDamage(this.getDamage() + f * 10.0F);
            this.markHurt();
            this.gameEvent(GameEvent.ENTITY_DAMAGE, damageSource.getEntity());
            boolean bl = damageSource.getEntity() instanceof Player && ((Player)damageSource.getEntity()).getAbilities().instabuild;
            if (bl || this.getDamage() > 40.0F) {
                if (!bl && this.level().getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
                    this.destroy(damageSource);
                }
                this.discard();
            }

            return true;
        } else {
            return true;
        }
    }

    public void setDamage(float f) {
        this.entityData.set(DATA_ID_DAMAGE, f);
    }

    public float getDamage() {
        return this.entityData.get(DATA_ID_DAMAGE);
    }

    public void setHurtTime(int i) {
        this.entityData.set(DATA_ID_HURT, i);
    }

    public int getHurtTime() {
        return this.entityData.get(DATA_ID_HURT);
    }

    public void setHurtDir(int i) {
        this.entityData.set(DATA_ID_HURTDIR, i);
    }

    public int getHurtDir() {
        return this.entityData.get(DATA_ID_HURTDIR);
    }

    public void animateHurt(float f) {
        this.setHurtDir(-this.getHurtDir());
        this.setHurtTime(10);
        this.setDamage(this.getDamage() * 11.0F);
    }

    private static final EntityDataAccessor<Float> DATA_ID_DAMAGE = SynchedEntityData.defineId(VehicleEntity.class, EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Integer> DATA_ID_HURT = SynchedEntityData.defineId(VehicleEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Integer> DATA_ID_HURTDIR = SynchedEntityData.defineId(VehicleEntity.class, EntityDataSerializers.INT);

    public abstract Item getDropItem();
}
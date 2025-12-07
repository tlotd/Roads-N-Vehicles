package net.tlotd.roads_n_vehicles.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.tlotd.roads_n_vehicles.entity.ModEntities;
import net.tlotd.roads_n_vehicles.item.ModItems;
import net.tlotd.roads_n_vehicles.sound.ModSounds;

public class MuscleCarEntity extends AnimalEntity {

    public MuscleCarEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createMuscleCarAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ARMOR, 20.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0D);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (player.isSneaking() && this.getPassengerList().isEmpty()) {
            if (!this.getWorld().isClient) {
                ItemStack drop;
                if (this.getType() == ModEntities.MUSCLE_CAR_STALLION) {
                    drop = new ItemStack(ModItems.MUSCLE_CAR_STALLION);
                } else {
                    drop = new ItemStack(ModItems.MUSCLE_CAR_FIRECHARGE);
                }
                this.remove(RemovalReason.DISCARDED);
                ItemEntity itemEntity = new ItemEntity(this.getWorld(), this.getX(), this.getY() + 0.25D, this.getZ(), drop);
                this.getWorld().spawnEntity(itemEntity);
                this.getWorld().playSound(null, this.getBlockPos(), SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 1.0f, 1.0f);
            }
            return ActionResult.success(this.getWorld().isClient);
        }
        if (player.hasVehicle() && player.getVehicle() == this && this.getControllingPassenger() == player) {
            if (hornCooldown == 0) {
                this.getWorld().playSound(null, this.getBlockPos(), ModSounds.ENTITY_CAR_HORN, SoundCategory.PLAYERS, 25.0f, 1.0f);
                hornCooldown = 20;
            }
            return ActionResult.success(this.getWorld().isClient);
        }
        if (!player.shouldCancelInteraction() && this.getPassengerList().size() < 2) {
            if (!this.getWorld().isClient) {
                player.startRiding(this);
            }
            return ActionResult.success(this.getWorld().isClient);
        }
        return super.interactMob(player, hand);
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        return this.getPassengerList().size() < 2;
    }

    @Override
    public double getMountedHeightOffset() {
        return -0.2D;
    }

    @Override
    public LivingEntity getControllingPassenger() {
        Entity first = this.getFirstPassenger();
        return first instanceof LivingEntity living ? living : null;
    }

    @Override
    protected void updatePassengerPosition(Entity passenger, Entity.PositionUpdater positionUpdater) {
        if (!this.hasPassenger(passenger)) return;
        int index = this.getPassengerList().indexOf(passenger);
        double seatY = this.getMountedHeightOffset();
        double seatZ = -0.3D;
        double seatX;
        if (index == 0) {
            seatX = 0.55D;
        } else {
            seatX = -0.55D;
        }
        Vec3d offset = new Vec3d(seatX, seatY, seatZ).rotateY((float) -Math.toRadians(this.getYaw()));
        positionUpdater.accept(passenger, this.getX() + offset.x, this.getY() + offset.y, this.getZ() + offset.z);
    }

    @Override
    public void travel(Vec3d movementInput) {
        LivingEntity controller = this.getControllingPassenger();
        if (controller instanceof PlayerEntity player && !this.getWorld().isClient) {
            float forward = player.forwardSpeed;
            float speed = (float) this.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED);
            Vec3d local = new Vec3d(0, 0, forward * speed);
            float yawRad = (float) Math.toRadians(player.getYaw());
            double sin = Math.sin(yawRad);
            double cos = Math.cos(yawRad);
            double dx = local.x * cos - local.z * sin;
            double dz = local.x * sin + local.z * cos;
            this.setVelocity(dx, this.getVelocity().y, dz);
            super.travel(this.getVelocity());
            return;
        }
        super.travel(movementInput);
    }

    @Override
    public boolean isLogicalSideForUpdatingMovement() {
        return !this.getWorld().isClient;
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.BLOCK_METAL_HIT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_ANVIL_DESTROY;
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    protected void tickControlled(PlayerEntity controllingPlayer, Vec3d movementInput) {
        if (controllingPlayer.forwardSpeed != 0) {
            this.setYaw(controllingPlayer.getYaw());
            this.prevYaw = this.getYaw();
        }
        super.tickControlled(controllingPlayer, movementInput);
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        Entity attacker = source.getAttacker();
        if (attacker != null && this.hasPassenger(attacker)) {
            return false;
        }
        return super.damage(source, amount);
    }

    @Override
    public boolean shouldRenderName() {
        return false;
    }

    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return false;
    }

    public boolean isBeingRidden() {
        return this.getControllingPassenger() != null;
    }

    private int idleSoundCooldown, hornCooldown = 0;
    private double lastX, lastZ;
    private double smoothSpeed = 0.0;

    @Override
    public void tick() {
        super.tick();
        if (hornCooldown > 0) {
            hornCooldown--;
        }
        if (!this.getWorld().isClient && this.isBeingRidden()) {
            if (idleSoundCooldown <= 0) {
                this.playSound(ModSounds.ENTITY_CAR_IDLE, 1.0F, 1.0F);
                idleSoundCooldown = 2;
            } else {
                idleSoundCooldown--;
            }
        } else {
            idleSoundCooldown = 0;
        }
        double dx = this.getX() - lastX;
        double dz = this.getZ() - lastZ;
        double distancePerTick = Math.sqrt(dx*dx + dz*dz);
        double rawSpeed = distancePerTick * 20.0;
        lastX = this.getX();
        lastZ = this.getZ();
        double alpha = 0.2;
        smoothSpeed += alpha * (rawSpeed - smoothSpeed);
        LivingEntity controller = this.getControllingPassenger();
        if (controller instanceof PlayerEntity player) {
            int kmh = (int)(smoothSpeed * 3.6);
            int mph = (int)(smoothSpeed * 2.23694);
            player.sendMessage(Text.translatable("text.roads-n-vehicles.vehicle_speed", kmh, mph), true);
        }
    }
}
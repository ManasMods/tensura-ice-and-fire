package com.github.manasmods.tensuraiaf.ability;

import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.github.manasmods.tensura.entity.magic.breath.BreathEntity;
import com.github.manasmods.tensura.event.SkillGriefEvent;
import com.github.manasmods.tensura.registry.blocks.TensuraBlocks;
import com.github.manasmods.tensura.util.damage.DamageSourceHelper;
import com.github.manasmods.tensura.util.damage.TensuraIndirectEntityDamageSource;
import com.github.manasmods.tensura.world.TensuraGameRules;
import com.github.manasmods.tensuraiaf.registry.IafEntityTypes;
import com.github.manasmods.tensuraiaf.registry.IafParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;

public class IceBreathProjectile extends BreathEntity {
    public IceBreathProjectile(EntityType<? extends IceBreathProjectile> entityType, Level level) {
        super(entityType, level);
        this.setNoGravity(true);
    }

    public IceBreathProjectile(Level level, LivingEntity entity) {
        this(IafEntityTypes.ICE_BREATH.get(), level);
        setOwner(entity);
    }

    /** LOGIC **/
    public void tick() {
        super.tick();
        if (!this.getLevel().isClientSide()) {
            this.placeIce();
            this.clearFluid();
        }
    }

    protected void onHitEntity(EntityHitResult entityHitResult) {
        var entity = entityHitResult.getEntity();
        DamageSource damageSource = (new TensuraIndirectEntityDamageSource("ice_breath", this, this.getOwner()))
                .setNoKnock().setNotTensuraMagic().setMagic();
        if (entity.hurt(DamageSourceHelper.addSkillAndCost(damageSource, getMpCost(), getSkill()), 8)
                && entity instanceof LivingEntity living) FrozenProperties.setFrozenFor(living, 50);
    }

    public void placeIce() {
        if (getOwner() == null) return;
        if (!TensuraGameRules.canSkillGrief(this.getLevel())) return;

        float range = 15 * Mth.DEG_TO_RAD;
        for (int i = 0; i < 3; i++) {
            Vec3 cast = getOwner().getLookAngle().normalize().xRot(this.getLevel().random.nextFloat() * range * 2 - range).yRot(this.getLevel().random.nextFloat() * range * 2 - range);
            HitResult hitResult = this.getLevel().clip(new ClipContext(getOwner().getEyePosition(), getOwner().getEyePosition()
                    .add(cast.scale(getLength())), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, this));

            if (hitResult.getType() != HitResult.Type.BLOCK) continue;
            Vec3 pos = hitResult.getLocation().subtract(cast.scale(0.5));
            BlockPos blockPos = new BlockPos(pos.x, pos.y, pos.z);
            if (this.getLevel().getBlockState(blockPos).isAir() && this.getLevel().getBlockState(blockPos.below()).getMaterial().isSolid()) {
                SkillGriefEvent.Pre preGrief = new SkillGriefEvent.Pre(getOwner(), getSkill(), blockPos);
                if (MinecraftForge.EVENT_BUS.post(preGrief)) continue;
                this.getLevel().setBlockAndUpdate(blockPos, IafBlockRegistry.DRAGON_ICE_SPIKES.get().defaultBlockState());
                MinecraftForge.EVENT_BUS.post(new SkillGriefEvent.Post(getOwner(), getSkill(), blockPos));
            }
        }
    }

    public void clearFluid() {
        if (this.getOwner() == null) return;
        if (!TensuraGameRules.canSkillGrief(this.getLevel())) return;
        float range = 15 * Mth.DEG_TO_RAD;
        for(int i = 0; i < 3; ++i) {

            Vec3 cast = this.getOwner().getLookAngle().normalize().xRot(this.getLevel().random.nextFloat() * range * 2.0F - range).yRot(this.getLevel().random.nextFloat() * range * 2.0F - range);
            BlockHitResult hitResult = this.getLevel().clip(new ClipContext(this.getOwner().getEyePosition(), this.getOwner().getEyePosition().add(cast.scale(this.getLength())), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, this));
            if (hitResult.getType() == HitResult.Type.BLOCK) {
                BlockPos blockPos = hitResult.getBlockPos();

                if (this.getLevel().getBlockState(blockPos).is(BlockTags.FIRE)) {
                    SkillGriefEvent.Pre preGrief = new SkillGriefEvent.Pre(getOwner(), getSkill(), blockPos);
                    if (MinecraftForge.EVENT_BUS.post(preGrief)) continue;
                    this.getLevel().removeBlock(blockPos, false);
                    MinecraftForge.EVENT_BUS.post(new SkillGriefEvent.Post(getOwner(), getSkill(), blockPos));

                } else if (this.getLevel().getBlockState(blockPos).is(Blocks.LAVA)) {
                    SkillGriefEvent.Pre preGrief = new SkillGriefEvent.Pre(getOwner(), getSkill(), blockPos);
                    if (MinecraftForge.EVENT_BUS.post(preGrief)) continue;
                    this.getLevel().setBlockAndUpdate(blockPos, this.getLevel().getFluidState(blockPos).isSource() ?
                            Blocks.OBSIDIAN.defaultBlockState() : Blocks.COBBLESTONE.defaultBlockState());
                    MinecraftForge.EVENT_BUS.post(new SkillGriefEvent.Post(getOwner(), getSkill(), blockPos));

                } else if (this.getLevel().getBlockState(blockPos).is(Blocks.WATER) && this.getLevel().getFluidState(blockPos).isSource() ) {
                    SkillGriefEvent.Pre preGrief = new SkillGriefEvent.Pre(getOwner(), getSkill(), blockPos);
                    if (MinecraftForge.EVENT_BUS.post(preGrief)) continue;
                    this.getLevel().setBlockAndUpdate(blockPos, Blocks.FROSTED_ICE.defaultBlockState());
                    MinecraftForge.EVENT_BUS.post(new SkillGriefEvent.Post(getOwner(), getSkill(), blockPos));

                } else if (this.getLevel().getBlockState(blockPos).is(TensuraBlocks.HOT_SPRING_WATER.get()) && this.getLevel().getFluidState(blockPos).isSource() ) {
                    SkillGriefEvent.Pre preGrief = new SkillGriefEvent.Pre(getOwner(), getSkill(), blockPos);
                    if (MinecraftForge.EVENT_BUS.post(preGrief)) continue;
                    this.getLevel().setBlockAndUpdate(blockPos, Blocks.BLUE_ICE.defaultBlockState());
                    MinecraftForge.EVENT_BUS.post(new SkillGriefEvent.Post(getOwner(), getSkill(), blockPos));
                }
            }
        }
    }

    public void spawnParticle() {
        if (!(getOwner() instanceof LivingEntity owner)) return;
        Vec3 rotation = owner.getLookAngle().normalize();
        var pos = owner.position().add(rotation.scale(1.6));

        double x = pos.x;
        double y = pos.y + owner.getEyeHeight() * 0.9f;
        double z = pos.z;

        double speed = owner.getRandom().nextDouble() * 0.35 + 0.35;
        for (int i = 0; i < 10; i++) {
            double ox = Math.random() * 0.3 - 0.15;
            double oy = Math.random() * 0.3 - 0.15;
            double oz = Math.random() * 0.3 - 0.15;

            Vec3 randomVec = new Vec3(Math.random() - 0.5, Math.random() - 0.5, Math.random() - 0.5).normalize();
            Vec3 result = (rotation.scale(3).add(randomVec)).normalize().scale(speed);
            owner.getLevel().addParticle(ParticleTypes.SNOWFLAKE, x + ox, y + oy, z + oz, result.x, result.y, result.z);
            owner.getLevel().addParticle(IafParticles.SNOWFLAKE_EFFECT.get(), x + ox, y + oy, z + oz, result.x, result.y, result.z);
        }
    }
}

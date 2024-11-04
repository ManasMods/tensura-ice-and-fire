package com.github.manasmods.tensuraiaf.ability;

import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.github.manasmods.tensura.entity.magic.breath.BreathEntity;
import com.github.manasmods.tensura.util.damage.DamageSourceHelper;
import com.github.manasmods.tensura.util.damage.TensuraIndirectEntityDamageSource;
import com.github.manasmods.tensuraiaf.registry.IafEntityTypes;
import com.github.manasmods.tensuraiaf.registry.IafParticles;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

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
    protected void onHitEntity(EntityHitResult entityHitResult) {
        var entity = entityHitResult.getEntity();
        DamageSource damageSource = (new TensuraIndirectEntityDamageSource("ice_breath", this, this.getOwner()))
                .setNoKnock().setNotTensuraMagic().setMagic();
        if (entity.hurt(DamageSourceHelper.addSkillAndCost(damageSource, getMpCost(), getSkill()), 8)
                && entity instanceof LivingEntity living) FrozenProperties.setFrozenFor(living, 50);
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

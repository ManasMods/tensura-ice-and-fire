package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.entity.EntityDragonBase;
import io.github.manasmods.tensura.registry.item.TensuraMobDropItems;
import io.github.manasmods.tensura_iaf.IafHandler;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityDragonBase.class)
public abstract class MixinEntityDragonBase extends TamableAnimal {
    protected MixinEntityDragonBase(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource damageSource, boolean bl) {
        EntityDragonBase dragon = (EntityDragonBase) (Object) this;
        if (dragon.getDragonStage() < IafHandler.CONFIG.minStageEssence) return;
        if (dragon.getDragonStage() > IafHandler.CONFIG.maxStageEssence) return;
        if (dragon.getRandom().nextFloat() > IafHandler.CONFIG.essenceChance) return;
        dragon.spawnAtLocation(TensuraMobDropItems.DRAGON_ESSENCE.get());
    }
}

package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.entity.DragonBaseEntity;
import io.github.manasmods.tensura.registry.item.TensuraMobDropItems;
import io.github.manasmods.tensura_iaf.TensuraIaf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(DragonBaseEntity.class)
public abstract class MixinEntityDragonBase extends TamableAnimal {
    protected MixinEntityDragonBase(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource damageSource, boolean bl) {
        DragonBaseEntity dragon = (DragonBaseEntity) (Object) this;
        if (dragon.getDragonStage() < TensuraIaf.CONFIG.minStageEssence) return;
        if (dragon.getDragonStage() > TensuraIaf.CONFIG.maxStageEssence) return;
        if (dragon.getRandom().nextFloat() > TensuraIaf.CONFIG.essenceChance) return;
        dragon.spawnAtLocation(TensuraMobDropItems.DRAGON_ESSENCE.get());
    }
}

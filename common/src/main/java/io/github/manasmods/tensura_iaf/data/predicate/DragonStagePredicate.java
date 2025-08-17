package io.github.manasmods.tensura_iaf.data.predicate;

import com.iafenvoy.iceandfire.entity.EntityDragonBase;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.manasmods.tensura_iaf.registry.IafCritereonPredicates;
import net.minecraft.advancements.critereon.EntitySubPredicate;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public record DragonStagePredicate(int minStage, int maxStage) implements EntitySubPredicate {
    public static final MapCodec<DragonStagePredicate> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(
            Codec.INT.fieldOf("min").forGetter(DragonStagePredicate::minStage),
            Codec.INT.fieldOf("max").forGetter(DragonStagePredicate::maxStage)
    ).apply(instance, DragonStagePredicate::new));

    public MapCodec<DragonStagePredicate> codec() {
        return IafCritereonPredicates.DRAGON_STAGE.get();
    }

    public boolean matches(Entity entity, ServerLevel serverLevel, @Nullable Vec3 vec3) {
        if (entity instanceof EntityDragonBase dragonBase) {
            int state = dragonBase.getDragonStage();
            if (state < this.minStage || state > this.maxStage) return false;
        }
        return false;
    }
}
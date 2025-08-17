package io.github.manasmods.tensura_iaf.registry;

import com.mojang.serialization.MapCodec;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.tensura_iaf.TensuraIaf;
import io.github.manasmods.tensura_iaf.data.predicate.DragonStagePredicate;
import net.minecraft.advancements.critereon.EntitySubPredicate;
import net.minecraft.core.registries.Registries;

public class IafCritereonPredicates {
    public static final DeferredRegister<MapCodec<? extends EntitySubPredicate>> PREDICATES = DeferredRegister.create(TensuraIaf.MOD_ID, Registries.ENTITY_SUB_PREDICATE_TYPE);
    public static final RegistrySupplier<MapCodec<DragonStagePredicate>> DRAGON_STAGE = PREDICATES.register("dragon_stage_predicate", () -> DragonStagePredicate.CODEC);
    public static void init() {
        PREDICATES.register();
    }
}

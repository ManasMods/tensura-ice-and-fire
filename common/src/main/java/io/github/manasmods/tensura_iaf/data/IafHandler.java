package io.github.manasmods.tensura_iaf.data;

import com.iafenvoy.iceandfire.entity.EntityDragonBase;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.LootEvent;
import io.github.manasmods.tensura.event.TensuraEntityEvents;
import io.github.manasmods.tensura.event.TensuraSkillEvents;
import io.github.manasmods.tensura.registry.item.TensuraMobDropItems;
import io.github.manasmods.tensura_iaf.data.predicate.DragonStagePredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class IafHandler {
    public static void init() {
        LootEvent.MODIFY_LOOT_TABLE.register((key, context, builtin) -> {
            if (!builtin) return;

            if (key.location().getPath().startsWith("entities/dragon")) {
                EntityPredicate.Builder highPredicate = EntityPredicate.Builder.entity().subPredicate(new DragonStagePredicate(4, 5));
                LootPool.Builder pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(TensuraMobDropItems.DRAGON_ESSENCE.get())
                                .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, highPredicate))
                                .when(LootItemRandomChanceCondition.randomChance(0.25F))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                        );
                context.addPool(pool);
            }
        });

        TensuraSkillEvents.SKILL_PLUNDER.register((target, entity, steal, changeable) -> {
            if (target instanceof EntityDragonBase dragonBase && (dragonBase.isModelDead() || dragonBase.getDeathStage() > 0))
                return EventResult.interruptFalse();
            return EventResult.pass();
        });

        TensuraEntityEvents.ENERGY_DRAIN_EVENT.register((target, drainer, drainType, gainType, amount, percentage) -> {
            if (target instanceof EntityDragonBase dragonBase && (dragonBase.isModelDead() || dragonBase.getDeathStage() > 0))
                return EventResult.interruptFalse();
            return EventResult.pass();
        });

        TensuraEntityEvents.SPIRITUAL_HURT_EVENT.register((target, drainer, drainType, gainType, amount, percentage) -> {
            if (target instanceof EntityDragonBase dragonBase && (dragonBase.isModelDead() || dragonBase.getDeathStage() > 0))
                return EventResult.interruptFalse();
            return EventResult.pass();
        });
    }
}

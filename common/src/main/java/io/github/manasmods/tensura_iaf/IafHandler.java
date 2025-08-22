package io.github.manasmods.tensura_iaf;

import com.iafenvoy.iceandfire.entity.EntityDragonBase;
import dev.architectury.event.EventResult;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.event.TensuraEntityEvents;
import io.github.manasmods.tensura.event.TensuraSkillEvents;
import io.github.manasmods.tensura_iaf.registry.IafConfig;

public class IafHandler {
    public static IafConfig CONFIG = ConfigRegistry.getConfig(IafConfig.class);

    public static void init() {
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

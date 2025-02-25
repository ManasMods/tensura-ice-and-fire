package com.github.manasmods.tensuraiaf.handler;

import com.github.alexthe666.iceandfire.entity.EntityDragonBase;
import com.github.manasmods.tensura.event.EnergyDrainEvent;
import com.github.manasmods.tensura.event.SkillPlunderEvent;
import com.github.manasmods.tensura.event.SpiritualHurtEvent;
import com.github.manasmods.tensura.registry.items.TensuraMobDropItems;
import com.github.manasmods.tensuraiaf.TensuraIaF;
import com.github.manasmods.tensuraiaf.TensuraIafConfig;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TensuraIaF.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class IafDropHandler {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onDragonDeath(final LivingDeathEvent e) {
        if (e.isCanceled()) return;
        if (!(e.getEntity() instanceof EntityDragonBase dragon)) return;
        if (dragon.level.isClientSide()) return;

        if (!dragon.getLevel().getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT)) return;
        if (dragon.getDragonStage() < TensuraIafConfig.INSTANCE.minDragonStageForEssence.get()) return;
        if (dragon.getDragonStage() > TensuraIafConfig.INSTANCE.maxDragonStageForEssence.get()) return;
        dragon.spawnAtLocation(TensuraMobDropItems.DRAGON_ESSENCE.get());
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onEnergyDrain(final EnergyDrainEvent e) {
        if (e.isCanceled()) return;
        if (!(e.getEntity() instanceof EntityDragonBase dragon)) return;
        if (dragon.isModelDead() || dragon.getDeathStage() > 0) e.setCanceled(true);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onSkillPlunder(final SkillPlunderEvent e) {
        if (e.isCanceled()) return;
        if (!(e.getTarget() instanceof EntityDragonBase dragon)) return;
        if (dragon.isModelDead() || dragon.getDeathStage() > 0) e.setCanceled(true);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onSpiritualHurt(final SpiritualHurtEvent e) {
        if (e.isCanceled()) return;
        if (!(e.getEntity() instanceof EntityDragonBase dragon)) return;
        if (dragon.isModelDead() || dragon.getDeathStage() > 0) e.setCanceled(true);
    }
}

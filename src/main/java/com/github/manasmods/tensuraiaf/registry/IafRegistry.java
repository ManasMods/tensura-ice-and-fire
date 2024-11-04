package com.github.manasmods.tensuraiaf.registry;

import net.minecraftforge.eventbus.api.IEventBus;

public class IafRegistry {
    public static void register(IEventBus modEventBus) {
        IafSkills.init(modEventBus);
        IafEntityTypes.init(modEventBus);
        IafParticles.init(modEventBus);
    }
}

package com.github.manasmods.tensuraiaf.registry;

import com.github.manasmods.manascore.api.skills.ManasSkill;
import com.github.manasmods.manascore.api.skills.SkillAPI;
import com.github.manasmods.tensuraiaf.TensuraIaF;
import com.github.manasmods.tensuraiaf.ability.IceBreathSkill;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class IafSkills {
    private static final DeferredRegister<ManasSkill> registry = DeferredRegister.create(SkillAPI.getSkillRegistryKey(), TensuraIaF.MOD_ID);
    public static final RegistryObject<IceBreathSkill> ICE_BREATH = registry.register("ice_breath", IceBreathSkill::new);
    public static void init(IEventBus modEventBus) {
        registry.register(modEventBus);
    }
}

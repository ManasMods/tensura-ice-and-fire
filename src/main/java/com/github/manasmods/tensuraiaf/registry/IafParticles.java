package com.github.manasmods.tensuraiaf.registry;

import com.github.manasmods.tensuraiaf.TensuraIaF;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IafParticles {
    private static final DeferredRegister<ParticleType<?>> registry = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TensuraIaF.MOD_ID);
    public static final RegistryObject<SimpleParticleType> SNOWFLAKE_EFFECT = registry.register("snowflake_effect", () -> new SimpleParticleType(false));
    public static void init(IEventBus modEventBus) {
        registry.register(modEventBus);
    }
}

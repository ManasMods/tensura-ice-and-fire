package com.github.manasmods.tensuraiaf;

import com.github.manasmods.tensura.client.particle.LightningEffectParticle;
import com.github.manasmods.tensuraiaf.registry.IafEntityTypes;
import com.github.manasmods.tensuraiaf.registry.IafParticles;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TensuraIaF.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IafClient {
    @SubscribeEvent
    public static void init(final FMLClientSetupEvent e) {
        IafClient.registerEntityRenderer();
    }

    private static void registerEntityRenderer() {
        EntityRenderers.register(IafEntityTypes.ICE_BREATH.get(), NoopRenderer::new);
    }

    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.register(IafParticles.SNOWFLAKE_EFFECT.get(), LightningEffectParticle.LightningProvider::new);
    }
}

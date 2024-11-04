package com.github.manasmods.tensuraiaf.registry;

import com.github.manasmods.tensuraiaf.TensuraIaF;
import com.github.manasmods.tensuraiaf.ability.IceBreathProjectile;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IafEntityTypes {
    private static final DeferredRegister<EntityType<?>> registry = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TensuraIaF.MOD_ID);
    public static final RegistryObject<EntityType<IceBreathProjectile>> ICE_BREATH = registry.register(
            "ice_breath", () -> EntityType.Builder.<IceBreathProjectile>of(IceBreathProjectile::new, MobCategory.MISC)
                    .sized(1f, 1f).clientTrackingRange(64)
                    .build(new ResourceLocation(TensuraIaF.MOD_ID, "ice_breath").toString()));
    public static void init(IEventBus modEventBus) {
        registry.register(modEventBus);
    }
}

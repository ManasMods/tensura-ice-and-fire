package io.github.manasmods.tensura_iaf.data;

import io.github.manasmods.tensura_iaf.TensuraIaf;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class TensuraIafEntityTags {
    public static TagKey<EntityType<?>> CANNOT_BE_CHAINED = modTag("cannot_be_chained");

    static TagKey<EntityType<?>> modTag(String name) {
        return create(ResourceLocation.fromNamespaceAndPath(TensuraIaf.MOD_ID, name));
    }
    static TagKey<EntityType<?>> create(final ResourceLocation name) {
        return TagKey.create(Registries.ENTITY_TYPE, name);
    }
}

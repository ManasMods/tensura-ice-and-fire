package com.github.manasmods.tensuraiaf.data.gen;

import com.github.manasmods.manascore.api.data.gen.LanguageProvider;
import com.github.manasmods.tensura.ability.TensuraSkill;
import com.github.manasmods.tensuraiaf.registry.IafEntityTypes;
import com.github.manasmods.tensuraiaf.registry.IafSkills;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.RegistryObject;

public class IafLanguageProvider extends LanguageProvider {
    public IafLanguageProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, "tensuraiaf");
    }
    protected void generate() {
        addEntity(IafEntityTypes.ICE_BREATH, "Ice Breath");
        addSkill(IafSkills.ICE_BREATH, "Ice Breath", "Spew icy breath to freeze enemies.");
    }

    protected void addEntity(RegistryObject<? extends EntityType<?>> entity, String name) {
        add(String.format("entity.%s.%s", entity.getId().getNamespace(), entity.getId().getPath().replace('/', '.')), name);
    }

    protected void addSkill(RegistryObject<? extends TensuraSkill> skill, String name, String description) {
        add(String.format("%s.skill.%s", skill.getId().getNamespace(), skill.getId().getPath().replace('/', '.')), name);
        add(String.format("%s.skill.%s.description", skill.getId().getNamespace(), skill.getId().getPath().replace('/', '.')), description);
    }
}

package com.github.manasmods.tensuraiaf.ability;

import com.github.manasmods.manascore.api.skills.ManasSkillInstance;
import com.github.manasmods.tensura.ability.SkillHelper;
import com.github.manasmods.tensura.ability.skill.Skill;
import com.github.manasmods.tensura.entity.magic.breath.BreathEntity;
import com.github.manasmods.tensuraiaf.TensuraIaF;
import com.github.manasmods.tensuraiaf.registry.IafEntityTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;

import javax.annotation.Nullable;

public class IceBreathSkill extends Skill {
    public IceBreathSkill() {
        super(SkillType.INTRINSIC);
    }

    @Nullable
    public ResourceLocation getSkillIcon() {
        ResourceLocation id = this.getRegistryName();
        if (id == null) return new ResourceLocation(TensuraIaF.MOD_ID, "textures/temp_textures/item/confused_rimuru.png");
        return new ResourceLocation(TensuraIaF.MOD_ID, "textures/skill/" + getType().getNamespace() + "/" + id.getPath().replace('/', '.') + ".png");
    }

    public double magiculeCost(LivingEntity entity, ManasSkillInstance instance) {
        return 50;
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity) {
        instance.getOrCreateTag().putInt("BreathEntity", 0);
        instance.markDirty();
    }

    public boolean onHeld(ManasSkillInstance instance, LivingEntity entity, int heldTicks) {
        if (heldTicks % 20 == 0 && SkillHelper.outOfMagicule(entity, instance)) return false;
        if (heldTicks % 200 == 0 && heldTicks > 0) addMasteryPoint(instance, entity);

        BreathEntity.spawnBreathEntity(IafEntityTypes.ICE_BREATH.get(), entity, instance, magiculeCost(entity, instance));
        entity.getLevel().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                SoundEvents.PLAYER_HURT_FREEZE, SoundSource.PLAYERS, 1.0f,1.0f);
        return true;
    }
}

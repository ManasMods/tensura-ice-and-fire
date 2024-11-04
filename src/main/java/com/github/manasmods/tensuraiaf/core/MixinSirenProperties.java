package com.github.manasmods.tensuraiaf.core;

import com.github.alexthe666.iceandfire.entity.props.SirenProperties;
import com.github.manasmods.tensura.ability.SkillUtils;
import com.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SirenProperties.class)
public abstract class MixinSirenProperties {
    @Inject(at = @At(value = "HEAD"), method = "setCharmedBy", cancellable = true, remap = false)
    private static void setCharmedBy(LivingEntity entity, LivingEntity charmedBy, CallbackInfo ci) {
        if (SkillUtils.isSkillToggled(entity, ResistanceSkills.SPIRITUAL_ATTACK_NULLIFICATION.get())) ci.cancel();
    }
}

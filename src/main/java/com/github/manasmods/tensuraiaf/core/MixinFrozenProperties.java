package com.github.manasmods.tensuraiaf.core;

import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.github.manasmods.tensura.ability.SkillUtils;
import com.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FrozenProperties.class)
public abstract class MixinFrozenProperties {
    @Inject(at = @At(value = "HEAD"), method = "setFrozenFor", cancellable = true, remap = false)
    private static void setFrozenFor(LivingEntity entity, int duration, CallbackInfo ci) {
        if (SkillUtils.isSkillToggled(entity, ResistanceSkills.COLD_NULLIFICATION.get())) ci.cancel();
        else if (SkillUtils.isSkillToggled(entity, ResistanceSkills.THERMAL_FLUCTUATION_NULLIFICATION.get())) ci.cancel();
    }
}

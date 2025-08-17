package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.data.component.FrozenData;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FrozenData.class)
public class MixinFrozenData {
    @Inject(at = @At(value = "HEAD"), method = "setFrozen", cancellable = true, remap = false)
    private void setFrozenFor(LivingEntity entity, int duration, CallbackInfo ci) {
        if (SkillUtils.isSkillToggled(entity, ResistanceSkills.COLD_NULLIFICATION.get())) ci.cancel();
        else if (SkillUtils.isSkillToggled(entity, ResistanceSkills.THERMAL_FLUCTUATION_NULLIFICATION.get())) ci.cancel();
    }
}

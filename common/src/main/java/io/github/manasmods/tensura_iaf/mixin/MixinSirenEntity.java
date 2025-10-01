package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.entity.SirenEntity;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SirenEntity.class)
public class MixinSirenEntity {
    @Inject(method = "isWearingEarplugs", cancellable = true, at = @At(value = "RETURN"))
    private static void isImmune(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue()) return;
        if (SkillUtils.isSkillToggled(entity, ResistanceSkills.SPIRITUAL_ATTACK_NULLIFICATION.get())) cir.setReturnValue(true);
    }
}

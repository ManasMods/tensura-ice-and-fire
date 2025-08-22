package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.entity.EntityGorgon;
import com.iafenvoy.iceandfire.registry.tag.IafEntityTags;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityGorgon.class)
public class MixinEntityGorgon {
    @Inject(at = @At(value = "HEAD"), method = "isBlindfolded", cancellable = true, remap = false)
    private static void isBlindfolded(LivingEntity target, CallbackInfoReturnable<Boolean> cir) {
        if (target.getType().is(IafEntityTags.IMMUNE_TO_GORGON_STONE)) cir.setReturnValue(true);
        else if (SkillUtils.isSkillToggled(target, ResistanceSkills.ABNORMAL_CONDITION_NULLIFICATION.get())) cir.setReturnValue(true);
    }
}

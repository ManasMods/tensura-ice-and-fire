package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.data.component.SirenData;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SirenData.class)
public class MixinSirenData {
    @Inject(at = @At(value = "HEAD"), method = "setCharmed", cancellable = true, remap = false)
    private void setCharmedBy(Entity entity, CallbackInfo ci) {
        if (entity instanceof LivingEntity living
                && SkillUtils.isSkillToggled(living, ResistanceSkills.SPIRITUAL_ATTACK_NULLIFICATION.get())) ci.cancel();
    }
}

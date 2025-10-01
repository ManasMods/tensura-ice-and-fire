package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.registry.IafStatusEffects;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.resist.ColdNullification;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(ColdNullification.class)
public class MixinColdNullification {
    @Inject(method = "getImmuneEffects", cancellable = true,  at = @At(value = "RETURN"))
    private void getImmuneEffects(ManasSkillInstance instance, LivingEntity entity, CallbackInfoReturnable<List<Holder<MobEffect>>> cir) {
        List<Holder<MobEffect>> list = new ArrayList<>(cir.getReturnValue());
        list.add(IafStatusEffects.REGISTRY.getRegistrar().getHolder(IafStatusEffects.FROZEN.getId()));
        cir.setReturnValue(list);
    }
}

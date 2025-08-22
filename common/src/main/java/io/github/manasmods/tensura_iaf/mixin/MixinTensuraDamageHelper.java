package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.registry.IafDamageTypes;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import net.minecraft.world.damagesource.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TensuraDamageHelper.class)
public class MixinTensuraDamageHelper {
    @Inject(at = @At(value = "HEAD"), method = "isAbnormal", cancellable = true, remap = false)
    private static void isAbnormal(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (damageSource.is(IafDamageTypes.GORGON_DMG_TYPE)) cir.setReturnValue(true);
    }
}

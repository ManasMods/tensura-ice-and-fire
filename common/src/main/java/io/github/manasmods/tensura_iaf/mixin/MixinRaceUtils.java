package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.entity.DragonBaseEntity;
import io.github.manasmods.tensura.race.RaceUtils;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RaceUtils.class)
public abstract class MixinRaceUtils {

    @Inject(at = @At(value = "RETURN"), method = "isNonLiving", cancellable = true)
    private static void isNonLiving(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue()) return;
        if (entity instanceof DragonBaseEntity dragon && (dragon.isModelDead() || dragon.getDeathStage() > 0)) cir.setReturnValue(true);
    }
}

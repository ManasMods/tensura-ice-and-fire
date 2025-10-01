package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.item.ChainItem;
import io.github.manasmods.tensura_iaf.data.TensuraIafEntityTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChainItem.class)
public class MixinItemChain {
    @Inject(at = @At(value = "INVOKE", target = "Lcom/iafenvoy/iceandfire/data/component/ChainData;attachChain(Ljava/util/UUID;)V",
            shift = At.Shift.BEFORE), method = "interactLivingEntity", cancellable = true)
    private void interactLivingEntity(ItemStack stack, Player playerIn, LivingEntity target, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        if (target.getType().is(TensuraIafEntityTags.CANNOT_BE_CHAINED))
            cir.setReturnValue(InteractionResult.PASS);
    }
}

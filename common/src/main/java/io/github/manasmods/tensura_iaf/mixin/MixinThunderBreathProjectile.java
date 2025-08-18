package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.entity.block.BlockEntityDragonForgeInput;
import com.iafenvoy.iceandfire.registry.IafBlocks;
import io.github.manasmods.tensura.entity.magic.breath.ThunderBreathProjectile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ThunderBreathProjectile.class)
public class MixinThunderBreathProjectile {
    @Inject(method = "applyBlockInteraction", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private void applyBlockInteraction(Vec3 pos, BlockPos blockPos, BlockState state, CallbackInfo ci) {
        if (state.is(IafBlocks.DRAGONFORGE_LIGHTNING_INPUT)) {
            ThunderBreathProjectile breath = ((ThunderBreathProjectile) (Object) this);
            BlockEntity blockEntity = breath.level().getBlockEntity(blockPos);
            if (!(blockEntity instanceof BlockEntityDragonForgeInput forge)) return;
            if (breath.level().getRandom().nextInt(0, 32) < breath.getDamage()) forge.onHitWithFlame();
            ci.cancel();
        }
    }
}

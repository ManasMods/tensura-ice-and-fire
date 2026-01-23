package io.github.manasmods.tensura_iaf.mixin;

import com.iafenvoy.iceandfire.item.block.entity.DragonForgeInputBlockEntity;
import com.iafenvoy.iceandfire.registry.IafBlocks;
import io.github.manasmods.tensura.entity.magic.breath.IceBreathProjectile;
import io.github.manasmods.tensura.event.TensuraSkillEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(IceBreathProjectile.class)
public class MixinIceBreathProjectile {
    @Inject(method = "applyBlockInteraction", at = @At(value = "HEAD"), cancellable = true)
    private void applyBlockInteraction(Vec3 pos, BlockPos blockPos, BlockState state, CallbackInfo ci) {
        if (state.is(IafBlocks.DRAGONFORGE_ICE_INPUT)) {
            IceBreathProjectile breath = ((IceBreathProjectile) (Object) this);
            BlockEntity blockEntity = breath.level().getBlockEntity(blockPos);
            if (!(blockEntity instanceof DragonForgeInputBlockEntity forge)) return;
            if (breath.level().getRandom().nextInt(0, 32) < breath.getDamage()) forge.onHitWithFlame();
            ci.cancel();
        }
    }

    @Inject(method = "applyBlockInteraction", at = @At(value = "TAIL"))
    private void placeIceSpike(Vec3 pos, BlockPos blockPos, BlockState state, CallbackInfo ci) {
        IceBreathProjectile breath = ((IceBreathProjectile) (Object) this);
        if (breath.level().getBlockState(blockPos.above()).isAir() && IafBlocks.DRAGON_ICE_SPIKES.get().defaultBlockState().canSurvive(breath.level(), blockPos.above())) {
            if (!TensuraSkillEvents.SKILL_GRIEF_PRE.invoker().grief(breath.getSkill(), breath.level(), breath.getOwner(), pos.x(), pos.y() + 1, pos.z()).isFalse()) {
                breath.level().setBlockAndUpdate(blockPos.above(), IafBlocks.DRAGON_ICE_SPIKES.get().defaultBlockState());
                TensuraSkillEvents.SKILL_GRIEF_POS.invoker().grief(breath.getSkill(), breath.level(), breath.getOwner(), pos.x(), pos.y() + 1, pos.z());
            }
        }
    }
}

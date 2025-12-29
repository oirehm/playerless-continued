package com.oirehm.playerless.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "shouldAlwaysDropExperience", at = @At("HEAD"), cancellable = true)
    private void alwaysDropExperience(CallbackInfoReturnable < Boolean > cir) {

        cir.setReturnValue(true);
    }

    @Inject(method = "shouldDropLoot", at = @At("HEAD"), cancellable = true)
    private void alwaysDropLoot(CallbackInfoReturnable < Boolean > cir) {

        cir.setReturnValue(true);
    }
}
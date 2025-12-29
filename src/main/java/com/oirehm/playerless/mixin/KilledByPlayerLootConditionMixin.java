package com.oirehm.playerless.mixin;

import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.context.LootContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(KilledByPlayerLootCondition.class)
public class KilledByPlayerLootConditionMixin {

    @Inject(method = "test(Lnet/minecraft/loot/context/LootContext;)Z", at = @At("HEAD"), cancellable = true)
    private void alwaysReturnTrue(LootContext context, CallbackInfoReturnable < Boolean > cir) {

        cir.setReturnValue(true);
    }
}
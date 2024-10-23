package org.Miko0187.nonoban.client.mixins;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ForceEnableRealms {
    @Inject(at = @At("HEAD"), method = "isRealmsEnabled", cancellable = true)
    private void isRealmsEnabled(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}

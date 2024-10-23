package org.Miko0187.nonoban.client.mixins;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class DisableTememetry {
    @Inject(at = @At("HEAD"), method = "isTelemetryEnabledByApi", cancellable = true)
    private void isTelemetryEnabledByApi(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isOptionalTelemetryEnabledByApi", cancellable = true)
    private void isOptionalTelemetryEnabledByApi(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isOptionalTelemetryEnabled", cancellable = true)
    private void isOptionalTelemetryEnabled(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}

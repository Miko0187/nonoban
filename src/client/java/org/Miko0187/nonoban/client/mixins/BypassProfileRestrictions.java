package org.Miko0187.nonoban.client.mixins;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.function.Function;

@Mixin(MinecraftClient.class)
public class BypassProfileRestrictions {
    @Inject(at = @At("HEAD"), method = "createInitScreens", cancellable = true)
    private void createInitScreens(List<Function<Runnable, Screen>> list, CallbackInfo ci) {
        ci.cancel();
    }
}

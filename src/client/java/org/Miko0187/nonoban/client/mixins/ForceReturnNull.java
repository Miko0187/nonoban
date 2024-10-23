package org.Miko0187.nonoban.client.mixins;

import com.mojang.authlib.minecraft.BanDetails;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ForceReturnNull {
    @Inject(at = @At("HEAD"), method = "getMultiplayerBanDetails", cancellable = true)
    private void getMultiplayerBanDetails(CallbackInfoReturnable<BanDetails> cir) {
        cir.setReturnValue(null);
    }
}

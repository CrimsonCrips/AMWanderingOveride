package org.amoverride.amoverride.mixin;

import com.github.alexthe666.alexsmobs.client.event.ClientEvents;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(ClientEvents.class)
public abstract class AMOverrideMixin {

    @ModifyExpressionValue(method = "onPreRenderEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;getVehicle()Lnet/minecraft/world/entity/Entity;"))
    private Entity amoverride$onPreRenderEntity(Entity original) {
        return null;
    }
}

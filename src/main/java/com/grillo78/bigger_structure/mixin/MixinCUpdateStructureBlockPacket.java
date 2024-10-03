package com.grillo78.bigger_structure.mixin;

import com.grillo78.bigger_structure.Config;
import net.minecraft.network.protocol.game.ServerboundSetStructureBlockPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerboundSetStructureBlockPacket.class)
public class MixinCUpdateStructureBlockPacket {

    @ModifyConstant(method = "<init>(Lnet/minecraft/network/FriendlyByteBuf;)V", constant = {@Constant(intValue = 48), @Constant(intValue = -48)})
    private int modifyReadSizes(int original) {
        return original < 0 ? -Config.COMMON.maxStructureSize.get() : Config.COMMON.maxStructureSize.get();
    }
}

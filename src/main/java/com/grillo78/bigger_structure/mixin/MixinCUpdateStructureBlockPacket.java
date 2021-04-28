package com.grillo78.bigger_structure.mixin;

import com.grillo78.bigger_structure.Config;
import net.minecraft.network.play.client.CUpdateStructureBlockPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CUpdateStructureBlockPacket.class)
public class MixinCUpdateStructureBlockPacket {

    @ModifyConstant(method = "read", constant = {@Constant(intValue = 48), @Constant(intValue = -48)})
    private int modifyReadSizes(int original) {
        return original < 0 ? -Config.COMMON.maxStructureSize.get() : Config.COMMON.maxStructureSize.get();
    }
}

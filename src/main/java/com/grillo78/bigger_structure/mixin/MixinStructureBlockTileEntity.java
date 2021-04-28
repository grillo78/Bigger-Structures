package com.grillo78.bigger_structure.mixin;

import com.grillo78.bigger_structure.BiggerStructures;
import com.grillo78.bigger_structure.Config;
import net.minecraft.tileentity.StructureBlockTileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(StructureBlockTileEntity.class)
public class MixinStructureBlockTileEntity {

    @ModifyConstant(method = "load", constant = {@Constant(intValue = 48), @Constant(intValue = -48)})
    private int modifyLoadSizes(int original) {
        return original < 0 ? -Config.COMMON.maxStructureSize.get() : Config.COMMON.maxStructureSize.get();
    }
}

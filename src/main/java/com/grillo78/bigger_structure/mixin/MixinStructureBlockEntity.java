package com.grillo78.bigger_structure.mixin;

import com.grillo78.bigger_structure.Config;
import net.minecraft.world.level.block.entity.StructureBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(StructureBlockEntity.class)
public class MixinStructureBlockEntity {

    @ModifyConstant(method = "loadAdditional", constant = {@Constant(intValue = 48), @Constant(intValue = -48)})
    private int modifyLoadSizes(int original) {
        return original < 0 ? -Config.COMMON.maxStructureSize.get() : Config.COMMON.maxStructureSize.get();
    }

    @ModifyConstant(method = "detectSize", constant = {@Constant(intValue = 80)})
    private int modifyDetectSizes(int original) {
        return original < 0 ? -Config.COMMON.maxStructureSize.get() : Config.COMMON.maxStructureSize.get();
    }
}

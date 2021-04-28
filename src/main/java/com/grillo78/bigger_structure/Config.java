package com.grillo78.bigger_structure;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static class Common {
        public final ForgeConfigSpec.IntValue maxStructureSize;

        Common(ForgeConfigSpec.Builder builder) {
            builder.push("common"); {
                this.maxStructureSize = builder.comment("The max amount of a structure in all axis").defineInRange("maxStructureSize", 300, 0, Integer.MAX_VALUE);
            }
            builder.pop();
        }
    }

    static final ForgeConfigSpec commonSpec;
    public static final Config.Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = commonSpecPair.getRight();
        COMMON = commonSpecPair.getLeft();
    }
}

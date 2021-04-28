package com.grillo78.bigger_structure;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("bigger_structures")
public class BiggerStructures
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();


    public BiggerStructures() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonSpec);
    }
}

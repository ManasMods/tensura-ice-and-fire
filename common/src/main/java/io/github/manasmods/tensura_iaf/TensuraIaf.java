package io.github.manasmods.tensura_iaf;

import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura_iaf.registry.IafConfig;

public final class TensuraIaf {
    public static final String MOD_ID = "tensura_iaf";
    public static IafConfig CONFIG = ConfigRegistry.getConfig(IafConfig.class);

    public static void init() {
        ConfigRegistry.registerConfig(new IafConfig());
        IafHandler.init();
    }
}

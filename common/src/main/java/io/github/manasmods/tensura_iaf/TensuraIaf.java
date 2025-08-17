package io.github.manasmods.tensura_iaf;

import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura_iaf.data.IafHandler;
import io.github.manasmods.tensura_iaf.registry.IafConfig;
import io.github.manasmods.tensura_iaf.registry.IafCritereonPredicates;

public final class TensuraIaf {
    public static final String MOD_ID = "tensura_iaf";

    public static void init() {
        ConfigRegistry.registerConfig(new IafConfig());
        IafCritereonPredicates.init();
        IafHandler.init();
    }
}

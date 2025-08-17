package io.github.manasmods.tensura_iaf.registry;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;

public class IafConfig extends ManasConfig {
    @Comment("The minimum stage of Dragon to drop Dragon Essence.")
    public int minAura = 4;
    @Comment("The maximum stage of Dragon to drop Dragon Essence.")
    public int maxAura = 5;
    @Comment("The chance for Dragon to drop Dragon Essence.")
    public double essenceChance = 10;

    public String getFileName() {
        return "tensura/iaf_config";
    }
}

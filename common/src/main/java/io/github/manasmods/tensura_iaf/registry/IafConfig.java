package io.github.manasmods.tensura_iaf.registry;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;

public class IafConfig extends ManasConfig {
    @Comment("The minimum stage of Dragon to drop Dragon Essence.")
    public int minStageEssence = 4;
    @Comment("The maximum stage of Dragon to drop Dragon Essence.")
    public int maxStageEssence = 5;
    @Comment("The chance for Dragon to drop Dragon Essence.")
    public float essenceChance = 0.5F;

    public String getFileName() {
        return "tensura/iaf_config";
    }
}

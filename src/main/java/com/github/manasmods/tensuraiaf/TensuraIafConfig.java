package com.github.manasmods.tensuraiaf;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class TensuraIafConfig {
    public static final TensuraIafConfig INSTANCE;
    public static final ForgeConfigSpec SPEC;

    static {
        Pair<TensuraIafConfig, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(TensuraIafConfig::new);
        INSTANCE = pair.getKey();
        SPEC = pair.getValue();
    }

    public final ForgeConfigSpec.IntValue minDragonStageForEssence;
    public final ForgeConfigSpec.IntValue maxDragonStageForEssence;

    private TensuraIafConfig(ForgeConfigSpec.Builder builder) {
        builder.push("dragonStageForEssence");
        this.minDragonStageForEssence = builder.comment("The minimum stage of a dragon to drop a Dragon Essence")
                .defineInRange("minDragonStageForEssence", 4, 0, 10000);
        this.maxDragonStageForEssence = builder.comment("The maximum stage of a dragon to drop a Dragon Essence")
                .defineInRange("maxDragonStageForEssence", 5, 0, 10000);
        builder.pop();
    }
}

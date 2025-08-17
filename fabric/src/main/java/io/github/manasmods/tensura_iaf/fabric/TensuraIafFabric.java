package io.github.manasmods.tensura_iaf.fabric;

import io.github.manasmods.tensura_iaf.TensuraIaf;
import net.fabricmc.api.ModInitializer;

public final class TensuraIafFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TensuraIaf.init();
    }
}

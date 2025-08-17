package io.github.manasmods.tensura_iaf.neoforge;

import net.neoforged.fml.common.Mod;

import io.github.manasmods.tensura_iaf.TensuraIaf;

@Mod(TensuraIaf.MOD_ID)
public final class TensuraIafNeoForge {
    public TensuraIafNeoForge() {
        TensuraIaf.init();
    }
}

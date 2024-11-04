package com.github.manasmods.tensuraiaf.data.gen;

import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import com.github.manasmods.manascore.api.data.gen.BlockTagProvider;
import com.github.manasmods.tensura.data.TensuraTags;
import com.github.manasmods.tensuraiaf.TensuraIaF;
import net.minecraftforge.data.event.GatherDataEvent;

public class IafBlockTagProvider extends BlockTagProvider {
    public IafBlockTagProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, TensuraIaF.MOD_ID);
    }

    protected void generate() {
        tag(TensuraTags.Blocks.TRAP_BLOCKS).add(IafBlockRegistry.DRAGON_ICE_SPIKES.get());
        tag(TensuraTags.Blocks.TREASURE_BLOCKS).add(IafBlockRegistry.GHOST_CHEST.get());
    }
}

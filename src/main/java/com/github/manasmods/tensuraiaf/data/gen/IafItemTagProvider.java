package com.github.manasmods.tensuraiaf.data.gen;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.github.manasmods.manascore.api.data.gen.BlockTagProvider;
import com.github.manasmods.manascore.api.data.gen.ItemTagProvider;
import com.github.manasmods.tensura.data.TensuraTags;
import com.github.manasmods.tensuraiaf.TensuraIaF;
import net.minecraftforge.data.event.GatherDataEvent;

public class IafItemTagProvider extends ItemTagProvider {
    public IafItemTagProvider(GatherDataEvent gatherDataEvent, BlockTagProvider blockTagProvider) {
        super(gatherDataEvent, TensuraIaF.MOD_ID, blockTagProvider);
    }

    protected void generate() {
        tag(TensuraTags.Items.RAW_MONSTER_CONSUMABLES).add(IafItemRegistry.FIRE_DRAGON_FLESH.get(), IafItemRegistry.FIRE_DRAGON_HEART.get(),
                IafItemRegistry.ICE_DRAGON_FLESH.get(), IafItemRegistry.ICE_DRAGON_HEART.get(),
                IafItemRegistry.LIGHTNING_DRAGON_FLESH.get(), IafItemRegistry.LIGHTNING_DRAGON_HEART.get(),
                IafItemRegistry.HYDRA_HEART.get());
        tag(TensuraTags.Items.DUBIOUS_EFFECT_INGREDIENT).add(IafItemRegistry.LIGHTNING_STEW.get(),
                IafItemRegistry.FIRE_STEW.get(), IafItemRegistry.FROST_STEW.get(), IafItemRegistry.AMBROSIA.get());
        tag(TensuraTags.Items.DUBIOUS_BREWING_INGREDIENT).add(IafItemRegistry.SIREN_TEAR.get());
        tag(TensuraTags.Items.DUBIOUS_POISON_INGREDIENT).add(IafItemRegistry.ROTTEN_EGG.get(),
                IafItemRegistry.COCKATRICE_EYE.get(), IafItemRegistry.HYDRA_FANG.get());
        tag(TensuraTags.Items.DUBIOUS_MAGIC_INGREDIENT).add(IafItemRegistry.PIXIE_WINGS.get(), IafItemRegistry.ECTOPLASM.get());
        tag(TensuraTags.Items.DUBIOUS_CRYSTAL_INGREDIENT).add(IafItemRegistry.SUMMONING_CRYSTAL_FIRE.get(),
                IafItemRegistry.SUMMONING_CRYSTAL_ICE.get(), IafItemRegistry.SUMMONING_CRYSTAL_LIGHTNING.get());
    }
}

package com.github.manasmods.tensuraiaf.data.gen;

import com.github.alexthe666.iceandfire.datagen.tags.IafEntityTags;
import com.github.alexthe666.iceandfire.entity.IafEntityRegistry;
import com.github.manasmods.tensura.data.TensuraTags;
import com.github.manasmods.tensura.registry.entity.TensuraEntityTypes;
import com.github.manasmods.tensuraiaf.TensuraIaF;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.Nullable;

public class IafEntityTypeTagProvider extends EntityTypeTagsProvider {
    public IafEntityTypeTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }
    public IafEntityTypeTagProvider(GatherDataEvent gatherDataEvent) {
        this(gatherDataEvent.getGenerator(), TensuraIaF.MOD_ID, gatherDataEvent.getExistingFileHelper());
    }

    protected void addTags() {
        tag(TensuraTags.EntityTypes.DROP_CRYSTAL).add(IafEntityRegistry.AMPHITHERE.get(), IafEntityRegistry.COCKATRICE.get(),
                IafEntityRegistry.CYCLOPS.get(), IafEntityRegistry.DEATH_WORM.get(), IafEntityRegistry.DREAD_BEAST.get(),
                IafEntityRegistry.DREAD_GHOUL.get(), IafEntityRegistry.DREAD_KNIGHT.get(), IafEntityRegistry.DREAD_LICH.get(),
                IafEntityRegistry.DREAD_SCUTTLER.get(), IafEntityRegistry.DREAD_THRALL.get(), IafEntityRegistry.FIRE_DRAGON.get(),
                IafEntityRegistry.GHOST.get(), IafEntityRegistry.GORGON.get(), IafEntityRegistry.HIPPOCAMPUS.get(),
                IafEntityRegistry.HIPPOGRYPH.get(), IafEntityRegistry.HYDRA.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.LIGHTNING_DRAGON.get(), IafEntityRegistry.MYRMEX_QUEEN.get(), IafEntityRegistry.MYRMEX_ROYAL.get(),
                IafEntityRegistry.MYRMEX_SENTINEL.get(), IafEntityRegistry.MYRMEX_SOLDIER.get(), IafEntityRegistry.MYRMEX_SOLDIER.get(),
                IafEntityRegistry.MYRMEX_WORKER.get(), IafEntityRegistry.PIXIE.get(), IafEntityRegistry.SEA_SERPENT.get(),
                IafEntityRegistry.SIREN.get(), IafEntityRegistry.STYMPHALIAN_BIRD.get(), IafEntityRegistry.TROLL.get());

        tag(TensuraTags.EntityTypes.NAMEABLE).add(IafEntityRegistry.AMPHITHERE.get(), IafEntityRegistry.COCKATRICE.get(),
                IafEntityRegistry.DEATH_WORM.get(), IafEntityRegistry.HIPPOCAMPUS.get(), IafEntityRegistry.HIPPOGRYPH.get(),
                IafEntityRegistry.PIXIE.get(), IafEntityRegistry.FIRE_DRAGON.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.LIGHTNING_DRAGON.get());

        tag(TensuraTags.EntityTypes.HERO_BOSS).add(IafEntityRegistry.FIRE_DRAGON.get(), IafEntityRegistry.DREAD_LICH.get(),
                IafEntityRegistry.GORGON.get(), IafEntityRegistry.HYDRA.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.LIGHTNING_DRAGON.get());
        tag(TensuraTags.EntityTypes.FULL_GRAVITY_CONTROL).add(IafEntityRegistry.FIRE_DRAGON.get(),
                IafEntityRegistry.DREAD_LICH.get(), IafEntityRegistry.LIGHTNING_DRAGON.get());

        tag(TensuraTags.EntityTypes.NO_FEAR).add(IafEntityRegistry.FIRE_DRAGON.get(), IafEntityRegistry.DREAD_LICH.get(),
                IafEntityRegistry.GORGON.get(), IafEntityRegistry.HYDRA.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.LIGHTNING_DRAGON.get(), IafEntityRegistry.MYRMEX_QUEEN.get());
        tag(TensuraTags.EntityTypes.NO_POSSESSION).add(IafEntityRegistry.FIRE_DRAGON.get(), IafEntityRegistry.DREAD_LICH.get(),
                IafEntityRegistry.GORGON.get(), IafEntityRegistry.HYDRA.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.LIGHTNING_DRAGON.get(), IafEntityRegistry.MYRMEX_QUEEN.get());
        tag(TensuraTags.EntityTypes.NO_MIND_CONTROL).add(IafEntityRegistry.FIRE_DRAGON.get(), IafEntityRegistry.DREAD_LICH.get(),
                IafEntityRegistry.GORGON.get(), IafEntityRegistry.HYDRA.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.LIGHTNING_DRAGON.get(), IafEntityRegistry.MYRMEX_QUEEN.get());

        tag(TensuraTags.EntityTypes.NO_CHARISMA).add(IafEntityRegistry.COCKATRICE.get(),
                IafEntityRegistry.CYCLOPS.get(), IafEntityRegistry.DEATH_WORM.get(), IafEntityRegistry.DREAD_BEAST.get(),
                IafEntityRegistry.DREAD_GHOUL.get(), IafEntityRegistry.DREAD_KNIGHT.get(), IafEntityRegistry.DREAD_LICH.get(), IafEntityRegistry.DREAD_HORSE.get(),
                IafEntityRegistry.DREAD_SCUTTLER.get(), IafEntityRegistry.DREAD_THRALL.get(), IafEntityRegistry.FIRE_DRAGON.get(),
                IafEntityRegistry.GHOST.get(), IafEntityRegistry.GORGON.get(), IafEntityRegistry.HYDRA.get(),
                IafEntityRegistry.ICE_DRAGON.get(), IafEntityRegistry.LIGHTNING_DRAGON.get(), IafEntityRegistry.MYRMEX_QUEEN.get(),
                IafEntityRegistry.MYRMEX_ROYAL.get(), IafEntityRegistry.MYRMEX_SENTINEL.get(), IafEntityRegistry.MYRMEX_SOLDIER.get(),
                IafEntityRegistry.MYRMEX_SOLDIER.get(), IafEntityRegistry.MYRMEX_WORKER.get(), IafEntityRegistry.SEA_SERPENT.get(),
                IafEntityRegistry.SIREN.get(), IafEntityRegistry.STYMPHALIAN_BIRD.get(), IafEntityRegistry.TROLL.get());

        tag(TensuraTags.EntityTypes.SPIRITUAL).add(IafEntityRegistry.GHOST.get(), IafEntityRegistry.PIXIE.get());
        tag(TensuraTags.EntityTypes.UNDEAD).add(IafEntityRegistry.DREAD_BEAST.get(), IafEntityRegistry.DREAD_GHOUL.get(),
                IafEntityRegistry.DREAD_KNIGHT.get(), IafEntityRegistry.DREAD_LICH.get(), IafEntityRegistry.DREAD_SCUTTLER.get(),
                IafEntityRegistry.DREAD_THRALL.get(), IafEntityRegistry.DREAD_HORSE.get(), IafEntityRegistry.GHOST.get());

        tag(TensuraTags.EntityTypes.NO_SOUND).add(IafEntityRegistry.DRAGON_EGG.get(), IafEntityRegistry.DRAGON_SKULL.get(),
                IafEntityRegistry.HIPPOGRYPH_EGG.get(), IafEntityRegistry.STONE_STATUE.get(), IafEntityRegistry.DEATH_WORM_EGG.get(),
                IafEntityRegistry.COCKATRICE_EGG.get(), IafEntityRegistry.STYMPHALIAN_FEATHER.get(), IafEntityRegistry.MYRMEX_EGG.get(),
                IafEntityRegistry.SEA_SERPENT_BUBBLES.get(), IafEntityRegistry.CHAIN_TIE.get(), IafEntityRegistry.MOB_SKULL.get());
        tag(TensuraTags.EntityTypes.NO_BLOOD).add(IafEntityRegistry.DEATH_WORM.get(), IafEntityRegistry.MYRMEX_QUEEN.get(),
                IafEntityRegistry.MYRMEX_ROYAL.get(), IafEntityRegistry.MYRMEX_SENTINEL.get(), IafEntityRegistry.MYRMEX_SOLDIER.get(),
                IafEntityRegistry.MYRMEX_SOLDIER.get(), IafEntityRegistry.MYRMEX_WORKER.get());
        tag(TensuraTags.EntityTypes.COLD_BLOODED).add(IafEntityRegistry.HIPPOCAMPUS.get(), IafEntityRegistry.SEA_SERPENT.get(),
                IafEntityRegistry.SIREN.get(), IafEntityRegistry.HYDRA.get(), IafEntityRegistry.ICE_DRAGON.get(),
                IafEntityRegistry.FIRE_DRAGON.get(), IafEntityRegistry.LIGHTNING_DRAGON.get(), IafEntityRegistry.ICE_DRAGON.get());
        tag(TensuraTags.EntityTypes.COLD_SOURCE).add(IafEntityRegistry.DREAD_BEAST.get(), IafEntityRegistry.DREAD_GHOUL.get(),
                IafEntityRegistry.DREAD_KNIGHT.get(), IafEntityRegistry.DREAD_HORSE.get(), IafEntityRegistry.DREAD_LICH.get(),
                IafEntityRegistry.DREAD_SCUTTLER.get(), IafEntityRegistry.DREAD_THRALL.get(), IafEntityRegistry.GHOST.get(),
                IafEntityRegistry.ICE_DRAGON.get());

        tag(IafEntityTags.IMMUNE_TO_GORGON_STONE).addTag(TensuraTags.EntityTypes.SPIRITUAL)
                .add(TensuraEntityTypes.ELEMENTAL_COLOSSUS.get(), TensuraEntityTypes.HINATA_SAKAGUCHI.get(),
                        TensuraEntityTypes.CHARYBDIS.get());
    }
}

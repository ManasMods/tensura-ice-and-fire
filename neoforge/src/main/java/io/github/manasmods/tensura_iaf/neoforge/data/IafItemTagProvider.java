package io.github.manasmods.tensura_iaf.neoforge.data;

import com.iafenvoy.iceandfire.registry.IafItems;
import io.github.manasmods.tensura.data.TensuraItemTags;
import io.github.manasmods.tensura_iaf.TensuraIaf;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class IafItemTagProvider extends ItemTagsProvider {

	public IafItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future,
							  CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper helper) {
		super(output, future, provider, TensuraIaf.MOD_ID, helper);
	}

	protected void addTags(HolderLookup.Provider arg) {
		tag(TensuraItemTags.RAW_MONSTER_CONSUMABLES).add(IafItems.FIRE_DRAGON_FLESH.get(), IafItems.FIRE_DRAGON_HEART.get(),
				IafItems.ICE_DRAGON_FLESH.get(), IafItems.ICE_DRAGON_HEART.get(),
				IafItems.LIGHTNING_DRAGON_FLESH.get(), IafItems.LIGHTNING_DRAGON_HEART.get(),
				IafItems.HYDRA_HEART.get());
		tag(TensuraItemTags.DUBIOUS_EFFECT_INGREDIENT).add(IafItems.LIGHTNING_STEW.get(),
				IafItems.FIRE_STEW.get(), IafItems.FROST_STEW.get(), IafItems.AMBROSIA.get());
		tag(TensuraItemTags.DUBIOUS_BREWING_INGREDIENT).add(IafItems.SIREN_TEAR.get());
		tag(TensuraItemTags.DUBIOUS_POISON_INGREDIENT).add(IafItems.ROTTEN_EGG.get(),
				IafItems.COCKATRICE_EYE.get(), IafItems.HYDRA_FANG.get());
		tag(TensuraItemTags.DUBIOUS_MAGIC_INGREDIENT).add(IafItems.PIXIE_WINGS.get(), IafItems.ECTOPLASM.get());
		tag(TensuraItemTags.DUBIOUS_CRYSTAL_INGREDIENT).add(IafItems.SUMMONING_CRYSTAL_FIRE.get(),
				IafItems.SUMMONING_CRYSTAL_ICE.get(), IafItems.SUMMONING_CRYSTAL_LIGHTNING.get());
	}
}

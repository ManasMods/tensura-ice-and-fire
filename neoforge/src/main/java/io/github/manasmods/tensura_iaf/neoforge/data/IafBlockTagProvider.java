package io.github.manasmods.tensura_iaf.neoforge.data;

import com.iafenvoy.iceandfire.registry.IafBlocks;
import io.github.manasmods.tensura.data.TensuraBlockTags;
import io.github.manasmods.tensura_iaf.TensuraIaf;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class IafBlockTagProvider extends BlockTagsProvider {

	public IafBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture,
							   @Nullable ExistingFileHelper existingFileHelper) {
		super(output, completableFuture, TensuraIaf.MOD_ID, existingFileHelper);
	}

	protected void addTags(HolderLookup.Provider arg) {
		tag(TensuraBlockTags.TRAP_BLOCKS).add(IafBlocks.DRAGON_ICE_SPIKES.get());
		tag(TensuraBlockTags.TREASURE_BLOCKS).add(IafBlocks.GHOST_CHEST.get());
	}
}

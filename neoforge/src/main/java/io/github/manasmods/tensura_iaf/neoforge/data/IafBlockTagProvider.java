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
        tag(TensuraBlockTags.HEAT_SOURCE_BLOCKS).add(IafBlocks.DRAGONFORGE_FIRE_CORE.get(), IafBlocks.DRAGONFORGE_LIGHTNING_CORE.get());
		tag(TensuraBlockTags.TRAP_BLOCKS).add(IafBlocks.DRAGON_ICE_SPIKES.get());
		tag(TensuraBlockTags.TREASURE_BLOCKS).add(IafBlocks.GHOST_CHEST.get());
		tag(TensuraBlockTags.SKILL_UNBREAKABLE).add(IafBlocks.DREAD_SPAWNER.get(),
				IafBlocks.DREAD_PORTAL.get(), IafBlocks.DREAD_STONE.get(), IafBlocks.DREAD_STONE_BRICKS.get(),
				IafBlocks.DREAD_STONE_BRICKS_STAIRS.get(), IafBlocks.DREAD_STONE_BRICKS_SLAB.get(),
				IafBlocks.DREAD_STONE_BRICKS_CHISELED.get(), IafBlocks.DREAD_STONE_BRICKS_CRACKED.get(),
				IafBlocks.DREAD_STONE_BRICKS_MOSSY.get(), IafBlocks.DREAD_STONE_TILE.get(),
				IafBlocks.DREAD_STONE_FACE.get(), IafBlocks.DREAD_TORCH_WALL.get(),
				IafBlocks.DREAD_TORCH.get(), IafBlocks.DREADWOOD_LOG.get(),
				IafBlocks.DREADWOOD_PLANKS.get(), IafBlocks.DREADWOOD_PLANKS_LOCK.get());
        tag(TensuraBlockTags.SKILL_UNOBTAINABLE).add(IafBlocks.DREAD_SPAWNER.get(),
                IafBlocks.DREAD_PORTAL.get(), IafBlocks.DREAD_STONE.get(), IafBlocks.DREAD_STONE_BRICKS.get(),
                IafBlocks.DREAD_STONE_BRICKS_STAIRS.get(), IafBlocks.DREAD_STONE_BRICKS_SLAB.get(),
                IafBlocks.DREAD_STONE_BRICKS_CHISELED.get(), IafBlocks.DREAD_STONE_BRICKS_CRACKED.get(),
                IafBlocks.DREAD_STONE_BRICKS_MOSSY.get(), IafBlocks.DREAD_STONE_TILE.get(),
                IafBlocks.DREAD_STONE_FACE.get(), IafBlocks.DREAD_TORCH_WALL.get(),
                IafBlocks.DREAD_TORCH.get(), IafBlocks.DREADWOOD_LOG.get(),
                IafBlocks.DREADWOOD_PLANKS.get(), IafBlocks.DREADWOOD_PLANKS_LOCK.get());
	}
}

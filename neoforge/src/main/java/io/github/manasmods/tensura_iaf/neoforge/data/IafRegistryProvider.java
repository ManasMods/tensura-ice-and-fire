package io.github.manasmods.tensura_iaf.neoforge.data;

import com.iafenvoy.iceandfire.IceAndFire;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import io.github.manasmods.tensura_iaf.TensuraIaf;
import io.github.manasmods.tensura_iaf.data.IafEntityExistenceData;
import io.github.manasmods.tensura_iaf.data.IafGearExistenceData;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class IafRegistryProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(TensuraCustomData.ENTITY_EXISTENCE, IafEntityExistenceData::bootstrap)
            .add(TensuraCustomData.GEAR_EXISTENCE, IafGearExistenceData::bootstrap);

    public IafRegistryProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(TensuraIaf.MOD_ID, IceAndFire.MOD_ID));
    }
}

package io.github.manasmods.tensura_iaf.data;

import com.iafenvoy.iceandfire.registry.IafWorld;
import io.github.manasmods.tensura.data.chunk.DataPackMagiculeModifier;
import io.github.manasmods.tensura.data.chunk.LevelMagiculeModifier;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

import java.util.List;

public class IafLevelMagiculeModifiers {
    public static void bootstrap(BootstrapContext<LevelMagiculeModifier> context) {
        register(context, new LevelMagiculeModifier(IafWorld.DREAD_LAND.location(), 0,
                List.of(new DataPackMagiculeModifier(DataPackMagiculeModifier.Mode.ADD, 50000)),
                List.of(new DataPackMagiculeModifier(DataPackMagiculeModifier.Mode.MULTIPLY, 2))));
    }

    public static void register(BootstrapContext<LevelMagiculeModifier> context, LevelMagiculeModifier data) {
        ResourceKey<LevelMagiculeModifier> key = ResourceKey.create(TensuraCustomData.LEVEL_MAGICULE, data.worldId());
        context.register(key, data);
    }
}
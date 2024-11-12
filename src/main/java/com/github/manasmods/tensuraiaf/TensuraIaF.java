package com.github.manasmods.tensuraiaf;

import com.github.manasmods.tensuraiaf.data.gen.*;
import com.github.manasmods.tensuraiaf.registry.IafRegistry;
import lombok.Getter;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.loading.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TensuraIaF.MOD_ID)
public class TensuraIaF {
    public static final String MOD_ID = "tensuraiaf";
    public static final String CONFIG_DIR = "tensura-reincarnated";
    @Getter
    private static final Logger LOGGER = LogManager.getLogger();

    public TensuraIaF() {
        FileUtils.getOrCreateDirectory(FMLPaths.CONFIGDIR.get().resolve(CONFIG_DIR), CONFIG_DIR);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TensuraIafConfig.SPEC, getConfigFileName("iaf_common"));

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IafRegistry.register(modEventBus);
        modEventBus.addListener(this::generateData);
    }

    private void generateData(final GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeServer(), new IafEntityEPProvider(event));
        event.getGenerator().addProvider(event.includeServer(), new IafEntityTypeTagProvider(event));
        event.getGenerator().addProvider(event.includeServer(), new IafLanguageProvider(event));
        event.getGenerator().addProvider(event.includeServer(), new IafGearEpProvider(event));

        IafBlockTagProvider provider = new IafBlockTagProvider(event);
        event.getGenerator().addProvider(event.includeServer(), provider);
        event.getGenerator().addProvider(event.includeServer(), new IafItemTagProvider(event, provider));
    }

    private String getConfigFileName(String name) {
        return String.format("%s/%s.toml", CONFIG_DIR, name);
    }
}

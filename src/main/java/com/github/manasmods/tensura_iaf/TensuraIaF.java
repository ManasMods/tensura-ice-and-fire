package com.github.manasmods.tensura_iaf;

import com.github.manasmods.tensura_iaf.data.gen.IafEntityEPProvider;
import com.github.manasmods.tensura_iaf.data.gen.IafEntityTypeTagProvider;
import lombok.Getter;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TensuraIaF.MOD_ID)
public class TensuraIaF {
    public static final String MOD_ID = "tensura_iaf";
    @Getter
    private static final Logger LOGGER = LogManager.getLogger();

    public TensuraIaF() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::generateData);
    }

    private void generateData(final GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeServer(), new IafEntityEPProvider(event));
        event.getGenerator().addProvider(event.includeServer(), new IafEntityTypeTagProvider(event));
    }
}

package com.github.manasmods.tensuraiaf.data.gen;

import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import com.github.alexthe666.iceandfire.enums.EnumSeaSerpent;
import com.github.alexthe666.iceandfire.enums.EnumTroll;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.github.manasmods.manascore.api.data.gen.CustomDataProvider;
import com.github.manasmods.tensura.data.pack.GearEPCount;
import com.google.gson.JsonElement;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class IafGearEpProvider extends CustomDataProvider {
    public IafGearEpProvider(GatherDataEvent event) {
        super("gear/ep", event.getGenerator());
    }

    public @NotNull String getName() {
        return "Iaf Gear EP";
    }

    protected void run(BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
        GearEPCount.of(IafItemRegistry.STYMPHALIAN_DAGGER.getId(), 1000, 10000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.HIPPOGRYPH_SWORD.getId(), 1000, 10000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.PIXIE_WAND.getId(), 1000, 10000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.HIPPOCAMPUS_SLAPPER.getId(), 1000, 10000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.ITEM_COCKATRICE_SCEPTER.getId(), 5000, 20000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.AMPHITHERE_MACUAHUITL.getId(), 2000, 18000, 0.015).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.GHOST_SWORD.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.TIDE_TRIDENT.getId(), 4000, 25000, 0.015).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.DRAGONBONE_SWORD.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONBONE_PICKAXE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONBONE_SHOVEL.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONBONE_AXE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONBONE_HOE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGON_BOW.getId(), 2000, 18000, 0.015).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.DRAGONBONE_SWORD_FIRE.getId(), 6000, 25000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONBONE_SWORD_ICE.getId(), 6000, 25000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONBONE_SWORD_LIGHTNING.getId(), 6000, 25000, 0.015).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_SWORD.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_SWORD_VENOM.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_PICKAXE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_SHOVEL.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_AXE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_HOE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_HELMET.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_CHESTPLATE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_LEGGINGS.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_BOOTS.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_STAFF.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_DESERT_SWARM.getId(), 2000, 18000, 0.015).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_SWORD.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_SWORD_VENOM.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_PICKAXE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_SHOVEL.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_AXE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_HOE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_HELMET.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_CHESTPLATE.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_LEGGINGS.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_BOOTS.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_STAFF.getId(), 2000, 18000, 0.015).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.MYRMEX_JUNGLE_SWARM.getId(), 2000, 18000, 0.015).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.DEATHWORM_RED_HELMET.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_RED_CHESTPLATE.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_RED_LEGGINGS.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_RED_BOOTS.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_WHITE_HELMET.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_WHITE_CHESTPLATE.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_WHITE_LEGGINGS.getId(), 1000, 5000, 0.01).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DEATHWORM_WHITE_BOOTS.getId(), 1000, 5000, 0.01).buildJson(biConsumer);

        for (EnumDragonArmor dragonArmor : EnumDragonArmor.values()) {
            GearEPCount.of(dragonArmor.helmet.getId(), 6000, 1000000, 0.02).buildJson(biConsumer);
            GearEPCount.of(dragonArmor.chestplate.getId(), 6000, 1000000, 0.02).buildJson(biConsumer);
            GearEPCount.of(dragonArmor.leggings.getId(), 6000, 1000000, 0.02).buildJson(biConsumer);
            GearEPCount.of(dragonArmor.boots.getId(), 6000, 1000000, 0.02).buildJson(biConsumer);
        }

        for (EnumSeaSerpent seaSerpent : EnumSeaSerpent.values()) {
            GearEPCount.of(seaSerpent.helmet.getId(), 8000, 80000, 0.025).buildJson(biConsumer);
            GearEPCount.of(seaSerpent.chestplate.getId(), 8000, 80000, 0.025).buildJson(biConsumer);
            GearEPCount.of(seaSerpent.leggings.getId(), 8000, 80000, 0.025).buildJson(biConsumer);
            GearEPCount.of(seaSerpent.boots.getId(), 8000, 80000, 0.025).buildJson(biConsumer);
        }

        for (EnumTroll troll : EnumTroll.values()) {
            GearEPCount.of(ForgeRegistries.ITEMS.getKey(troll.helmet.get()), 5000, 8000, 0.02).buildJson(biConsumer);
            GearEPCount.of(ForgeRegistries.ITEMS.getKey(troll.chestplate.get()), 5000, 8000, 0.02).buildJson(biConsumer);
            GearEPCount.of(ForgeRegistries.ITEMS.getKey(troll.leggings.get()), 5000, 8000, 0.02).buildJson(biConsumer);
            GearEPCount.of(ForgeRegistries.ITEMS.getKey(troll.boots.get()), 5000, 8000, 0.02).buildJson(biConsumer);
        }
        for (EnumTroll.Weapon troll : EnumTroll.Weapon.values()) {
            GearEPCount.of(ForgeRegistries.ITEMS.getKey(troll.item.get()), 5000, 80000, 0.02).buildJson(biConsumer);
        }

        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_SWORD.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_PICKAXE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_SHOVEL.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_AXE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_HOE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_HELMET.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_CHESTPLATE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_LEGGINGS.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_FIRE_BOOTS.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_SWORD.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_PICKAXE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_SHOVEL.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_AXE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_HOE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_HELMET.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_CHESTPLATE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_LEGGINGS.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_ICE_BOOTS.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);

        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_SWORD.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_PICKAXE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_SHOVEL.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_AXE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_HOE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_HELMET.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_CHESTPLATE.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_LEGGINGS.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_BOOTS.getId(), 48000, 1000000, 0.03).buildJson(biConsumer);
    }
}

package com.github.manasmods.tensura_iaf.data.gen;

import com.github.alexthe666.iceandfire.entity.IafEntityRegistry;
import com.github.manasmods.manascore.api.data.gen.CustomDataProvider;
import com.github.manasmods.tensura.data.pack.EntityEPCount;
import com.github.manasmods.tensura.registry.skill.CommonSkills;
import com.github.manasmods.tensura.registry.skill.ExtraSkills;
import com.github.manasmods.tensura.registry.skill.IntrinsicSkills;
import com.github.manasmods.tensura.registry.skill.ResistanceSkills;
import com.google.gson.JsonElement;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class IafEntityEPProvider extends CustomDataProvider {
    public IafEntityEPProvider(GatherDataEvent gatherDataEvent) {
        super("entity/ep", gatherDataEvent.getGenerator());
    }

    public String getName() {
        return "Ice & Fire Entity EP";
    }

    protected void run(BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.AMPHITHERE.get()), 2500, 3500).buildJson(biConsumer);

        List<ResourceLocation> cockatriceList = new ArrayList<>();
        cockatriceList.add(CommonSkills.CORROSION.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.COCKATRICE.get()), 6000, 8000, cockatriceList).buildJson(biConsumer);

        List<ResourceLocation> cyclopsList = new ArrayList<>();
        cyclopsList.add(ExtraSkills.STRENGTHEN_BODY.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.CYCLOPS.get()), 9000, 12000, cyclopsList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DEATH_WORM.get()), 2000, 5000).buildJson(biConsumer);

        List<ResourceLocation> dreadList = new ArrayList<>();
        dreadList.add(ResistanceSkills.COLD_RESISTANCE.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_BEAST.get()), 1000, 3000, dreadList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_GHOUL.get()), 1000, 3000, dreadList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_KNIGHT.get()), 2000, 5000, dreadList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_LICH.get()), 140000, 155000, dreadList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_SCUTTLER.get()), 2000, 5000, dreadList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_THRALL.get()), 1200, 3200, dreadList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.DREAD_HORSE.get()), 1000, 3000, dreadList).buildJson(biConsumer);

        List<ResourceLocation> dragonList = new ArrayList<>();
        dragonList.add(IntrinsicSkills.DRAGON_SKIN.getId());
        dragonList.add(IntrinsicSkills.DRAGON_EYE.getId());
        dragonList.add(IntrinsicSkills.DRAGON_EAR.getId());
        List<ResourceLocation> fireDragonList = new ArrayList<>(dragonList);
        fireDragonList.add(IntrinsicSkills.FLAME_BREATH.getId());
        fireDragonList.add(ResistanceSkills.FLAME_ATTACK_RESISTANCE.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.FIRE_DRAGON.get()), 20000, 40000, fireDragonList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.GHOST.get()), 2900, 3100).buildJson(biConsumer);

        List<ResourceLocation> gorgonList = new ArrayList<>();
        gorgonList.add(ExtraSkills.SNAKE_EYE.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.GORGON.get()), 95000, 110000, gorgonList).buildJson(biConsumer);

        List<ResourceLocation> hippoList = new ArrayList<>();
        hippoList.add(IntrinsicSkills.WATER_BREATHING.getId());
        hippoList.add(CommonSkills.WATER_CURRENT_CONTROL.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.HIPPOCAMPUS.get()), 5500, 6600, hippoList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.HIPPOGRYPH.get()), 9500, 12000).buildJson(biConsumer);

        List<ResourceLocation> hydraList = new ArrayList<>();
        hydraList.add(ResistanceSkills.POISON_RESISTANCE.getId());
        hydraList.add(ResistanceSkills.WATER_ATTACK_RESISTANCE.getId());
        hydraList.add(IntrinsicSkills.POISONOUS_BREATH.getId());
        hydraList.add(CommonSkills.POISON.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.HYDRA.get()), 95000, 110000, hydraList).buildJson(biConsumer);

        List<ResourceLocation> iceDragonList = new ArrayList<>(dragonList);
        iceDragonList.add(ResistanceSkills.COLD_RESISTANCE.getId());
        iceDragonList.add(ResistanceSkills.WATER_ATTACK_RESISTANCE.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.ICE_DRAGON.get()), 20000, 40000, iceDragonList).buildJson(biConsumer);

        List<ResourceLocation> lightningDragonList = new ArrayList<>(dragonList);
        lightningDragonList.add(IntrinsicSkills.THUNDER_BREATH.getId());
        lightningDragonList.add(ResistanceSkills.WIND_ATTACK_RESISTANCE.getId());
        lightningDragonList.add(ResistanceSkills.ELECTRICITY_RESISTANCE.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.LIGHTNING_DRAGON.get()), 20000, 40000, lightningDragonList).buildJson(biConsumer);

        List<ResourceLocation> myrmexList = new ArrayList<>();
        myrmexList.add(CommonSkills.POISON.getId());
        myrmexList.add(ResistanceSkills.POISON_RESISTANCE.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.MYRMEX_QUEEN.get()), 9000, 12000, myrmexList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.MYRMEX_ROYAL.get()), 5750, 6500, myrmexList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.MYRMEX_SENTINEL.get()), 6750, 7500, myrmexList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.MYRMEX_SOLDIER.get()), 2750, 3500, myrmexList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.MYRMEX_WORKER.get()), 900, 1100, myrmexList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.PIXIE.get()), 2750, 3500).buildJson(biConsumer);

        List<ResourceLocation> serpentList = new ArrayList<>();
        serpentList.add(IntrinsicSkills.WATER_BREATHING.getId());
        serpentList.add(CommonSkills.WATER_CURRENT_CONTROL.getId());
        serpentList.add(CommonSkills.HYDRAULIC_PROPULSION.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.SEA_SERPENT.get()), 9500, 11000, serpentList).buildJson(biConsumer);

        List<ResourceLocation> sirenList = new ArrayList<>();
        sirenList.add(IntrinsicSkills.WATER_BREATHING.getId());
        sirenList.add(CommonSkills.WATER_CURRENT_CONTROL.getId());
        sirenList.add(IntrinsicSkills.CHARM.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.SIREN.get()), 3000, 3250, sirenList).buildJson(biConsumer);
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.STYMPHALIAN_BIRD.get()), 1500, 2000).buildJson(biConsumer);

        List<ResourceLocation> trollList = new ArrayList<>();
        trollList.add(CommonSkills.STRENGTH.getId());
        EntityEPCount.of(EntityType.getKey(IafEntityRegistry.TROLL.get()), 5750, 6500, trollList).buildJson(biConsumer);
    }
}

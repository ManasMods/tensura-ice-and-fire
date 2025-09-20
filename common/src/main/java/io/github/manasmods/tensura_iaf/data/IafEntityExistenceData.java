package io.github.manasmods.tensura_iaf.data;

import com.iafenvoy.iceandfire.registry.IafEntities;
import io.github.manasmods.tensura.data.existence.EntityExistenceData;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import io.github.manasmods.tensura.registry.skill.CommonSkills;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.registry.skill.IntrinsicSkills;
import io.github.manasmods.tensura.registry.skill.ResistanceSkills;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class IafEntityExistenceData {
	public static void bootstrap(BootstrapContext<EntityExistenceData> context) {
		register(context, EntityExistenceData.getDefault(IafEntities.AMPHITHERE.getId(), 200, 2500, 3500, 250, 500));
		
		List<ResourceLocation> cockatriceList = new ArrayList<>();
		cockatriceList.add(CommonSkills.CORROSION.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.COCKATRICE.getId(), 80, 5000, 6000, 1000, 2000, cockatriceList));

		List<ResourceLocation> cyclopsList = new ArrayList<>();
		cyclopsList.add(ExtraSkills.STRENGTHEN_BODY.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.CYCLOPS.getId(), 500, 6000, 8000, 3000, 4000, cyclopsList));
		register(context, EntityExistenceData.getDefault(IafEntities.DEATH_WORM.getId(), 60, 2000, 5000));

		List<ResourceLocation> dreadList = new ArrayList<>();
		dreadList.add(ResistanceSkills.COLD_RESISTANCE.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_BEAST.getId(), 60, 1000, 3000, dreadList));
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_GHOUL.getId(), 60, 1000, 3000, dreadList));
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_KNIGHT.getId(), 100, 2000, 5000, dreadList));
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_LICH.getId(), 500, 140000, 155000, dreadList));
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_SCUTTLER.getId(), 100, 2000, 5000, dreadList));
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_THRALL.getId(), 120, 1200, 3200, dreadList));
		register(context, EntityExistenceData.getDefault(IafEntities.DREAD_HORSE.getId(), 120, 1000, 3000, dreadList));

		List<ResourceLocation> dragonList = new ArrayList<>();
		dragonList.add(IntrinsicSkills.DRAGON_SKIN.getId());
		dragonList.add(IntrinsicSkills.DRAGON_EYE.getId());
		dragonList.add(IntrinsicSkills.DRAGON_EAR.getId());

		List<ResourceLocation> fireDragonList = new ArrayList<>(dragonList);
		fireDragonList.add(IntrinsicSkills.FLAME_BREATH.getId());
		fireDragonList.add(ResistanceSkills.FLAME_ATTACK_RESISTANCE.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.FIRE_DRAGON.getId(), 2000, 20000, 30000, 10000, 10000, fireDragonList));
		register(context, EntityExistenceData.getDefault(IafEntities.GHOST.getId(), 100, 2900, 3100));

		List<ResourceLocation> gorgonList = new ArrayList<>();
		gorgonList.add(ExtraSkills.SNAKE_EYE.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.GORGON.getId(), 2000, 85000, 91000, 10000, 20000, gorgonList));

		List<ResourceLocation> hippoList = new ArrayList<>();
		hippoList.add(IntrinsicSkills.WATER_BREATHING.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.HIPPOCAMPUS.getId(), 100, 4500, 5600, 1000, 1000, hippoList));
		register(context, EntityExistenceData.getDefault(IafEntities.HIPPOGRYPH.getId(), 120, 8500, 10000, 1000, 2000));

		List<ResourceLocation> hydraList = new ArrayList<>();
		hydraList.add(ResistanceSkills.POISON_RESISTANCE.getId());
		hydraList.add(ResistanceSkills.WATER_ATTACK_RESISTANCE.getId());
		hydraList.add(IntrinsicSkills.POISONOUS_BREATH.getId());
		hydraList.add(CommonSkills.POISON.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.HYDRA.getId(), 3000, 85000, 90000, 10000, 20000, hydraList));

		List<ResourceLocation> iceDragonList = new ArrayList<>(dragonList);
		iceDragonList.add(ResistanceSkills.COLD_RESISTANCE.getId());
		iceDragonList.add(ResistanceSkills.WATER_ATTACK_RESISTANCE.getId());
		iceDragonList.add(IntrinsicSkills.ICE_BREATH.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.ICE_DRAGON.getId(), 2000, 20000, 30000, 10000, 10000, iceDragonList));

		List<ResourceLocation> lightningDragonList = new ArrayList<>(dragonList);
		lightningDragonList.add(IntrinsicSkills.THUNDER_BREATH.getId());
		lightningDragonList.add(ResistanceSkills.WIND_ATTACK_RESISTANCE.getId());
		lightningDragonList.add(ResistanceSkills.ELECTRICITY_RESISTANCE.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.LIGHTNING_DRAGON.getId(), 2000, 20000, 30000, 10000, 10000, lightningDragonList));
		register(context, EntityExistenceData.getDefault(IafEntities.PIXIE.getId(), 100, 2750, 3500));

		List<ResourceLocation> serpentList = new ArrayList<>();
		serpentList.add(IntrinsicSkills.WATER_BREATHING.getId());
		serpentList.add(CommonSkills.HYDRAULIC_PROPULSION.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.SEA_SERPENT.getId(), 1000, 8500, 9000, 1000, 2000, serpentList));

		List<ResourceLocation> sirenList = new ArrayList<>();
		sirenList.add(IntrinsicSkills.WATER_BREATHING.getId());
		sirenList.add(IntrinsicSkills.CHARM.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.SIREN.getId(), 200, 3000, 3250, sirenList));
		register(context, EntityExistenceData.getDefault(IafEntities.STYMPHALIAN_BIRD.getId(), 60, 1500, 2000, 250, 500));

		List<ResourceLocation> trollList = new ArrayList<>();
		trollList.add(CommonSkills.STRENGTH.getId());
		register(context, EntityExistenceData.getDefault(IafEntities.TROLL.getId(), 200, 5750, 6500, 250, 500, trollList));
	}

	public static void register(BootstrapContext<EntityExistenceData> context, EntityExistenceData data) {
		ResourceKey<EntityExistenceData> key = ResourceKey.create(TensuraCustomData.ENTITY_EXISTENCE, data.entity());
		context.register(key, data);
	}
}
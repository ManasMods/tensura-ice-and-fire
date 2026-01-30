package io.github.manasmods.tensura_iaf.data;

import com.iafenvoy.iceandfire.data.*;
import com.iafenvoy.iceandfire.registry.IafItems;
import com.iafenvoy.iceandfire.registry.IafRegistries;
import io.github.manasmods.tensura.data.existence.gear.GearExistenceData;
import io.github.manasmods.tensura.data.existence.gear.UniqueGearEvolutionHelper;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

public class IafGearExistenceData {
	public static void bootstrap(BootstrapContext<GearExistenceData> context) {
		register(context, GearExistenceData.getDefault(IafItems.STYMPHALIAN_DAGGER.getId(), 1000, 0.005, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.HIPPOGRYPH_SWORD.getId(), 1000, 0.005, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.PIXIE_WAND.getId(), 1000, 0.005));
		register(context, GearExistenceData.getDefault(IafItems.HIPPOCAMPUS_SLAPPER.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.COCKATRICE_SCEPTER.getId(), 5000, 0.01));
		register(context, GearExistenceData.getDefault(IafItems.AMPHITHERE_MACUAHUITL.getId(), 2000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        register(context, GearExistenceData.getDefault(IafItems.LICH_STAFF.getId(), 5000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(IafItems.DREAD_SWORD.getId(), 5000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DREAD_QUEEN_STAFF.getId(), 5000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(IafItems.DREAD_QUEEN_SWORD.getId(), 5000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        register(context, GearExistenceData.getDefault(IafItems.GHOST_SWORD.getId(), 2000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.TIDE_TRIDENT.getId(), 4000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_SWORD.getId(), 2000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_PICKAXE.getId(), 2000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_SHOVEL.getId(), 2000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_AXE.getId(), 2000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_HOE.getId(), 2000, 0.015, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGON_BOW.getId(), 2000, 0.015));

		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_SWORD_FIRE.getId(), 6000, 0.015, UniqueGearEvolutionHelper.getHighMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_SWORD_ICE.getId(), 6000, 0.015, UniqueGearEvolutionHelper.getHighMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONBONE_SWORD_LIGHTNING.getId(), 6000, 0.015, UniqueGearEvolutionHelper.getHighMagisteelWeapons()));

		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_RED_HELMET.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_RED_CHESTPLATE.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_RED_LEGGINGS.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_RED_BOOTS.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_WHITE_HELMET.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_WHITE_CHESTPLATE.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_WHITE_LEGGINGS.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DEATHWORM_WHITE_BOOTS.getId(), 1000, 0.01, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

		for (DragonColor dragonArmor : IafRegistries.DRAGON_COLOR.stream().toList()) {
			register(context, GearExistenceData.getDefault(dragonArmor.helmet.getId(), 6000, 0.02, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(dragonArmor.chestplate.getId(), 6000, 0.02, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(dragonArmor.leggings.getId(), 6000, 0.02, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(dragonArmor.boots.getId(), 6000, 0.02, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
		}

		for (SeaSerpentType seaSerpent : SeaSerpentType.values()) {
			register(context, GearExistenceData.getDefault(seaSerpent.helmet.getId(), 8000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(seaSerpent.chestplate.getId(), 8000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(seaSerpent.leggings.getId(), 8000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(seaSerpent.boots.getId(), 8000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
		}

		for (TrollType troll : TrollType.values()) {
			register(context, GearExistenceData.getDefault(troll.helmet.getId(), 5000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(troll.chestplate.getId(), 5000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(troll.leggings.getId(), 5000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
			register(context, GearExistenceData.getDefault(troll.boots.getId(), 5000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
		}
		for (TrollType.BuiltinWeapon troll : TrollType.BuiltinWeapon.values()) {
			register(context, GearExistenceData.getDefault(troll.getItem().arch$registryName(), 5000, 0.01, UniqueGearEvolutionHelper.getHighMagisteelWeapons()));
		}

		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_SWORD.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_PICKAXE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_SHOVEL.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_AXE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_HOE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_HELMET.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_CHESTPLATE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_LEGGINGS.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_FIRE_BOOTS.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));

		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_SWORD.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_PICKAXE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_SHOVEL.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_AXE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_HOE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_HELMET.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_CHESTPLATE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_LEGGINGS.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_ICE_BOOTS.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));

		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_SWORD.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_PICKAXE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_SHOVEL.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_AXE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_HOE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelWeapons()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_HELMET.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_CHESTPLATE.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_LEGGINGS.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
		register(context, GearExistenceData.getDefault(IafItems.DRAGONSTEEL_LIGHTNING_BOOTS.getId(), 48000, 0.025, UniqueGearEvolutionHelper.getPureMagisteelArmors()));
	}

	public static void register(BootstrapContext<GearExistenceData> context, GearExistenceData data) {
		ResourceKey<GearExistenceData> key = ResourceKey.create(TensuraCustomData.GEAR_EXISTENCE, data.gear());
		context.register(key, data);
	}
}
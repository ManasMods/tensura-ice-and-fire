package io.github.manasmods.tensura_iaf.neoforge.data;

import com.iafenvoy.iceandfire.registry.IafEntities;
import com.iafenvoy.iceandfire.registry.tag.IafEntityTags;
import io.github.manasmods.tensura.data.TensuraEntityTags;
import io.github.manasmods.tensura.registry.entity.HumanEntityTypes;
import io.github.manasmods.tensura.registry.entity.MonsterEntityTypes;
import io.github.manasmods.tensura_iaf.TensuraIaf;
import io.github.manasmods.tensura_iaf.data.TensuraIafEntityTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class IafEntityTypeTagProvider extends EntityTypeTagsProvider {

	public IafEntityTypeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture,
									@Nullable ExistingFileHelper existingFileHelper) {
		super(output, completableFuture, TensuraIaf.MOD_ID, existingFileHelper);
	}

	protected void addTags(@NotNull HolderLookup.Provider provider) {
		tag(TensuraIafEntityTags.CANNOT_BE_CHAINED).addTag(TensuraEntityTags.HERO_BOSS);

		tag(TensuraEntityTags.EP_INITIATE_EXCLUDED).add(IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_ENERGY_DRAIN).add(IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_EP_PLUNDER).add(IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_SKILL_PLUNDER).add(IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_SPIRITUAL_DAMAGE).add(IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.CAN_DIE_IN_LABYRINTH).add(IafEntities.STONE_STATUE.get());

		tag(TensuraEntityTags.DROP_CRYSTAL).add(IafEntities.AMPHITHERE.get(), IafEntities.COCKATRICE.get(),
				IafEntities.CYCLOPS.get(), IafEntities.DEATH_WORM.get(), IafEntities.DREAD_BEAST.get(),
				IafEntities.DREAD_GHOUL.get(), IafEntities.DREAD_KNIGHT.get(), IafEntities.DREAD_LICH.get(),
				IafEntities.DREAD_SCUTTLER.get(), IafEntities.DREAD_THRALL.get(), IafEntities.FIRE_DRAGON.get(),
				IafEntities.GHOST.get(), IafEntities.GORGON.get(), IafEntities.HIPPOCAMPUS.get(),
				IafEntities.HIPPOGRYPH.get(), IafEntities.HYDRA.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.LIGHTNING_DRAGON.get(), IafEntities.PIXIE.get(), IafEntities.SEA_SERPENT.get(),
				IafEntities.SIREN.get(), IafEntities.STYMPHALIAN_BIRD.get(), IafEntities.TROLL.get());

		tag(TensuraEntityTags.NAMEABLE).add(IafEntities.AMPHITHERE.get(), IafEntities.COCKATRICE.get(),
				IafEntities.DEATH_WORM.get(), IafEntities.HIPPOCAMPUS.get(), IafEntities.HIPPOGRYPH.get(),
				IafEntities.PIXIE.get(), IafEntities.FIRE_DRAGON.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.LIGHTNING_DRAGON.get());

		tag(TensuraEntityTags.HERO_BOSS).add(IafEntities.FIRE_DRAGON.get(), IafEntities.DREAD_LICH.get(),
				IafEntities.GORGON.get(), IafEntities.HYDRA.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.LIGHTNING_DRAGON.get());
		tag(TensuraEntityTags.FULL_GRAVITY_CONTROL).add(IafEntities.FIRE_DRAGON.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.DREAD_LICH.get(), IafEntities.LIGHTNING_DRAGON.get());

		tag(TensuraEntityTags.NO_FEAR).add(IafEntities.FIRE_DRAGON.get(), IafEntities.DREAD_LICH.get(),
				IafEntities.GORGON.get(), IafEntities.HYDRA.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.LIGHTNING_DRAGON.get(), IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_POSSESSION).add(IafEntities.FIRE_DRAGON.get(), IafEntities.DREAD_LICH.get(),
				IafEntities.GORGON.get(), IafEntities.HYDRA.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.LIGHTNING_DRAGON.get(), IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_MIND_CONTROL).add(IafEntities.FIRE_DRAGON.get(), IafEntities.DREAD_LICH.get(),
				IafEntities.GORGON.get(), IafEntities.HYDRA.get(), IafEntities.ICE_DRAGON.get(),
				IafEntities.LIGHTNING_DRAGON.get(), IafEntities.STONE_STATUE.get());

		tag(TensuraEntityTags.NO_CHARISMA).add(IafEntities.COCKATRICE.get(),
				IafEntities.CYCLOPS.get(), IafEntities.DEATH_WORM.get(), IafEntities.DREAD_BEAST.get(),
				IafEntities.DREAD_GHOUL.get(), IafEntities.DREAD_KNIGHT.get(), IafEntities.DREAD_LICH.get(), IafEntities.DREAD_HORSE.get(),
				IafEntities.DREAD_SCUTTLER.get(), IafEntities.DREAD_THRALL.get(), IafEntities.FIRE_DRAGON.get(),
				IafEntities.GHOST.get(), IafEntities.GORGON.get(), IafEntities.HYDRA.get(),
				IafEntities.ICE_DRAGON.get(), IafEntities.LIGHTNING_DRAGON.get(), IafEntities.SEA_SERPENT.get(),
				IafEntities.SIREN.get(), IafEntities.STYMPHALIAN_BIRD.get(), IafEntities.TROLL.get());

		tag(TensuraEntityTags.SPIRITUAL).add(IafEntities.GHOST.get(), IafEntities.PIXIE.get());
		tag(TensuraEntityTags.NO_SOUND).add(IafEntities.DRAGON_EGG.get(), IafEntities.DRAGON_SKULL.get(),
				IafEntities.HIPPOGRYPH_EGG.get(), IafEntities.STONE_STATUE.get(), IafEntities.DEATH_WORM_EGG.get(),
				IafEntities.COCKATRICE_EGG.get(), IafEntities.STYMPHALIAN_FEATHER.get(),
				IafEntities.SEA_SERPENT_BUBBLES.get(), IafEntities.CHAIN_TIE.get(), IafEntities.MOB_SKULL.get(),
				IafEntities.STONE_STATUE.get());
		tag(TensuraEntityTags.NO_BLOOD).add(IafEntities.DEATH_WORM.get(), IafEntities.STONE_STATUE.get());

		tag(TensuraEntityTags.COLD_BLOODED).add(IafEntities.HIPPOCAMPUS.get(), IafEntities.SEA_SERPENT.get(),
				IafEntities.SIREN.get(), IafEntities.HYDRA.get(), IafEntities.COCKATRICE.get(),
				IafEntities.FIRE_DRAGON.get(), IafEntities.LIGHTNING_DRAGON.get(), IafEntities.ICE_DRAGON.get());
		tag(TensuraEntityTags.COLD_SOURCE).add(IafEntities.DREAD_BEAST.get(), IafEntities.DREAD_GHOUL.get(),
				IafEntities.DREAD_KNIGHT.get(), IafEntities.DREAD_HORSE.get(), IafEntities.DREAD_LICH.get(),
				IafEntities.DREAD_SCUTTLER.get(), IafEntities.DREAD_THRALL.get(), IafEntities.GHOST.get(),
				IafEntities.ICE_DRAGON.get());

		tag(IafEntityTags.IMMUNE_TO_GORGON_STONE).addTag(TensuraEntityTags.SPIRITUAL)
				.add(MonsterEntityTypes.ELEMENTAL_COLOSSUS.get(), HumanEntityTypes.HINATA_SAKAGUCHI.get(), MonsterEntityTypes.CHARYBDIS.get());
		tag(IafEntityTags.CYCLOPS_UNLIFTABLES).addTag(TensuraEntityTags.HERO_BOSS)
				.add(HumanEntityTypes.HINATA_SAKAGUCHI.get());
	}
}

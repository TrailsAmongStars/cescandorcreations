package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;
import net.trailsamongstars.cescandorcreations.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {


    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ELECTRUM_BLOCK.get());
        dropSelf(ModBlocks.DEHYDRATED_SCULK.get());
        dropSelf(ModBlocks.APOLLIUM_BLOCK.get());
        dropSelf(ModBlocks.HADISIUM_BLOCK.get());
        dropSelf(ModBlocks.HEPHASTEUM_BLOCK.get());
        dropSelf(ModBlocks.IOLIUM_BLOCK.get());
        dropSelf(ModBlocks.OCEANIUM_BLOCK.get());
        dropSelf(ModBlocks.SEMELIUM_BLOCK.get());
        dropSelf(ModBlocks.TALIUM_BLOCK.get());
        dropSelf(ModBlocks.ENCHANTED_SEMELIUM_BLOCK.get());
        dropSelf(ModBlocks.UNCARVED_MUSIC_DISC_BASE.get());

        add(ModBlocks.ELECTRUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ELECTRUM_ORE.get(), ModItems.RAW_ELECTRUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

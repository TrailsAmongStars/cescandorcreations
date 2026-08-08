package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;
import net.trailsamongstars.cescandorcreations.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CescandorCreations.MOD_ID , existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ELECTRUM_BLOCK.get())
                .add(ModBlocks.ELECTRUM_BLOCK.get())
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.APOLLIUM_BLOCK.get())
                .add(ModBlocks.HADISIUM_BLOCK.get())
                .add(ModBlocks.HEPHASTEUM_BLOCK.get())
                .add(ModBlocks.IOLIUM_BLOCK.get())
                .add(ModBlocks.OCEANIUM_BLOCK.get())
                .add(ModBlocks.SEMELIUM_BLOCK.get())
                .add(ModBlocks.TALIUM_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ELECTRUM_BLOCK.get())
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.ENCHANTED_SEMELIUM_BLOCK.get());

        tag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.APOLLIUM_BLOCK.get())
                .add(ModBlocks.HADISIUM_BLOCK.get())
                .add(ModBlocks.HEPHASTEUM_BLOCK.get())
                .add(ModBlocks.IOLIUM_BLOCK.get())
                .add(ModBlocks.OCEANIUM_BLOCK.get())
                .add(ModBlocks.SEMELIUM_BLOCK.get())
                .add(ModBlocks.TALIUM_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.DEHYDRATED_SCULK.get());

        tag(ModTags.Blocks.NEEDS_ELECTRUM_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ELECTRUM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_ELECTRUM_TOOL);
    }
}

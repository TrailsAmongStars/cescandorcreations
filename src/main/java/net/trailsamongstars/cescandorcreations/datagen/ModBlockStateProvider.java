package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CescandorCreations.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ELECTRUM_BLOCK);
        blockWithItem(ModBlocks.ELECTRUM_ORE);
        blockWithItem(ModBlocks.DEHYDRATED_SCULK);
        blockWithItem(ModBlocks.APOLLIUM_BLOCK);
        blockWithItem(ModBlocks.HADISIUM_BLOCK);
        blockWithItem(ModBlocks.HEPHASTEUM_BLOCK);
        blockWithItem(ModBlocks.IOLIUM_BLOCK);
        blockWithItem(ModBlocks.OCEANIUM_BLOCK);
        blockWithItem(ModBlocks.SEMELIUM_BLOCK);
        blockWithItem(ModBlocks.TALIUM_BLOCK);
        blockWithItem(ModBlocks.ENCHANTED_SEMELIUM_BLOCK);
        blockWithItem(ModBlocks.UNCARVED_MUSIC_DISC_BASE);
        blockWithItem(ModBlocks.RESONIUM_BLOCK);
        blockWithItem(ModBlocks.RESONIUM_FRAGMENT);
        blockWithItem(ModBlocks.RESONANT_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.ALCHEMY_TABLE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}

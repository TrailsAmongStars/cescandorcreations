package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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
        dropSelf(ModBlocks.RESONIUM_BLOCK.get());
        dropSelf(ModBlocks.RESONANT_QUARTZ_BLOCK.get());

        add(ModBlocks.ELECTRUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ELECTRUM_ORE.get(), ModItems.RAW_ELECTRUM.get()));
        add(ModBlocks.RESONIUM_FRAGMENT.get(),
                block -> createMultipleOreDrops(ModBlocks.RESONIUM_FRAGMENT.get(), ModItems.RESONIUM_DUST.get(),
                        2, 5));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

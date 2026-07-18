package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.item.ModItems;
import net.trailsamongstars.cescandorcreations.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags,
                              @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, CescandorCreations.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_DYES)
                .add(Items.BLACK_DYE)
                .add(Items.BLUE_DYE)
                .add(Items.BROWN_DYE)
                .add(Items.CYAN_DYE)
                .add(Items.GRAY_DYE)
                .add(Items.GREEN_DYE)
                .add(Items.LIGHT_BLUE_DYE)
                .add(Items.LIGHT_GRAY_DYE)
                .add(Items.LIME_DYE)
                .add(Items.MAGENTA_DYE)
                .add(Items.ORANGE_DYE)
                .add(Items.PINK_DYE)
                .add(Items.PURPLE_DYE)
                .add(Items.RED_DYE)
                .add(Items.WHITE_DYE)
                .add(Items.YELLOW_DYE);

        tag(ItemTags.SWORDS)
                .add(ModItems.ELECTRUM_SWORD.get())
                .add(ModItems.DIAMOND_SCYTHE.get())
                .add(ModItems.STONE_SCYTHE.get())
                .add(ModItems.GOLDEN_SCYTHE.get())
                .add(ModItems.NETHERITE_SCYTHE.get())
                .add(ModItems.WOODEN_SCYTHE.get())
                .add(ModItems.IRON_SCYTHE.get());
        tag(ItemTags.AXES)
                .add(ModItems.ELECTRUM_AXE.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ELECTRUM_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ELECTRUM_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.ELECTRUM_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ELECTRUM_HELMET.get())
                .add(ModItems.ELECTRUM_CHESTPLATE.get())
                .add(ModItems.ELECTRUM_LEGGINGS.get())
                .add(ModItems.ELECTRUM_BOOTS.get());
    }
}

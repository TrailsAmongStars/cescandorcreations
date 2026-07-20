package net.trailsamongstars.cescandorcreations.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.trailsamongstars.cescandorcreations.CescandorCreations;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ADAMANTIUM_TOOL = createTag("needs_adamantium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMANTIUM_TOOL =
                createTag("incorrect_for_adamantium_tool");
        public static final TagKey<Block> NEEDS_ELECTRUM_TOOL = createTag("needs_electrum_tool");
        public static final TagKey<Block> INCORRECT_FOR_ELECTRUM_TOOL =
                createTag("incorrect_for_electrum_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_DYES = createTag("transformable_dyes");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, name));
        }
    }
}

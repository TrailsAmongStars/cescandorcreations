package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;
import net.trailsamongstars.cescandorcreations.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> CESCANDOR_SMELTABLES = List.of(ModItems.RAW_ELECTRUM, ModBlocks.ELECTRUM_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTRUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.APOLLIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.APOLLIUM_INGOT.get())
                .unlockedBy("has_apollium", has(ModItems.APOLLIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HADISIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.HADISIUM_INGOT.get())
                .unlockedBy("has_hadisium", has(ModItems.HADISIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HEPHASTEUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.HEPHASTEUM_INGOT.get())
                .unlockedBy("has_hephasteum", has(ModItems.HEPHASTEUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IOLIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.IOLIUM_INGOT.get())
                .unlockedBy("has_iolium", has(ModItems.IOLIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OCEANIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.OCEANIUM_INGOT.get())
                .unlockedBy("has_oceanium", has(ModItems.OCEANIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEMELIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SEMELIUM_INGOT.get())
                .unlockedBy("has_semelium", has(ModItems.SEMELIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TALIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.TALIUM_INGOT.get())
                .unlockedBy("has_talium", has(ModItems.TALIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENCHANTED_SEMELIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ENCHANTED_SEMELIUM_INGOT.get())
                .unlockedBy("has_enchanted_semelium", has(ModItems.ENCHANTED_SEMELIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WAND.get())
                .pattern(" AA")
                .pattern(" BA")
                .pattern("C  ")
                .define('A', ModItems.ELECTRUM_DUST.get())
                .define('B', ModItems.ENCHANTED_SEMELIUM_INGOT.get())
                .define('C', Items.BREEZE_ROD)
                .unlockedBy("has_enchanted_semelium", has(ModItems.ENCHANTED_SEMELIUM_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTRUM_INGOT, 9)
                .requires(ModBlocks.ELECTRUM_BLOCK.get())
                .unlockedBy("has_electrum_block", has(ModBlocks.ELECTRUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.APOLLIUM_INGOT, 9)
                .requires(ModBlocks.APOLLIUM_BLOCK.get())
                .unlockedBy("has_apollium_block", has(ModBlocks.APOLLIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HADISIUM_INGOT, 9)
                .requires(ModBlocks.HADISIUM_BLOCK.get())
                .unlockedBy("has_hadisium_block", has(ModBlocks.HADISIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HEPHASTEUM_INGOT, 9)
                .requires(ModBlocks.HEPHASTEUM_BLOCK.get())
                .unlockedBy("has_hephasteum_block", has(ModBlocks.HEPHASTEUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IOLIUM_INGOT, 9)
                .requires(ModBlocks.IOLIUM_BLOCK.get())
                .unlockedBy("has_iolium_block", has(ModBlocks.IOLIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OCEANIUM_INGOT, 9)
                .requires(ModBlocks.OCEANIUM_BLOCK.get())
                .unlockedBy("has_oceanium_block", has(ModBlocks.OCEANIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SEMELIUM_INGOT, 9)
                .requires(ModBlocks.SEMELIUM_BLOCK.get())
                .unlockedBy("has_semelium_block", has(ModBlocks.SEMELIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TALIUM_INGOT, 9)
                .requires(ModBlocks.TALIUM_BLOCK.get())
                .unlockedBy("has_talium_block", has(ModBlocks.TALIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENCHANTED_SEMELIUM_INGOT, 9)
                .requires(ModBlocks.ENCHANTED_SEMELIUM_BLOCK.get())
                .unlockedBy("has_enchanted_semelium_block", has(ModBlocks.ENCHANTED_SEMELIUM_BLOCK))
                .save(recipeOutput);

        oreSmelting(recipeOutput, CESCANDOR_SMELTABLES, RecipeCategory.MISC, ModItems.ELECTRUM_INGOT.get(), 0.25f, 200, "electrum");
        oreBlasting(recipeOutput, CESCANDOR_SMELTABLES, RecipeCategory.MISC, ModItems.ELECTRUM_INGOT.get(), 0.25f, 100, "electrum");

        // Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_AXE.get())
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_PICKAXE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_SHOVEL.get())
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_HOE.get())
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_SCYTHE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern("S  ")
                .define('P', ItemTags.PLANKS)
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ItemTags.PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_SCYTHE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern("S  ")
                .define('M', ItemTags.STONE_CRAFTING_MATERIALS)
                .define('S', Items.STICK)
                .unlockedBy("has_stone", has(ItemTags.STONE_CRAFTING_MATERIALS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SCYTHE.get())
                .pattern("III")
                .pattern(" S ")
                .pattern("S  ")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_iron", has(Items.IRON_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_SCYTHE.get())
                .pattern("GGG")
                .pattern(" S ")
                .pattern("S  ")
                .define('G', Items.GOLD_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_gold", has(Items.GOLD_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_SCYTHE.get())
                .pattern("DDD")
                .pattern(" S ")
                .pattern("S  ")
                .define('D', Items.DIAMOND)
                .define('S', Items.STICK)
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_SCYTHE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern("S  ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .pattern("   ")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_HELMET.get())
                .pattern("   ")
                .pattern("EEE")
                .pattern("E E")
                .define('E', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADAMANTIUM_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("CAC")
                .pattern("CBC")
                .pattern("CCC")
                .define('A', ModItems.ADAMANTIUM_UPGRADE_SMITHING_TEMPLATE.get())
                .define('B', Items.END_STONE)
                .define('C', Items.DIAMOND)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.UNCARVED_MUSIC_DISC_BASE)
                .pattern("RBR")
                .pattern("B B")
                .pattern("RBR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('B', Items.BLACKSTONE)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RESONIUM_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RESONIUM_DUST, 9)
                .requires(ModBlocks.RESONIUM_BLOCK)
                .unlockedBy("has_resonium_block", has(ModBlocks.RESONIUM_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RESONANT_QUARTZ_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.POLISHED_RESONANT_QUARTZ.get())
                .unlockedBy("has_polished_resonant_quartz", has(ModItems.POLISHED_RESONANT_QUARTZ)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POLISHED_RESONANT_QUARTZ, 9)
                .requires(ModBlocks.RESONANT_QUARTZ_BLOCK)
                .unlockedBy("has_resonant_quartz_block", has(ModBlocks.RESONANT_QUARTZ_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RESONANT_QUARTZ)
                .requires(Items.QUARTZ)
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .requires(ModItems.RESONIUM_DUST.get())
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        //Music Disc Track Stuff

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_1)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Items.RED_DYE)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_2)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.GRAY_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Items.BROWN_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_3)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.LIME_DYE)
                .requires(Items.CYAN_DYE)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_4)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Items.MAGENTA_DYE)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_5)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Items.WHITE_DYE)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_6)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.LIME_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_7)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PINK_DYE)
                .requires(Items.MAGENTA_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_8)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.MAGENTA_DYE)
                .requires(Items.CYAN_DYE)
                .requires(Items.LIME_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_9)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.MAGENTA_DYE)
                .requires(Items.CYAN_DYE)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_10)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.CYAN_DYE)
                .requires(Items.BLUE_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_11)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.BLUE_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Items.GRAY_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_12)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.LIGHT_GRAY_DYE)
                .requires(Items.RED_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_13)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PINK_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_14)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_15)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Items.MAGENTA_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_16)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.BLUE_DYE)
                .requires(Items.LIME_DYE)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_17)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.RED_DYE)
                .requires(Items.PURPLE_DYE)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_18)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Items.GREEN_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_19)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.CYAN_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_20)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.LIME_DYE)
                .requires(Items.CYAN_DYE)
                .requires(Items.MAGENTA_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_21)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.YELLOW_DYE)
                .requires(Items.ORANGE_DYE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_22)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.BROWN_DYE)
                .requires(Items.ORANGE_DYE)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_23)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.CYAN_DYE)
                .requires(Items.BLUE_DYE)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_24)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Items.BLACK_DYE)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_25)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Items.PINK_DYE)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_26)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.GREEN_DYE)
                .requires(Items.BLACK_DYE)
                .requires(Items.CYAN_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_27)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MONOCHROME_28)
                .requires(ModItems.MAGIC_PASTE.get())
                .requires(Items.BROWN_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_BANG_BANG)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_1)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_BLOCKS)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_2)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_BOUNCE)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_3)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CASIO)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_4)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CAT)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_5)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CHIRP)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_6)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGIC)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_7)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CREATOR)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_8)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CREATOR_BOX)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_9)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_DAYS_GO_BY)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_10)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_FAR)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_11)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_LAVA_CHICKEN)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_12)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_MALL)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_13)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_MELLOHI)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_14)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGRIC)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_15)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_OTHERSIDE)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_16)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_PIGSTEP)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_17)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_PRECIPICE)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_18)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_RELIC)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_19)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_SNEAKMAN)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_20)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_STAL)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_21)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_STRAD)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_22)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_TEARS)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_23)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_TOO_SWEET)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_24)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_WAIT)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_25)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_WARD)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_26)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_ELEVATOR)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_27)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_TRACK_INTERLUDE)
                .pattern("RQR")
                .pattern("QMQ")
                .pattern("RQR")
                .define('R', ModItems.RESONIUM_DUST.get())
                .define('Q', Items.QUARTZ)
                .define('M', ModItems.MONOCHROME_28)
                .unlockedBy("has_resonium", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BANG_BANG_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_BANG_BANG)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_BLOCKS)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_BLOCKS)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSIC_DISC_BOUNCE)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_BOUNCE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CASIO_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CASIO)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_CAT)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CAT)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_CHIRP)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CHIRP)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CUTIE_MEW_MEW_MAGIC_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGIC)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_CREATOR)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CREATOR)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_CREATOR_MUSIC_BOX)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CREATOR_BOX)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DAYS_GO_BY_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_DAYS_GO_BY)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_FAR)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_FAR)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSIC_DISC_LAVA_CHICKEN)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_LAVA_CHICKEN)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_MALL)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_MALL)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_MELLOHI)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_MELLOHI)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CUTIE_MEW_MEW_MAGRIC_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGRIC)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_OTHERSIDE)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_OTHERSIDE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_PIGSTEP)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_PIGSTEP)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_PRECIPICE)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_PRECIPICE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_RELIC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_RELIC)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SNEAKMAN_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_SNEAKMAN)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_STAL)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_STAL)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_STRAD)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_STRAD)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSIC_DISC_TEARS)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_TEARS)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TOO_SWEET_MUSIC_DISC)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_TOO_SWEET)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_WAIT)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_WAIT)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSIC_DISC_WARD)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_WARD)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSIC_DISC_ELEVATOR)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_ELEVATOR)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSIC_DISC_INTERLUDE)
                .requires(ModItems.MUSIC_DISC_BASE.get())
                .requires(ModItems.MUSIC_DISC_TRACK_INTERLUDE)
                .unlockedBy("has_resonium_dust", has(ModItems.RESONIUM_DUST)).save(recipeOutput);

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CescandorCreations.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

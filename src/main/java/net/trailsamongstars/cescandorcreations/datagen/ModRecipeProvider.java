package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHARGED_ELECTRUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.CHARGED_ELECTRUM.get())
                .unlockedBy("has_electrum", has(ModItems.CHARGED_ELECTRUM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WAND.get())
                .pattern(" AA")
                .pattern(" BA")
                .pattern("C  ")
                .define('A', ModItems.ELECTRUM_DUST.get())
                .define('B', ModItems.CHARGED_ELECTRUM.get())
                .define('C', Items.BREEZE_ROD)
                .unlockedBy("has_charged_electrum", has(ModItems.CHARGED_ELECTRUM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTRUM_INGOT, 9)
                .requires(ModBlocks.ELECTRUM_BLOCK.get())
                .unlockedBy("has_electrum_block", has(ModBlocks.ELECTRUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHARGED_ELECTRUM, 9)
                .requires(ModBlocks.CHARGED_ELECTRUM_BLOCK.get())
                .unlockedBy("has_electrum_block", has(ModBlocks.CHARGED_ELECTRUM_BLOCK)).save(recipeOutput);

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
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_SCYTHE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern("S  ")
                .define('M', ItemTags.STONE_CRAFTING_MATERIALS)
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SCYTHE.get())
                .pattern("III")
                .pattern(" S ")
                .pattern("S  ")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_SCYTHE.get())
                .pattern("GGG")
                .pattern(" S ")
                .pattern("S  ")
                .define('G', Items.GOLD_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_SCYTHE.get())
                .pattern("DDD")
                .pattern(" S ")
                .pattern("S      ")
                .define('D', Items.DIAMOND)
                .define('S', Items.STICK)
                .unlockedBy("has_electrum", has(ModItems.ELECTRUM_INGOT)).save(recipeOutput);

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

package net.trailsamongstars.cescandorcreations.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.recipe.AlchemyTableRecipe;
import net.trailsamongstars.cescandorcreations.recipe.ModRecipes;
import net.trailsamongstars.cescandorcreations.screen.custom.AlchemyTableScreen;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@JeiPlugin
public class JEICescandorCreationPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AlchemyTableRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<AlchemyTableRecipe> alchemyTableRecipes = recipeManager
                .getAllRecipesFor(ModRecipes.ALCHEMY_TABLE_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(AlchemyTableRecipeCategory.ALCHEMY_TABLE_RECIPE_RECIPE_TYPE, alchemyTableRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AlchemyTableScreen.class, 74, 30, 22, 20,
                AlchemyTableRecipeCategory.ALCHEMY_TABLE_RECIPE_RECIPE_TYPE);
    }
}

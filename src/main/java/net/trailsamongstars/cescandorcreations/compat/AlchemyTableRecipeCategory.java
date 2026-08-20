package net.trailsamongstars.cescandorcreations.compat;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethodStage;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;
import net.trailsamongstars.cescandorcreations.recipe.AlchemyTableRecipe;
import org.jetbrains.annotations.Nullable;

public class AlchemyTableRecipeCategory implements IRecipeCategory<AlchemyTableRecipe> {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "alchemy_table");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID,
            "textures/gui/alchemy_table/alchemy_table_gui.png");

    public static final RecipeType<AlchemyTableRecipe> ALCHEMY_TABLE_RECIPE_RECIPE_TYPE =
            new RecipeType<>(UID, AlchemyTableRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public AlchemyTableRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 83);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ALCHEMY_TABLE));
    }

    @Override
    public RecipeType<AlchemyTableRecipe> getRecipeType() {
            return ALCHEMY_TABLE_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.cescandorcreations.alchemy_table");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public @Nullable IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlchemyTableRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 54, 34).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 104, 34).addItemStack(recipe.getResultItem(null));
    }
}

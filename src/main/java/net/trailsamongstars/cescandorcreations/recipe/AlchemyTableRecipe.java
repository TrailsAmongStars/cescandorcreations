package net.trailsamongstars.cescandorcreations.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public record AlchemyTableRecipe(Ingredient inputItem, ItemStack output) implements Recipe<AlchemyTableRecipeInput>{
    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(AlchemyTableRecipeInput alchemyTableRecipeInput, Level level) {
        if(level.isClientSide) {
            return false;
        }

        return inputItem.test(alchemyTableRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(AlchemyTableRecipeInput alchemyTableRecipeInput, HolderLookup.Provider registries) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.ALCHEMY_TABLE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.ALCHEMY_TABLE_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<AlchemyTableRecipe> {
        public static final MapCodec<AlchemyTableRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(AlchemyTableRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(AlchemyTableRecipe::output)
        ).apply(inst, AlchemyTableRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, AlchemyTableRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, AlchemyTableRecipe::inputItem,
                        ItemStack.STREAM_CODEC, AlchemyTableRecipe::output,
                        AlchemyTableRecipe::new);

        @Override
        public MapCodec<AlchemyTableRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, AlchemyTableRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}

package net.trailsamongstars.cescandorcreations.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trailsamongstars.cescandorcreations.CescandorCreations;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, CescandorCreations.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, CescandorCreations.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<AlchemyTableRecipe>> ALCHEMY_TABLE_SERIALIZER =
            SERIALIZERS.register("alchemy_table", AlchemyTableRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<AlchemyTableRecipe>> ALCHEMY_TABLE_TYPE =
            TYPES.register("alchemy_table", () -> new RecipeType<AlchemyTableRecipe>() {
                @Override
                public String toString() {
                    return "alchemy_table";
                }
            });

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}

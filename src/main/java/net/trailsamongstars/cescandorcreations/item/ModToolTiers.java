package net.trailsamongstars.cescandorcreations.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.trailsamongstars.cescandorcreations.util.ModTags;

public class ModToolTiers {
    public static final Tier ELECTRUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ELECTRUM_TOOL,
            400, 16f, 2f, 28, () ->
            Ingredient.of(ModItems.ELECTRUM_INGOT));
}

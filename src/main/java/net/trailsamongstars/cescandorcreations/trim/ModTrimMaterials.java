package net.trailsamongstars.cescandorcreations.trim;

import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> ELECTRUM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "electrum"));
    public static final ResourceKey<TrimMaterial> ADAMANTIUM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "adamantium"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ELECTRUM, ModItems.ELECTRUM_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#DDA782").getOrThrow()), 0.6F);
        register(context, ADAMANTIUM, ModItems.ADAMANTIUM.get(), Style.EMPTY.withColor(TextColor.parseColor("#40644C").getOrThrow()), 0.7F);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}
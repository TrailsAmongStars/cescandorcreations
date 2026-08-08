package net.trailsamongstars.cescandorcreations.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.trailsamongstars.cescandorcreations.CescandorCreations;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ELECTRUM_ORE_PLACED_KEY = registerKey("electrum_ore_placed");
    public static final ResourceKey<PlacedFeature> RESONIUM_FRAGMENT_PLACED_KEY = registerKey("resonium_fragment_placed");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ELECTRUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ELECTRUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform
                        (VerticalAnchor.absolute(16), VerticalAnchor.absolute(62))));

        register(context, RESONIUM_FRAGMENT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RESONIUM_FRAGMENT_KEY),
                ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform
                        (VerticalAnchor.absolute(16), VerticalAnchor.absolute(62))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
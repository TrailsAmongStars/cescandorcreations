package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CescandorCreations.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ECHO_DUST.get());
        basicItem(ModItems.ECHO_PLATE.get());
        basicItem(ModItems.RAW_ELECTRUM.get());
        basicItem(ModItems.ELECTRUM_INGOT.get());
        basicItem(ModItems.ELECTRUM_INGOT.get());
        basicItem(ModItems.CHARGED_ELECTRUM.get());
        basicItem(ModItems.ELECTRUM_DUST.get());
        basicItem(ModItems.NOTE.get());
        basicItem(ModItems.CHORD.get());
        basicItem(ModItems.VERSE.get());
        basicItem(ModItems.STANZA.get());
        basicItem(ModItems.ENTANGLER.get());
        basicItem(ModItems.DETANGLER.get());
        basicItem(ModItems.CHRONO_CATALYST.get());
        basicItem(ModItems.MELANTHIUM.get());
        basicItem(ModItems.WAND.get());
        basicItem(ModItems.MAGIC_PASTE.get());
        basicItem(ModItems.SHATTERED_ECHO_SHARD.get());
        basicItem(ModItems.POWDERED_END_STONE.get());
        basicItem(ModItems.SHULKER_SLAG.get());
        basicItem(ModItems.SHULKER_SHARD.get());

        handheldItem(ModItems.ELECTRUM_SWORD);
        handheldItem(ModItems.ELECTRUM_AXE);
        handheldItem(ModItems.ELECTRUM_PICKAXE);
        handheldItem(ModItems.ELECTRUM_SHOVEL);
        handheldItem(ModItems.ELECTRUM_HOE);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID,"item/" + item.getId().getPath()));
    }
}

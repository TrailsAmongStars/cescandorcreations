package net.trailsamongstars.cescandorcreations.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
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
    }
}

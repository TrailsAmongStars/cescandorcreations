package net.trailsamongstars.cescandorcreations.datagen;

import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;
import net.trailsamongstars.cescandorcreations.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CescandorCreations.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ECHO_DUST.get());
        basicItem(ModItems.ECHO_PLATE.get());
        basicItem(ModItems.RAW_ELECTRUM.get());
        basicItem(ModItems.ELECTRUM_INGOT.get());
        basicItem(ModItems.RESONIUM_DUST.get());
        basicItem(ModItems.ELECTRUM_DUST.get());
        basicItem(ModItems.NOTE.get());
        basicItem(ModItems.CHORD.get());
        basicItem(ModItems.VERSE.get());
        basicItem(ModItems.STANZA.get());
        basicItem(ModItems.MELANTHIUM.get());
        basicItem(ModItems.WAND.get());
        basicItem(ModItems.MAGIC_PASTE.get());
        basicItem(ModItems.SHATTERED_ECHO_SHARD.get());
        basicItem(ModItems.POWDERED_END_STONE.get());
        basicItem(ModItems.SHULKER_SLAG.get());
        basicItem(ModItems.SHULKER_SHARD.get());

        basicItem(ModItems.MUSIC_DISC_BASE.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_CAT.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_BLOCKS.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_CHIRP.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_FAR.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_MALL.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_MELLOHI.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_STAL.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_STRAD.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_WARD.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_WAIT.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_PIGSTEP.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_OTHERSIDE.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_CREATOR.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_CREATOR_BOX.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_RELIC.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_PRECIPICE.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_TEARS.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_LAVA_CHICKEN.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_BOUNCE.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_BANG_BANG.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_CASIO.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGIC.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_MEW_MEW_MAGIC.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_DAYS_GO_BY.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_SNEAKMAN.get());
        basicItem(ModItems.MUSIC_DISC_TRACK_TOO_SWEET.get());

        basicItem(ModItems.MONOCHROME_1.get());
        basicItem(ModItems.MONOCHROME_2.get());
        basicItem(ModItems.MONOCHROME_3.get());
        basicItem(ModItems.MONOCHROME_4.get());
        basicItem(ModItems.MONOCHROME_5.get());
        basicItem(ModItems.MONOCHROME_6.get());
        basicItem(ModItems.MONOCHROME_7.get());
        basicItem(ModItems.MONOCHROME_8.get());
        basicItem(ModItems.MONOCHROME_9.get());
        basicItem(ModItems.MONOCHROME_10.get());
        basicItem(ModItems.MONOCHROME_11.get());
        basicItem(ModItems.MONOCHROME_12.get());
        basicItem(ModItems.MONOCHROME_13.get());
        basicItem(ModItems.MONOCHROME_14.get());
        basicItem(ModItems.MONOCHROME_15.get());
        basicItem(ModItems.MONOCHROME_16.get());
        basicItem(ModItems.MONOCHROME_17.get());
        basicItem(ModItems.MONOCHROME_18.get());
        basicItem(ModItems.MONOCHROME_19.get());
        basicItem(ModItems.MONOCHROME_20.get());
        basicItem(ModItems.MONOCHROME_21.get());
        basicItem(ModItems.MONOCHROME_22.get());
        basicItem(ModItems.MONOCHROME_23.get());
        basicItem(ModItems.MONOCHROME_24.get());
        basicItem(ModItems.MONOCHROME_25.get());
        basicItem(ModItems.MONOCHROME_26.get());

        basicItem(ModItems.BANG_BANG_MUSIC_DISC.get());
        basicItem(ModItems.SNEAKMAN_MUSIC_DISC.get());
        basicItem(ModItems.DAYS_GO_BY_MUSIC_DISC.get());
        basicItem(ModItems.CASIO_MUSIC_DISC.get());
        basicItem(ModItems.TOO_SWEET_MUSIC_DISC.get());
        basicItem(ModItems.CUTIE_MEW_MEW_MAGIC_MUSIC_DISC.get());
        basicItem(ModItems.MEW_MEW_MAGIC_MUSIC_DISC.get());

        basicItem(ModItems.APOLLIUM_INGOT.get());
        basicItem(ModItems.HADISIUM_INGOT.get());
        basicItem(ModItems.HEPHASTEUM_INGOT.get());
        basicItem(ModItems.IOLIUM_INGOT.get());
        basicItem(ModItems.OCEANIUM_INGOT.get());
        basicItem(ModItems.SEMELIUM_INGOT.get());
        basicItem(ModItems.TALIUM_INGOT.get());
        basicItem(ModItems.ENCHANTED_SEMELIUM_INGOT.get());
        basicItem(ModItems.CELESTIUM_INGOT.get());
        basicItem(ModItems.MITHRAL_INGOT.get());
        basicItem(ModItems.OPALIUM_INGOT.get());
        basicItem(ModItems.ADAMANTIUM.get());
        basicItem(ModItems.ADAMANTIUM_UPGRADE_SMITHING_TEMPLATE.get());

        basicItem(ModItems.VESSEL_HELMET.get());
        basicItem(ModItems.CUT_VESSEL_HELMET.get());
        basicItem(ModItems.POLISHED_VESSEL_HELMET.get());
        basicItem(ModItems.PRIMED_VESSEL_HELMET.get());

        basicItem(ModItems.VESSEL_CHESTPLATE.get());
        basicItem(ModItems.CUT_VESSEL_CHESTPLATE.get());
        basicItem(ModItems.POLISHED_VESSEL_CHESTPLATE.get());
        basicItem(ModItems.PRIMED_VESSEL_CHESTPLATE.get());

        basicItem(ModItems.VESSEL_LEGGINGS.get());
        basicItem(ModItems.CUT_VESSEL_LEGGINGS.get());
        basicItem(ModItems.POLISHED_VESSEL_LEGGINGS.get());
        basicItem(ModItems.PRIMED_VESSEL_LEGGINGS.get());

        basicItem(ModItems.VESSEL_BOOTS.get());
        basicItem(ModItems.CUT_VESSEL_BOOTS.get());
        basicItem(ModItems.POLISHED_VESSEL_BOOTS.get());
        basicItem(ModItems.PRIMED_VESSEL_BOOTS.get());

        basicItem(ModItems.VESSEL_AXE.get());
        basicItem(ModItems.CUT_VESSEL_AXE.get());
        basicItem(ModItems.POLISHED_VESSEL_AXE.get());
        basicItem(ModItems.PRIMED_VESSEL_AXE.get());

        basicItem(ModItems.VESSEL_HOE.get());
        basicItem(ModItems.CUT_VESSEL_HOE.get());
        basicItem(ModItems.POLISHED_VESSEL_HOE.get());
        basicItem(ModItems.PRIMED_VESSEL_HOE.get());

        basicItem(ModItems.VESSEL_PICKAXE.get());
        basicItem(ModItems.CUT_VESSEL_PICKAXE.get());
        basicItem(ModItems.POLISHED_VESSEL_PICKAXE.get());
        basicItem(ModItems.PRIMED_VESSEL_PICKAXE.get());

        basicItem(ModItems.VESSEL_SHOVEL.get());
        basicItem(ModItems.CUT_VESSEL_SHOVEL.get());
        basicItem(ModItems.POLISHED_VESSEL_SHOVEL.get());
        basicItem(ModItems.PRIMED_VESSEL_SHOVEL.get());

        basicItem(ModItems.VESSEL_SWORD.get());
        basicItem(ModItems.CUT_VESSEL_SWORD.get());
        basicItem(ModItems.POLISHED_VESSEL_SWORD.get());
        basicItem(ModItems.PRIMED_VESSEL_SWORD.get());

        basicItem(ModItems.VESSEL_SCYTHE.get());
        basicItem(ModItems.CUT_VESSEL_SCYTHE.get());
        basicItem(ModItems.POLISHED_VESSEL_SCYTHE.get());
        basicItem(ModItems.PRIMED_VESSEL_SCYTHE.get());

        handheldItem(ModItems.ELECTRUM_SWORD);
        handheldItem(ModItems.ELECTRUM_AXE);
        handheldItem(ModItems.ELECTRUM_PICKAXE);
        handheldItem(ModItems.ELECTRUM_SHOVEL);
        handheldItem(ModItems.ELECTRUM_HOE);
        handheldItem(ModItems.ADAMANTIUM_SWORD);
        handheldItem(ModItems.ADAMANTIUM_AXE);
        handheldItem(ModItems.ADAMANTIUM_PICKAXE);
        handheldItem(ModItems.ADAMANTIUM_SHOVEL);
        handheldItem(ModItems.ADAMANTIUM_HOE);

        handheldItem(ModItems.WOODEN_SCYTHE);
        handheldItem(ModItems.STONE_SCYTHE);
        handheldItem(ModItems.IRON_SCYTHE);
        handheldItem(ModItems.GOLDEN_SCYTHE);
        handheldItem(ModItems.DIAMOND_SCYTHE);
        handheldItem(ModItems.ELECTRUM_SCYTHE);
        handheldItem(ModItems.NETHERITE_SCYTHE);
        handheldItem(ModItems.ADAMANTIUM_SCYTHE);
        
        trimmedArmorItem(ModItems.ELECTRUM_HELMET);
        trimmedArmorItem(ModItems.ELECTRUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ELECTRUM_LEGGINGS);
        trimmedArmorItem(ModItems.ELECTRUM_BOOTS);
        trimmedArmorItem(ModItems.ADAMANTIUM_HELMET);
        trimmedArmorItem(ModItems.ADAMANTIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ADAMANTIUM_LEGGINGS);
        trimmedArmorItem(ModItems.ADAMANTIUM_BOOTS);

    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = CescandorCreations.MOD_ID; // Change this to your mod id

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }


    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID,"item/" + item.getId().getPath()));
    }
}
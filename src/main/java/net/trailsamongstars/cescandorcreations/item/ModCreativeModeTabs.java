package net.trailsamongstars.cescandorcreations.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CescandorCreations.MOD_ID);

    public static final Supplier<CreativeModeTab> CESCANDOR_ITEMS_TAB = CREATIVE_MODE_TAB.register("cescandor_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELECTRUM_INGOT.get()))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ECHO_DUST);
                        output.accept(ModItems.ECHO_PLATE);
                        output.accept(ModItems.ELECTRUM_INGOT);
                        output.accept(ModItems.ELECTRUM_DUST);
                        output.accept(ModItems.RAW_ELECTRUM);
                        output.accept(ModItems.WAND);
                        output.accept(ModItems.MELANTHIUM);
                        output.accept(ModItems.MAGIC_PASTE);
                        output.accept(ModItems.SHATTERED_ECHO_SHARD);
                        output.accept(ModItems.POWDERED_END_STONE);
                        output.accept(ModItems.SHULKER_SLAG);
                        output.accept(ModItems.SHULKER_SHARD);
                        output.accept(ModItems.RESONIUM_DUST);

                        output.accept(ModItems.VESSEL_HELMET);
                        output.accept(ModItems.CUT_VESSEL_HELMET);
                        output.accept(ModItems.POLISHED_VESSEL_HELMET);
                        output.accept(ModItems.PRIMED_VESSEL_HELMET);
                        output.accept(ModItems.VESSEL_CHESTPLATE);
                        output.accept(ModItems.CUT_VESSEL_CHESTPLATE);
                        output.accept(ModItems.POLISHED_VESSEL_CHESTPLATE);
                        output.accept(ModItems.PRIMED_VESSEL_CHESTPLATE);
                        output.accept(ModItems.VESSEL_LEGGINGS);
                        output.accept(ModItems.CUT_VESSEL_LEGGINGS);
                        output.accept(ModItems.POLISHED_VESSEL_LEGGINGS);
                        output.accept(ModItems.PRIMED_VESSEL_LEGGINGS);
                        output.accept(ModItems.VESSEL_BOOTS);
                        output.accept(ModItems.CUT_VESSEL_BOOTS);
                        output.accept(ModItems.POLISHED_VESSEL_BOOTS);
                        output.accept(ModItems.PRIMED_VESSEL_BOOTS);

                        output.accept(ModItems.VESSEL_AXE);
                        output.accept(ModItems.CUT_VESSEL_AXE);
                        output.accept(ModItems.POLISHED_VESSEL_AXE);
                        output.accept(ModItems.PRIMED_VESSEL_AXE);
                        output.accept(ModItems.VESSEL_HOE);
                        output.accept(ModItems.CUT_VESSEL_HOE);
                        output.accept(ModItems.POLISHED_VESSEL_HOE);
                        output.accept(ModItems.PRIMED_VESSEL_HOE);
                        output.accept(ModItems.VESSEL_PICKAXE);
                        output.accept(ModItems.CUT_VESSEL_PICKAXE);
                        output.accept(ModItems.POLISHED_VESSEL_PICKAXE);
                        output.accept(ModItems.PRIMED_VESSEL_PICKAXE);
                        output.accept(ModItems.VESSEL_SHOVEL);
                        output.accept(ModItems.CUT_VESSEL_SHOVEL);
                        output.accept(ModItems.POLISHED_VESSEL_SHOVEL);
                        output.accept(ModItems.PRIMED_VESSEL_SHOVEL);
                        output.accept(ModItems.VESSEL_SWORD);
                        output.accept(ModItems.CUT_VESSEL_SWORD);
                        output.accept(ModItems.POLISHED_VESSEL_SWORD);
                        output.accept(ModItems.PRIMED_VESSEL_SWORD);
                        output.accept(ModItems.VESSEL_SCYTHE);
                        output.accept(ModItems.CUT_VESSEL_SCYTHE);
                        output.accept(ModItems.POLISHED_VESSEL_SCYTHE);
                        output.accept(ModItems.PRIMED_VESSEL_SCYTHE);
                        output.accept(ModItems.ADAMANTIUM_UPGRADE_SMITHING_TEMPLATE);
                    }).build());

    public static final Supplier<CreativeModeTab> CESCANDOR_ALLOYS_TAB = CREATIVE_MODE_TAB.register("cescandor_alloys_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ADAMANTIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_items_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_alloys"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.APOLLIUM_INGOT);
                        output.accept(ModItems.HADISIUM_INGOT);
                        output.accept(ModItems.HEPHASTEUM_INGOT);
                        output.accept(ModItems.IOLIUM_INGOT);
                        output.accept(ModItems.OCEANIUM_INGOT);
                        output.accept(ModItems.SEMELIUM_INGOT);
                        output.accept(ModItems.TALIUM_INGOT);
                        output.accept(ModItems.ENCHANTED_SEMELIUM_INGOT);
                        output.accept(ModItems.CELESTIUM_INGOT);
                        output.accept(ModItems.MITHRAL_INGOT);
                        output.accept(ModItems.OPALIUM_INGOT);
                        output.accept(ModItems.ADAMANTIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> CESCANDOR_BLOCKS_TAB = CREATIVE_MODE_TAB.register("cescandor_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ELECTRUM_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_alloys_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ELECTRUM_BLOCK);
                        output.accept(ModBlocks.ELECTRUM_ORE);
                        output.accept(ModBlocks.RESONIUM_BLOCK);
                        output.accept(ModBlocks.RESONIUM_FRAGMENT);
                        output.accept(ModBlocks.DEHYDRATED_SCULK);
                        output.accept(ModBlocks.APOLLIUM_BLOCK);
                        output.accept(ModBlocks.HADISIUM_BLOCK);
                        output.accept(ModBlocks.HEPHASTEUM_BLOCK);
                        output.accept(ModBlocks.IOLIUM_BLOCK);
                        output.accept(ModBlocks.OCEANIUM_BLOCK);
                        output.accept(ModBlocks.SEMELIUM_BLOCK);
                        output.accept(ModBlocks.TALIUM_BLOCK);
                        output.accept(ModBlocks.ENCHANTED_SEMELIUM_BLOCK);
                        output.accept(ModBlocks.PEDESTAL);
                    }).build());

    public static final Supplier<CreativeModeTab> CESCANDOR_TOOLS_TAB = CREATIVE_MODE_TAB.register("cescandor_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_SCYTHE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_blocks_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ELECTRUM_SWORD);
                        output.accept(ModItems.ELECTRUM_AXE);
                        output.accept(ModItems.ELECTRUM_PICKAXE);
                        output.accept(ModItems.ELECTRUM_SHOVEL);
                        output.accept(ModItems.ELECTRUM_HOE);
                        output.accept(ModItems.ADAMANTIUM_SWORD);
                        output.accept(ModItems.ADAMANTIUM_AXE);
                        output.accept(ModItems.ADAMANTIUM_PICKAXE);
                        output.accept(ModItems.ADAMANTIUM_SHOVEL);
                        output.accept(ModItems.ADAMANTIUM_HOE);

                        output.accept(ModItems.WOODEN_SCYTHE);
                        output.accept(ModItems.STONE_SCYTHE);
                        output.accept(ModItems.IRON_SCYTHE);
                        output.accept(ModItems.GOLDEN_SCYTHE);
                        output.accept(ModItems.DIAMOND_SCYTHE);
                        output.accept(ModItems.ELECTRUM_SCYTHE);
                        output.accept(ModItems.NETHERITE_SCYTHE);
                        output.accept(ModItems.ADAMANTIUM_SCYTHE);
                    }).build());

    public static final Supplier<CreativeModeTab> CESCANDOR_ARMOR_TAB = CREATIVE_MODE_TAB.register("cescandor_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELECTRUM_CHESTPLATE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_tools_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_armor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ELECTRUM_HELMET);
                        output.accept(ModItems.ELECTRUM_CHESTPLATE);
                        output.accept(ModItems.ELECTRUM_LEGGINGS);
                        output.accept(ModItems.ELECTRUM_BOOTS);
                        output.accept(ModItems.ADAMANTIUM_HELMET);
                        output.accept(ModItems.ADAMANTIUM_CHESTPLATE);
                        output.accept(ModItems.ADAMANTIUM_LEGGINGS);
                        output.accept(ModItems.ADAMANTIUM_BOOTS);
                    }).build());

    public static final Supplier<CreativeModeTab> CESCANDOR_MONEY_TAB = CREATIVE_MODE_TAB.register("cescandor_money_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NOTE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_armor_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_money"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NOTE);
                        output.accept(ModItems.CHORD);
                        output.accept(ModItems.VERSE);
                        output.accept(ModItems.STANZA);
                    }).build());

    public static final Supplier<CreativeModeTab> CESCANDOR_MUSIC_DISCS_TAB = CREATIVE_MODE_TAB.register("cescandor_music_discs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BANG_BANG_MUSIC_DISC.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_money_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_music_discs"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MUSIC_DISC_BOUNCE);
                        output.accept(ModItems.MUSIC_DISC_LAVA_CHICKEN);
                        output.accept(ModItems.MUSIC_DISC_TEARS);
                        output.accept(ModItems.MUSIC_DISC_ELEVATOR);
                        output.accept(ModItems.MUSIC_DISC_INTERLUDE);
                        output.accept(ModItems.BANG_BANG_MUSIC_DISC);
                        output.accept(ModItems.SNEAKMAN_MUSIC_DISC);
                        output.accept(ModItems.DAYS_GO_BY_MUSIC_DISC);
                        output.accept(ModItems.CASIO_MUSIC_DISC);
                        output.accept(ModItems.TOO_SWEET_MUSIC_DISC);
                        output.accept(ModItems.CUTIE_MEW_MEW_MAGIC_MUSIC_DISC);
                        output.accept(ModItems.CUTIE_MEW_MEW_MAGRIC_MUSIC_DISC);

                        output.accept(ModBlocks.UNCARVED_MUSIC_DISC_BASE);
                        output.accept(ModItems.MUSIC_DISC_BASE);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CAT);
                        output.accept(ModItems.MUSIC_DISC_TRACK_BLOCKS);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CHIRP);
                        output.accept(ModItems.MUSIC_DISC_TRACK_FAR);
                        output.accept(ModItems.MUSIC_DISC_TRACK_MALL);
                        output.accept(ModItems.MUSIC_DISC_TRACK_MELLOHI);
                        output.accept(ModItems.MUSIC_DISC_TRACK_STAL);
                        output.accept(ModItems.MUSIC_DISC_TRACK_STRAD);
                        output.accept(ModItems.MUSIC_DISC_TRACK_WARD);
                        output.accept(ModItems.MUSIC_DISC_TRACK_WAIT);
                        output.accept(ModItems.MUSIC_DISC_TRACK_PIGSTEP);
                        output.accept(ModItems.MUSIC_DISC_TRACK_OTHERSIDE);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CREATOR);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CREATOR_BOX);
                        output.accept(ModItems.MUSIC_DISC_TRACK_RELIC);
                        output.accept(ModItems.MUSIC_DISC_TRACK_PRECIPICE);
                        output.accept(ModItems.MUSIC_DISC_TRACK_TEARS);
                        output.accept(ModItems.MUSIC_DISC_TRACK_LAVA_CHICKEN);
                        output.accept(ModItems.MUSIC_DISC_TRACK_BOUNCE);
                        output.accept(ModItems.MUSIC_DISC_TRACK_BANG_BANG);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CASIO);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGIC);
                        output.accept(ModItems.MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGRIC);
                        output.accept(ModItems.MUSIC_DISC_TRACK_DAYS_GO_BY);
                        output.accept(ModItems.MUSIC_DISC_TRACK_SNEAKMAN);
                        output.accept(ModItems.MUSIC_DISC_TRACK_TOO_SWEET);
                        output.accept(ModItems.MUSIC_DISC_TRACK_ELEVATOR);
                        output.accept(ModItems.MUSIC_DISC_TRACK_INTERLUDE);

                        output.accept(ModItems.MONOCHROME_1);
                        output.accept(ModItems.MONOCHROME_2);
                        output.accept(ModItems.MONOCHROME_3);
                        output.accept(ModItems.MONOCHROME_4);
                        output.accept(ModItems.MONOCHROME_5);
                        output.accept(ModItems.MONOCHROME_6);
                        output.accept(ModItems.MONOCHROME_7);
                        output.accept(ModItems.MONOCHROME_8);
                        output.accept(ModItems.MONOCHROME_9);
                        output.accept(ModItems.MONOCHROME_10);
                        output.accept(ModItems.MONOCHROME_11);
                        output.accept(ModItems.MONOCHROME_12);
                        output.accept(ModItems.MONOCHROME_13);
                        output.accept(ModItems.MONOCHROME_14);
                        output.accept(ModItems.MONOCHROME_15);
                        output.accept(ModItems.MONOCHROME_16);
                        output.accept(ModItems.MONOCHROME_17);
                        output.accept(ModItems.MONOCHROME_18);
                        output.accept(ModItems.MONOCHROME_19);
                        output.accept(ModItems.MONOCHROME_20);
                        output.accept(ModItems.MONOCHROME_21);
                        output.accept(ModItems.MONOCHROME_22);
                        output.accept(ModItems.MONOCHROME_23);
                        output.accept(ModItems.MONOCHROME_24);
                        output.accept(ModItems.MONOCHROME_25);
                        output.accept(ModItems.MONOCHROME_26);
                        output.accept(ModItems.MONOCHROME_27);
                        output.accept(ModItems.MONOCHROME_28);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

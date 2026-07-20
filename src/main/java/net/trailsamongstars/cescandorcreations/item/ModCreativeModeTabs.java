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
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, "cescandor_items_tab"))
                    .title(Component.translatable("creativetab.cescandorcreations.cescandor_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ELECTRUM_BLOCK);
                        output.accept(ModBlocks.ELECTRUM_ORE);
                        output.accept(ModBlocks.DEHYDRATED_SCULK);
                        output.accept(ModBlocks.APOLLIUM_BLOCK);
                        output.accept(ModBlocks.HADISIUM_BLOCK);
                        output.accept(ModBlocks.HEPHASTEUM_BLOCK);
                        output.accept(ModBlocks.IOLIUM_BLOCK);
                        output.accept(ModBlocks.OCEANIUM_BLOCK);
                        output.accept(ModBlocks.SEMELIUM_BLOCK);
                        output.accept(ModBlocks.TALIUM_BLOCK);
                        output.accept(ModBlocks.ENCHANTED_SEMELIUM_BLOCK);
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

                        output.accept(ModItems.WOODEN_SCYTHE);
                        output.accept(ModItems.STONE_SCYTHE);
                        output.accept(ModItems.IRON_SCYTHE);
                        output.accept(ModItems.GOLDEN_SCYTHE);
                        output.accept(ModItems.DIAMOND_SCYTHE);
                        output.accept(ModItems.NETHERITE_SCYTHE);
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

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

package net.trailsamongstars.cescandorcreations.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.item.custom.FuelItem;
import net.trailsamongstars.cescandorcreations.item.custom.ModArmorItem;
import net.trailsamongstars.cescandorcreations.item.custom.WandItem;
import net.trailsamongstars.cescandorcreations.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister.Items ITEMS=DeferredRegister.createItems(CescandorCreations.MOD_ID);

    public static final DeferredItem<Item> ECHO_DUST = ITEMS.register("echo_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECHO_PLATE = ITEMS.register("echo_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NOTE = ITEMS.register("note",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHORD = ITEMS.register("chord",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VERSE = ITEMS.register("verse",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STANZA = ITEMS.register("stanza",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHATTERED_ECHO_SHARD = ITEMS.register("shattered_echo_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_END_STONE = ITEMS.register("powdered_end_stone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHULKER_SLAG = ITEMS.register("shulker_slag",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHULKER_SHARD = ITEMS.register("shulker_shard",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> MELANTHIUM = ITEMS.register("melanthium",
            () -> new FuelItem(new Item.Properties(), 5000));
    public static final DeferredItem<Item> APOLLIUM_INGOT = ITEMS.register("apollium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HADISIUM_INGOT = ITEMS.register("hadisium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEPHASTEUM_INGOT = ITEMS.register("hephasteum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IOLIUM_INGOT = ITEMS.register("iolium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OCEANIUM_INGOT = ITEMS.register("oceanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SEMELIUM_INGOT = ITEMS.register("semelium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TALIUM_INGOT = ITEMS.register("talium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENCHANTED_SEMELIUM_INGOT = ITEMS.register("enchanted_semelium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CELESTIUM_INGOT = ITEMS.register("celestium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MITHRAL_INGOT = ITEMS.register("mithral_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OPALIUM_INGOT = ITEMS.register("opalium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADAMANTIUM = ITEMS.register("adamantium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties().durability(128)));
    public static final DeferredItem<Item> MAGIC_PASTE = ITEMS.register("magic_paste",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> ELECTRUM_SWORD = ITEMS.register("electrum_sword",
            () -> new SwordItem(ModToolTiers.ELECTRUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ELECTRUM, 3, -2.4f))));
    public static final DeferredItem<PickaxeItem> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ELECTRUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ELECTRUM, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel",
            () -> new ShovelItem(ModToolTiers.ELECTRUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ELECTRUM, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> ELECTRUM_AXE = ITEMS.register("electrum_axe",
            () -> new AxeItem(ModToolTiers.ELECTRUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ELECTRUM, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> ELECTRUM_HOE = ITEMS.register("electrum_hoe",
            () -> new HoeItem(ModToolTiers.ELECTRUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ELECTRUM, 0F, -3.0f))));

    public static final DeferredItem<SwordItem> ADAMANTIUM_SWORD = ITEMS.register("adamantium_sword",
            () -> new SwordItem(ModToolTiers.ADAMANTIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADAMANTIUM, 3, -2.4f))));
    public static final DeferredItem<PickaxeItem> ADAMANTIUM_PICKAXE = ITEMS.register("adamantium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANTIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ADAMANTIUM, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> ADAMANTIUM_SHOVEL = ITEMS.register("adamantium_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANTIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ADAMANTIUM, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> ADAMANTIUM_AXE = ITEMS.register("adamantium_axe",
            () -> new AxeItem(ModToolTiers.ADAMANTIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ADAMANTIUM, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> ADAMANTIUM_HOE = ITEMS.register("adamantium_hoe",
            () -> new HoeItem(ModToolTiers.ADAMANTIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ADAMANTIUM, 0F, -3.0f))));

    public static final DeferredItem<SwordItem> WOODEN_SCYTHE = ITEMS.register("wooden_scythe",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 7, -3.4f))));
    public static final DeferredItem<SwordItem> STONE_SCYTHE = ITEMS.register("stone_scythe",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 7, -3.4f))));
    public static final DeferredItem<SwordItem> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new SwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 7, -3.4f))));
    public static final DeferredItem<SwordItem> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 7, -3.4f))));
    public static final DeferredItem<SwordItem> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 7, -3.4f))));
    public static final DeferredItem<SwordItem> ELECTRUM_SCYTHE = ITEMS.register("electrum_scythe",
            () -> new SwordItem(ModToolTiers.ELECTRUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ELECTRUM, 7, -3.4f))));
    public static final DeferredItem<SwordItem> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 7, -3.4f))));

    public static final DeferredItem<ArmorItem> ELECTRUM_HELMET = ITEMS.register("electrum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(16))));
    public static final DeferredItem<ArmorItem> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16))));
    public static final DeferredItem<ArmorItem> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16))));
    public static final DeferredItem<ArmorItem> ELECTRUM_BOOTS = ITEMS.register("electrum_boots",
            () -> new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16))));

    public static final DeferredItem<ArmorItem> ADAMANTIUM_HELMET = ITEMS.register("adamantium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANTIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final DeferredItem<ArmorItem> ADAMANTIUM_CHESTPLATE = ITEMS.register("adamantium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))));
    public static final DeferredItem<ArmorItem> ADAMANTIUM_LEGGINGS = ITEMS.register("adamantium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(40))));
    public static final DeferredItem<ArmorItem> ADAMANTIUM_BOOTS = ITEMS.register("adamantium_boots",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(40))));

    public static final DeferredItem<Item> BANG_BANG_MUSIC_DISC = ITEMS.register("bang_bang_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BANG_BANG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> SNEAKMAN_MUSIC_DISC = ITEMS.register("sneakman_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SNEAKMAN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DAYS_GO_BY_MUSIC_DISC = ITEMS.register("days_go_by_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DAYS_GO_BY_KEY).stacksTo(1)));
    public static final DeferredItem<Item> CASIO_MUSIC_DISC = ITEMS.register("casio_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASIO_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

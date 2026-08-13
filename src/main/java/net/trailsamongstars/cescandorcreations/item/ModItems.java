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

    public static final DeferredItem<Item> RESONIUM_DUST = ITEMS.register("resonium_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_HELMET = ITEMS.register("vessel_helmet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_HELMET = ITEMS.register("cut_vessel_helmet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_HELMET = ITEMS.register("polished_vessel_helmet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_HELMET = ITEMS.register("primed_vessel_helmet",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_CHESTPLATE = ITEMS.register("vessel_chestplate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_CHESTPLATE = ITEMS.register("cut_vessel_chestplate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_CHESTPLATE = ITEMS.register("polished_vessel_chestplate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_CHESTPLATE = ITEMS.register("primed_vessel_chestplate",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_LEGGINGS = ITEMS.register("vessel_leggings",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_LEGGINGS = ITEMS.register("cut_vessel_leggings",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_LEGGINGS = ITEMS.register("polished_vessel_leggings",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_LEGGINGS = ITEMS.register("primed_vessel_leggings",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_BOOTS = ITEMS.register("vessel_boots",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_BOOTS = ITEMS.register("cut_vessel_boots",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_BOOTS = ITEMS.register("polished_vessel_boots",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_BOOTS = ITEMS.register("primed_vessel_boots",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_AXE = ITEMS.register("vessel_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_AXE = ITEMS.register("cut_vessel_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_AXE = ITEMS.register("polished_vessel_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_AXE = ITEMS.register("primed_vessel_axe",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_HOE = ITEMS.register("vessel_hoe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_HOE = ITEMS.register("cut_vessel_hoe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_HOE = ITEMS.register("polished_vessel_hoe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_HOE = ITEMS.register("primed_vessel_hoe",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_PICKAXE = ITEMS.register("vessel_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_PICKAXE = ITEMS.register("cut_vessel_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_PICKAXE = ITEMS.register("polished_vessel_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_PICKAXE = ITEMS.register("primed_vessel_pickaxe",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_SHOVEL = ITEMS.register("vessel_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_SHOVEL = ITEMS.register("cut_vessel_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_SHOVEL = ITEMS.register("polished_vessel_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_SHOVEL = ITEMS.register("primed_vessel_shovel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_SWORD = ITEMS.register("vessel_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_SWORD = ITEMS.register("cut_vessel_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_SWORD = ITEMS.register("polished_vessel_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_SWORD = ITEMS.register("primed_vessel_sword",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VESSEL_SCYTHE = ITEMS.register("vessel_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUT_VESSEL_SCYTHE = ITEMS.register("cut_vessel_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_VESSEL_SCYTHE = ITEMS.register("polished_vessel_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRIMED_VESSEL_SCYTHE = ITEMS.register("primed_vessel_scythe",
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
    public static final DeferredItem<Item> ADAMANTIUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("adamantium_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_RESONANT_QUARTZ = ITEMS.register("polished_resonant_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RESONANT_QUARTZ = ITEMS.register("resonant_quartz",
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
    public static final DeferredItem<SwordItem> ADAMANTIUM_SCYTHE = ITEMS.register("adamantium_scythe",
            () -> new SwordItem(ModToolTiers.ADAMANTIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADAMANTIUM, 7, -3.4f))));

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

    public static final DeferredItem<Item> CRUSHED_MUSIC_DISC_BASE = ITEMS.register("crushed_music_disc_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_BASE = ITEMS.register("music_disc_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CAT = ITEMS.register("music_disc_track_cat",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_BLOCKS = ITEMS.register("music_disc_track_blocks",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CHIRP = ITEMS.register("music_disc_track_chirp",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_FAR = ITEMS.register("music_disc_track_far",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_MALL = ITEMS.register("music_disc_track_mall",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_MELLOHI = ITEMS.register("music_disc_track_mellohi",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_STAL = ITEMS.register("music_disc_track_stal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_STRAD = ITEMS.register("music_disc_track_strad",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_WARD = ITEMS.register("music_disc_track_ward",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_WAIT = ITEMS.register("music_disc_track_wait",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_PIGSTEP = ITEMS.register("music_disc_track_pigstep",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_OTHERSIDE = ITEMS.register("music_disc_track_otherside",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CREATOR = ITEMS.register("music_disc_track_creator",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CREATOR_BOX = ITEMS.register("music_disc_track_creator_box",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_RELIC = ITEMS.register("music_disc_track_relic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_PRECIPICE = ITEMS.register("music_disc_track_precipice",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_TEARS = ITEMS.register("music_disc_track_tears",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_LAVA_CHICKEN = ITEMS.register("music_disc_track_lava_chicken",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_BOUNCE = ITEMS.register("music_disc_track_bounce",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_BANG_BANG = ITEMS.register("music_disc_track_bang_bang",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CASIO = ITEMS.register("music_disc_track_casio",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGIC = ITEMS.register("music_disc_track_cutie_mew_mew_magic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_CUTIE_MEW_MEW_MAGRIC = ITEMS.register("music_disc_track_cutie_mew_mew_magric",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_DAYS_GO_BY = ITEMS.register("music_disc_track_days_go_by",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_SNEAKMAN = ITEMS.register("music_disc_track_sneakman",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_TOO_SWEET = ITEMS.register("music_disc_track_too_sweet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_ELEVATOR = ITEMS.register("music_disc_track_elevator",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSIC_DISC_TRACK_INTERLUDE = ITEMS.register("music_disc_track_interlude",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MONOCHROME_1 = ITEMS.register("monochrome_1",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_2 = ITEMS.register("monochrome_2",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_3 = ITEMS.register("monochrome_3",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_4 = ITEMS.register("monochrome_4",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_5 = ITEMS.register("monochrome_5",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_6 = ITEMS.register("monochrome_6",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_7 = ITEMS.register("monochrome_7",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_8 = ITEMS.register("monochrome_8",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_9 = ITEMS.register("monochrome_9",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_10 = ITEMS.register("monochrome_10",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_11 = ITEMS.register("monochrome_11",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_12 = ITEMS.register("monochrome_12",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_13 = ITEMS.register("monochrome_13",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_14 = ITEMS.register("monochrome_14",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_15 = ITEMS.register("monochrome_15",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_16 = ITEMS.register("monochrome_16",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_17 = ITEMS.register("monochrome_17",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_18 = ITEMS.register("monochrome_18",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_19 = ITEMS.register("monochrome_19",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_20 = ITEMS.register("monochrome_20",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_21 = ITEMS.register("monochrome_21",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_22 = ITEMS.register("monochrome_22",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_23 = ITEMS.register("monochrome_23",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_24 = ITEMS.register("monochrome_24",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_25 = ITEMS.register("monochrome_25",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_26 = ITEMS.register("monochrome_26",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_27 = ITEMS.register("monochrome_27",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONOCHROME_28 = ITEMS.register("monochrome_28",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BANG_BANG_MUSIC_DISC = ITEMS.register("bang_bang_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BANG_BANG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> SNEAKMAN_MUSIC_DISC = ITEMS.register("sneakman_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SNEAKMAN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DAYS_GO_BY_MUSIC_DISC = ITEMS.register("days_go_by_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DAYS_GO_BY_KEY).stacksTo(1)));
    public static final DeferredItem<Item> CASIO_MUSIC_DISC = ITEMS.register("casio_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASIO_KEY).stacksTo(1)));
    public static final DeferredItem<Item> TOO_SWEET_MUSIC_DISC = ITEMS.register("too_sweet_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.TOO_SWEET_KEY).stacksTo(1)));
    public static final DeferredItem<Item> CUTIE_MEW_MEW_MAGIC_MUSIC_DISC = ITEMS.register("cutie_mew_mew_magic_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CUTIE_MEW_MEW_MAGIC_KEY).stacksTo(1)));
    public static final DeferredItem<Item> CUTIE_MEW_MEW_MAGRIC_MUSIC_DISC = ITEMS.register("cutie_mew_mew_magric_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CUTIE_MEW_MEW_MAGRIC_KEY).stacksTo(1)));

    public static final DeferredItem<Item> MUSIC_DISC_BOUNCE = ITEMS.register("music_disc_bounce",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BOUNCE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> MUSIC_DISC_TEARS = ITEMS.register("music_disc_tears",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.TEARS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> MUSIC_DISC_LAVA_CHICKEN = ITEMS.register("music_disc_lava_chicken",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.LAVA_CHICKEN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> MUSIC_DISC_ELEVATOR = ITEMS.register("music_disc_elevator",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ELEVATOR_KEY).stacksTo(1)));
    public static final DeferredItem<Item> MUSIC_DISC_INTERLUDE = ITEMS.register("music_disc_interlude",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.INTERLUDE_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

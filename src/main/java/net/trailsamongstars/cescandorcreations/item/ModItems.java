package net.trailsamongstars.cescandorcreations.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.trailsamongstars.cescandorcreations.item.custom.FuelItem;
import net.trailsamongstars.cescandorcreations.item.custom.WandItem;

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
    public static final DeferredItem<Item> CHARGED_ELECTRUM = ITEMS.register("charged_electrum",
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
    public static final DeferredItem<Item> ENTANGLER = ITEMS.register("entangler",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DETANGLER = ITEMS.register("detangler",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHRONO_CATALYST = ITEMS.register("chrono_catalyst",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> MELANTHIUM = ITEMS.register("melanthium",
            () -> new FuelItem(new Item.Properties(), 5000));

    public static final DeferredItem<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties().durability(128)));
    public static final DeferredItem<Item> ENCHANTED_BLUE_DYE = ITEMS.register("enchanted_blue_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENCHANTED_GREEN_DYE = ITEMS.register("enchanted_green_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENCHANTED_RED_DYE = ITEMS.register("enchanted_red_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENCHANTED_YELLOW_DYE = ITEMS.register("enchanted_yellow_dye",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

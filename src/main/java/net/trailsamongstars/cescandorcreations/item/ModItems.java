package net.trailsamongstars.cescandorcreations.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trailsamongstars.cescandorcreations.CescandorCreations;

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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

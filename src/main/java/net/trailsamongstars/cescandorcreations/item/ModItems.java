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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

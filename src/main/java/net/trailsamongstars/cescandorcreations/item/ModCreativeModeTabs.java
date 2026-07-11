package net.trailsamongstars.cescandorcreations.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trailsamongstars.cescandorcreations.CescandorCreations;

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
                        output.accept(ModItems.RAW_ELECTRUM);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

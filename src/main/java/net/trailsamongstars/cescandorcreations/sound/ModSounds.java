package net.trailsamongstars.cescandorcreations.sound;

import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, CescandorCreations.MOD_ID);

    public static final Supplier<SoundEvent> BANG_BANG = registerSoundEvent("bang_bang");
    public static final ResourceKey<JukeboxSong> BANG_BANG_KEY = createSong("bang_bang");
    public static final Supplier<SoundEvent> SNEAKMAN = registerSoundEvent("sneakman");
    public static final ResourceKey<JukeboxSong> SNEAKMAN_KEY = createSong("sneakman");
    public static final Supplier<SoundEvent> DAYS_GO_BY = registerSoundEvent("days_go_by");
    public static final ResourceKey<JukeboxSong> DAYS_GO_BY_KEY = createSong("days_go_by");
    public static final Supplier<SoundEvent> CASIO = registerSoundEvent("casio");
    public static final ResourceKey<JukeboxSong> CASIO_KEY = createSong("casio");

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(CescandorCreations.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
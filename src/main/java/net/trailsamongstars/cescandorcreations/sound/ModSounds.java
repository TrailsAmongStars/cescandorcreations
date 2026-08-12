package net.trailsamongstars.cescandorcreations.sound;

import net.trailsamongstars.cescandorcreations.CescandorCreations;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
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
    public static final Supplier<SoundEvent> TOO_SWEET = registerSoundEvent("too_sweet");
    public static final ResourceKey<JukeboxSong> TOO_SWEET_KEY = createSong("too_sweet");
    public static final Supplier<SoundEvent> CUTIE_MEW_MEW_MAGIC = registerSoundEvent("cutie_mew_mew_magic");
    public static final ResourceKey<JukeboxSong> CUTIE_MEW_MEW_MAGIC_KEY = createSong("cutie_mew_mew_magic");
    public static final Supplier<SoundEvent> CUTIE_MEW_MEW_MAGRIC = registerSoundEvent("cutie_mew_mew_magric");
    public static final ResourceKey<JukeboxSong> CUTIE_MEW_MEW_MAGRIC_KEY = createSong("cutie_mew_mew_magric");

    public static final Supplier<SoundEvent> BOUNCE = registerSoundEvent("bounce");
    public static final ResourceKey<JukeboxSong> BOUNCE_KEY = createSong("bounce");
    public static final Supplier<SoundEvent> LAVA_CHICKEN = registerSoundEvent("lava_chicken");
    public static final ResourceKey<JukeboxSong> LAVA_CHICKEN_KEY = createSong("lava_chicken");
    public static final Supplier<SoundEvent> TEARS = registerSoundEvent("tears");
    public static final ResourceKey<JukeboxSong> TEARS_KEY = createSong("tears");
    public static final Supplier<SoundEvent> ELEVATOR = registerSoundEvent("elevator");
    public static final ResourceKey<JukeboxSong> ELEVATOR_KEY = createSong("elevator");
    public static final Supplier<SoundEvent> INTERLUDE = registerSoundEvent("interlude");
    public static final ResourceKey<JukeboxSong> INTERLUDE_KEY = createSong("interlude");

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
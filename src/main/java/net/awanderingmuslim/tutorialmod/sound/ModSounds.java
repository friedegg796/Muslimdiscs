package net.awanderingmuslim.tutorialmod.sound;

import net.awanderingmuslim.tutorialmod.TutorialMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent EID_TAKBIR = registerSoundEvent("eid_takbir");
    public static final RegistryKey<JukeboxSong> EID_TAKBIR_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "eid_takbir"));


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TutorialMod.LOGGER.info("Registering Mod Sounds for " + TutorialMod.MOD_ID);
    }
}

package net.awanderingmuslim.tutorialmod.item;

import net.awanderingmuslim.tutorialmod.TutorialMod;
import net.awanderingmuslim.tutorialmod.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {


    public static final Item EID_TAKBIR_MUSIC_DISC = registerItem("eid_takbir_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.EID_TAKBIR_KEY).maxCount(1)));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

    }
}
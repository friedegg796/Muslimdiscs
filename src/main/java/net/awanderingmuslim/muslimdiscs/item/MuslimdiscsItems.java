package net.awanderingmuslim.muslimdiscs.item;

import net.awanderingmuslim.muslimdiscs.Muslimdiscs;
import net.awanderingmuslim.muslimdiscs.sound.MuslimdiscsSounds;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MuslimdiscsItems {


    public static final Item EID_TAKBIR_MUSIC_DISC = registerItem("eid_takbir_music_disc",
            setting -> new Item(setting.jukeboxPlayable(MuslimdiscsSounds.EID_TAKBIR_KEY).maxCount(1)));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Muslimdiscs.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Muslimdiscs.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Muslimdiscs.LOGGER.info("Registering Mod Items for " + Muslimdiscs.MOD_ID);
          
    }
}
package net.awanderingmuslim.muslimdiscs;

import net.fabricmc.api.ModInitializer;
import net.awanderingmuslim.muslimdiscs.item.ModItemGroups;
import net.awanderingmuslim.muslimdiscs.item.ModItems;
import net.awanderingmuslim.muslimdiscs.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Muslimdiscs implements ModInitializer {
    public static final String MOD_ID = "muslimdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModSounds.registerSounds();


    }
}
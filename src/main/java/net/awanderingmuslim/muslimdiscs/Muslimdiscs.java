package net.awanderingmuslim.muslimdiscs;

import net.fabricmc.api.ModInitializer;
import net.awanderingmuslim.muslimdiscs.item.MuslimdiscsItemGroups;
import net.awanderingmuslim.muslimdiscs.item.MuslimdiscsItems;
import net.awanderingmuslim.muslimdiscs.sound.MuslimdiscsSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Muslimdiscs implements ModInitializer {
    public static final String MOD_ID = "muslimdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MuslimdiscsItemGroups.registerItemGroups();

        MuslimdiscsItems.registerModItems();
        MuslimdiscsSounds.registerSounds();

    }
}
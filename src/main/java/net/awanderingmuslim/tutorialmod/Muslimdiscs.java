package net.awanderingmuslim.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.awanderingmuslim.tutorialmod.item.ModItemGroups;
import net.awanderingmuslim.tutorialmod.item.ModItems;
import net.awanderingmuslim.tutorialmod.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Muslimdiscs implements ModInitializer {
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModSounds.registerSounds();


    }
}
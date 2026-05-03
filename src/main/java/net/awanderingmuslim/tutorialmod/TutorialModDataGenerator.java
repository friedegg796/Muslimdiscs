package net.awanderingmuslim.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.awanderingmuslim.tutorialmod.datagen.ModModelProvider;
import net.awanderingmuslim.tutorialmod.datagen.ModRegistryDataGenerator;
import net.minecraft.registry.RegistryBuilder;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRegistryDataGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {

    }
}

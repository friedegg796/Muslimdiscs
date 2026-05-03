package net.awanderingmuslim.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.awanderingmuslim.tutorialmod.datagen.ModModelProvider;
import net.minecraft.registry.RegistryBuilder;

public class MuslimdiscsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {

    }
}

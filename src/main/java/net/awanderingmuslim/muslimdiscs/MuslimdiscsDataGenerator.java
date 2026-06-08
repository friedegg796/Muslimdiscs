package net.awanderingmuslim.muslimdiscs;

import net.awanderingmuslim.muslimdiscs.datagen.MuslimdiscsTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.awanderingmuslim.muslimdiscs.datagen.MuslimdiscsModelProvider;
import net.minecraft.registry.RegistryBuilder;

public class MuslimdiscsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MuslimdiscsModelProvider::new);
        pack.addProvider(MuslimdiscsTagProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {

    }
}

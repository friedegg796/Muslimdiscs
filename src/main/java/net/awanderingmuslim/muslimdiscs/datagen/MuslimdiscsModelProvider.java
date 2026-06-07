package net.awanderingmuslim.muslimdiscs.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.awanderingmuslim.muslimdiscs.item.MuslimdiscsItems;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class MuslimdiscsModelProvider extends FabricModelProvider {
    public MuslimdiscsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MuslimdiscsItems.EID_TAKBIR_MUSIC_DISC, Models.GENERATED);


    }
}

package net.awanderingmuslim.muslimdiscs.datagen;

import net.awanderingmuslim.muslimdiscs.item.MuslimdiscsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MuslimdiscsTagProvider extends FabricTagProvider.ItemTagProvider {
    public MuslimdiscsTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(MuslimdiscsItems.EID_TAKBIR_MUSIC_DISC);

        valueLookupBuilder(ItemTags.DUPLICATES_ALLAYS)
                .add(MuslimdiscsItems.EID_TAKBIR_MUSIC_DISC);
    }
}

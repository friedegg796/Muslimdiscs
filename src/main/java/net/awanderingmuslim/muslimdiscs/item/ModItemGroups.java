package net.awanderingmuslim.muslimdiscs.item;

import net.awanderingmuslim.muslimdiscs.Muslimdiscs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MUSLIMDISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Muslimdiscs.MOD_ID, "muslimdisc_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EID_TAKBIR_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.muslimdiscs.muslimdiscs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EID_TAKBIR_MUSIC_DISC);


                    }).build());


    public static final ItemGroup MUSLIMDISCS_NASHEED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Muslimdiscs.MOD_ID, "muslimdisc_discs_nasheeds"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EID_TAKBIR_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.muslimdiscs.muslimdiscs_nasheed"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EID_TAKBIR_MUSIC_DISC);


                    }).build());


    public static void registerItemGroups() {
        Muslimdiscs.LOGGER.info("Registering Item Groups for " + Muslimdiscs.MOD_ID);
    }
}

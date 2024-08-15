package net.finaty.additional_ores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.finaty.additional_ores.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COSMIC_HELMET, ModItems.COSMIC_CHESTPLATE, ModItems.COSMIC_LEGGINGS, ModItems.COSMIC_BOOTS)
                .add(ModItems.TITAN_HELMET, ModItems.TITAN_CHESTPLATE, ModItems.TITAN_LEGGINGS, ModItems.TITAN_BOOTS);
               
    }
}
package net.finaty.additional_ores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.finaty.additional_ores.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TITAN_BLOCK)
                .add(ModBlocks.TITAN_ORE)
                .add(ModBlocks.DEEPSLATE_TITAN_ORE)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE)
                .add(ModBlocks.IRIDIUM_BLOCK)
                .add(ModBlocks.IRIDIUM_ORE)
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE)
                .add(ModBlocks.NETHER_COSMIC_DUST_ORE)
                .add(ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE)
                .add(ModBlocks.COSMIC_DUST_BLOCK)
                .add(ModBlocks.BLOCK_OF_COSMIC_INGOTS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.IRIDIUM_BLOCK)
                .add(ModBlocks.IRIDIUM_ORE)
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE)
                .add(ModBlocks.NETHER_COSMIC_DUST_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITAN_BLOCK)
                .add(ModBlocks.TITAN_ORE)
                .add(ModBlocks.DEEPSLATE_TITAN_ORE)
                .add(ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE)
                .add(ModBlocks.BLOCK_OF_COSMIC_INGOTS);

    }
}

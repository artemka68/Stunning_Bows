package net.finaty.additional_ores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.finaty.additional_ores.block.ModBlocks;
import net.finaty.additional_ores.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRIDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_IRIDIUM_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COSMIC_DUST_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COSMIC_DUST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_COSMIC_INGOTS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TITAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_COBALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_IRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.COSMIC_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COSMIC_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.COSMIC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COSMIC_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.COSMIC_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COSMIC_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COSMIC_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COSMIC_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COSMIC_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITAN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COBALT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.IRIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_HOE, Models.HANDHELD);



        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COSMIC_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COSMIC_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COSMIC_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COSMIC_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITAN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITAN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITAN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITAN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_BOOTS));
    }
}

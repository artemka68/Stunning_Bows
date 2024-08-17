package net.finaty.additional_ores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.finaty.additional_ores.AdditionalOres;
import net.finaty.additional_ores.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ADDITIONAL_ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdditionalOres.MOD_ID, "additional_ores_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.additional_ores_group"))
                    .icon(() -> new ItemStack(ModItems.COSMIC_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TITAN);
                        entries.add(ModItems.RAW_TITAN);
                        entries.add(ModItems.COBALT);
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.IRIDIUM);
                        entries.add(ModItems.RAW_IRIDIUM);
                        entries.add(ModItems.OBSIDIAN_STICK);
                        entries.add(ModItems.OBSIDIAN_NUGGET);
                        entries.add(ModItems.COSMIC_DUST);
                        entries.add(ModItems.COSMIC_INGOT);
                        entries.add(ModItems.COSMIC_STICK);
                        entries.add(ModItems.COSMIC_FRAGMENT);

                        entries.add(ModBlocks.TITAN_BLOCK);
                        entries.add(ModBlocks.TITAN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITAN_ORE);
                        entries.add(ModBlocks.IRIDIUM_BLOCK);
                        entries.add(ModBlocks.IRIDIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_IRIDIUM_ORE);
                        entries.add(ModBlocks.COBALT_BLOCK);
                        entries.add(ModBlocks.COBALT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_COBALT_ORE);
                        entries.add(ModBlocks.NETHER_COSMIC_DUST_ORE);
                        entries.add(ModBlocks.COSMIC_DUST_BLOCK);
                        entries.add(ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE);
                        entries.add(ModBlocks.BLOCK_OF_COSMIC_INGOTS);

                        entries.add(ModItems.COSMIC_SWORD);
                        entries.add(ModItems.COSMIC_AXE);
                        entries.add(ModItems.COSMIC_PICKAXE);
                        entries.add(ModItems.COSMIC_SHOVEL);
                        entries.add(ModItems.COSMIC_HOE);
                        entries.add(ModItems.TITAN_SWORD);
                        entries.add(ModItems.TITAN_AXE);
                        entries.add(ModItems.TITAN_PICKAXE);
                        entries.add(ModItems.TITAN_SHOVEL);
                        entries.add(ModItems.TITAN_HOE);
                        entries.add(ModItems.COBALT_SWORD);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_PICKAXE);
                        entries.add(ModItems.COBALT_SHOVEL);
                        entries.add(ModItems.COBALT_HOE);
                        entries.add(ModItems.IRIDIUM_SWORD);
                        entries.add(ModItems.IRIDIUM_AXE);
                        entries.add(ModItems.IRIDIUM_PICKAXE);
                        entries.add(ModItems.IRIDIUM_SHOVEL);
                        entries.add(ModItems.IRIDIUM_HOE);

                        entries.add(ModItems.COSMIC_HELMET);
                        entries.add(ModItems.COSMIC_CHESTPLATE);
                        entries.add(ModItems.COSMIC_LEGGINGS);
                        entries.add(ModItems.COSMIC_BOOTS);
                        entries.add(ModItems.TITAN_HELMET);
                        entries.add(ModItems.TITAN_CHESTPLATE);
                        entries.add(ModItems.TITAN_LEGGINGS);
                        entries.add(ModItems.TITAN_BOOTS);
                        entries.add(ModItems.COBALT_HELMET);
                        entries.add(ModItems.COBALT_CHESTPLATE);
                        entries.add(ModItems.COBALT_LEGGINGS);
                        entries.add(ModItems.COBALT_BOOTS);
                        entries.add(ModItems.IRIDIUM_HELMET);
                        entries.add(ModItems.IRIDIUM_CHESTPLATE);
                        entries.add(ModItems.IRIDIUM_LEGGINGS);
                        entries.add(ModItems.IRIDIUM_BOOTS);

                    }).build());


    public static void registerItemGroups() {
        AdditionalOres.LOGGER.info("Registering Item Groups for " + AdditionalOres.MOD_ID);
    }
}

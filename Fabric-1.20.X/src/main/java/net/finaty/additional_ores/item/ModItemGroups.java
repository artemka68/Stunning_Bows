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
                    .icon(() -> new ItemStack(ModItems.IRIDIUM)).entries((displayContext, entries) -> {
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


                    }).build());


    public static void registerItemGroups() {
        AdditionalOres.LOGGER.info("Registering Item Groups for " + AdditionalOres.MOD_ID);
    }
}

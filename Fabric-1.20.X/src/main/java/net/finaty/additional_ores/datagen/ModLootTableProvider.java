package net.finaty.additional_ores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.finaty.additional_ores.block.ModBlocks;
import net.finaty.additional_ores.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TITAN_BLOCK);
        addDrop(ModBlocks.COBALT_BLOCK);
        addDrop(ModBlocks.IRIDIUM_BLOCK);
        addDrop(ModBlocks.BLOCK_OF_COSMIC_INGOTS);
        addDrop(ModBlocks.COSMIC_DUST_BLOCK);

        addDrop(ModBlocks.TITAN_ORE, copperLikeOreDrops(ModBlocks.TITAN_ORE, ModItems.RAW_TITAN));
        addDrop(ModBlocks.DEEPSLATE_TITAN_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_TITAN_ORE, ModItems.RAW_TITAN));
        addDrop(ModBlocks.COBALT_ORE, copperLikeOreDrops(ModBlocks.COBALT_ORE, ModItems.RAW_COBALT));
        addDrop(ModBlocks.DEEPSLATE_COBALT_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_COBALT_ORE, ModItems.RAW_COBALT));
        addDrop(ModBlocks.IRIDIUM_ORE, copperLikeOreDrops(ModBlocks.IRIDIUM_ORE, ModItems.RAW_IRIDIUM));
        addDrop(ModBlocks.DEEPSLATE_IRIDIUM_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_IRIDIUM_ORE, ModItems.RAW_IRIDIUM));

        addDrop(ModBlocks.NETHER_COSMIC_DUST_ORE, copperLikeOreDrops(ModBlocks.NETHER_COSMIC_DUST_ORE, ModItems.COSMIC_DUST));
        addDrop(ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE, copperLikeOreDrops(ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE, ModItems.COSMIC_FRAGMENT));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 1.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

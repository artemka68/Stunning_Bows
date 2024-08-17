package net.finaty.additional_ores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.finaty.additional_ores.block.ModBlocks;
import net.finaty.additional_ores.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TITAN_SMELTABLES = List.of(ModItems.RAW_TITAN,
            ModBlocks.TITAN_ORE, ModBlocks.DEEPSLATE_TITAN_ORE);
    private static final List<ItemConvertible> COBALT_SMELTABLES = List.of(ModItems.RAW_COBALT,
            ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE);
    private static final List<ItemConvertible> IRIDIUM_SMELTABLES = List.of(ModItems.RAW_IRIDIUM,
            ModBlocks.IRIDIUM_ORE, ModBlocks.DEEPSLATE_IRIDIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, TITAN_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN,
                0.8f, 250, "titan");
        offerBlasting(exporter, TITAN_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN,
                0.8f, 150, "titan");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITAN, RecipeCategory.DECORATIONS,
                ModBlocks.TITAN_BLOCK);

        offerSmelting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN,
                0.7f, 200, "cobalt");
        offerBlasting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN,
                0.7f, 100, "cobalt");
        //ИЗ 9 СЛИТКОВ В БЛОК И ОБРАТНО
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBALT, RecipeCategory.DECORATIONS,
                ModBlocks.COBALT_BLOCK);

        offerSmelting(exporter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN,
                0.6f, 175, "iridium");
        offerBlasting(exporter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN,
                0.6f, 75, "iridium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IRIDIUM, RecipeCategory.DECORATIONS,
                ModBlocks.IRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OBSIDIAN_NUGGET, RecipeCategory.DECORATIONS,
                Blocks.OBSIDIAN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COSMIC_DUST, RecipeCategory.DECORATIONS,
                ModBlocks.COSMIC_DUST_BLOCK);


//        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COSMIC_FRAGMENT, RecipeCategory.DECORATIONS,
//                ModItems.COSMIC_INGOT);

//        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COSMIC_INGOT, RecipeCategory.DECORATIONS,
//                  ModBlocks.BLOCK_OF_COSMIC_INGOTS);


        //COSMIC_BLOCK_FROM_COSMIC_INGOTS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_COSMIC_INGOTS, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.COSMIC_INGOT)
                .criterion(hasItem(ModItems.COSMIC_INGOT), conditionsFromItem(ModItems.COSMIC_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLOCK_OF_COSMIC_INGOTS)));


        //COSMIC_INGOT_FROM_COSMIC_FRAGMENT
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COSMIC_INGOT, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.COSMIC_FRAGMENT)
                .criterion(hasItem(ModItems.COSMIC_FRAGMENT), conditionsFromItem(ModItems.COSMIC_FRAGMENT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COSMIC_INGOT)));

        //OBSIDIAN_STICK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_STICK, 4)
                .pattern("  S")
                .pattern(" S ")
                .pattern("S  ")
                .input('S', ModItems.OBSIDIAN_NUGGET)
                .criterion(hasItem(ModItems.OBSIDIAN_NUGGET), conditionsFromItem(ModItems.OBSIDIAN_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_STICK)));

        //COSMIC_STICK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COSMIC_STICK, 1)
                .pattern(" S ")
                .pattern("S#S")
                .pattern(" S ")
                .input('S', ModItems.COSMIC_DUST)
                .input('#', ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.COSMIC_DUST), conditionsFromItem(ModItems.COSMIC_DUST))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COSMIC_STICK)));

//        //COSMIC_INGOTS_FROM_COSMIC_BLOCK
//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COSMIC_INGOT, 9)
//                .pattern("S")
//                .input('S', ModBlocks.BLOCK_OF_COSMIC_INGOTS)
//                .criterion(hasItem(ModBlocks.BLOCK_OF_COSMIC_INGOTS), conditionsFromItem(ModBlocks.BLOCK_OF_COSMIC_INGOTS))
//                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COSMIC_INGOT)));


//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_TITAN, 1)
//                .pattern("SSS")
//                .pattern("SSS")
//                .pattern("SSS")
//                .input('S', Items.STONE)
//                .input('R', ModItems.TITAN)
//                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
//                .criterion(hasItem(ModItems.TITAN), conditionsFromItem(ModItems.TITAN))
//                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_TITAN)));
    }
}

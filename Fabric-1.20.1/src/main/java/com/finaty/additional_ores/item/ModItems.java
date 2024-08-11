package com.finaty.additional_ores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.finaty.additional_ores.AdditionalOres;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COSMIC_FRAGMENT= registerItem("cosmic_fragment", new Item(new FabricItemSettings()));
    public static final Item COSMIC_DUST = registerItem("cosmic_fragment", new Item(new FabricItemSettings()));
    public static final Item COSMIC_STICK = registerItem("cosmic_stick", new Item(new FabricItemSettings()));
    public static final Item TITAN = registerItem("titan", new Item(new FabricItemSettings()));
    public static final Item RAW_TITAN = registerItem("raw_titan", new Item(new FabricItemSettings()));
    public static final Item COBALT = registerItem("cobalt", new Item(new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM = registerItem("iridium", new Item(new FabricItemSettings()));
    public static final Item RAW_IRIDIUM = registerItem("raw_iridium", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_STICK = registerItem("obsidian_stick", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_NUGGET = registerItem("obsidian_nugget", new Item(new FabricItemSettings()));
    public static final Item COSMIC_INGOT= registerItem("cosmic_ingot", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COSMIC_FRAGMENT);
        entries.add(COSMIC_DUST);
        entries.add(COSMIC_STICK);
        entries.add(COSMIC_INGOT);
        entries.add(TITAN);
        entries.add(RAW_TITAN);
        entries.add(COBALT);
        entries.add(RAW_COBALT);
        entries.add(IRIDIUM);
        entries.add(RAW_IRIDIUM);
        entries.add(OBSIDIAN_STICK);
        entries.add(OBSIDIAN_NUGGET);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdditionalOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionalOres.LOGGER.info("Registering Mod Items for " + AdditionalOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
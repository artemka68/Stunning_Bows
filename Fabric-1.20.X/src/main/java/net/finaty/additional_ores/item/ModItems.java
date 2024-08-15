package net.finaty.additional_ores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.finaty.additional_ores.AdditionalOres;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TITAN = registerItem("titan", new Item(new FabricItemSettings()));
    public static final Item RAW_TITAN = registerItem("raw_titan", new Item(new FabricItemSettings()));
    public static final Item COBALT = registerItem("cobalt", new Item(new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM = registerItem("iridium", new Item(new FabricItemSettings()));
    public static final Item RAW_IRIDIUM = registerItem("raw_iridium", new Item(new FabricItemSettings()));

    public static final Item OBSIDIAN_STICK = registerItem("obsidian_stick", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_NUGGET = registerItem("obsidian_nugget", new Item(new FabricItemSettings()));
    public static final Item COSMIC_DUST = registerItem("cosmic_dust", new Item(new FabricItemSettings()));
    public static final Item COSMIC_INGOT = registerItem("cosmic_ingot", new Item(new FabricItemSettings()));
    public static final Item COSMIC_STICK = registerItem("cosmic_stick", new Item(new FabricItemSettings()));
    public static final Item COSMIC_FRAGMENT = registerItem("cosmic_fragment", new Item(new FabricItemSettings()));





    public static final Item COSMIC_SWORD = registerItem("cosmic_sword",
            new SwordItem(ModToolMaterial.COSMIC, 4, -2.4f, new FabricItemSettings()));
    public static final Item COSMIC_AXE = registerItem("cosmic_axe",
            new AxeItem(ModToolMaterial.COSMIC, 6, -3f, new FabricItemSettings()));
    public static final Item COSMIC_PICKAXE = registerItem("cosmic_pickaxe",
            new PickaxeItem(ModToolMaterial.COSMIC, 2, -2.8f, new FabricItemSettings()));
    public static final Item COSMIC_SHOVEL = registerItem("cosmic_shovel",
            new ShovelItem(ModToolMaterial.COSMIC, 2.5f, -3f, new FabricItemSettings()));
    public static final Item COSMIC_HOE = registerItem("cosmic_hoe",
            new HoeItem(ModToolMaterial.COSMIC, -4, 1f, new FabricItemSettings()));

    public static final Item TITAN_SWORD = registerItem("titan_sword",
            new SwordItem(ModToolMaterial.TITAN, 2, -2.4f, new FabricItemSettings()));
    public static final Item TITAN_AXE = registerItem("titan_axe",
            new AxeItem(ModToolMaterial.TITAN, 4.5f, -3f, new FabricItemSettings()));
    public static final Item TITAN_PICKAXE = registerItem("titan_pickaxe",
            new PickaxeItem(ModToolMaterial.TITAN, 0, -2.8f, new FabricItemSettings()));
    public static final Item TITAN_SHOVEL = registerItem("titan_shovel",
            new ShovelItem(ModToolMaterial.TITAN, 1.0f, -3f, new FabricItemSettings()));
    public static final Item TITAN_HOE = registerItem("titan_hoe",
            new HoeItem(ModToolMaterial.TITAN, -4, 0f, new FabricItemSettings()));

    public static final Item COBALT_SWORD = registerItem("cobalt_sword",
            new SwordItem(ModToolMaterial.COBALT, 2, -2.4f, new FabricItemSettings()));
    public static final Item COBALT_AXE = registerItem("cobalt_axe",
            new AxeItem(ModToolMaterial.COBALT, 5, -3.05f, new FabricItemSettings()));
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe",
            new PickaxeItem(ModToolMaterial.COBALT, 0, -2.8f, new FabricItemSettings()));
    public static final Item COBALT_SHOVEL = registerItem("cobalt_shovel",
            new ShovelItem(ModToolMaterial.COBALT, 1.0f, -3.0f, new FabricItemSettings()));
    public static final Item COBALT_HOE = registerItem("cobalt_hoe",
            new HoeItem(ModToolMaterial.COBALT, -3, -0.5f, new FabricItemSettings()));

    public static final Item IRIDIUM_SWORD = registerItem("iridium_sword",
            new SwordItem(ModToolMaterial.IRIDIUM, 2, -2.4f, new FabricItemSettings()));
    public static final Item IRIDIUM_AXE = registerItem("iridium_axe",
            new AxeItem(ModToolMaterial.IRIDIUM, 6.0f, -3.15f, new FabricItemSettings()));
    public static final Item IRIDIUM_PICKAXE = registerItem("iridium_pickaxe",
            new PickaxeItem(ModToolMaterial.IRIDIUM, 0, -2.8f, new FabricItemSettings()));
    public static final Item IRIDIUM_SHOVEL = registerItem("iridium_shovel",
            new ShovelItem(ModToolMaterial.IRIDIUM, 1.0f, -3.0f, new FabricItemSettings()));
    public static final Item IRIDIUM_HOE = registerItem("iridium_hoe",
            new HoeItem(ModToolMaterial.IRIDIUM, -2, -1.5f, new FabricItemSettings()));




    public static final Item COSMIC_HELMET = registerItem("cosmic_helmet",
            new ArmorItem(ModArmorMaterials.COSMIC, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COSMIC_CHESTPLATE = registerItem("cosmic_chestplate",
            new ArmorItem(ModArmorMaterials.COSMIC, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COSMIC_LEGGINGS = registerItem("cosmic_leggings",
            new ArmorItem(ModArmorMaterials.COSMIC, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COSMIC_BOOTS = registerItem("cosmic_boots",
            new ArmorItem(ModArmorMaterials.COSMIC, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TITAN_HELMET = registerItem("titan_helmet",
            new ArmorItem(ModArmorMaterials.TITAN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TITAN_CHESTPLATE = registerItem("titan_chestplate",
            new ArmorItem(ModArmorMaterials.TITAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TITAN_LEGGINGS = registerItem("titan_leggings",
            new ArmorItem(ModArmorMaterials.TITAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TITAN_BOOTS = registerItem("titan_boots",
            new ArmorItem(ModArmorMaterials.TITAN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item COBALT_HELMET = registerItem("cobalt_helmet",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRIDIUM_HELMET = registerItem("iridium_helmet",
            new ArmorItem(ModArmorMaterials.IRIDIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRIDIUM_CHESTPLATE = registerItem("iridium_chestplate",
            new ArmorItem(ModArmorMaterials.IRIDIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRIDIUM_LEGGINGS = registerItem("iridium_leggings",
            new ArmorItem(ModArmorMaterials.IRIDIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRIDIUM_BOOTS = registerItem("iridium_boots",
            new ArmorItem(ModArmorMaterials.IRIDIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));





    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TITAN);
        entries.add(RAW_TITAN);
        entries.add(COBALT);
        entries.add(RAW_COBALT);
        entries.add(IRIDIUM);
        entries.add(RAW_IRIDIUM);
        entries.add(OBSIDIAN_STICK);
        entries.add(OBSIDIAN_NUGGET);
        entries.add(COSMIC_DUST);
        entries.add(COSMIC_INGOT);
        entries.add(COSMIC_STICK);
        entries.add(COSMIC_FRAGMENT);


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdditionalOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionalOres.LOGGER.info("Registering Mod Items for " + AdditionalOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

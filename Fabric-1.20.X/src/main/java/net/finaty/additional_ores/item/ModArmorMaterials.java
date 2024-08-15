package net.finaty.additional_ores.item;

import net.finaty.additional_ores.AdditionalOres;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    COSMIC("cosmic", 42, new int[] { 3, 9, 7, 3 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> Ingredient.ofItems(ModItems.COSMIC_INGOT)),

    TITAN("titan", 35, new int[] { 3, 8, 6, 3 }, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> Ingredient.ofItems(ModItems.TITAN)),

    COBALT("cobalt", 25, new int[] { 2, 7, 6, 2 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0f, () -> Ingredient.ofItems(ModItems.COBALT)),

    IRIDIUM("iridium", 15, new int[] { 2, 5, 4, 2 }, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.IRIDIUM));


//    LEATHER("leather", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 1);
//        map.put(ArmorItem.Type.LEGGINGS, 2);
//        map.put(ArmorItem.Type.CHESTPLATE, 3);
//        map.put(ArmorItem.Type.HELMET, 1);
//    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
//    }),
//    CHAIN("chainmail", 15, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 1);
//        map.put(ArmorItem.Type.LEGGINGS, 4);
//        map.put(ArmorItem.Type.CHESTPLATE, 5);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
//    }),
//    IRON("iron", 15, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 2);
//        map.put(ArmorItem.Type.LEGGINGS, 5);
//        map.put(ArmorItem.Type.CHESTPLATE, 6);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
//    }),
//    GOLD("gold", 7, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 1);
//        map.put(ArmorItem.Type.LEGGINGS, 3);
//        map.put(ArmorItem.Type.CHESTPLATE, 5);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
//    }),
//    DIAMOND("diamond", 33, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 3);
//        map.put(ArmorItem.Type.LEGGINGS, 6);
//        map.put(ArmorItem.Type.CHESTPLATE, 8);
//        map.put(ArmorItem.Type.HELMET, 3);
//    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
//    }),
//    TURTLE("turtle", 25, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 2);
//        map.put(ArmorItem.Type.LEGGINGS, 5);
//        map.put(ArmorItem.Type.CHESTPLATE, 6);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.SCUTE});
//    }),
//    NETHERITE("netherite", 37, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
//        map.put(ArmorItem.Type.BOOTS, 3);
//        map.put(ArmorItem.Type.LEGGINGS, 6);
//        map.put(ArmorItem.Type.CHESTPLATE, 8);
//        map.put(ArmorItem.Type.HELMET, 3);
//    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
//    });

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return AdditionalOres.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

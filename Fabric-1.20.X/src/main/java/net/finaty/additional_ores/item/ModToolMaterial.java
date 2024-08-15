package net.finaty.additional_ores.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    COSMIC(4, 2031, 9.0F, 4.0F, 15,
            () -> Ingredient.ofItems(ModItems.COSMIC_INGOT)),
    TITAN(4, 2031, 9.0F, 4.0F, 15,
            () -> Ingredient.ofItems(ModItems.TITAN)),
    COBALT(3, 1561, 8.0F, 3.0F, 10,
                  () -> Ingredient.ofItems(ModItems.COBALT)),
    IRIDIUM(2, 250, 6.0F, 2.0F, 14,
                  () -> Ingredient.ofItems(ModItems.IRIDIUM));



//    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
//        return Ingredient.fromTag(ItemTags.PLANKS);
//    }),
//    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
//        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
//    }),
//    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
//    }),
//    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
//    }),
//    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
//    }),
//    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
//    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
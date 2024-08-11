package com.finaty.additional_ores.item;

import com.finaty.additional_ores.AdditionalOres;
import com.finaty.additional_ores.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import com.finaty.additional_ores.AdditionalOres;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdditionalOres.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.COSMIC_FRAGMENT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COSMIC_FRAGMENT);
                        entries.add(ModItems.COSMIC_DUST);
                        entries.add(ModItems.COSMIC_STICK);
                        entries.add(ModItems.COSMIC_INGOT);
                        entries.add(ModItems.TITAN);
                        entries.add(ModItems.RAW_TITAN);
                        entries.add(ModItems.COBALT);
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.IRIDIUM);
                        entries.add(ModItems.RAW_IRIDIUM);
                        entries.add(ModItems.OBSIDIAN_STICK);
                        entries.add(ModItems.OBSIDIAN_NUGGET);



                    }).build());


    public static void registerItemGroups() {
        AdditionalOres.LOGGER.info("Registering Item Groups for " + AdditionalOres.MOD_ID);
    }
}
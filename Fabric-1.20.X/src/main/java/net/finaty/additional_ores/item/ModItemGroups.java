package net.finaty.additional_ores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.finaty.additional_ores.AdditionalOres;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup IRIDIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdditionalOres.MOD_ID, "iridium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.iridium"))
                    .icon(() -> new ItemStack(ModItems.IRIDIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IRIDIUM);
                        entries.add(ModItems.RAW_IRIDIUM);


                    }).build());


    public static void registerItemGroups() {
        AdditionalOres.LOGGER.info("Registering Item Groups for " + AdditionalOres.MOD_ID);
    }
}

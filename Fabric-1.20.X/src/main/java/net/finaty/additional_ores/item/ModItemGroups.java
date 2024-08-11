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


                    }).build());


    public static void registerItemGroups() {
        AdditionalOres.LOGGER.info("Registering Item Groups for " + AdditionalOres.MOD_ID);
    }
}

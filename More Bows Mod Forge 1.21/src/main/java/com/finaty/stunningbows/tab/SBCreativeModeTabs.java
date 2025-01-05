package com.finaty.stunningbows.tab;

import com.finaty.stunningbows.StunningBows;
import com.finaty.stunningbows.core.item.SBItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SBCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StunningBows.MOD_ID);



    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> STUNNINGBOWS_TAB = CREATIVE_MODE_TABS.register("stunningbows_tab",
            () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> SBItems.STUNNING_BOW.get().getDefaultInstance())
            .title(Component.translatable("creativetab.stunningbows.stunningbows"))
            .displayItems((parameters, output) -> {
                // Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(SBItems.BONE_BOW.get());
                output.accept(SBItems.COPPER_BOW.get());
                output.accept(SBItems.GOLDEN_BOW.get());
                output.accept(SBItems.IRON_BOW.get());
                output.accept(SBItems.NETHER_BOW.get());
                output.accept(SBItems.DIAMOND_BOW.get());
                output.accept(SBItems.NETHERITE_BOW.get());
                output.accept(SBItems.STUNNING_BOW.get());


                output.accept(SBItems.COPPER_STRING.get());
                output.accept(SBItems.GOLDEN_STRING.get());
                output.accept(SBItems.IRON_STRING.get());
                output.accept(SBItems.DIAMOND_STRING.get());
                output.accept(SBItems.NETHERITE_STRING.get());

                output.accept(SBItems.COPPER_NUGGET.get());
                output.accept(SBItems.DIAMOND_NUGGET.get());
                output.accept(SBItems.NETHERITE_NUGGET.get());
            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

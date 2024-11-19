package com.finaty.stunningbows.item;

import com.finaty.stunningbows.StunningBows;
import com.finaty.stunningbows.custom.FireBow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SBItems {
    public static final int durabilityOfBow = 384; //Common durability of bow

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StunningBows.MOD_ID);




    //List of items
    public static final RegistryObject<Item> NETHER_BOW = ITEMS.register("nether_bow",
            () -> new BowItem(new Item.Properties().durability(durabilityOfBow)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

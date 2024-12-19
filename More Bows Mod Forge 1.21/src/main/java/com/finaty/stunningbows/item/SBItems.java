package com.finaty.stunningbows.item;

import com.finaty.stunningbows.StunningBows;
import com.finaty.stunningbows.custom.BoneBow;
import com.finaty.stunningbows.custom.CopperBow;
import com.finaty.stunningbows.custom.NetherBow;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SBItems {
    public static final int durabilityOfBow = 384; //Common durability of bow

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StunningBows.MOD_ID);




    //List of bows
    public static final RegistryObject<Item> NETHER_BOW = ITEMS.register("nether_bow",
            () -> new NetherBow(new Item.Properties().durability(durabilityOfBow)));

    public static final RegistryObject<Item> BONE_BOW = ITEMS.register("bone_bow",
            () -> new BoneBow(new Item.Properties().durability(durabilityOfBow + 30)));

    public static final RegistryObject<Item> COPPER_BOW = ITEMS.register("copper_bow",
            () -> new CopperBow(new Item.Properties().durability(durabilityOfBow + 50)));

    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new CopperBow(new Item.Properties().durability(durabilityOfBow + 50)));

    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow",
            () -> new CopperBow(new Item.Properties().durability(durabilityOfBow + 100)));

    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow",
            () -> new CopperBow(new Item.Properties().durability(durabilityOfBow + 200)));

    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new CopperBow(new Item.Properties().durability(durabilityOfBow + 350)));


    //List of items

    public static final RegistryObject<Item> COPPER_STRING = ITEMS.register("copper_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_STRING = ITEMS.register("golden_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_STRING = ITEMS.register("iron_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_STRING = ITEMS.register("diamond_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_STRING = ITEMS.register("netherite_string",
            () -> new Item(new Item.Properties()));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

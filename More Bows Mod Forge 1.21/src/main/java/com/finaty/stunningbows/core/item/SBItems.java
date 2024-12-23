package com.finaty.stunningbows.core.item;

import com.finaty.stunningbows.StunningBows;
import com.finaty.stunningbows.core.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SBItems {
    public static final int BOW_DURABILITY = 384; //Common durability of bow

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StunningBows.MOD_ID);




    //List of bows
    public static final RegistryObject<Item> NETHER_BOW = ITEMS.register("nether_bow",
            () -> new NetherBow(new Item.Properties().durability(BOW_DURABILITY))); // 384

    public static final RegistryObject<Item> BONE_BOW = ITEMS.register("bone_bow",
            () -> new BoneBow(new Item.Properties().durability(BOW_DURABILITY + 36))); // 420

    public static final RegistryObject<Item> COPPER_BOW = ITEMS.register("copper_bow",
            () -> new CopperBow(new Item.Properties().durability(BOW_DURABILITY + 166))); // 550

    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new GoldenBow(new Item.Properties().durability(BOW_DURABILITY - 84))); // 300

    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow",
            () -> new IronBow(new Item.Properties().durability(BOW_DURABILITY + 266))); // 650

    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow",
            () -> new DiamondBow(new Item.Properties().durability(BOW_DURABILITY + 466))); // 850

    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new NetheriteBow(new Item.Properties().durability(BOW_DURABILITY + 866))); // 1250


    //List of strings
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


    //List of nuggets
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            () -> new Item(new Item.Properties()));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

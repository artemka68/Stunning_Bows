package com.finaty.stunningbows.util;

import com.finaty.stunningbows.item.SBItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class SBItemProperties {
    public static void addItemProperties() {
        makeBow(SBItems.NETHER_BOW.get());
        makeBow(SBItems.BONE_BOW.get());
        makeBow(SBItems.COPPER_BOW.get());
        makeBow(SBItems.GOLDEN_BOW.get());
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (p_340951_, p_340952_, p_340953_, p_340954_) -> {
            if (p_340953_ == null) {
                return 0.0F;
            } else {
                return p_340953_.getUseItem() != p_340951_ ? 0.0F : (float)(p_340951_.getUseDuration(p_340953_) - p_340953_.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }
}

package com.finaty.stunningbows;

import com.finaty.stunningbows.item.SBItems;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StunningBows.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class SBClientEvents {
    //Bow fov while pulling
    @SubscribeEvent
    public static void onComputerFovModifierEvent(ComputeFovModifierEvent event) {
        if(event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == SBItems.NETHER_BOW.get() ||
                event.getPlayer().getUseItem().getItem() == SBItems.BONE_BOW.get() ||
                    event.getPlayer().getUseItem().getItem() == SBItems.COPPER_BOW.get() ||
                        event.getPlayer().getUseItem().getItem() == SBItems.GOLDEN_BOW.get() ||
                            event.getPlayer().getUseItem().getItem() == SBItems.IRON_BOW.get() ||
                                event.getPlayer().getUseItem().getItem() == SBItems.DIAMOND_BOW.get() ||
                                    event.getPlayer().getUseItem().getItem() == SBItems.NETHERITE_BOW.get()) {
            float f = 1.0F;

            //While flying
            if (event.getPlayer().getAbilities().flying) {
                f *= 1.1F;
            }

            //While running
            f *= ((float)event.getPlayer().getAttributeValue(Attributes.MOVEMENT_SPEED) / event.getPlayer().getAbilities().getWalkingSpeed() + 1.0F) / 2.0F;
            if (event.getPlayer().getAbilities().getWalkingSpeed() == 0.0F || Float.isNaN(f) || Float.isInfinite(f)) {
                f = 1.0F;
            }

            //While pulling
            int ticksUsingItem = event.getPlayer().getTicksUsingItem();
            float f1 = (float)ticksUsingItem / 20.0F;
            if(f1 > 1.0F) {
                f1 = 1.0F;
            } else {
                f1 *= f1;
            }
            f *= 1.0F - f1 * 0.15F;
            event.setNewFovModifier(f);
        }
    }
}

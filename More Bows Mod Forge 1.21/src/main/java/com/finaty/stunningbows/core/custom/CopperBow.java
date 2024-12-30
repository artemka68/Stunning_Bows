package com.finaty.stunningbows.core.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class CopperBow extends BowItem {
    public static final int MAX_DRAW_DURATION = 20;
    public static final int DEFAULT_RANGE = 15;

    public CopperBow(Item.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving, int pTimeLeft) {
        if (pEntityLiving instanceof Player player) {
            ItemStack itemstack = player.getProjectile(pStack);
            if (!itemstack.isEmpty()) {
                int i = this.getUseDuration(pStack, pEntityLiving) - pTimeLeft;
                i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(pStack, pLevel, player, i, true);
                if (i < 0) return;

                float f = getPowerForTime(i);
                if (!((double)f < 0.1)) {
                    List<ItemStack> list = draw(pStack, itemstack, player);
                    if (pLevel instanceof ServerLevel serverlevel && !list.isEmpty()) {
                        this.shoot(serverlevel, player, player.getUsedItemHand(), pStack, list, f * 3.20F, 1.0F, f == 1.0F, null);
                    }

                    pLevel.playSound(
                            null,
                            player.getX(),
                            player.getY(),
                            player.getZ(),
                            SoundEvents.ARROW_SHOOT,
                            SoundSource.PLAYERS,
                            1.0F,
                            1.0F / (pLevel.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F
                    );
                    player.awardStat(Stats.ITEM_USED.get(this));
                }
            }
        }
    }

    public static float getPowerForTime(int pCharge) {
        float f = (float)pCharge / 20.0F;
        f = (f * f + f * 2.5F) / 2.75F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }
}

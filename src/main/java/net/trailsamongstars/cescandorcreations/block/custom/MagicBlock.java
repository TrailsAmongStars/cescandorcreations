package net.trailsamongstars.cescandorcreations.block.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.trailsamongstars.cescandorcreations.item.ModItems;

import java.util.List;


public class MagicBlock extends Block {
    public MagicBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {

        if(entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == Items.BLUE_DYE) {
                itemEntity.setItem(new ItemStack(ModItems.ENCHANTED_BLUE_DYE.get(),
                        itemEntity.getItem().getCount()));
            }
        }

        if(entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == Items.GREEN_DYE) {
                itemEntity.setItem(new ItemStack(ModItems.ENCHANTED_GREEN_DYE.get(),
                        itemEntity.getItem().getCount()));
            }
        }

        if(entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == Items.RED_DYE) {
                itemEntity.setItem(new ItemStack(ModItems.ENCHANTED_RED_DYE.get(),
                        itemEntity.getItem().getCount()));
            }
        }

        if(entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == Items.YELLOW_DYE) {
                itemEntity.setItem(new ItemStack(ModItems.ENCHANTED_YELLOW_DYE.get(),
                        itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, state, entity);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()){
            tooltipComponents.add(Component.translatable("tooltip.cescandorcreations.charged_electrum_block.shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip.cescandorcreations.charged_electrum_block"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}

package com.qej.betterbricks;

import com.qej.betterbricks.block.ModBlocks;
import com.qej.betterbricks.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterBricks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterBricksTab
{
   public static CreativeModeTab BETTER_BRICKS_TAB;

   @SubscribeEvent
   public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
   {
        BETTER_BRICKS_TAB = event.registerCreativeModeTab(new ResourceLocation(BetterBricks.MODID,
                "betterbricks_tab"), builder -> builder.icon(() -> new ItemStack(ModBlocks.GRAY_BRICKS.get()))
                .title(Component.translatable("itemGroup.betterbricks")));
   }
}

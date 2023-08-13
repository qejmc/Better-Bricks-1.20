package com.qej.betterbricks;

import com.qej.betterbricks.block.ModBlocks;
import com.qej.betterbricks.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = BetterBricks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterBricksTab
{
   public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
           Registries.CREATIVE_MODE_TAB, BetterBricks.MODID);

   public static RegistryObject<CreativeModeTab> BETTER_BRICKS_TAB = CREATIVE_MODE_TABS.register("betterbricks_tab",
           () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GRAY_BRICKS.get()))
                   .title(Component.translatable("itemGroup.betterbricks")).build());

   public static void register(IEventBus eventBus)
   {
      CREATIVE_MODE_TABS.register(eventBus);
   }

}

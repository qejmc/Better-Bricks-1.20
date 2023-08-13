package com.qej.betterbricks;

import com.mojang.logging.LogUtils;
import com.qej.betterbricks.block.ModBlocks;
import com.qej.betterbricks.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.Arrays;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BetterBricks.MODID)
public class BetterBricks
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "betterbricks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace

    public BetterBricks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == BetterBricksTab.BETTER_BRICKS_TAB)
        {
            event.accept(ModItems.MORTAR);
            event.accept(ModItems.TAN_DYE);

            event.accept(ModBlocks.TAN_BRICKS);
            event.accept(ModBlocks.TAN_BRICK_SLAB);
            event.accept(ModBlocks.TAN_BRICK_STAIRS);
            event.accept(ModBlocks.BROWN_MULTICOLOR_BRICK_SLAB);
            event.accept(ModBlocks.BROWN_MULTICOLOR_BRICKS);
            event.accept(ModBlocks.BROWN_MULTICOLOR_BRICK_STAIRS);
            event.accept(ModBlocks.GRAY_BRICK_SLAB);
            event.accept(ModBlocks.GRAY_BRICK_STAIRS);
            event.accept(ModBlocks.GRAY_BRICKS);
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_GRAY_BRICKS);
            event.accept(ModBlocks.SANDSTONE_BRICK_SLAB);
            event.accept(ModBlocks.SANDSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.SANDSTONE_BRICKS);
            event.accept(ModBlocks.TAN_MULTICOLOR_BRICK_SLAB);
            event.accept(ModBlocks.TAN_MULTICOLOR_BRICK_STAIRS);
            event.accept(ModBlocks.TAN_MULTICOLOR_BRICKS);
            event.accept(ModBlocks.WHEAT_BRICK_SLAB);
            event.accept(ModBlocks.WHEAT_BRICK_STAIRS);
            event.accept(ModBlocks.WHEAT_BRICKS);
            event.accept(ModBlocks.WHITE_BRICK_SLAB);
            event.accept(ModBlocks.WHITE_BRICKS);
            event.accept(ModBlocks.WHITE_BRICK_STAIRS);
            event.accept(ModBlocks.WHITE_THIN_BRICK_SLAB);
            event.accept(ModBlocks.WHITE_THIN_BRICK_STAIRS);
            event.accept(ModBlocks.WHITE_THIN_BRICKS);

        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}

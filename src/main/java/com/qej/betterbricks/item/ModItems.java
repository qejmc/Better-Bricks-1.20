package com.qej.betterbricks.item;

import com.qej.betterbricks.BetterBricks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BetterBricks.MODID);

    public static final RegistryObject<Item> MORTAR = ITEMS.register("mortar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TAN_DYE = ITEMS.register("tan_dye",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

package com.qej.betterbricks.block;

import com.qej.betterbricks.BetterBricks;
import com.qej.betterbricks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterBricks.MODID);

    /*
     * STANDARD BRICK BLOCKS
     */
    public static final RegistryObject<Block> TAN_BRICKS = registerBlock("tan_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> GRAY_BRICKS = registerBlock("gray_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> BROWN_MULTICOLOR_BRICKS = registerBlock("brown_multicolor_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> TAN_MULTICOLOR_BRICKS = registerBlock("tan_multicolor_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHEAT_BRICKS = registerBlock("wheat_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHITE_THIN_BRICKS = registerBlock("white_thin_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    /*
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS_ALT = registerBlock("light_gray_bricks_alt",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
            );
    */

    /*
     * STANDARD BRICK STAIRS
     */

    public static final RegistryObject<Block> TAN_BRICK_STAIRS = registerBlock("tan_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> BROWN_MULTICOLOR_BRICK_STAIRS = registerBlock("brown_multicolor_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> TAN_MULTICOLOR_BRICK_STAIRS = registerBlock("tan_multicolor_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_MULTICOLOR_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHEAT_BRICK_STAIRS = registerBlock("wheat_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHEAT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHITE_THIN_BRICK_STAIRS = registerBlock("white_thin_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_THIN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS)
                    .strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops())
            );
    /*
     * STANDARD BRICK SLABS
     */

    public static final RegistryObject<Block> TAN_BRICK_SLAB = registerBlock("tan_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> BROWN_MULTICOLOR_BRICK_SLAB = registerBlock("brown_multicolor_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> TAN_MULTICOLOR_BRICK_SLAB = registerBlock("tan_multicolor_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHEAT_BRICK_SLAB = registerBlock("wheat_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    public static final RegistryObject<Block> WHITE_THIN_BRICK_SLAB = registerBlock("white_thin_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).strength(1.0f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops())
            );

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> obj = BLOCKS.register(name, block);
        registerBlockItem(name, obj);
        return obj;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}

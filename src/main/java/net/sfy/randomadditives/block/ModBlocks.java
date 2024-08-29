package net.sfy.randomadditives.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sfy.randomadditives.RandomAdditives;
import net.sfy.randomadditives.item.ModItems;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(RandomAdditives.MOD_ID);

    public static final DeferredBlock<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.METAL).destroyTime(5F)));

    public static final DeferredBlock<Block> MITHRIL_ORE = registerBlock("mithril_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(3.5F)));

    public static final DeferredBlock<Block> DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).destroyTime(3.5F)));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

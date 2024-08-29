package net.sfy.randomadditives.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sfy.randomadditives.RandomAdditives;
import net.sfy.randomadditives.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomAdditives.MOD_ID);

public static final Supplier<CreativeModeTab> RANDOM_ADDITIVES_CREATIVE_TAB = CREATIVE_MODE_TAB.register("random_additives_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MITHRIL_INGOT.get()))
                .title(Component.translatable("creativetab.randomadditives.random_additives_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.MITHRIL_INGOT);
                    output.accept(ModItems.RAW_MITHRIL);
                    output.accept(ModBlocks.MITHRIL_BLOCK);
                    output.accept(ModBlocks.MITHRIL_ORE);
                    output.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE);
                }).build());


            public static void register(IEventBus eventBus) {
                CREATIVE_MODE_TAB.register(eventBus);
            }
}

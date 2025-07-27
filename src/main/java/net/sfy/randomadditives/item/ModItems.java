package net.sfy.randomadditives.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sfy.randomadditives.RandomAdditives;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RandomAdditives.MOD_ID);

    public static final DeferredItem<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MITHRIL, 3, -2.4F))));
    public static final DeferredItem<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MITHRIL, 1.5F, -3.0F))));
    public static final DeferredItem<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL, 1.0F, -2.8F))));
    public static final DeferredItem<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MITHRIL, 5.0F, -3.0F))));
    public static final DeferredItem<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MITHRIL, -3.0F, 0.0F))));

//    public static final DeferredItem<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet", new Item.Properties()
//            .attributes(ArmorItem.))

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.sfy.randomadditives.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.sfy.randomadditives.util.ModTags;

public class ModToolTiers {
    public static final Tier MITHRIL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL,
            1561, 8.0F, 3.0F, 10, () -> Ingredient.of(ModItems.MITHRIL_INGOT));
}
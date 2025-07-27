package net.sfy.randomadditives.util;

import net.sfy.randomadditives.RandomAdditives;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = createTag("needs_mithril_tool");
        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = createTag("incorrect_for_bismuth_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(RandomAdditives.MOD_ID, name));
        }
    }
}

package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableSlabBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WaxedMossySlabs extends SlabBlock {

    public WaxedMossySlabs() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD));
    }
}

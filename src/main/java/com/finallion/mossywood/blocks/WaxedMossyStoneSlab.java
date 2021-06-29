package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WaxedMossyStoneSlab extends SlabBlock {

    public WaxedMossyStoneSlab() {
        super(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
    }
}

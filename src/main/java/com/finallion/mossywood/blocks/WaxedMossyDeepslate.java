package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WaxedMossyDeepslate extends PillarBlock {

    public WaxedMossyDeepslate() {
        super(FabricBlockSettings.copyOf(Blocks.STONE).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
    }
}

package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableStairsBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WaxedMossyStairs extends StairsBlock {

    public WaxedMossyStairs(BlockState baseBlockState) {
        super(baseBlockState, FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD));
    }
}

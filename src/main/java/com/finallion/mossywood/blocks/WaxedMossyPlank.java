package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WaxedMossyPlank extends Block {

    public WaxedMossyPlank() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD));
    }
}

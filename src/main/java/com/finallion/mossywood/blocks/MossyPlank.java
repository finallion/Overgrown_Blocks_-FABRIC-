package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.sound.BlockSoundGroup;

public class MossyPlank extends OxidizableBlock {
    private final OxidizationLevel oxidizationLevel;

    public MossyPlank(OxidizationLevel oxidizationLevel) {
        super(oxidizationLevel, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD));
        this.oxidizationLevel = oxidizationLevel;
    }
}

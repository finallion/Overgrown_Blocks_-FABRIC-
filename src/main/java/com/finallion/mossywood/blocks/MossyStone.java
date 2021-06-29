package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.sound.BlockSoundGroup;

public class MossyStone extends OxidizableBlock {
    private final OxidizationLevel oxidizationLevel;

    public MossyStone(OxidizationLevel oxidizationLevel) {
        super(oxidizationLevel, FabricBlockSettings.copyOf(Blocks.STONE).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
        this.oxidizationLevel = oxidizationLevel;
    }
}

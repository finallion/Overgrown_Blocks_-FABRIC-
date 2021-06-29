package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableSlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class MossyStoneSlab extends OxidizableSlabBlock {
    private final OxidizationLevel oxidizationLevel;

    public MossyStoneSlab(OxidizationLevel oxidizationLevel) {
        super(oxidizationLevel, FabricBlockSettings.copyOf(Blocks.STONE_SLAB).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
        this.oxidizationLevel = oxidizationLevel;
    }

}

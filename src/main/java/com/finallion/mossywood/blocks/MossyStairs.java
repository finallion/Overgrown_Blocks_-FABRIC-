package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class MossyStairs extends StairsBlock implements Oxidizable {
    private final OxidizationLevel oxidizationLevel;

    public MossyStairs(OxidizationLevel oxidizationLevel, BlockState baseBlockState) {
        super(baseBlockState, FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD));
        this.oxidizationLevel = oxidizationLevel;
    }

    @Override
    public OxidizationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }


    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }
}

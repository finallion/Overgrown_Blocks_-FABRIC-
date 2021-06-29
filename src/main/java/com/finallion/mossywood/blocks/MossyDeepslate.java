package com.finallion.mossywood.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Direction;

public class MossyDeepslate extends OxidizableBlock {
    private final OxidizationLevel oxidizationLevel;
    public static final EnumProperty<Direction.Axis> AXIS;

    public MossyDeepslate(OxidizationLevel oxidizationLevel) {
        super(oxidizationLevel, FabricBlockSettings.copyOf(Blocks.STONE).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
        this.oxidizationLevel = oxidizationLevel;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return changeRotation(state, rotation);
    }

    public static BlockState changeRotation(BlockState state, BlockRotation rotation) {
        switch(rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch((Direction.Axis)state.get(AXIS)) {
                    case X:
                        return (BlockState)state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return (BlockState)state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AXIS});
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    static {
        AXIS = Properties.AXIS;
    }
}

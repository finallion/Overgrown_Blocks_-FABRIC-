package com.finallion.mossywood.mixin;


import com.finallion.mossywood.registry.OxidizableRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;

@Mixin(Oxidizable.class)
public interface OxidizableMixin {

    @Overwrite
    static Optional<Block> getDecreasedOxidationBlock(Block block) {
        return OxidizableRegistry.getDecreasedOxidizationBlock(block);
    }

    @Overwrite
    static Optional<Block> getIncreasedOxidationBlock(Block block) {
        return OxidizableRegistry.getIncreasedOxidizationBlock(block);
    }

    @Overwrite
    static Block getUnaffectedOxidationBlock(Block block) {
        return OxidizableRegistry.getUnaffectedOxidizationBlock(block);
    }

}

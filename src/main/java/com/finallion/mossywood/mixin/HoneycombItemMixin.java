package com.finallion.mossywood.mixin;

import com.finallion.mossywood.registry.OxidizableRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.item.HoneycombItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;

@Mixin(HoneycombItem.class)
public class HoneycombItemMixin {

    @Overwrite
    public static Optional<BlockState> getWaxedState(BlockState state) {
        return OxidizableRegistry.getWaxedState(state);
    }
}
package com.finallion.mossywood.mixin;

import com.finallion.mossywood.registry.OxidizableRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    @Redirect(method = "useOnBlock(Lnet/minecraft/item/ItemUsageContext;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Optional;ofNullable(Ljava/lang/Object;)Ljava/util/Optional;"))
    public <T> Optional<T> redirectGetUnwaxedState(T state, ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        return (Optional<T>) OxidizableRegistry.getUnwaxedBlock(blockState.getBlock());
    }
}

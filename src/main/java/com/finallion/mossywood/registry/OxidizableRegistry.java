package com.finallion.mossywood.registry;

import com.finallion.mossywood.registry.ModBlocks;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.block.*;
import net.minecraft.item.HoneycombItem;


public class OxidizableRegistry {


    // oxidation ++
    public static Supplier<BiMap<Block, Block>> getOxidizationLevelIncreases() {
        ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.builder();

        builder.put(Blocks.OAK_PLANKS, ModBlocks.DAMP_OAK_PLANKS)
                .put(ModBlocks.DAMP_OAK_PLANKS, ModBlocks.MOSSY_OAK_PLANKS)
                .put(ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSS_COVERED_OAK_PLANKS)
                .put(ModBlocks.MOSS_COVERED_OAK_PLANKS, ModBlocks.OVERGROWN_OAK_PLANKS)
                .put(Blocks.OAK_STAIRS, ModBlocks.DAMP_OAK_STAIRS)
                .put(ModBlocks.DAMP_OAK_STAIRS, ModBlocks.MOSSY_OAK_STAIRS)
                .put(ModBlocks.MOSSY_OAK_STAIRS, ModBlocks.MOSS_COVERED_OAK_STAIRS)
                .put(ModBlocks.MOSS_COVERED_OAK_STAIRS, ModBlocks.OVERGROWN_OAK_STAIRS)
                .put(Blocks.OAK_SLAB, ModBlocks.DAMP_OAK_SLAB)
                .put(ModBlocks.DAMP_OAK_SLAB, ModBlocks.MOSSY_OAK_SLAB)
                .put(ModBlocks.MOSSY_OAK_SLAB, ModBlocks.MOSS_COVERED_OAK_SLAB)
                .put(ModBlocks.MOSS_COVERED_OAK_SLAB, ModBlocks.OVERGROWN_OAK_SLAB)
                .put(Blocks.OAK_LOG, ModBlocks.DAMP_OAK_LOG)
                .put(ModBlocks.DAMP_OAK_LOG, ModBlocks.MOSSY_OAK_LOG)
                .put(ModBlocks.MOSSY_OAK_LOG, ModBlocks.MOSS_COVERED_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_OAK_LOG, ModBlocks.OVERGROWN_OAK_LOG)
                .put(Blocks.STRIPPED_OAK_LOG, ModBlocks.DAMP_STRIPPED_OAK_LOG)
                .put(ModBlocks.DAMP_STRIPPED_OAK_LOG, ModBlocks.MOSSY_STRIPPED_OAK_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_OAK_LOG, ModBlocks.MOSS_COVERED_STRIPPED_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_OAK_LOG, ModBlocks.OVERGROWN_STRIPPED_OAK_LOG)

                .put(Blocks.DARK_OAK_PLANKS, ModBlocks.DAMP_DARK_OAK_PLANKS)
                .put(ModBlocks.DAMP_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PLANKS)
                .put(ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSS_COVERED_DARK_OAK_PLANKS)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_PLANKS, ModBlocks.OVERGROWN_DARK_OAK_PLANKS)
                .put(Blocks.DARK_OAK_STAIRS, ModBlocks.DAMP_DARK_OAK_STAIRS)
                .put(ModBlocks.DAMP_DARK_OAK_STAIRS, ModBlocks.MOSSY_DARK_OAK_STAIRS)
                .put(ModBlocks.MOSSY_DARK_OAK_STAIRS, ModBlocks.MOSS_COVERED_DARK_OAK_STAIRS)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_STAIRS, ModBlocks.OVERGROWN_DARK_OAK_STAIRS)
                .put(Blocks.DARK_OAK_SLAB, ModBlocks.DAMP_DARK_OAK_SLAB)
                .put(ModBlocks.DAMP_DARK_OAK_SLAB, ModBlocks.MOSSY_DARK_OAK_SLAB)
                .put(ModBlocks.MOSSY_DARK_OAK_SLAB, ModBlocks.MOSS_COVERED_DARK_OAK_SLAB)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_SLAB, ModBlocks.OVERGROWN_DARK_OAK_SLAB)
                .put(Blocks.DARK_OAK_LOG, ModBlocks.DAMP_DARK_OAK_LOG)
                .put(ModBlocks.DAMP_DARK_OAK_LOG, ModBlocks.MOSSY_DARK_OAK_LOG)
                .put(ModBlocks.MOSSY_DARK_OAK_LOG, ModBlocks.MOSS_COVERED_DARK_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_LOG, ModBlocks.OVERGROWN_DARK_OAK_LOG)
                .put(Blocks.STRIPPED_DARK_OAK_LOG, ModBlocks.DAMP_STRIPPED_DARK_OAK_LOG)
                .put(ModBlocks.DAMP_STRIPPED_DARK_OAK_LOG, ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG, ModBlocks.MOSS_COVERED_STRIPPED_DARK_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_DARK_OAK_LOG, ModBlocks.OVERGROWN_STRIPPED_DARK_OAK_LOG)

                .put(Blocks.ACACIA_PLANKS, ModBlocks.DAMP_ACACIA_PLANKS)
                .put(ModBlocks.DAMP_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PLANKS)
                .put(ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSS_COVERED_ACACIA_PLANKS)
                .put(ModBlocks.MOSS_COVERED_ACACIA_PLANKS, ModBlocks.OVERGROWN_ACACIA_PLANKS)
                .put(Blocks.ACACIA_STAIRS, ModBlocks.DAMP_ACACIA_STAIRS)
                .put(ModBlocks.DAMP_ACACIA_STAIRS, ModBlocks.MOSSY_ACACIA_STAIRS)
                .put(ModBlocks.MOSSY_ACACIA_STAIRS, ModBlocks.MOSS_COVERED_ACACIA_STAIRS)
                .put(ModBlocks.MOSS_COVERED_ACACIA_STAIRS, ModBlocks.OVERGROWN_ACACIA_STAIRS)
                .put(Blocks.ACACIA_SLAB, ModBlocks.DAMP_ACACIA_SLAB)
                .put(ModBlocks.DAMP_ACACIA_SLAB, ModBlocks.MOSSY_ACACIA_SLAB)
                .put(ModBlocks.MOSSY_ACACIA_SLAB, ModBlocks.MOSS_COVERED_ACACIA_SLAB)
                .put(ModBlocks.MOSS_COVERED_ACACIA_SLAB, ModBlocks.OVERGROWN_ACACIA_SLAB)
                .put(Blocks.ACACIA_LOG, ModBlocks.DAMP_ACACIA_LOG)
                .put(ModBlocks.DAMP_ACACIA_LOG, ModBlocks.MOSSY_ACACIA_LOG)
                .put(ModBlocks.MOSSY_ACACIA_LOG, ModBlocks.MOSS_COVERED_ACACIA_LOG)
                .put(ModBlocks.MOSS_COVERED_ACACIA_LOG, ModBlocks.OVERGROWN_ACACIA_LOG)
                .put(Blocks.STRIPPED_ACACIA_LOG, ModBlocks.DAMP_STRIPPED_ACACIA_LOG)
                .put(ModBlocks.DAMP_STRIPPED_ACACIA_LOG, ModBlocks.MOSSY_STRIPPED_ACACIA_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG, ModBlocks.MOSS_COVERED_STRIPPED_ACACIA_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_ACACIA_LOG, ModBlocks.OVERGROWN_STRIPPED_ACACIA_LOG)

                .put(Blocks.JUNGLE_PLANKS, ModBlocks.DAMP_JUNGLE_PLANKS)
                .put(ModBlocks.DAMP_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PLANKS)
                .put(ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSS_COVERED_JUNGLE_PLANKS)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_PLANKS, ModBlocks.OVERGROWN_JUNGLE_PLANKS)
                .put(Blocks.JUNGLE_STAIRS, ModBlocks.DAMP_JUNGLE_STAIRS)
                .put(ModBlocks.DAMP_JUNGLE_STAIRS, ModBlocks.MOSSY_JUNGLE_STAIRS)
                .put(ModBlocks.MOSSY_JUNGLE_STAIRS, ModBlocks.MOSS_COVERED_JUNGLE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_STAIRS, ModBlocks.OVERGROWN_JUNGLE_STAIRS)
                .put(Blocks.JUNGLE_SLAB, ModBlocks.DAMP_JUNGLE_SLAB)
                .put(ModBlocks.DAMP_JUNGLE_SLAB, ModBlocks.MOSSY_JUNGLE_SLAB)
                .put(ModBlocks.MOSSY_JUNGLE_SLAB, ModBlocks.MOSS_COVERED_JUNGLE_SLAB)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_SLAB, ModBlocks.OVERGROWN_JUNGLE_SLAB)
                .put(Blocks.JUNGLE_LOG, ModBlocks.DAMP_JUNGLE_LOG)
                .put(ModBlocks.DAMP_JUNGLE_LOG, ModBlocks.MOSSY_JUNGLE_LOG)
                .put(ModBlocks.MOSSY_JUNGLE_LOG, ModBlocks.MOSS_COVERED_JUNGLE_LOG)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_LOG, ModBlocks.OVERGROWN_JUNGLE_LOG)
                .put(Blocks.STRIPPED_JUNGLE_LOG, ModBlocks.DAMP_STRIPPED_JUNGLE_LOG)
                .put(ModBlocks.DAMP_STRIPPED_JUNGLE_LOG, ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG, ModBlocks.MOSS_COVERED_STRIPPED_JUNGLE_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_JUNGLE_LOG, ModBlocks.OVERGROWN_STRIPPED_JUNGLE_LOG)

                .put(Blocks.BIRCH_PLANKS, ModBlocks.DAMP_BIRCH_PLANKS)
                .put(ModBlocks.DAMP_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PLANKS)
                .put(ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSS_COVERED_BIRCH_PLANKS)
                .put(ModBlocks.MOSS_COVERED_BIRCH_PLANKS, ModBlocks.OVERGROWN_BIRCH_PLANKS)
                .put(Blocks.BIRCH_STAIRS, ModBlocks.DAMP_BIRCH_STAIRS)
                .put(ModBlocks.DAMP_BIRCH_STAIRS, ModBlocks.MOSSY_BIRCH_STAIRS)
                .put(ModBlocks.MOSSY_BIRCH_STAIRS, ModBlocks.MOSS_COVERED_BIRCH_STAIRS)
                .put(ModBlocks.MOSS_COVERED_BIRCH_STAIRS, ModBlocks.OVERGROWN_BIRCH_STAIRS)
                .put(Blocks.BIRCH_SLAB, ModBlocks.DAMP_BIRCH_SLAB)
                .put(ModBlocks.DAMP_BIRCH_SLAB, ModBlocks.MOSSY_BIRCH_SLAB)
                .put(ModBlocks.MOSSY_BIRCH_SLAB, ModBlocks.MOSS_COVERED_BIRCH_SLAB)
                .put(ModBlocks.MOSS_COVERED_BIRCH_SLAB, ModBlocks.OVERGROWN_BIRCH_SLAB)
                .put(Blocks.BIRCH_LOG, ModBlocks.DAMP_BIRCH_LOG)
                .put(ModBlocks.DAMP_BIRCH_LOG, ModBlocks.MOSSY_BIRCH_LOG)
                .put(ModBlocks.MOSSY_BIRCH_LOG, ModBlocks.MOSS_COVERED_BIRCH_LOG)
                .put(ModBlocks.MOSS_COVERED_BIRCH_LOG, ModBlocks.OVERGROWN_BIRCH_LOG)
                .put(Blocks.STRIPPED_BIRCH_LOG, ModBlocks.DAMP_STRIPPED_BIRCH_LOG)
                .put(ModBlocks.DAMP_STRIPPED_BIRCH_LOG, ModBlocks.MOSSY_STRIPPED_BIRCH_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG, ModBlocks.MOSS_COVERED_STRIPPED_BIRCH_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_BIRCH_LOG, ModBlocks.OVERGROWN_STRIPPED_BIRCH_LOG)

                .put(Blocks.SPRUCE_PLANKS, ModBlocks.DAMP_SPRUCE_PLANKS)
                .put(ModBlocks.DAMP_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PLANKS)
                .put(ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSS_COVERED_SPRUCE_PLANKS)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_PLANKS, ModBlocks.OVERGROWN_SPRUCE_PLANKS)
                .put(Blocks.SPRUCE_STAIRS, ModBlocks.DAMP_SPRUCE_STAIRS)
                .put(ModBlocks.DAMP_SPRUCE_STAIRS, ModBlocks.MOSSY_SPRUCE_STAIRS)
                .put(ModBlocks.MOSSY_SPRUCE_STAIRS, ModBlocks.MOSS_COVERED_SPRUCE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_STAIRS, ModBlocks.OVERGROWN_SPRUCE_STAIRS)
                .put(Blocks.SPRUCE_SLAB, ModBlocks.DAMP_SPRUCE_SLAB)
                .put(ModBlocks.DAMP_SPRUCE_SLAB, ModBlocks.MOSSY_SPRUCE_SLAB)
                .put(ModBlocks.MOSSY_SPRUCE_SLAB, ModBlocks.MOSS_COVERED_SPRUCE_SLAB)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_SLAB, ModBlocks.OVERGROWN_SPRUCE_SLAB)
                .put(Blocks.SPRUCE_LOG, ModBlocks.DAMP_SPRUCE_LOG)
                .put(ModBlocks.DAMP_SPRUCE_LOG, ModBlocks.MOSSY_SPRUCE_LOG)
                .put(ModBlocks.MOSSY_SPRUCE_LOG, ModBlocks.MOSS_COVERED_SPRUCE_LOG)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_LOG, ModBlocks.OVERGROWN_SPRUCE_LOG)
                .put(Blocks.STRIPPED_SPRUCE_LOG, ModBlocks.DAMP_STRIPPED_SPRUCE_LOG)
                .put(ModBlocks.DAMP_STRIPPED_SPRUCE_LOG, ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG, ModBlocks.MOSS_COVERED_STRIPPED_SPRUCE_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_SPRUCE_LOG, ModBlocks.OVERGROWN_STRIPPED_SPRUCE_LOG)

                .put(Blocks.STONE, ModBlocks.DAMP_STONE)
                .put(ModBlocks.DAMP_STONE, ModBlocks.MOSSY_STONE)
                .put(ModBlocks.MOSSY_STONE, ModBlocks.MOSS_COVERED_STONE)
                .put(ModBlocks.MOSS_COVERED_STONE, ModBlocks.OVERGROWN_STONE)
                .put(Blocks.STONE_STAIRS, ModBlocks.DAMP_STONE_STAIRS)
                .put(ModBlocks.DAMP_STONE_STAIRS, ModBlocks.MOSSY_STONE_STAIRS)
                .put(ModBlocks.MOSSY_STONE_STAIRS, ModBlocks.MOSS_COVERED_STONE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_STONE_STAIRS, ModBlocks.OVERGROWN_STONE_STAIRS)
                .put(Blocks.STONE_SLAB, ModBlocks.DAMP_STONE_SLAB)
                .put(ModBlocks.DAMP_STONE_SLAB, ModBlocks.MOSSY_STONE_SLAB)
                .put(ModBlocks.MOSSY_STONE_SLAB, ModBlocks.MOSS_COVERED_STONE_SLAB)
                .put(ModBlocks.MOSS_COVERED_STONE_SLAB, ModBlocks.OVERGROWN_STONE_SLAB)
                .put(Blocks.SMOOTH_STONE, ModBlocks.DAMP_SMOOTH_STONE)
                .put(ModBlocks.DAMP_SMOOTH_STONE, ModBlocks.MOSSY_SMOOTH_STONE)
                .put(ModBlocks.MOSSY_SMOOTH_STONE, ModBlocks.MOSS_COVERED_SMOOTH_STONE)
                .put(ModBlocks.MOSS_COVERED_SMOOTH_STONE, ModBlocks.OVERGROWN_SMOOTH_STONE)
                .put(Blocks.SMOOTH_STONE_SLAB, ModBlocks.DAMP_SMOOTH_STONE_SLAB)
                .put(ModBlocks.DAMP_SMOOTH_STONE_SLAB, ModBlocks.MOSSY_SMOOTH_STONE_SLAB)
                .put(ModBlocks.MOSSY_SMOOTH_STONE_SLAB, ModBlocks.MOSS_COVERED_SMOOTH_STONE_SLAB)
                .put(ModBlocks.MOSS_COVERED_SMOOTH_STONE_SLAB, ModBlocks.OVERGROWN_SMOOTH_STONE_SLAB)

                .put(Blocks.DIORITE, ModBlocks.DAMP_DIORITE)
                .put(ModBlocks.DAMP_DIORITE, ModBlocks.MOSSY_DIORITE)
                .put(ModBlocks.MOSSY_DIORITE, ModBlocks.MOSS_COVERED_DIORITE)
                .put(ModBlocks.MOSS_COVERED_DIORITE, ModBlocks.OVERGROWN_DIORITE)
                .put(Blocks.DIORITE_STAIRS, ModBlocks.DAMP_DIORITE_STAIRS)
                .put(ModBlocks.DAMP_DIORITE_STAIRS, ModBlocks.MOSSY_DIORITE_STAIRS)
                .put(ModBlocks.MOSSY_DIORITE_STAIRS, ModBlocks.MOSS_COVERED_DIORITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_DIORITE_STAIRS, ModBlocks.OVERGROWN_DIORITE_STAIRS)
                .put(Blocks.DIORITE_SLAB, ModBlocks.DAMP_DIORITE_SLAB)
                .put(ModBlocks.DAMP_DIORITE_SLAB, ModBlocks.MOSSY_DIORITE_SLAB)
                .put(ModBlocks.MOSSY_DIORITE_SLAB, ModBlocks.MOSS_COVERED_DIORITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_DIORITE_SLAB, ModBlocks.OVERGROWN_DIORITE_SLAB)
                .put(Blocks.POLISHED_DIORITE, ModBlocks.DAMP_POLISHED_DIORITE)
                .put(ModBlocks.DAMP_POLISHED_DIORITE, ModBlocks.MOSSY_POLISHED_DIORITE)
                .put(ModBlocks.MOSSY_POLISHED_DIORITE, ModBlocks.MOSS_COVERED_POLISHED_DIORITE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DIORITE, ModBlocks.OVERGROWN_POLISHED_DIORITE)
                .put(Blocks.POLISHED_DIORITE_STAIRS, ModBlocks.DAMP_POLISHED_DIORITE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_DIORITE_STAIRS, ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS, ModBlocks.MOSS_COVERED_POLISHED_DIORITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DIORITE_STAIRS, ModBlocks.OVERGROWN_POLISHED_DIORITE_STAIRS)
                .put(Blocks.POLISHED_DIORITE_SLAB, ModBlocks.DAMP_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_DIORITE_SLAB, ModBlocks.MOSSY_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB, ModBlocks.MOSS_COVERED_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DIORITE_SLAB, ModBlocks.OVERGROWN_POLISHED_DIORITE_SLAB)

                .put(Blocks.GRANITE, ModBlocks.DAMP_GRANITE)
                .put(ModBlocks.DAMP_GRANITE, ModBlocks.MOSSY_GRANITE)
                .put(ModBlocks.MOSSY_GRANITE, ModBlocks.MOSS_COVERED_GRANITE)
                .put(ModBlocks.MOSS_COVERED_GRANITE, ModBlocks.OVERGROWN_GRANITE)
                .put(Blocks.GRANITE_STAIRS, ModBlocks.DAMP_GRANITE_STAIRS)
                .put(ModBlocks.DAMP_GRANITE_STAIRS, ModBlocks.MOSSY_GRANITE_STAIRS)
                .put(ModBlocks.MOSSY_GRANITE_STAIRS, ModBlocks.MOSS_COVERED_GRANITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_GRANITE_STAIRS, ModBlocks.OVERGROWN_GRANITE_STAIRS)
                .put(Blocks.GRANITE_SLAB, ModBlocks.DAMP_GRANITE_SLAB)
                .put(ModBlocks.DAMP_GRANITE_SLAB, ModBlocks.MOSSY_GRANITE_SLAB)
                .put(ModBlocks.MOSSY_GRANITE_SLAB, ModBlocks.MOSS_COVERED_GRANITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_GRANITE_SLAB, ModBlocks.OVERGROWN_GRANITE_SLAB)
                .put(Blocks.POLISHED_GRANITE, ModBlocks.DAMP_POLISHED_GRANITE)
                .put(ModBlocks.DAMP_POLISHED_GRANITE, ModBlocks.MOSSY_POLISHED_GRANITE)
                .put(ModBlocks.MOSSY_POLISHED_GRANITE, ModBlocks.MOSS_COVERED_POLISHED_GRANITE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_GRANITE, ModBlocks.OVERGROWN_POLISHED_GRANITE)
                .put(Blocks.POLISHED_GRANITE_STAIRS, ModBlocks.DAMP_POLISHED_GRANITE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_GRANITE_STAIRS, ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS, ModBlocks.MOSS_COVERED_POLISHED_GRANITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_GRANITE_STAIRS, ModBlocks.OVERGROWN_POLISHED_GRANITE_STAIRS)
                .put(Blocks.POLISHED_GRANITE_SLAB, ModBlocks.DAMP_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_GRANITE_SLAB, ModBlocks.MOSSY_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB, ModBlocks.MOSS_COVERED_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_GRANITE_SLAB, ModBlocks.OVERGROWN_POLISHED_GRANITE_SLAB)

                .put(Blocks.ANDESITE, ModBlocks.DAMP_ANDESITE)
                .put(ModBlocks.DAMP_ANDESITE, ModBlocks.MOSSY_ANDESITE)
                .put(ModBlocks.MOSSY_ANDESITE, ModBlocks.MOSS_COVERED_ANDESITE)
                .put(ModBlocks.MOSS_COVERED_ANDESITE, ModBlocks.OVERGROWN_ANDESITE)
                .put(Blocks.ANDESITE_STAIRS, ModBlocks.DAMP_ANDESITE_STAIRS)
                .put(ModBlocks.DAMP_ANDESITE_STAIRS, ModBlocks.MOSSY_ANDESITE_STAIRS)
                .put(ModBlocks.MOSSY_ANDESITE_STAIRS, ModBlocks.MOSS_COVERED_ANDESITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_ANDESITE_STAIRS, ModBlocks.OVERGROWN_ANDESITE_STAIRS)
                .put(Blocks.ANDESITE_SLAB, ModBlocks.DAMP_ANDESITE_SLAB)
                .put(ModBlocks.DAMP_ANDESITE_SLAB, ModBlocks.MOSSY_ANDESITE_SLAB)
                .put(ModBlocks.MOSSY_ANDESITE_SLAB, ModBlocks.MOSS_COVERED_ANDESITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_ANDESITE_SLAB, ModBlocks.OVERGROWN_ANDESITE_SLAB)
                .put(Blocks.POLISHED_ANDESITE, ModBlocks.DAMP_POLISHED_ANDESITE)
                .put(ModBlocks.DAMP_POLISHED_ANDESITE, ModBlocks.MOSSY_POLISHED_ANDESITE)
                .put(ModBlocks.MOSSY_POLISHED_ANDESITE, ModBlocks.MOSS_COVERED_POLISHED_ANDESITE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE, ModBlocks.OVERGROWN_POLISHED_ANDESITE)
                .put(Blocks.POLISHED_ANDESITE_STAIRS, ModBlocks.DAMP_POLISHED_ANDESITE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_ANDESITE_STAIRS, ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS, ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_STAIRS, ModBlocks.OVERGROWN_POLISHED_ANDESITE_STAIRS)
                .put(Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.DAMP_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_ANDESITE_SLAB, ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB, ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_SLAB, ModBlocks.OVERGROWN_POLISHED_ANDESITE_SLAB)

                .put(Blocks.DEEPSLATE, ModBlocks.DAMP_DEEPSLATE)
                .put(ModBlocks.DAMP_DEEPSLATE, ModBlocks.MOSSY_DEEPSLATE)
                .put(ModBlocks.MOSSY_DEEPSLATE, ModBlocks.MOSS_COVERED_DEEPSLATE)
                .put(ModBlocks.MOSS_COVERED_DEEPSLATE, ModBlocks.OVERGROWN_DEEPSLATE)
                .put(Blocks.POLISHED_DEEPSLATE, ModBlocks.DAMP_POLISHED_DEEPSLATE)
                .put(ModBlocks.DAMP_POLISHED_DEEPSLATE, ModBlocks.MOSSY_POLISHED_DEEPSLATE)
                .put(ModBlocks.MOSSY_POLISHED_DEEPSLATE, ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE, ModBlocks.OVERGROWN_POLISHED_DEEPSLATE)
                .put(Blocks.POLISHED_DEEPSLATE_STAIRS, ModBlocks.DAMP_POLISHED_DEEPSLATE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_POLISHED_DEEPSLATE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_DEEPSLATE_STAIRS, ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS, ModBlocks.OVERGROWN_POLISHED_DEEPSLATE_STAIRS)
                .put(Blocks.POLISHED_DEEPSLATE_SLAB, ModBlocks.DAMP_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_DEEPSLATE_SLAB, ModBlocks.MOSSY_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_DEEPSLATE_SLAB, ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_SLAB, ModBlocks.OVERGROWN_POLISHED_DEEPSLATE_SLAB)

                .build();

        builder.putAll(Oxidizable.OXIDATION_LEVEL_INCREASES.get());

        return Suppliers.memoize(builder::build);
    }

    public static Optional<Block> getIncreasedOxidizationBlock(Block block) {
        return Optional.ofNullable(getOxidizationLevelIncreases().get().get(block));
    }

    public static Optional<BlockState> getIncreasedOxidizationState(BlockState state) {
        return getIncreasedOxidizationBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }


    // oxidation --
    public static Supplier<BiMap<Block, Block>> getOxidizationLevelDecreases() {
        return Suppliers.memoize(() -> getOxidizationLevelIncreases().get().inverse());
    }

    public static Optional<Block> getDecreasedOxidizationBlock(Block block) {
        return Optional.ofNullable(getOxidizationLevelDecreases().get().get(block));
    }

    public static Optional<BlockState> getDecreasedOxidizationState(BlockState state) {
        return getDecreasedOxidizationBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }


    // waxed ++
    public static Supplier<BiMap<Block, Block>> getUnwaxedToWaxed() {
        ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.builder();

        builder.putAll(HoneycombItem.UNWAXED_TO_WAXED_BLOCKS.get());

        builder.put(ModBlocks.DAMP_OAK_PLANKS, ModBlocks.WAXED_DAMP_OAK_PLANKS)
                .put(ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.WAXED_MOSSY_OAK_PLANKS)
                .put(ModBlocks.MOSS_COVERED_OAK_PLANKS, ModBlocks.WAXED_MOSS_COVERED_OAK_PLANKS)
                .put(ModBlocks.OVERGROWN_OAK_PLANKS, ModBlocks.WAXED_OVERGROWN_OAK_PLANKS)
                .put(ModBlocks.DAMP_OAK_SLAB, ModBlocks.WAXED_DAMP_OAK_SLAB)
                .put(ModBlocks.MOSSY_OAK_SLAB, ModBlocks.WAXED_MOSSY_OAK_SLAB)
                .put(ModBlocks.MOSS_COVERED_OAK_SLAB, ModBlocks.WAXED_MOSS_COVERED_OAK_SLAB)
                .put(ModBlocks.OVERGROWN_OAK_SLAB, ModBlocks.WAXED_OVERGROWN_OAK_SLAB)
                .put(ModBlocks.DAMP_OAK_STAIRS, ModBlocks.WAXED_DAMP_OAK_STAIRS)
                .put(ModBlocks.MOSSY_OAK_STAIRS, ModBlocks.WAXED_MOSSY_OAK_STAIRS)
                .put(ModBlocks.MOSS_COVERED_OAK_STAIRS, ModBlocks.WAXED_MOSS_COVERED_OAK_STAIRS)
                .put(ModBlocks.OVERGROWN_OAK_STAIRS, ModBlocks.WAXED_OVERGROWN_OAK_STAIRS)
                .put(ModBlocks.DAMP_OAK_LOG, ModBlocks.WAXED_DAMP_OAK_LOG)
                .put(ModBlocks.MOSSY_OAK_LOG, ModBlocks.WAXED_MOSSY_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_OAK_LOG, ModBlocks.WAXED_MOSS_COVERED_OAK_LOG)
                .put(ModBlocks.OVERGROWN_OAK_LOG, ModBlocks.WAXED_OVERGROWN_OAK_LOG)
                .put(ModBlocks.DAMP_STRIPPED_OAK_LOG, ModBlocks.WAXED_DAMP_STRIPPED_OAK_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_OAK_LOG, ModBlocks.WAXED_MOSSY_STRIPPED_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_OAK_LOG, ModBlocks.WAXED_MOSS_COVERED_STRIPPED_OAK_LOG)
                .put(ModBlocks.OVERGROWN_STRIPPED_OAK_LOG, ModBlocks.WAXED_OVERGROWN_STRIPPED_OAK_LOG)

                .put(ModBlocks.DAMP_DARK_OAK_PLANKS, ModBlocks.WAXED_DAMP_DARK_OAK_PLANKS)
                .put(ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.WAXED_MOSSY_DARK_OAK_PLANKS)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_PLANKS, ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_PLANKS)
                .put(ModBlocks.OVERGROWN_DARK_OAK_PLANKS, ModBlocks.WAXED_OVERGROWN_DARK_OAK_PLANKS)
                .put(ModBlocks.DAMP_DARK_OAK_SLAB, ModBlocks.WAXED_DAMP_DARK_OAK_SLAB)
                .put(ModBlocks.MOSSY_DARK_OAK_SLAB, ModBlocks.WAXED_MOSSY_DARK_OAK_SLAB)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_SLAB, ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_SLAB)
                .put(ModBlocks.OVERGROWN_DARK_OAK_SLAB, ModBlocks.WAXED_OVERGROWN_DARK_OAK_SLAB)
                .put(ModBlocks.DAMP_DARK_OAK_STAIRS, ModBlocks.WAXED_DAMP_DARK_OAK_STAIRS)
                .put(ModBlocks.MOSSY_DARK_OAK_STAIRS, ModBlocks.WAXED_MOSSY_DARK_OAK_STAIRS)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_STAIRS, ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_STAIRS)
                .put(ModBlocks.OVERGROWN_DARK_OAK_STAIRS, ModBlocks.WAXED_OVERGROWN_DARK_OAK_STAIRS)
                .put(ModBlocks.DAMP_DARK_OAK_LOG, ModBlocks.WAXED_DAMP_DARK_OAK_LOG)
                .put(ModBlocks.MOSSY_DARK_OAK_LOG, ModBlocks.WAXED_MOSSY_DARK_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_DARK_OAK_LOG, ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_LOG)
                .put(ModBlocks.OVERGROWN_DARK_OAK_LOG, ModBlocks.WAXED_OVERGROWN_DARK_OAK_LOG)
                .put(ModBlocks.DAMP_STRIPPED_DARK_OAK_LOG, ModBlocks.WAXED_DAMP_STRIPPED_DARK_OAK_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG, ModBlocks.WAXED_MOSSY_STRIPPED_DARK_OAK_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_DARK_OAK_LOG, ModBlocks.WAXED_MOSS_COVERED_STRIPPED_DARK_OAK_LOG)
                .put(ModBlocks.OVERGROWN_STRIPPED_DARK_OAK_LOG, ModBlocks.WAXED_OVERGROWN_STRIPPED_DARK_OAK_LOG)

                .put(ModBlocks.DAMP_ACACIA_PLANKS, ModBlocks.WAXED_DAMP_ACACIA_PLANKS)
                .put(ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.WAXED_MOSSY_ACACIA_PLANKS)
                .put(ModBlocks.MOSS_COVERED_ACACIA_PLANKS, ModBlocks.WAXED_MOSS_COVERED_ACACIA_PLANKS)
                .put(ModBlocks.OVERGROWN_ACACIA_PLANKS, ModBlocks.WAXED_OVERGROWN_ACACIA_PLANKS)
                .put(ModBlocks.DAMP_ACACIA_SLAB, ModBlocks.WAXED_DAMP_ACACIA_SLAB)
                .put(ModBlocks.MOSSY_ACACIA_SLAB, ModBlocks.WAXED_MOSSY_ACACIA_SLAB)
                .put(ModBlocks.MOSS_COVERED_ACACIA_SLAB, ModBlocks.WAXED_MOSS_COVERED_ACACIA_SLAB)
                .put(ModBlocks.OVERGROWN_ACACIA_SLAB, ModBlocks.WAXED_OVERGROWN_ACACIA_SLAB)
                .put(ModBlocks.DAMP_ACACIA_STAIRS, ModBlocks.WAXED_DAMP_ACACIA_STAIRS)
                .put(ModBlocks.MOSSY_ACACIA_STAIRS, ModBlocks.WAXED_MOSSY_ACACIA_STAIRS)
                .put(ModBlocks.MOSS_COVERED_ACACIA_STAIRS, ModBlocks.WAXED_MOSS_COVERED_ACACIA_STAIRS)
                .put(ModBlocks.OVERGROWN_ACACIA_STAIRS, ModBlocks.WAXED_OVERGROWN_ACACIA_STAIRS)
                .put(ModBlocks.DAMP_ACACIA_LOG, ModBlocks.WAXED_DAMP_ACACIA_LOG)
                .put(ModBlocks.MOSSY_ACACIA_LOG, ModBlocks.WAXED_MOSSY_ACACIA_LOG)
                .put(ModBlocks.MOSS_COVERED_ACACIA_LOG, ModBlocks.WAXED_MOSS_COVERED_ACACIA_LOG)
                .put(ModBlocks.OVERGROWN_ACACIA_LOG, ModBlocks.WAXED_OVERGROWN_ACACIA_LOG)
                .put(ModBlocks.DAMP_STRIPPED_ACACIA_LOG, ModBlocks.WAXED_DAMP_STRIPPED_ACACIA_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG, ModBlocks.WAXED_MOSSY_STRIPPED_ACACIA_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_ACACIA_LOG, ModBlocks.WAXED_MOSS_COVERED_STRIPPED_ACACIA_LOG)
                .put(ModBlocks.OVERGROWN_STRIPPED_ACACIA_LOG, ModBlocks.WAXED_OVERGROWN_STRIPPED_ACACIA_LOG)

                .put(ModBlocks.DAMP_JUNGLE_PLANKS, ModBlocks.WAXED_DAMP_JUNGLE_PLANKS)
                .put(ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.WAXED_MOSSY_JUNGLE_PLANKS)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_PLANKS, ModBlocks.WAXED_MOSS_COVERED_JUNGLE_PLANKS)
                .put(ModBlocks.OVERGROWN_JUNGLE_PLANKS, ModBlocks.WAXED_OVERGROWN_JUNGLE_PLANKS)
                .put(ModBlocks.DAMP_JUNGLE_SLAB, ModBlocks.WAXED_DAMP_JUNGLE_SLAB)
                .put(ModBlocks.MOSSY_JUNGLE_SLAB, ModBlocks.WAXED_MOSSY_JUNGLE_SLAB)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_SLAB, ModBlocks.WAXED_MOSS_COVERED_JUNGLE_SLAB)
                .put(ModBlocks.OVERGROWN_JUNGLE_SLAB, ModBlocks.WAXED_OVERGROWN_JUNGLE_SLAB)
                .put(ModBlocks.DAMP_JUNGLE_STAIRS, ModBlocks.WAXED_DAMP_JUNGLE_STAIRS)
                .put(ModBlocks.MOSSY_JUNGLE_STAIRS, ModBlocks.WAXED_MOSSY_JUNGLE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_JUNGLE_STAIRS)
                .put(ModBlocks.OVERGROWN_JUNGLE_STAIRS, ModBlocks.WAXED_OVERGROWN_JUNGLE_STAIRS)
                .put(ModBlocks.DAMP_JUNGLE_LOG, ModBlocks.WAXED_DAMP_JUNGLE_LOG)
                .put(ModBlocks.MOSSY_JUNGLE_LOG, ModBlocks.WAXED_MOSSY_JUNGLE_LOG)
                .put(ModBlocks.MOSS_COVERED_JUNGLE_LOG, ModBlocks.WAXED_MOSS_COVERED_JUNGLE_LOG)
                .put(ModBlocks.OVERGROWN_JUNGLE_LOG, ModBlocks.WAXED_OVERGROWN_JUNGLE_LOG)
                .put(ModBlocks.DAMP_STRIPPED_JUNGLE_LOG, ModBlocks.WAXED_DAMP_STRIPPED_JUNGLE_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG, ModBlocks.WAXED_MOSSY_STRIPPED_JUNGLE_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_JUNGLE_LOG, ModBlocks.WAXED_MOSS_COVERED_STRIPPED_JUNGLE_LOG)
                .put(ModBlocks.OVERGROWN_STRIPPED_JUNGLE_LOG, ModBlocks.WAXED_OVERGROWN_STRIPPED_JUNGLE_LOG)

                .put(ModBlocks.DAMP_BIRCH_PLANKS, ModBlocks.WAXED_DAMP_BIRCH_PLANKS)
                .put(ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.WAXED_MOSSY_BIRCH_PLANKS)
                .put(ModBlocks.MOSS_COVERED_BIRCH_PLANKS, ModBlocks.WAXED_MOSS_COVERED_BIRCH_PLANKS)
                .put(ModBlocks.OVERGROWN_BIRCH_PLANKS, ModBlocks.WAXED_OVERGROWN_BIRCH_PLANKS)
                .put(ModBlocks.DAMP_BIRCH_SLAB, ModBlocks.WAXED_DAMP_BIRCH_SLAB)
                .put(ModBlocks.MOSSY_BIRCH_SLAB, ModBlocks.WAXED_MOSSY_BIRCH_SLAB)
                .put(ModBlocks.MOSS_COVERED_BIRCH_SLAB, ModBlocks.WAXED_MOSS_COVERED_BIRCH_SLAB)
                .put(ModBlocks.OVERGROWN_BIRCH_SLAB, ModBlocks.WAXED_OVERGROWN_BIRCH_SLAB)
                .put(ModBlocks.DAMP_BIRCH_STAIRS, ModBlocks.WAXED_DAMP_BIRCH_STAIRS)
                .put(ModBlocks.MOSSY_BIRCH_STAIRS, ModBlocks.WAXED_MOSSY_BIRCH_STAIRS)
                .put(ModBlocks.MOSS_COVERED_BIRCH_STAIRS, ModBlocks.WAXED_MOSS_COVERED_BIRCH_STAIRS)
                .put(ModBlocks.OVERGROWN_BIRCH_STAIRS, ModBlocks.WAXED_OVERGROWN_BIRCH_STAIRS)
                .put(ModBlocks.DAMP_BIRCH_LOG, ModBlocks.WAXED_DAMP_BIRCH_LOG)
                .put(ModBlocks.MOSSY_BIRCH_LOG, ModBlocks.WAXED_MOSSY_BIRCH_LOG)
                .put(ModBlocks.MOSS_COVERED_BIRCH_LOG, ModBlocks.WAXED_MOSS_COVERED_BIRCH_LOG)
                .put(ModBlocks.OVERGROWN_BIRCH_LOG, ModBlocks.WAXED_OVERGROWN_BIRCH_LOG)
                .put(ModBlocks.DAMP_STRIPPED_BIRCH_LOG, ModBlocks.WAXED_DAMP_STRIPPED_BIRCH_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG, ModBlocks.WAXED_MOSSY_STRIPPED_BIRCH_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_BIRCH_LOG, ModBlocks.WAXED_MOSS_COVERED_STRIPPED_BIRCH_LOG)
                .put(ModBlocks.OVERGROWN_STRIPPED_BIRCH_LOG, ModBlocks.WAXED_OVERGROWN_STRIPPED_BIRCH_LOG)

                .put(ModBlocks.DAMP_SPRUCE_PLANKS, ModBlocks.WAXED_DAMP_SPRUCE_PLANKS)
                .put(ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.WAXED_MOSSY_SPRUCE_PLANKS)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_PLANKS, ModBlocks.WAXED_MOSS_COVERED_SPRUCE_PLANKS)
                .put(ModBlocks.OVERGROWN_SPRUCE_PLANKS, ModBlocks.WAXED_OVERGROWN_SPRUCE_PLANKS)
                .put(ModBlocks.DAMP_SPRUCE_SLAB, ModBlocks.WAXED_DAMP_SPRUCE_SLAB)
                .put(ModBlocks.MOSSY_SPRUCE_SLAB, ModBlocks.WAXED_MOSSY_SPRUCE_SLAB)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_SLAB, ModBlocks.WAXED_MOSS_COVERED_SPRUCE_SLAB)
                .put(ModBlocks.OVERGROWN_SPRUCE_SLAB, ModBlocks.WAXED_OVERGROWN_SPRUCE_SLAB)
                .put(ModBlocks.DAMP_SPRUCE_STAIRS, ModBlocks.WAXED_DAMP_SPRUCE_STAIRS)
                .put(ModBlocks.MOSSY_SPRUCE_STAIRS, ModBlocks.WAXED_MOSSY_SPRUCE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_SPRUCE_STAIRS)
                .put(ModBlocks.OVERGROWN_SPRUCE_STAIRS, ModBlocks.WAXED_OVERGROWN_SPRUCE_STAIRS)
                .put(ModBlocks.DAMP_SPRUCE_LOG, ModBlocks.WAXED_DAMP_SPRUCE_LOG)
                .put(ModBlocks.MOSSY_SPRUCE_LOG, ModBlocks.WAXED_MOSSY_SPRUCE_LOG)
                .put(ModBlocks.MOSS_COVERED_SPRUCE_LOG, ModBlocks.WAXED_MOSS_COVERED_SPRUCE_LOG)
                .put(ModBlocks.OVERGROWN_SPRUCE_LOG, ModBlocks.WAXED_OVERGROWN_SPRUCE_LOG)
                .put(ModBlocks.DAMP_STRIPPED_SPRUCE_LOG, ModBlocks.WAXED_DAMP_STRIPPED_SPRUCE_LOG)
                .put(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG, ModBlocks.WAXED_MOSSY_STRIPPED_SPRUCE_LOG)
                .put(ModBlocks.MOSS_COVERED_STRIPPED_SPRUCE_LOG, ModBlocks.WAXED_MOSS_COVERED_STRIPPED_SPRUCE_LOG)
                .put(ModBlocks.OVERGROWN_STRIPPED_SPRUCE_LOG, ModBlocks.WAXED_OVERGROWN_STRIPPED_SPRUCE_LOG)

                .put(ModBlocks.DAMP_STONE, ModBlocks.WAXED_DAMP_STONE)
                .put(ModBlocks.MOSSY_STONE, ModBlocks.WAXED_MOSSY_STONE)
                .put(ModBlocks.MOSS_COVERED_STONE, ModBlocks.WAXED_MOSS_COVERED_STONE)
                .put(ModBlocks.OVERGROWN_STONE, ModBlocks.WAXED_OVERGROWN_STONE)
                .put(ModBlocks.DAMP_STONE_SLAB, ModBlocks.WAXED_DAMP_STONE_SLAB)
                .put(ModBlocks.MOSSY_STONE_SLAB, ModBlocks.WAXED_MOSSY_STONE_SLAB)
                .put(ModBlocks.MOSS_COVERED_STONE_SLAB, ModBlocks.WAXED_MOSS_COVERED_STONE_SLAB)
                .put(ModBlocks.OVERGROWN_STONE_SLAB, ModBlocks.WAXED_OVERGROWN_STONE_SLAB)
                .put(ModBlocks.DAMP_STONE_STAIRS, ModBlocks.WAXED_DAMP_STONE_STAIRS)
                .put(ModBlocks.MOSSY_STONE_STAIRS, ModBlocks.WAXED_MOSSY_STONE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_STONE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_STONE_STAIRS)
                .put(ModBlocks.OVERGROWN_STONE_STAIRS, ModBlocks.WAXED_OVERGROWN_STONE_STAIRS)
                .put(ModBlocks.DAMP_SMOOTH_STONE, ModBlocks.WAXED_DAMP_SMOOTH_STONE)
                .put(ModBlocks.MOSSY_SMOOTH_STONE, ModBlocks.WAXED_MOSSY_SMOOTH_STONE)
                .put(ModBlocks.MOSS_COVERED_SMOOTH_STONE, ModBlocks.WAXED_MOSS_COVERED_SMOOTH_STONE)
                .put(ModBlocks.OVERGROWN_SMOOTH_STONE, ModBlocks.WAXED_OVERGROWN_SMOOTH_STONE)
                .put(ModBlocks.DAMP_SMOOTH_STONE_SLAB, ModBlocks.WAXED_DAMP_SMOOTH_STONE_SLAB)
                .put(ModBlocks.MOSSY_SMOOTH_STONE_SLAB, ModBlocks.WAXED_MOSSY_SMOOTH_STONE_SLAB)
                .put(ModBlocks.MOSS_COVERED_SMOOTH_STONE_SLAB, ModBlocks.WAXED_MOSS_COVERED_SMOOTH_STONE_SLAB)
                .put(ModBlocks.OVERGROWN_SMOOTH_STONE_SLAB, ModBlocks.WAXED_OVERGROWN_SMOOTH_STONE_SLAB)

                .put(ModBlocks.DAMP_DIORITE, ModBlocks.WAXED_DAMP_DIORITE)
                .put(ModBlocks.MOSSY_DIORITE, ModBlocks.WAXED_MOSSY_DIORITE)
                .put(ModBlocks.MOSS_COVERED_DIORITE, ModBlocks.WAXED_MOSS_COVERED_DIORITE)
                .put(ModBlocks.OVERGROWN_DIORITE, ModBlocks.WAXED_OVERGROWN_DIORITE)
                .put(ModBlocks.DAMP_DIORITE_SLAB, ModBlocks.WAXED_DAMP_DIORITE_SLAB)
                .put(ModBlocks.MOSSY_DIORITE_SLAB, ModBlocks.WAXED_MOSSY_DIORITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_DIORITE_SLAB, ModBlocks.WAXED_MOSS_COVERED_DIORITE_SLAB)
                .put(ModBlocks.OVERGROWN_DIORITE_SLAB, ModBlocks.WAXED_OVERGROWN_DIORITE_SLAB)
                .put(ModBlocks.DAMP_DIORITE_STAIRS, ModBlocks.WAXED_DAMP_DIORITE_STAIRS)
                .put(ModBlocks.MOSSY_DIORITE_STAIRS, ModBlocks.WAXED_MOSSY_DIORITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_DIORITE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_DIORITE_STAIRS)
                .put(ModBlocks.OVERGROWN_DIORITE_STAIRS, ModBlocks.WAXED_OVERGROWN_DIORITE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_DIORITE, ModBlocks.WAXED_DAMP_POLISHED_DIORITE)
                .put(ModBlocks.MOSSY_POLISHED_DIORITE, ModBlocks.WAXED_MOSSY_POLISHED_DIORITE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DIORITE, ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE)
                .put(ModBlocks.OVERGROWN_POLISHED_DIORITE, ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE)
                .put(ModBlocks.DAMP_POLISHED_DIORITE_SLAB, ModBlocks.WAXED_DAMP_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB, ModBlocks.WAXED_MOSSY_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DIORITE_SLAB, ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.OVERGROWN_POLISHED_DIORITE_SLAB, ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_DIORITE_STAIRS, ModBlocks.WAXED_DAMP_POLISHED_DIORITE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS, ModBlocks.WAXED_MOSSY_POLISHED_DIORITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DIORITE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE_STAIRS)
                .put(ModBlocks.OVERGROWN_POLISHED_DIORITE_STAIRS, ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE_STAIRS)

                .put(ModBlocks.DAMP_GRANITE, ModBlocks.WAXED_DAMP_GRANITE)
                .put(ModBlocks.MOSSY_GRANITE, ModBlocks.WAXED_MOSSY_GRANITE)
                .put(ModBlocks.MOSS_COVERED_GRANITE, ModBlocks.WAXED_MOSS_COVERED_GRANITE)
                .put(ModBlocks.OVERGROWN_GRANITE, ModBlocks.WAXED_OVERGROWN_GRANITE)
                .put(ModBlocks.DAMP_GRANITE_SLAB, ModBlocks.WAXED_DAMP_GRANITE_SLAB)
                .put(ModBlocks.MOSSY_GRANITE_SLAB, ModBlocks.WAXED_MOSSY_GRANITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_GRANITE_SLAB, ModBlocks.WAXED_MOSS_COVERED_GRANITE_SLAB)
                .put(ModBlocks.OVERGROWN_GRANITE_SLAB, ModBlocks.WAXED_OVERGROWN_GRANITE_SLAB)
                .put(ModBlocks.DAMP_GRANITE_STAIRS, ModBlocks.WAXED_DAMP_GRANITE_STAIRS)
                .put(ModBlocks.MOSSY_GRANITE_STAIRS, ModBlocks.WAXED_MOSSY_GRANITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_GRANITE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_GRANITE_STAIRS)
                .put(ModBlocks.OVERGROWN_GRANITE_STAIRS, ModBlocks.WAXED_OVERGROWN_GRANITE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_GRANITE, ModBlocks.WAXED_DAMP_POLISHED_GRANITE)
                .put(ModBlocks.MOSSY_POLISHED_GRANITE, ModBlocks.WAXED_MOSSY_POLISHED_GRANITE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_GRANITE, ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE)
                .put(ModBlocks.OVERGROWN_POLISHED_GRANITE, ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE)
                .put(ModBlocks.DAMP_POLISHED_GRANITE_SLAB, ModBlocks.WAXED_DAMP_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB, ModBlocks.WAXED_MOSSY_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_GRANITE_SLAB, ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.OVERGROWN_POLISHED_GRANITE_SLAB, ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_GRANITE_STAIRS, ModBlocks.WAXED_DAMP_POLISHED_GRANITE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS, ModBlocks.WAXED_MOSSY_POLISHED_GRANITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_GRANITE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE_STAIRS)
                .put(ModBlocks.OVERGROWN_POLISHED_GRANITE_STAIRS, ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE_STAIRS)

                .put(ModBlocks.DAMP_ANDESITE, ModBlocks.WAXED_DAMP_ANDESITE)
                .put(ModBlocks.MOSSY_ANDESITE, ModBlocks.WAXED_MOSSY_ANDESITE)
                .put(ModBlocks.MOSS_COVERED_ANDESITE, ModBlocks.WAXED_MOSS_COVERED_ANDESITE)
                .put(ModBlocks.OVERGROWN_ANDESITE, ModBlocks.WAXED_OVERGROWN_ANDESITE)
                .put(ModBlocks.DAMP_ANDESITE_SLAB, ModBlocks.WAXED_DAMP_ANDESITE_SLAB)
                .put(ModBlocks.MOSSY_ANDESITE_SLAB, ModBlocks.WAXED_MOSSY_ANDESITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_ANDESITE_SLAB, ModBlocks.WAXED_MOSS_COVERED_ANDESITE_SLAB)
                .put(ModBlocks.OVERGROWN_ANDESITE_SLAB, ModBlocks.WAXED_OVERGROWN_ANDESITE_SLAB)
                .put(ModBlocks.DAMP_ANDESITE_STAIRS, ModBlocks.WAXED_DAMP_ANDESITE_STAIRS)
                .put(ModBlocks.MOSSY_ANDESITE_STAIRS, ModBlocks.WAXED_MOSSY_ANDESITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_ANDESITE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_ANDESITE_STAIRS)
                .put(ModBlocks.OVERGROWN_ANDESITE_STAIRS, ModBlocks.WAXED_OVERGROWN_ANDESITE_STAIRS)
                .put(ModBlocks.DAMP_POLISHED_ANDESITE, ModBlocks.WAXED_DAMP_POLISHED_ANDESITE)
                .put(ModBlocks.MOSSY_POLISHED_ANDESITE, ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE, ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE)
                .put(ModBlocks.OVERGROWN_POLISHED_ANDESITE, ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE)
                .put(ModBlocks.DAMP_POLISHED_ANDESITE_SLAB, ModBlocks.WAXED_DAMP_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB, ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_SLAB, ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.OVERGROWN_POLISHED_ANDESITE_SLAB, ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_ANDESITE_STAIRS, ModBlocks.WAXED_DAMP_POLISHED_ANDESITE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS, ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE_STAIRS)
                .put(ModBlocks.OVERGROWN_POLISHED_ANDESITE_STAIRS, ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE_STAIRS)

                .put(ModBlocks.DAMP_DEEPSLATE, ModBlocks.WAXED_DAMP_DEEPSLATE)
                .put(ModBlocks.MOSSY_DEEPSLATE, ModBlocks.WAXED_MOSSY_DEEPSLATE)
                .put(ModBlocks.MOSS_COVERED_DEEPSLATE, ModBlocks.WAXED_MOSS_COVERED_DEEPSLATE)
                .put(ModBlocks.OVERGROWN_DEEPSLATE, ModBlocks.WAXED_OVERGROWN_DEEPSLATE)
                .put(ModBlocks.DAMP_POLISHED_DEEPSLATE, ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE)
                .put(ModBlocks.MOSSY_POLISHED_DEEPSLATE, ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE, ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE)
                .put(ModBlocks.OVERGROWN_POLISHED_DEEPSLATE, ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE)
                .put(ModBlocks.DAMP_POLISHED_DEEPSLATE_SLAB, ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.MOSSY_POLISHED_DEEPSLATE_SLAB, ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_SLAB, ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.OVERGROWN_POLISHED_DEEPSLATE_SLAB, ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE_SLAB)
                .put(ModBlocks.DAMP_POLISHED_DEEPSLATE_STAIRS, ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE_STAIRS)
                .put(ModBlocks.MOSSY_POLISHED_DEEPSLATE_STAIRS, ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE_STAIRS)
                .put(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS, ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS)
                .put(ModBlocks.OVERGROWN_POLISHED_DEEPSLATE_STAIRS, ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE_STAIRS)


                .build();

        return Suppliers.memoize(builder::build);
    }

    public static Optional<Block> getWaxedBlock(Block block) {
        return Optional.ofNullable(getUnwaxedToWaxed().get().get(block));
    }

    public static Optional<BlockState> getWaxedState(BlockState state) {
        return getWaxedBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }

    // waxed --;
    public static Supplier<BiMap<Block, Block>> getWaxedToUnwaxed() {
        return Suppliers.memoize(() -> getUnwaxedToWaxed().get().inverse());
    }

    public static Optional<Block> getUnwaxedBlock(Block block) {
        return Optional.ofNullable(getWaxedToUnwaxed().get().get(block));
    }

    public static Optional<BlockState> getUnwaxedState(BlockState state) {
        return getUnwaxedBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }


    // base
    public static Block getUnaffectedOxidizationBlock(Block block) {
        Block block2 = block;

        for(Block block3 = getOxidizationLevelDecreases().get().get(block); block3 != null; block3 = getOxidizationLevelDecreases().get().get(block3)) {
            block2 = block3;
        }

        return block2;
    }

    public static BlockState getUnaffectedOxidizationState(BlockState state) {
        return getUnaffectedOxidizationBlock(state.getBlock()).getStateWithProperties(state);
    }
}

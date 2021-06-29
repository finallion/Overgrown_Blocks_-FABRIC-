package com.finallion.mossywood.registry;

import com.finallion.mossywood.MossyWood;
import com.finallion.mossywood.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static List<Block> blocksList = new ArrayList<>();

    public static void registerBlocks() { }

    public static Block createBlock(Block block, String id) {
        Registry.register(Registry.BLOCK, new Identifier(MossyWood.MOD_ID, id), block);
        blocksList.add(block);
        return block;
    }


    // oak
    public static final Block DAMP_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_oak_planks");
    public static final Block MOSSY_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.EXPOSED), "mossy_oak_planks");
    public static final Block MOSS_COVERED_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_oak_planks");
    public static final Block OVERGROWN_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_oak_planks");

    public static final Block WAXED_DAMP_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_damp_oak_planks");
    public static final Block WAXED_MOSSY_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_mossy_oak_planks");
    public static final Block WAXED_MOSS_COVERED_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_moss_covered_oak_planks");
    public static final Block WAXED_OVERGROWN_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_overgrown_oak_planks");

    public static final Block DAMP_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.UNAFFECTED, DAMP_OAK_PLANKS.getDefaultState()), "damp_oak_stairs");
    public static final Block MOSSY_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.EXPOSED, MOSSY_OAK_PLANKS.getDefaultState()), "mossy_oak_stairs");
    public static final Block MOSS_COVERED_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.WEATHERED, MOSS_COVERED_OAK_PLANKS.getDefaultState()), "moss_covered_oak_stairs");
    public static final Block OVERGROWN_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.OXIDIZED, OVERGROWN_OAK_PLANKS.getDefaultState()), "overgrown_oak_stairs");

    public static final Block WAXED_DAMP_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_DAMP_OAK_PLANKS.getDefaultState()), "waxed_damp_oak_stairs");
    public static final Block WAXED_MOSSY_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSSY_OAK_PLANKS.getDefaultState()), "waxed_mossy_oak_stairs");
    public static final Block WAXED_MOSS_COVERED_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSS_COVERED_OAK_PLANKS.getDefaultState()), "waxed_moss_covered_oak_stairs");
    public static final Block WAXED_OVERGROWN_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_OVERGROWN_OAK_PLANKS.getDefaultState()), "waxed_overgrown_oak_stairs");

    public static final Block DAMP_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_oak_slab");
    public static final Block MOSSY_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.EXPOSED), "mossy_oak_slab");
    public static final Block MOSS_COVERED_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_oak_slab");
    public static final Block OVERGROWN_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_oak_slab");

    public static final Block WAXED_DAMP_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_damp_oak_slab");
    public static final Block WAXED_MOSSY_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_mossy_oak_slab");
    public static final Block WAXED_MOSS_COVERED_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_moss_covered_oak_slab");
    public static final Block WAXED_OVERGROWN_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_overgrown_oak_slab");

    public static final Block DAMP_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_oak_log");
    public static final Block MOSSY_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_oak_log");
    public static final Block MOSS_COVERED_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_oak_log");
    public static final Block OVERGROWN_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_oak_log");

    public static final Block WAXED_DAMP_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_oak_log");
    public static final Block WAXED_MOSSY_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_oak_log");
    public static final Block WAXED_MOSS_COVERED_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_oak_log");
    public static final Block WAXED_OVERGROWN_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_oak_log");

    public static final Block DAMP_STRIPPED_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stripped_oak_log");
    public static final Block MOSSY_STRIPPED_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stripped_oak_log");
    public static final Block MOSS_COVERED_STRIPPED_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stripped_oak_log");
    public static final Block OVERGROWN_STRIPPED_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stripped_oak_log");

    public static final Block WAXED_DAMP_STRIPPED_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_stripped_oak_log");
    public static final Block WAXED_MOSSY_STRIPPED_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_stripped_oak_log");
    public static final Block WAXED_MOSS_COVERED_STRIPPED_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_stripped_oak_log");
    public static final Block WAXED_OVERGROWN_STRIPPED_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_stripped_oak_log");



    // dark oak
    public static final Block DAMP_DARK_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_dark_oak_planks");
    public static final Block MOSSY_DARK_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.EXPOSED), "mossy_dark_oak_planks");
    public static final Block MOSS_COVERED_DARK_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_dark_oak_planks");
    public static final Block OVERGROWN_DARK_OAK_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_dark_oak_planks");

    public static final Block WAXED_DAMP_DARK_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_damp_dark_oak_planks");
    public static final Block WAXED_MOSSY_DARK_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_mossy_dark_oak_planks");
    public static final Block WAXED_MOSS_COVERED_DARK_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_moss_covered_dark_oak_planks");
    public static final Block WAXED_OVERGROWN_DARK_OAK_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_overgrown_dark_oak_planks");

    public static final Block DAMP_DARK_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.UNAFFECTED, DAMP_DARK_OAK_PLANKS.getDefaultState()), "damp_dark_oak_stairs");
    public static final Block MOSSY_DARK_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.EXPOSED, MOSSY_DARK_OAK_PLANKS.getDefaultState()), "mossy_dark_oak_stairs");
    public static final Block MOSS_COVERED_DARK_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.WEATHERED, MOSS_COVERED_DARK_OAK_PLANKS.getDefaultState()), "moss_covered_dark_oak_stairs");
    public static final Block OVERGROWN_DARK_OAK_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.OXIDIZED, OVERGROWN_DARK_OAK_PLANKS.getDefaultState()), "overgrown_dark_oak_stairs");

    public static final Block WAXED_DAMP_DARK_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_DAMP_DARK_OAK_PLANKS.getDefaultState()), "waxed_damp_dark_oak_stairs");
    public static final Block WAXED_MOSSY_DARK_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSSY_DARK_OAK_PLANKS.getDefaultState()), "waxed_mossy_dark_oak_stairs");
    public static final Block WAXED_MOSS_COVERED_DARK_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSS_COVERED_DARK_OAK_PLANKS.getDefaultState()), "waxed_moss_covered_dark_oak_stairs");
    public static final Block WAXED_OVERGROWN_DARK_OAK_STAIRS = createBlock(new WaxedMossyStairs(WAXED_OVERGROWN_DARK_OAK_PLANKS.getDefaultState()), "waxed_overgrown_dark_oak_stairs");

    public static final Block DAMP_DARK_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_dark_oak_slab");
    public static final Block MOSSY_DARK_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.EXPOSED), "mossy_dark_oak_slab");
    public static final Block MOSS_COVERED_DARK_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_dark_oak_slab");
    public static final Block OVERGROWN_DARK_OAK_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_dark_oak_slab");

    public static final Block WAXED_DAMP_DARK_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_damp_dark_oak_slab");
    public static final Block WAXED_MOSSY_DARK_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_mossy_dark_oak_slab");
    public static final Block WAXED_MOSS_COVERED_DARK_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_moss_covered_dark_oak_slab");
    public static final Block WAXED_OVERGROWN_DARK_OAK_SLAB = createBlock(new WaxedMossySlabs(), "waxed_overgrown_dark_oak_slab");

    public static final Block DAMP_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_dark_oak_log");
    public static final Block MOSSY_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_dark_oak_log");
    public static final Block MOSS_COVERED_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_dark_oak_log");
    public static final Block OVERGROWN_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_dark_oak_log");

    public static final Block WAXED_DAMP_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_dark_oak_log");
    public static final Block WAXED_MOSSY_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_dark_oak_log");
    public static final Block WAXED_MOSS_COVERED_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_dark_oak_log");
    public static final Block WAXED_OVERGROWN_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_dark_oak_log");

    public static final Block DAMP_STRIPPED_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stripped_dark_oak_log");
    public static final Block MOSSY_STRIPPED_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stripped_dark_oak_log");
    public static final Block MOSS_COVERED_STRIPPED_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stripped_dark_oak_log");
    public static final Block OVERGROWN_STRIPPED_DARK_OAK_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stripped_dark_oak_log");

    public static final Block WAXED_DAMP_STRIPPED_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_stripped_dark_oak_log");
    public static final Block WAXED_MOSSY_STRIPPED_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_stripped_dark_oak_log");
    public static final Block WAXED_MOSS_COVERED_STRIPPED_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_stripped_dark_oak_log");
    public static final Block WAXED_OVERGROWN_STRIPPED_DARK_OAK_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_stripped_dark_oak_log");



    // acacia
    public static final Block DAMP_ACACIA_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_acacia_planks");
    public static final Block MOSSY_ACACIA_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.EXPOSED), "mossy_acacia_planks");
    public static final Block MOSS_COVERED_ACACIA_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_acacia_planks");
    public static final Block OVERGROWN_ACACIA_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_acacia_planks");

    public static final Block WAXED_DAMP_ACACIA_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_damp_acacia_planks");
    public static final Block WAXED_MOSSY_ACACIA_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_mossy_acacia_planks");
    public static final Block WAXED_MOSS_COVERED_ACACIA_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_moss_covered_acacia_planks");
    public static final Block WAXED_OVERGROWN_ACACIA_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_overgrown_acacia_planks");

    public static final Block DAMP_ACACIA_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.UNAFFECTED, DAMP_ACACIA_PLANKS.getDefaultState()), "damp_acacia_stairs");
    public static final Block MOSSY_ACACIA_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.EXPOSED, MOSSY_ACACIA_PLANKS.getDefaultState()), "mossy_acacia_stairs");
    public static final Block MOSS_COVERED_ACACIA_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.WEATHERED, MOSS_COVERED_ACACIA_PLANKS.getDefaultState()), "moss_covered_acacia_stairs");
    public static final Block OVERGROWN_ACACIA_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.OXIDIZED, OVERGROWN_ACACIA_PLANKS.getDefaultState()), "overgrown_acacia_stairs");

    public static final Block WAXED_DAMP_ACACIA_STAIRS = createBlock(new WaxedMossyStairs(WAXED_DAMP_ACACIA_PLANKS.getDefaultState()), "waxed_damp_acacia_stairs");
    public static final Block WAXED_MOSSY_ACACIA_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSSY_ACACIA_PLANKS.getDefaultState()), "waxed_mossy_acacia_stairs");
    public static final Block WAXED_MOSS_COVERED_ACACIA_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSS_COVERED_ACACIA_PLANKS.getDefaultState()), "waxed_moss_covered_acacia_stairs");
    public static final Block WAXED_OVERGROWN_ACACIA_STAIRS = createBlock(new WaxedMossyStairs(WAXED_OVERGROWN_ACACIA_PLANKS.getDefaultState()), "waxed_overgrown_acacia_stairs");

    public static final Block DAMP_ACACIA_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_acacia_slab");
    public static final Block MOSSY_ACACIA_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.EXPOSED), "mossy_acacia_slab");
    public static final Block MOSS_COVERED_ACACIA_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_acacia_slab");
    public static final Block OVERGROWN_ACACIA_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_acacia_slab");

    public static final Block WAXED_DAMP_ACACIA_SLAB = createBlock(new WaxedMossySlabs(), "waxed_damp_acacia_slab");
    public static final Block WAXED_MOSSY_ACACIA_SLAB = createBlock(new WaxedMossySlabs(), "waxed_mossy_acacia_slab");
    public static final Block WAXED_MOSS_COVERED_ACACIA_SLAB = createBlock(new WaxedMossySlabs(), "waxed_moss_covered_acacia_slab");
    public static final Block WAXED_OVERGROWN_ACACIA_SLAB = createBlock(new WaxedMossySlabs(), "waxed_overgrown_acacia_slab");

    public static final Block DAMP_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_acacia_log");
    public static final Block MOSSY_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_acacia_log");
    public static final Block MOSS_COVERED_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_acacia_log");
    public static final Block OVERGROWN_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_acacia_log");

    public static final Block WAXED_DAMP_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_acacia_log");
    public static final Block WAXED_MOSSY_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_acacia_log");
    public static final Block WAXED_MOSS_COVERED_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_acacia_log");
    public static final Block WAXED_OVERGROWN_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_acacia_log");

    public static final Block DAMP_STRIPPED_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stripped_acacia_log");
    public static final Block MOSSY_STRIPPED_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stripped_acacia_log");
    public static final Block MOSS_COVERED_STRIPPED_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stripped_acacia_log");
    public static final Block OVERGROWN_STRIPPED_ACACIA_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stripped_acacia_log");

    public static final Block WAXED_DAMP_STRIPPED_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_stripped_acacia_log");
    public static final Block WAXED_MOSSY_STRIPPED_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_stripped_acacia_log");
    public static final Block WAXED_MOSS_COVERED_STRIPPED_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_stripped_acacia_log");
    public static final Block WAXED_OVERGROWN_STRIPPED_ACACIA_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_stripped_acacia_log");



    // jungle
    public static final Block DAMP_JUNGLE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_jungle_planks");
    public static final Block MOSSY_JUNGLE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.EXPOSED), "mossy_jungle_planks");
    public static final Block MOSS_COVERED_JUNGLE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_jungle_planks");
    public static final Block OVERGROWN_JUNGLE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_jungle_planks");

    public static final Block WAXED_DAMP_JUNGLE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_damp_jungle_planks");
    public static final Block WAXED_MOSSY_JUNGLE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_mossy_jungle_planks");
    public static final Block WAXED_MOSS_COVERED_JUNGLE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_moss_covered_jungle_planks");
    public static final Block WAXED_OVERGROWN_JUNGLE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_overgrown_jungle_planks");

    public static final Block DAMP_JUNGLE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.UNAFFECTED, DAMP_JUNGLE_PLANKS.getDefaultState()), "damp_jungle_stairs");
    public static final Block MOSSY_JUNGLE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.EXPOSED, MOSSY_JUNGLE_PLANKS.getDefaultState()), "mossy_jungle_stairs");
    public static final Block MOSS_COVERED_JUNGLE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.WEATHERED, MOSS_COVERED_JUNGLE_PLANKS.getDefaultState()), "moss_covered_jungle_stairs");
    public static final Block OVERGROWN_JUNGLE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.OXIDIZED, OVERGROWN_JUNGLE_PLANKS.getDefaultState()), "overgrown_jungle_stairs");

    public static final Block WAXED_DAMP_JUNGLE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_DAMP_JUNGLE_PLANKS.getDefaultState()), "waxed_damp_jungle_stairs");
    public static final Block WAXED_MOSSY_JUNGLE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSSY_JUNGLE_PLANKS.getDefaultState()), "waxed_mossy_jungle_stairs");
    public static final Block WAXED_MOSS_COVERED_JUNGLE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSS_COVERED_JUNGLE_PLANKS.getDefaultState()), "waxed_moss_covered_jungle_stairs");
    public static final Block WAXED_OVERGROWN_JUNGLE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_OVERGROWN_JUNGLE_PLANKS.getDefaultState()), "waxed_overgrown_jungle_stairs");

    public static final Block DAMP_JUNGLE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_jungle_slab");
    public static final Block MOSSY_JUNGLE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.EXPOSED), "mossy_jungle_slab");
    public static final Block MOSS_COVERED_JUNGLE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_jungle_slab");
    public static final Block OVERGROWN_JUNGLE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_jungle_slab");

    public static final Block WAXED_DAMP_JUNGLE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_damp_jungle_slab");
    public static final Block WAXED_MOSSY_JUNGLE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_mossy_jungle_slab");
    public static final Block WAXED_MOSS_COVERED_JUNGLE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_moss_covered_jungle_slab");
    public static final Block WAXED_OVERGROWN_JUNGLE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_overgrown_jungle_slab");

    public static final Block DAMP_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_jungle_log");
    public static final Block MOSSY_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_jungle_log");
    public static final Block MOSS_COVERED_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_jungle_log");
    public static final Block OVERGROWN_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_jungle_log");

    public static final Block WAXED_DAMP_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_jungle_log");
    public static final Block WAXED_MOSSY_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_jungle_log");
    public static final Block WAXED_MOSS_COVERED_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_jungle_log");
    public static final Block WAXED_OVERGROWN_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_jungle_log");

    public static final Block DAMP_STRIPPED_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stripped_jungle_log");
    public static final Block MOSSY_STRIPPED_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stripped_jungle_log");
    public static final Block MOSS_COVERED_STRIPPED_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stripped_jungle_log");
    public static final Block OVERGROWN_STRIPPED_JUNGLE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stripped_jungle_log");

    public static final Block WAXED_DAMP_STRIPPED_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_stripped_jungle_log");
    public static final Block WAXED_MOSSY_STRIPPED_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_stripped_jungle_log");
    public static final Block WAXED_MOSS_COVERED_STRIPPED_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_stripped_jungle_log");
    public static final Block WAXED_OVERGROWN_STRIPPED_JUNGLE_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_stripped_jungle_log");



    // birch
    public static final Block DAMP_BIRCH_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_birch_planks");
    public static final Block MOSSY_BIRCH_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.EXPOSED), "mossy_birch_planks");
    public static final Block MOSS_COVERED_BIRCH_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_birch_planks");
    public static final Block OVERGROWN_BIRCH_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_birch_planks");

    public static final Block WAXED_DAMP_BIRCH_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_damp_birch_planks");
    public static final Block WAXED_MOSSY_BIRCH_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_mossy_birch_planks");
    public static final Block WAXED_MOSS_COVERED_BIRCH_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_moss_covered_birch_planks");
    public static final Block WAXED_OVERGROWN_BIRCH_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_overgrown_birch_planks");

    public static final Block DAMP_BIRCH_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.UNAFFECTED, DAMP_BIRCH_PLANKS.getDefaultState()), "damp_birch_stairs");
    public static final Block MOSSY_BIRCH_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.EXPOSED, MOSSY_BIRCH_PLANKS.getDefaultState()), "mossy_birch_stairs");
    public static final Block MOSS_COVERED_BIRCH_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.WEATHERED, MOSS_COVERED_BIRCH_PLANKS.getDefaultState()), "moss_covered_birch_stairs");
    public static final Block OVERGROWN_BIRCH_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.OXIDIZED, OVERGROWN_BIRCH_PLANKS.getDefaultState()), "overgrown_birch_stairs");

    public static final Block WAXED_DAMP_BIRCH_STAIRS = createBlock(new WaxedMossyStairs(WAXED_DAMP_BIRCH_PLANKS.getDefaultState()), "waxed_damp_birch_stairs");
    public static final Block WAXED_MOSSY_BIRCH_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSSY_BIRCH_PLANKS.getDefaultState()), "waxed_mossy_birch_stairs");
    public static final Block WAXED_MOSS_COVERED_BIRCH_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSS_COVERED_BIRCH_PLANKS.getDefaultState()), "waxed_moss_covered_birch_stairs");
    public static final Block WAXED_OVERGROWN_BIRCH_STAIRS = createBlock(new WaxedMossyStairs(WAXED_OVERGROWN_BIRCH_PLANKS.getDefaultState()), "waxed_overgrown_birch_stairs");

    public static final Block DAMP_BIRCH_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_birch_slab");
    public static final Block MOSSY_BIRCH_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.EXPOSED), "mossy_birch_slab");
    public static final Block MOSS_COVERED_BIRCH_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_birch_slab");
    public static final Block OVERGROWN_BIRCH_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_birch_slab");

    public static final Block WAXED_DAMP_BIRCH_SLAB = createBlock(new WaxedMossySlabs(), "waxed_damp_birch_slab");
    public static final Block WAXED_MOSSY_BIRCH_SLAB = createBlock(new WaxedMossySlabs(), "waxed_mossy_birch_slab");
    public static final Block WAXED_MOSS_COVERED_BIRCH_SLAB = createBlock(new WaxedMossySlabs(), "waxed_moss_covered_birch_slab");
    public static final Block WAXED_OVERGROWN_BIRCH_SLAB = createBlock(new WaxedMossySlabs(), "waxed_overgrown_birch_slab");

    public static final Block DAMP_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_birch_log");
    public static final Block MOSSY_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_birch_log");
    public static final Block MOSS_COVERED_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_birch_log");
    public static final Block OVERGROWN_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_birch_log");

    public static final Block WAXED_DAMP_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_birch_log");
    public static final Block WAXED_MOSSY_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_birch_log");
    public static final Block WAXED_MOSS_COVERED_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_birch_log");
    public static final Block WAXED_OVERGROWN_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_birch_log");

    public static final Block DAMP_STRIPPED_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stripped_birch_log");
    public static final Block MOSSY_STRIPPED_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stripped_birch_log");
    public static final Block MOSS_COVERED_STRIPPED_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stripped_birch_log");
    public static final Block OVERGROWN_STRIPPED_BIRCH_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stripped_birch_log");

    public static final Block WAXED_DAMP_STRIPPED_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_stripped_birch_log");
    public static final Block WAXED_MOSSY_STRIPPED_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_stripped_birch_log");
    public static final Block WAXED_MOSS_COVERED_STRIPPED_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_stripped_birch_log");
    public static final Block WAXED_OVERGROWN_STRIPPED_BIRCH_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_stripped_birch_log");



    // spruce
    public static final Block DAMP_SPRUCE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_spruce_planks");
    public static final Block MOSSY_SPRUCE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.EXPOSED), "mossy_spruce_planks");
    public static final Block MOSS_COVERED_SPRUCE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_spruce_planks");
    public static final Block OVERGROWN_SPRUCE_PLANKS = createBlock(new MossyPlank(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_spruce_planks");

    public static final Block WAXED_DAMP_SPRUCE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_damp_spruce_planks");
    public static final Block WAXED_MOSSY_SPRUCE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_mossy_spruce_planks");
    public static final Block WAXED_MOSS_COVERED_SPRUCE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_moss_covered_spruce_planks");
    public static final Block WAXED_OVERGROWN_SPRUCE_PLANKS = createBlock(new WaxedMossyPlank(), "waxed_overgrown_spruce_planks");

    public static final Block DAMP_SPRUCE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.UNAFFECTED, DAMP_SPRUCE_PLANKS.getDefaultState()), "damp_spruce_stairs");
    public static final Block MOSSY_SPRUCE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.EXPOSED, MOSSY_SPRUCE_PLANKS.getDefaultState()), "mossy_spruce_stairs");
    public static final Block MOSS_COVERED_SPRUCE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.WEATHERED, MOSS_COVERED_SPRUCE_PLANKS.getDefaultState()), "moss_covered_spruce_stairs");
    public static final Block OVERGROWN_SPRUCE_STAIRS = createBlock(new MossyStairs(Oxidizable.OxidizationLevel.OXIDIZED, OVERGROWN_SPRUCE_PLANKS.getDefaultState()), "overgrown_spruce_stairs");

    public static final Block WAXED_DAMP_SPRUCE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_DAMP_SPRUCE_PLANKS.getDefaultState()), "waxed_damp_spruce_stairs");
    public static final Block WAXED_MOSSY_SPRUCE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSSY_SPRUCE_PLANKS.getDefaultState()), "waxed_mossy_spruce_stairs");
    public static final Block WAXED_MOSS_COVERED_SPRUCE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_MOSS_COVERED_SPRUCE_PLANKS.getDefaultState()), "waxed_moss_covered_spruce_stairs");
    public static final Block WAXED_OVERGROWN_SPRUCE_STAIRS = createBlock(new WaxedMossyStairs(WAXED_OVERGROWN_SPRUCE_PLANKS.getDefaultState()), "waxed_overgrown_spruce_stairs");

    public static final Block DAMP_SPRUCE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_spruce_slab");
    public static final Block MOSSY_SPRUCE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.EXPOSED), "mossy_spruce_slab");
    public static final Block MOSS_COVERED_SPRUCE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_spruce_slab");
    public static final Block OVERGROWN_SPRUCE_SLAB = createBlock(new MossySlabs(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_spruce_slab");

    public static final Block WAXED_DAMP_SPRUCE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_damp_spruce_slab");
    public static final Block WAXED_MOSSY_SPRUCE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_mossy_spruce_slab");
    public static final Block WAXED_MOSS_COVERED_SPRUCE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_moss_covered_spruce_slab");
    public static final Block WAXED_OVERGROWN_SPRUCE_SLAB = createBlock(new WaxedMossySlabs(), "waxed_overgrown_spruce_slab");

    public static final Block DAMP_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_spruce_log");
    public static final Block MOSSY_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_spruce_log");
    public static final Block MOSS_COVERED_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_spruce_log");
    public static final Block OVERGROWN_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_spruce_log");

    public static final Block WAXED_DAMP_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_spruce_log");
    public static final Block WAXED_MOSSY_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_spruce_log");
    public static final Block WAXED_MOSS_COVERED_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_spruce_log");
    public static final Block WAXED_OVERGROWN_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_spruce_log");

    public static final Block DAMP_STRIPPED_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stripped_spruce_log");
    public static final Block MOSSY_STRIPPED_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stripped_spruce_log");
    public static final Block MOSS_COVERED_STRIPPED_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stripped_spruce_log");
    public static final Block OVERGROWN_STRIPPED_SPRUCE_LOG = createBlock(new MossyLog(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stripped_spruce_log");

    public static final Block WAXED_DAMP_STRIPPED_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_damp_stripped_spruce_log");
    public static final Block WAXED_MOSSY_STRIPPED_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_mossy_stripped_spruce_log");
    public static final Block WAXED_MOSS_COVERED_STRIPPED_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_moss_covered_stripped_spruce_log");
    public static final Block WAXED_OVERGROWN_STRIPPED_SPRUCE_LOG = createBlock(new WaxedMossyLog(), "waxed_overgrown_stripped_spruce_log");


    /*


    STONE


     */




    public static final Block DAMP_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stone");
    public static final Block DAMP_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_diorite");
    public static final Block DAMP_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_granite");
    public static final Block DAMP_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_andesite");
    public static final Block DAMP_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_deepslate");

    public static final Block DAMP_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_stone_slab");
    public static final Block DAMP_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_diorite_slab");
    public static final Block DAMP_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_granite_slab");
    public static final Block DAMP_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_andesite_slab");

    public static final Block DAMP_STONE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_STONE.getDefaultState()), "damp_stone_stairs");
    public static final Block DAMP_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_DIORITE.getDefaultState()), "damp_diorite_stairs");
    public static final Block DAMP_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_GRANITE.getDefaultState()), "damp_granite_stairs");
    public static final Block DAMP_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_ANDESITE.getDefaultState()), "damp_andesite_stairs");

    public static final Block DAMP_SMOOTH_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_smooth_stone");
    public static final Block DAMP_POLISHED_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_diorite");
    public static final Block DAMP_POLISHED_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_granite");
    public static final Block DAMP_POLISHED_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_andesite");
    public static final Block DAMP_POLISHED_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_deepslate");

    public static final Block DAMP_SMOOTH_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_smooth_stone_slab");
    public static final Block DAMP_POLISHED_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_diorite_slab");
    public static final Block DAMP_POLISHED_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_granite_slab");
    public static final Block DAMP_POLISHED_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_andesite_slab");
    public static final Block DAMP_POLISHED_DEEPSLATE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.UNAFFECTED), "damp_polished_deepslate_slab");

    public static final Block DAMP_POLISHED_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_POLISHED_DIORITE.getDefaultState()), "damp_polished_diorite_stairs");
    public static final Block DAMP_POLISHED_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_POLISHED_GRANITE.getDefaultState()), "damp_polished_granite_stairs");
    public static final Block DAMP_POLISHED_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_POLISHED_ANDESITE.getDefaultState()), "damp_polished_andesite_stairs");
    public static final Block DAMP_POLISHED_DEEPSLATE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.UNAFFECTED, ModBlocks.DAMP_POLISHED_DEEPSLATE.getDefaultState()), "damp_polished_deepslate_stairs");


    public static final Block MOSSY_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stone");
    public static final Block MOSSY_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_diorite");
    public static final Block MOSSY_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_granite");
    public static final Block MOSSY_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_andesite");
    public static final Block MOSSY_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.EXPOSED), "mossy_deepslate");

    public static final Block MOSSY_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_stone_slab");
    public static final Block MOSSY_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_diorite_slab");
    public static final Block MOSSY_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_granite_slab");
    public static final Block MOSSY_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_andesite_slab");

    public static final Block MOSSY_STONE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_STONE.getDefaultState()), "mossy_stone_stairs");
    public static final Block MOSSY_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_DIORITE.getDefaultState()), "mossy_diorite_stairs");
    public static final Block MOSSY_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_GRANITE.getDefaultState()), "mossy_granite_stairs");
    public static final Block MOSSY_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_ANDESITE.getDefaultState()), "mossy_andesite_stairs");

    public static final Block MOSSY_SMOOTH_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_smooth_stone");
    public static final Block MOSSY_POLISHED_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_diorite");
    public static final Block MOSSY_POLISHED_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_granite");
    public static final Block MOSSY_POLISHED_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_andesite");
    public static final Block MOSSY_POLISHED_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_deepslate");

    public static final Block MOSSY_SMOOTH_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_smooth_stone_slab");
    public static final Block MOSSY_POLISHED_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_diorite_slab");
    public static final Block MOSSY_POLISHED_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_granite_slab");
    public static final Block MOSSY_POLISHED_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_andesite_slab");
    public static final Block MOSSY_POLISHED_DEEPSLATE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.EXPOSED), "mossy_polished_deepslate_slab");

    public static final Block MOSSY_POLISHED_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_POLISHED_DIORITE.getDefaultState()), "mossy_polished_diorite_stairs");
    public static final Block MOSSY_POLISHED_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_POLISHED_GRANITE.getDefaultState()), "mossy_polished_granite_stairs");
    public static final Block MOSSY_POLISHED_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_POLISHED_ANDESITE.getDefaultState()), "mossy_polished_andesite_stairs");
    public static final Block MOSSY_POLISHED_DEEPSLATE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.EXPOSED, ModBlocks.MOSSY_POLISHED_DEEPSLATE.getDefaultState()), "mossy_polished_deepslate_stairs");



    public static final Block MOSS_COVERED_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stone");
    public static final Block MOSS_COVERED_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_diorite");
    public static final Block MOSS_COVERED_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_granite");
    public static final Block MOSS_COVERED_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_andesite");
    public static final Block MOSS_COVERED_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_deepslate");

    public static final Block MOSS_COVERED_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_stone_slab");
    public static final Block MOSS_COVERED_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_diorite_slab");
    public static final Block MOSS_COVERED_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_granite_slab");
    public static final Block MOSS_COVERED_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_andesite_slab");

    public static final Block MOSS_COVERED_STONE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_STONE.getDefaultState()), "moss_covered_stone_stairs");
    public static final Block MOSS_COVERED_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_DIORITE.getDefaultState()), "moss_covered_diorite_stairs");
    public static final Block MOSS_COVERED_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_GRANITE.getDefaultState()), "moss_covered_granite_stairs");
    public static final Block MOSS_COVERED_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_ANDESITE.getDefaultState()), "moss_covered_andesite_stairs");

    public static final Block MOSS_COVERED_SMOOTH_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_smooth_stone");
    public static final Block MOSS_COVERED_POLISHED_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_diorite");
    public static final Block MOSS_COVERED_POLISHED_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_granite");
    public static final Block MOSS_COVERED_POLISHED_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_andesite");
    public static final Block MOSS_COVERED_POLISHED_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_deepslate");

    public static final Block MOSS_COVERED_SMOOTH_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_smooth_stone_slab");
    public static final Block MOSS_COVERED_POLISHED_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_diorite_slab");
    public static final Block MOSS_COVERED_POLISHED_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_granite_slab");
    public static final Block MOSS_COVERED_POLISHED_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_andesite_slab");
    public static final Block MOSS_COVERED_POLISHED_DEEPSLATE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.WEATHERED), "moss_covered_polished_deepslate_slab");

    public static final Block MOSS_COVERED_POLISHED_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_POLISHED_DIORITE.getDefaultState()), "moss_covered_polished_diorite_stairs");
    public static final Block MOSS_COVERED_POLISHED_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_POLISHED_GRANITE.getDefaultState()), "moss_covered_polished_granite_stairs");
    public static final Block MOSS_COVERED_POLISHED_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_POLISHED_ANDESITE.getDefaultState()), "moss_covered_polished_andesite_stairs");
    public static final Block MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.WEATHERED, ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE.getDefaultState()), "moss_covered_polished_deepslate_stairs");



    public static final Block OVERGROWN_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stone");
    public static final Block OVERGROWN_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_diorite");
    public static final Block OVERGROWN_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_granite");
    public static final Block OVERGROWN_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_andesite");
    public static final Block OVERGROWN_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_deepslate");

    public static final Block OVERGROWN_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_stone_slab");
    public static final Block OVERGROWN_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_diorite_slab");
    public static final Block OVERGROWN_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_granite_slab");
    public static final Block OVERGROWN_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_andesite_slab");

    public static final Block OVERGROWN_STONE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_STONE.getDefaultState()), "overgrown_stone_stairs");
    public static final Block OVERGROWN_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_DIORITE.getDefaultState()), "overgrown_diorite_stairs");
    public static final Block OVERGROWN_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_GRANITE.getDefaultState()), "overgrown_granite_stairs");
    public static final Block OVERGROWN_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_ANDESITE.getDefaultState()), "overgrown_andesite_stairs");

    public static final Block OVERGROWN_SMOOTH_STONE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_smooth_stone");
    public static final Block OVERGROWN_POLISHED_DIORITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_diorite");
    public static final Block OVERGROWN_POLISHED_GRANITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_granite");
    public static final Block OVERGROWN_POLISHED_ANDESITE = createBlock(new MossyStone(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_andesite");
    public static final Block OVERGROWN_POLISHED_DEEPSLATE = createBlock(new MossyDeepslate(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_deepslate");

    public static final Block OVERGROWN_SMOOTH_STONE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_smooth_stone_slab");
    public static final Block OVERGROWN_POLISHED_DIORITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_diorite_slab");
    public static final Block OVERGROWN_POLISHED_GRANITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_granite_slab");
    public static final Block OVERGROWN_POLISHED_ANDESITE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_andesite_slab");
    public static final Block OVERGROWN_POLISHED_DEEPSLATE_SLAB = createBlock(new MossyStoneSlab(Oxidizable.OxidizationLevel.OXIDIZED), "overgrown_polished_deepslate_slab");

    public static final Block OVERGROWN_POLISHED_DIORITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_POLISHED_DIORITE.getDefaultState()), "overgrown_polished_diorite_stairs");
    public static final Block OVERGROWN_POLISHED_GRANITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_POLISHED_GRANITE.getDefaultState()), "overgrown_polished_granite_stairs");
    public static final Block OVERGROWN_POLISHED_ANDESITE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_POLISHED_ANDESITE.getDefaultState()), "overgrown_polished_andesite_stairs");
    public static final Block OVERGROWN_POLISHED_DEEPSLATE_STAIRS = createBlock(new MossyStoneStairs(Oxidizable.OxidizationLevel.OXIDIZED, ModBlocks.OVERGROWN_POLISHED_DEEPSLATE.getDefaultState()), "overgrown_polished_deepslate_stairs");








    public static final Block WAXED_DAMP_STONE = createBlock(new WaxedMossyStone(), "waxed_damp_stone");
    public static final Block WAXED_DAMP_DIORITE = createBlock(new WaxedMossyStone(), "waxed_damp_diorite");
    public static final Block WAXED_DAMP_GRANITE = createBlock(new WaxedMossyStone(), "waxed_damp_granite");
    public static final Block WAXED_DAMP_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_damp_andesite");
    public static final Block WAXED_DAMP_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_damp_deepslate");

    public static final Block WAXED_DAMP_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_stone_slab");
    public static final Block WAXED_DAMP_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_diorite_slab");
    public static final Block WAXED_DAMP_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_granite_slab");
    public static final Block WAXED_DAMP_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_andesite_slab");

    public static final Block WAXED_DAMP_STONE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_STONE.getDefaultState()), "waxed_damp_stone_stairs");
    public static final Block WAXED_DAMP_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_DIORITE.getDefaultState()), "waxed_damp_diorite_stairs");
    public static final Block WAXED_DAMP_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_GRANITE.getDefaultState()), "waxed_damp_granite_stairs");
    public static final Block WAXED_DAMP_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_ANDESITE.getDefaultState()), "waxed_damp_andesite_stairs");

    public static final Block WAXED_DAMP_SMOOTH_STONE = createBlock(new WaxedMossyStone(), "waxed_damp_smooth_stone");
    public static final Block WAXED_DAMP_POLISHED_DIORITE = createBlock(new WaxedMossyStone(), "waxed_damp_polished_diorite");
    public static final Block WAXED_DAMP_POLISHED_GRANITE = createBlock(new WaxedMossyStone(), "waxed_damp_polished_granite");
    public static final Block WAXED_DAMP_POLISHED_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_damp_polished_andesite");
    public static final Block WAXED_DAMP_POLISHED_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_damp_polished_deepslate");

    public static final Block WAXED_DAMP_SMOOTH_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_smooth_stone_slab");
    public static final Block WAXED_DAMP_POLISHED_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_polished_diorite_slab");
    public static final Block WAXED_DAMP_POLISHED_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_polished_granite_slab");
    public static final Block WAXED_DAMP_POLISHED_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_polished_andesite_slab");
    public static final Block WAXED_DAMP_POLISHED_DEEPSLATE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_damp_polished_deepslate_slab");

    public static final Block WAXED_DAMP_POLISHED_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_POLISHED_DIORITE.getDefaultState()), "waxed_damp_polished_diorite_stairs");
    public static final Block WAXED_DAMP_POLISHED_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_POLISHED_GRANITE.getDefaultState()), "waxed_damp_polished_granite_stairs");
    public static final Block WAXED_DAMP_POLISHED_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_POLISHED_ANDESITE.getDefaultState()), "waxed_damp_polished_andesite_stairs");
    public static final Block WAXED_DAMP_POLISHED_DEEPSLATE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE.getDefaultState()), "waxed_damp_polished_deepslate_stairs");


    public static final Block WAXED_MOSSY_STONE = createBlock(new WaxedMossyStone(), "waxed_mossy_stone");
    public static final Block WAXED_MOSSY_DIORITE = createBlock(new WaxedMossyStone(), "waxed_mossy_diorite");
    public static final Block WAXED_MOSSY_GRANITE = createBlock(new WaxedMossyStone(), "waxed_mossy_granite");
    public static final Block WAXED_MOSSY_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_mossy_andesite");
    public static final Block WAXED_MOSSY_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_mossy_deepslate");

    public static final Block WAXED_MOSSY_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_stone_slab");
    public static final Block WAXED_MOSSY_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_diorite_slab");
    public static final Block WAXED_MOSSY_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_granite_slab");
    public static final Block WAXED_MOSSY_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_andesite_slab");

    public static final Block WAXED_MOSSY_STONE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_STONE.getDefaultState()), "waxed_mossy_stone_stairs");
    public static final Block WAXED_MOSSY_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_DIORITE.getDefaultState()), "waxed_mossy_diorite_stairs");
    public static final Block WAXED_MOSSY_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_GRANITE.getDefaultState()), "waxed_mossy_granite_stairs");
    public static final Block WAXED_MOSSY_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_ANDESITE.getDefaultState()), "waxed_mossy_andesite_stairs");

    public static final Block WAXED_MOSSY_SMOOTH_STONE = createBlock(new WaxedMossyStone(), "waxed_mossy_smooth_stone");
    public static final Block WAXED_MOSSY_POLISHED_DIORITE = createBlock(new WaxedMossyStone(), "waxed_mossy_polished_diorite");
    public static final Block WAXED_MOSSY_POLISHED_GRANITE = createBlock(new WaxedMossyStone(), "waxed_mossy_polished_granite");
    public static final Block WAXED_MOSSY_POLISHED_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_mossy_polished_andesite");
    public static final Block WAXED_MOSSY_POLISHED_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_mossy_polished_deepslate");

    public static final Block WAXED_MOSSY_SMOOTH_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_smooth_stone_slab");
    public static final Block WAXED_MOSSY_POLISHED_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_polished_diorite_slab");
    public static final Block WAXED_MOSSY_POLISHED_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_polished_granite_slab");
    public static final Block WAXED_MOSSY_POLISHED_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_polished_andesite_slab");
    public static final Block WAXED_MOSSY_POLISHED_DEEPSLATE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_mossy_polished_deepslate_slab");

    public static final Block WAXED_MOSSY_POLISHED_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_POLISHED_DIORITE.getDefaultState()), "waxed_mossy_polished_diorite_stairs");
    public static final Block WAXED_MOSSY_POLISHED_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_POLISHED_GRANITE.getDefaultState()), "waxed_mossy_polished_granite_stairs");
    public static final Block WAXED_MOSSY_POLISHED_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE.getDefaultState()), "waxed_mossy_polished_andesite_stairs");
    public static final Block WAXED_MOSSY_POLISHED_DEEPSLATE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE.getDefaultState()), "waxed_mossy_polished_deepslate_stairs");



    public static final Block WAXED_MOSS_COVERED_STONE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_stone");
    public static final Block WAXED_MOSS_COVERED_DIORITE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_diorite");
    public static final Block WAXED_MOSS_COVERED_GRANITE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_granite");
    public static final Block WAXED_MOSS_COVERED_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_andesite");
    public static final Block WAXED_MOSS_COVERED_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_moss_covered_deepslate");

    public static final Block WAXED_MOSS_COVERED_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_stone_slab");
    public static final Block WAXED_MOSS_COVERED_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_diorite_slab");
    public static final Block WAXED_MOSS_COVERED_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_granite_slab");
    public static final Block WAXED_MOSS_COVERED_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_andesite_slab");

    public static final Block WAXED_MOSS_COVERED_STONE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_STONE.getDefaultState()), "waxed_moss_covered_stone_stairs");
    public static final Block WAXED_MOSS_COVERED_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_DIORITE.getDefaultState()), "waxed_moss_covered_diorite_stairs");
    public static final Block WAXED_MOSS_COVERED_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_GRANITE.getDefaultState()), "waxed_moss_covered_granite_stairs");
    public static final Block WAXED_MOSS_COVERED_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_ANDESITE.getDefaultState()), "waxed_moss_covered_andesite_stairs");

    public static final Block WAXED_MOSS_COVERED_SMOOTH_STONE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_smooth_stone");
    public static final Block WAXED_MOSS_COVERED_POLISHED_DIORITE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_polished_diorite");
    public static final Block WAXED_MOSS_COVERED_POLISHED_GRANITE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_polished_granite");
    public static final Block WAXED_MOSS_COVERED_POLISHED_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_moss_covered_polished_andesite");
    public static final Block WAXED_MOSS_COVERED_POLISHED_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_moss_covered_polished_deepslate");

    public static final Block WAXED_MOSS_COVERED_SMOOTH_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_smooth_stone_slab");
    public static final Block WAXED_MOSS_COVERED_POLISHED_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_polished_diorite_slab");
    public static final Block WAXED_MOSS_COVERED_POLISHED_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_polished_granite_slab");
    public static final Block WAXED_MOSS_COVERED_POLISHED_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_polished_andesite_slab");
    public static final Block WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_moss_covered_polished_deepslate_slab");

    public static final Block WAXED_MOSS_COVERED_POLISHED_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE.getDefaultState()), "waxed_moss_covered_polished_diorite_stairs");
    public static final Block WAXED_MOSS_COVERED_POLISHED_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE.getDefaultState()), "waxed_moss_covered_polished_granite_stairs");
    public static final Block WAXED_MOSS_COVERED_POLISHED_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE.getDefaultState()), "waxed_moss_covered_polished_andesite_stairs");
    public static final Block WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE.getDefaultState()), "waxed_moss_covered_polished_deepslate_stairs");



    public static final Block WAXED_OVERGROWN_STONE = createBlock(new WaxedMossyStone(), "waxed_overgrown_stone");
    public static final Block WAXED_OVERGROWN_DIORITE = createBlock(new WaxedMossyStone(), "waxed_overgrown_diorite");
    public static final Block WAXED_OVERGROWN_GRANITE = createBlock(new WaxedMossyStone(), "waxed_overgrown_granite");
    public static final Block WAXED_OVERGROWN_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_overgrown_andesite");
    public static final Block WAXED_OVERGROWN_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_overgrown_deepslate");

    public static final Block WAXED_OVERGROWN_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_stone_slab");
    public static final Block WAXED_OVERGROWN_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_diorite_slab");
    public static final Block WAXED_OVERGROWN_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_granite_slab");
    public static final Block WAXED_OVERGROWN_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_andesite_slab");

    public static final Block WAXED_OVERGROWN_STONE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_STONE.getDefaultState()), "waxed_overgrown_stone_stairs");
    public static final Block WAXED_OVERGROWN_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_DIORITE.getDefaultState()), "waxed_overgrown_diorite_stairs");
    public static final Block WAXED_OVERGROWN_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_GRANITE.getDefaultState()), "waxed_overgrown_granite_stairs");
    public static final Block WAXED_OVERGROWN_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_ANDESITE.getDefaultState()), "waxed_overgrown_andesite_stairs");

    public static final Block WAXED_OVERGROWN_SMOOTH_STONE = createBlock(new WaxedMossyStone(), "waxed_overgrown_smooth_stone");
    public static final Block WAXED_OVERGROWN_POLISHED_DIORITE = createBlock(new WaxedMossyStone(), "waxed_overgrown_polished_diorite");
    public static final Block WAXED_OVERGROWN_POLISHED_GRANITE = createBlock(new WaxedMossyStone(), "waxed_overgrown_polished_granite");
    public static final Block WAXED_OVERGROWN_POLISHED_ANDESITE = createBlock(new WaxedMossyStone(), "waxed_overgrown_polished_andesite");
    public static final Block WAXED_OVERGROWN_POLISHED_DEEPSLATE = createBlock(new WaxedMossyDeepslate(), "waxed_overgrown_polished_deepslate");

    public static final Block WAXED_OVERGROWN_SMOOTH_STONE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_smooth_stone_slab");
    public static final Block WAXED_OVERGROWN_POLISHED_DIORITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_polished_diorite_slab");
    public static final Block WAXED_OVERGROWN_POLISHED_GRANITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_polished_granite_slab");
    public static final Block WAXED_OVERGROWN_POLISHED_ANDESITE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_polished_andesite_slab");
    public static final Block WAXED_OVERGROWN_POLISHED_DEEPSLATE_SLAB = createBlock(new WaxedMossyStoneSlab(), "waxed_overgrown_polished_deepslate_slab");

    public static final Block WAXED_OVERGROWN_POLISHED_DIORITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE.getDefaultState()), "waxed_overgrown_polished_diorite_stairs");
    public static final Block WAXED_OVERGROWN_POLISHED_GRANITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE.getDefaultState()), "waxed_overgrown_polished_granite_stairs");
    public static final Block WAXED_OVERGROWN_POLISHED_ANDESITE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE.getDefaultState()), "waxed_overgrown_polished_andesite_stairs");
    public static final Block WAXED_OVERGROWN_POLISHED_DEEPSLATE_STAIRS = createBlock(new WaxedMossyStoneStairs(ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE.getDefaultState()), "waxed_overgrown_polished_deepslate_stairs");



}

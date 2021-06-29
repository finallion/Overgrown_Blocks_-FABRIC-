package com.finallion.mossywood.data;

import com.finallion.mossywood.blocks.*;
import com.finallion.mossywood.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.File;
import java.io.FileOutputStream;

public class BlockModelGenerator {

    public static void initBlockModelGenerator(String path) {
        for (Block block : ModBlocks.blocksList) {
            Identifier blockId = Registry.BLOCK.getId(block);
            String blockName = blockId.toString().replace("mossywood:", "");
            String newBlockName = getVanillaBaseBlock(blockName);

            // only unwaxed models needed!
            if (block instanceof MossyDeepslate) {
                writeFile(path, blockName, deepslateModel(newBlockName));
                writeFile(path, blockName + "_mirrored", deepslateMirroredModel(newBlockName));
            } else if (block instanceof MossyLog) {
                writeFile(path, blockName, logModel(newBlockName));
                writeFile(path, blockName + "_horizontal", logHorizontalModel(newBlockName));
            } else if (block instanceof MossyPlank || block instanceof MossyStone) {
                writeFile(path, blockName, basicModel(newBlockName));
            } else if (block instanceof MossySlabs || block instanceof MossyStoneSlab) {
                writeFile(path, blockName, slabModel(newBlockName));
                writeFile(path, blockName + "_double", slabDoubleModel(newBlockName));
                writeFile(path, blockName + "_top", slabTopModel(newBlockName));
            } else if (block instanceof MossyStairs || block instanceof MossyStoneStairs) {
                writeFile(path, blockName, stairsModel(newBlockName));
                writeFile(path, blockName + "_inner", stairsInnerModel(newBlockName));
                writeFile(path, blockName + "_outer", stairsOuterModel(newBlockName));
            }
        }
    }


    private static void writeFile(String path, String blockName, String data) {
        String filePath = path + "\\" + blockName + ".json";

        File file = new File(filePath);

        if (!file.exists() && !file.isDirectory()) {
            try {
                FileOutputStream fileOut = new FileOutputStream(filePath);
                fileOut.write(data.getBytes());
                System.out.println("Written block model!");
                fileOut.close();
            } catch (Exception e) {
                System.out.println("Problem reading file: " + filePath);
            }
        }
    }

    // grabs texture reference from the modded block
    private static String getVanillaBaseBlock(String blockName) {
        if (blockName.contains("damp_")) {
            return blockName.replace("damp_", "");
        } else if (blockName.contains("mossy_")) {
            return blockName.replace("mossy_", "");
        } else if (blockName.contains("moss_covered_")) {
            return blockName.replace("moss_covered_", "");
        } else {
            return blockName.replace("overgrown_", "");
        }
    }

    // gets the matching overlay
    private static String getOverlay(String blockName) {
        if (blockName.contains("damp")) {
            return "damp_overlay";
        } else if (blockName.contains("mossy")) {
            return "mossy_overlay";
        } else if (blockName.contains("moss_covered")) {
            return "moss_covered";
        } else {
            return "overgrown_overlay";
        }
    }

    /*



    Models



     */



    private static String basicModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/cube_all\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"up\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"down\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#all\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"up\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"down\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String slabModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/slab\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 16, 8, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"north\": { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"south\": { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"west\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 16, 8, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"up\", \"tintindex\": 1 },\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String slabDoubleModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/cube_all\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"west\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"up\", \"tintindex\": 1 },\n" +
                "        \"down\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    private static String slabTopModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/slab_top\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [ 0, 8, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#all\", \"cullface\": \"west\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 8, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"up\", \"tintindex\": 1 },\n" +
                "        \"down\": { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String stairsModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/stairs\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 8, 8, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 8, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 0, 0, 8, 16 ], \"texture\": \"#all\" },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"west\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 8, 0, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\":    { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"down\":  { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"north\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"south\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 8, 8, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": { \"uv\": [ 0, 0, 8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"up\": { \"uv\": [ 0, 0, 8, 16 ], \"texture\": \"#overlay\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 8, 0, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": { \"uv\": [ 0, 0, 8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"up\": { \"uv\": [ 0, 0, 8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"up\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String stairsInnerModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/inner_stairs\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 8, 8, 8 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#all\" },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#all\", \"cullface\": \"west\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 8, 0, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"north\": { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"south\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 8 ],\n" +
                "      \"to\": [ 8, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"north\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\" },\n" +
                "        \"south\": { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"west\" }\n" +
                "      }\n" +
                "    },\n" +
                "\n" +
                "\n" +
                "    {\n" +
                "      \"from\": [ 8, 0, 0 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"up\":    { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"up\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 8 ],\n" +
                "      \"to\": [ 8, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"up\":    { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"up\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"tintindex\": 1 },\n" +
                "        \"south\": { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 8, 8, 8 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"up\":    { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String stairsOuterModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/outer_stairs\",\n" +
                "  \"textures\": {\n" +
                "    \"all\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 16, 8, 8 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#all\" },\n" +
                "        \"north\": { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"north\" },\n" +
                "        \"west\":  { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"west\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 8 ],\n" +
                "      \"to\": [ 8, 8, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 0, 8, 8, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 0, 8, 8, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"south\": { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"west\" }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 8, 0, 8 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"down\":  { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"down\" },\n" +
                "        \"up\":    { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"up\" },\n" +
                "        \"north\": { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#all\" },\n" +
                "        \"south\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\", \"cullface\": \"south\" },\n" +
                "        \"west\":  { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#all\" },\n" +
                "        \"east\":  { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#all\", \"cullface\": \"east\" }\n" +
                "      }\n" +
                "    },\n" +
                "\n" +
                "\n" +
                "    {\n" +
                "      \"from\": [ 8, 0, 8 ],\n" +
                "      \"to\": [ 16, 16, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": { \"uv\": [ 0, 0, 8, 8 ], \"texture\": \"#overlay\", \"cullface\": \"up\" ,\"tintindex\":  1 },\n" +
                "        \"down\":  { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\":  1 },\n" +
                "        \"north\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"tintindex\":  1 },\n" +
                "        \"south\": { \"uv\": [ 8, 0, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\":  1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\":  1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 0,  8, 16 ], \"texture\": \"#overlay\", \"tintindex\":  1 }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 0 ],\n" +
                "      \"to\": [ 16, 8, 8 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\":    { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"tintindex\": 1 },\n" +
                "        \"down\":  { \"uv\": [ 0, 0, 16, 8 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 },\n" +
                "        \"north\": { \"uv\": [ 0, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"north\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 },\n" +
                "        \"east\":  { \"uv\": [ 0, 8,  8, 16 ], \"texture\": \"#overlay\", \"cullface\": \"east\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [ 0, 0, 8 ],\n" +
                "      \"to\": [ 8, 8, 16 ],\n" +
                "      \"faces\": {\n" +
                "        \"up\":    { \"uv\": [ 0, 8, 8, 16 ], \"texture\": \"#overlay\", \"tintindex\":  1 },\n" +
                "        \"south\": { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"south\", \"tintindex\": 1 },\n" +
                "        \"west\":  { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"west\", \"tintindex\": 1 },\n" +
                "        \"down\":  { \"uv\": [ 8, 8, 16, 16 ], \"texture\": \"#overlay\", \"cullface\": \"down\", \"tintindex\": 1 }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String logHorizontalModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/cube_column_horizontal\",\n" +
                "  \"textures\": {\n" +
                "    \"top\": \"minecraft:block/" + blockName + "_top\",\n" +
                "    \"bottom\": \"minecraft:block/" + blockName + "_top\",\n" +
                "    \"side\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }


    private static String logModel(String blockName) {
        String overlay = getOverlay(blockName);

        return "{\n" +
                "  \"parent\": \"minecraft:block/cube_column\",\n" +
                "  \"textures\": {\n" +
                "    \"top\": \"minecraft:block/" + blockName + "_top\",\n" +
                "    \"bottom\": \"minecraft:block/" + blockName + "_top\",\n" +
                "    \"side\": \"minecraft:block/" + blockName + "\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\",\n" +
                "    \"particle\": \"minecraft:block/" + blockName + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String deepslateMirroredModel(String blockName) {
        String overlay = getOverlay(blockName);
        return "{\n" +
                "  \"parent\": \"minecraft:block/cube_column_mirrored\",\n" +
                "  \"textures\": {\n" +
                "    \"top\": \"minecraft:block/deepslate_top\",\n" +
                "    \"bottom\": \"minecraft:block/deepslate_top\",\n" +
                "    \"side\": \"minecraft:block/deepslate\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"up\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"down\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"up\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"down\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String deepslateModel(String blockName) {
        String overlay = getOverlay(blockName);

        return "{\n" +
                "  \"parent\": \"minecraft:block/cube_column\",\n" +
                "  \"textures\": {\n" +
                "    \"top\": \"minecraft:block/deepslate_top\",\n" +
                "    \"bottom\": \"minecraft:block/deepslate_top\",\n" +
                "    \"side\": \"minecraft:block/deepslate\",\n" +
                "    \"overlay\": \"mossywood:block/" + overlay + "\"\n" +
                "  },\n" +
                "  \"elements\": [\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"up\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"down\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#bottom\",\n" +
                "          \"cullface\": \"down\"\n" +
                "        },\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#top\",\n" +
                "          \"cullface\": \"up\"\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"north\"\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"south\"\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"west\"\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#side\",\n" +
                "          \"cullface\": \"east\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"from\": [\n" +
                "        0,\n" +
                "        0,\n" +
                "        0\n" +
                "      ],\n" +
                "      \"to\": [\n" +
                "        16,\n" +
                "        16,\n" +
                "        16\n" +
                "      ],\n" +
                "      \"faces\": {\n" +
                "        \"up\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"up\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"down\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"down\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"north\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"north\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"south\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"south\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"west\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"west\",\n" +
                "          \"tintindex\": 1\n" +
                "        },\n" +
                "        \"east\": {\n" +
                "          \"texture\": \"#overlay\",\n" +
                "          \"cullface\": \"east\",\n" +
                "          \"tintindex\": 1\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }
}

package com.finallion.mossywood.data;

import com.finallion.mossywood.blocks.*;
import com.finallion.mossywood.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.*;


public class BlockStateGenerator {


    public static void initBlockStateGenerator(String path) {
        for (Block block : ModBlocks.blocksList) {
            Identifier blockId = Registry.BLOCK.getId(block);
            String blockName = blockId.toString().replace("mossywood:", "");
            String newBlockName = blockName;

            // waxed blockstates refer unwaxed models
            if (blockName.contains("waxed")) {
                newBlockName = blockName.replace("waxed_", "");
            }

            if (block instanceof MossyDeepslate || block instanceof WaxedMossyDeepslate) {
                writeFile(path, blockName, getDeepSlateState(newBlockName));
            } else if (block instanceof MossyLog || block instanceof WaxedMossyLog) {
                writeFile(path, blockName, getLogState(newBlockName));
            } else if (block instanceof MossyPlank || block instanceof MossyStone || block instanceof WaxedMossyPlank || block instanceof WaxedMossyStone) {
                writeFile(path, blockName, getBasicState(newBlockName));
            } else if (block instanceof MossySlabs || block instanceof MossyStoneSlab || block instanceof WaxedMossySlabs || block instanceof WaxedMossyStoneSlab) {
                writeFile(path, blockName, getSlabState(newBlockName));
            } else if (block instanceof MossyStairs || block instanceof MossyStoneStairs || block instanceof WaxedMossyStairs || block instanceof WaxedMossyStoneStairs) {
                writeFile(path, blockName, getStairState(newBlockName));
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
                System.out.println("Written blockstate!");
                fileOut.close();
            } catch (Exception e) {
                System.out.println("Problem reading file: " + filePath);
            }
        }
    }


    private static String getDeepSlateState(String blockName) {
        return "{\n" +
                "  \"variants\": {\n" +
                "    \"axis=x\": [\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "        \"x\": 90,\n" +
                "        \"y\": 90\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "_mirrored\",\n" +
                "        \"x\": 90,\n" +
                "        \"y\": 90\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "        \"y\": 90,\n" +
                "        \"x\": 90\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "_mirrored\",\n" +
                "        \"y\": 90,\n" +
                "        \"x\": 90\n" +
                "      }\n" +
                "    ],\n" +
                "    \"axis=y\": [\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "_mirrored\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "        \"y\": 180\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "_mirrored\",\n" +
                "        \"y\": 180\n" +
                "      }\n" +
                "    ],\n" +
                "    \"axis=z\": [\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "        \"x\": 90\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "_mirrored\",\n" +
                "        \"x\": 90\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "        \"y\": 180,\n" +
                "        \"x\": 90\n" +
                "      },\n" +
                "      {\n" +
                "        \"model\": \"mossywood:block/" + blockName + "_mirrored\",\n" +
                "        \"y\": 180,\n" +
                "        \"x\": 90\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }

    private static String getLogState(String blockName) {
        return "{\n" +
                "  \"variants\": {\n" +
                "    \"axis=x\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_horizontal\",\n" +
                "      \"x\": 90,\n" +
                "      \"y\": 90\n" +
                "    },\n" +
                "    \"axis=y\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\"\n" +
                "    },\n" +
                "    \"axis=z\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_horizontal\",\n" +
                "      \"x\": 90\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

    private static String getBasicState(String blockName) {
        return "{\n" +
                "  \"variants\": {\n" +
                "    \"\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

    private static String getSlabState(String blockName) {
        return "{\n" +
                "  \"variants\": {\n" +
                "    \"type=bottom\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\"\n" +
                "    },\n" +
                "    \"type=double\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_double\"\n" +
                "    },\n" +
                "    \"type=top\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_top\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

    private static String getStairState(String blockName) {
        return "{\n" +
                "  \"variants\": {\n" +
                "    \"facing=east,half=bottom,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=east,half=bottom,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\"\n" +
                "    },\n" +
                "    \"facing=east,half=bottom,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=east,half=bottom,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\"\n" +
                "    },\n" +
                "    \"facing=east,half=bottom,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\"\n" +
                "    },\n" +
                "    \"facing=east,half=top,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=east,half=top,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=east,half=top,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=east,half=top,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=east,half=top,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"x\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=bottom,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=bottom,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=bottom,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=bottom,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=bottom,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=top,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=top,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=top,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=top,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=north,half=top,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=bottom,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\"\n" +
                "    },\n" +
                "    \"facing=south,half=bottom,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=bottom,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\"\n" +
                "    },\n" +
                "    \"facing=south,half=bottom,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=bottom,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=top,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=top,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=top,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=top,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=south,half=top,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=bottom,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=bottom,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=bottom,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"y\": 90,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=bottom,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=bottom,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=top,shape=inner_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=top,shape=inner_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_inner\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=top,shape=outer_left\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=top,shape=outer_right\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "_outer\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 270,\n" +
                "      \"uvlock\": true\n" +
                "    },\n" +
                "    \"facing=west,half=top,shape=straight\": {\n" +
                "      \"model\": \"mossywood:block/" + blockName + "\",\n" +
                "      \"x\": 180,\n" +
                "      \"y\": 180,\n" +
                "      \"uvlock\": true\n" +
                "    }\n" +
                "  }\n" +
                "}\n";
    }



}

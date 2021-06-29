package com.finallion.mossywood.data;

import com.finallion.mossywood.blocks.*;
import com.finallion.mossywood.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.File;
import java.io.FileOutputStream;

public class LootTableGenerator {

    public static void initLootTableGenerator(String path) {
        for (Block block : ModBlocks.blocksList) {
            Identifier blockId = Registry.BLOCK.getId(block);
            String blockName = blockId.toString().replace("mossywood:", "");

            if (block instanceof MossySlabs || block instanceof MossyStoneSlab || block instanceof WaxedMossySlabs || block instanceof WaxedMossyStoneSlab) {
                writeFile(path, blockName, slabLootTable(blockName));
            } else {
                writeFile(path, blockName, basicLootTable(blockName));
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



    private static String basicLootTable(String blockName) {
        return "{\n" +
                "  \"type\": \"minecraft:block\",\n" +
                "  \"pools\": [\n" +
                "    {\n" +
                "      \"rolls\": 1.0, \"bonus_rolls\": 0.0,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"name\": \"mossywood:" + blockName + "\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"minecraft:survives_explosion\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

    private static String slabLootTable(String blockName) {
        return "{\n" +
                "  \"type\": \"minecraft:block\",\n" +
                "  \"pools\": [\n" +
                "    {\n" +
                "      \"rolls\": 1,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"functions\": [\n" +
                "            {\n" +
                "              \"function\": \"minecraft:set_count\",\n" +
                "              \"conditions\": [\n" +
                "                {\n" +
                "                  \"condition\": \"minecraft:block_state_property\",\n" +
                "                  \"block\": \"mossywood:" + blockName + "\",\n" +
                "                  \"properties\": {\n" +
                "                    \"type\": \"double\"\n" +
                "                  }\n" +
                "                }\n" +
                "              ],\n" +
                "              \"count\": 2\n" +
                "            },\n" +
                "            {\n" +
                "              \"function\": \"minecraft:explosion_decay\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"name\": \"mossywood:" + blockName + "\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }
}

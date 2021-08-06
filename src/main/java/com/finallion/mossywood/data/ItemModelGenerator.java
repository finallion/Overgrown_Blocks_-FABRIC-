package com.finallion.mossywood.data;

import com.finallion.mossywood.blocks.*;
import com.finallion.mossywood.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.File;
import java.io.FileOutputStream;

public class ItemModelGenerator {

    public static void initItemModelGenerator(String path) {
        for (Block block : ModBlocks.blocksList) {
            Identifier blockId = Registry.BLOCK.getId(block);
            String blockName = blockId.toString().replace("mossywood:", "");

            writeFile(path, blockName, getBasicItemModel(blockName));

        }
    }


    private static void writeFile(String path, String blockName, String data) {
        String filePath = path + "\\" + blockName + ".json";

        File file = new File(filePath);

        if (!file.exists() && !file.isDirectory()) {
            try {
                FileOutputStream fileOut = new FileOutputStream(filePath);
                fileOut.write(data.getBytes());
                System.out.println("Written item model!");
                fileOut.close();
            } catch (Exception e) {
                System.out.println("Problem reading file: " + filePath);
            }
        }
    }

    private static String getBasicItemModel(String blockName) {
        String withOutWaxed = blockName.replace("waxed_", "");


        return "{\n" +
                "  \"parent\": \"mossywood:block/" + withOutWaxed + "\"\n" +
                "}\n";
    }
}

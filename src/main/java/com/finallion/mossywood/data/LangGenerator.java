package com.finallion.mossywood.data;

import com.finallion.mossywood.blocks.*;
import com.finallion.mossywood.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class LangGenerator {
    public static void initLangGenerator(String path) {
        String itemGroup = "\"itemGroup.mossywood.mossy_group\": \"Overgrown Blocks\"";

        for (Block block : ModBlocks.blocksList) {
            Identifier blockId = Registry.BLOCK.getId(block);
            String blockName = blockId.toString().replace("mossywood:", "");

            writeToFile(path, blockName, false);
        }
        writeToFile(path, itemGroup, true);
    }


    private static void writeToFile(String path, String blockName, boolean itemGroup) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(path));
            StringBuffer inputBuffer = new StringBuffer();
            String line;

            // read data from file
            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            String inputStr = inputBuffer.toString().replace("}", "");

            FileOutputStream fileOut = new FileOutputStream(path);
            String editedLang;
            if (itemGroup) {
                editedLang = inputStr + blockName + "\n" + "}";
            } else {
                editedLang = inputStr + "\"block.mossywood." + blockName +"\": " + "\"" + editBlockName(blockName) + "\"," + "}";
            }
            fileOut.write(editedLang.getBytes());
            System.out.println("Written lang!");
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Problem reading file: " + path);
        }
    }

    private static String editBlockName(String blockName) {
        String[] nameParts = blockName.replace("_", " ").split(" ");
        StringBuilder name = new StringBuilder();
        for (String word : nameParts) {
            name.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }


        return name.toString().trim();
    }
}

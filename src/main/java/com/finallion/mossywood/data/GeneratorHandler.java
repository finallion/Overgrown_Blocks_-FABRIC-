package com.finallion.mossywood.data;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratorHandler {

    private static final String basePath = "C:\\Users\\lbret\\Desktop\\Modding\\Mossy Wood FABRIC 1.17\\src\\main\\resources\\";
    private static final String blockStatePath = "assets\\mossywood\\blockstates";
    private static final String langPath = "assets\\mossywood\\lang\\en_us.json";
    private static final String blockModelPath = "assets\\mossywood\\models\\block";
    private static final String itemModelPath = "assets\\mossywood\\models\\item";
    private static final String lootTablePath = "data\\mossywood\\loot_tables\\blocks";
    private static final String recipesPath = "data\\mossywood\\recipes";
    private static final String advancementsPath = "data\\mossywood\\advancements\\recipes\\mossywood";


    // generates files
    // target directories + lang file (en_us.json) needs to be present to generate
    public static void generateData() {
        //BlockStateGenerator.initBlockStateGenerator(basePath + blockStatePath);
        //LangGenerator.initLangGenerator(basePath + langPath);
        //rItemModelGenerator.initItemModelGenerator(basePath + itemModelPath);
        //BlockModelGenerator.initBlockModelGenerator(basePath + blockModelPath);
        //LootTableGenerator.initLootTableGenerator(basePath + lootTablePath);
    }

    // reworks data in existing files
    public static void changeData(String directoryPath, String content, String replacement, boolean createNewFile) {
        try {
            List<Path> files = findFiles(directoryPath);
            for (Path path : files) {
                writeNewFile(String.valueOf(path), content, replacement, createNewFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeNewFile(String path, String content, String replacement, boolean newFile) {
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
            String inputStr = inputBuffer.toString();


            // replaces specific data
            if (inputStr.contains(content)) {
                inputStr = inputStr.replace(content, replacement);
            }

            // write to new file or write the changed data to same file
            String newPathName = path;
            if (newFile) {
                newPathName = path.replace(content, replacement);
            }

            FileOutputStream fileOut = new FileOutputStream(newPathName);
            fileOut.write(inputStr.getBytes());
            System.out.println("Written!");
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Problem reading file: " + path);
        }
    }


    private static List<Path> findFiles(String searchDirectory) throws IOException {
        try (Stream<Path> files = Files.walk(Paths.get(searchDirectory))) {
            return files.collect(Collectors.toList());
        }
    }


}

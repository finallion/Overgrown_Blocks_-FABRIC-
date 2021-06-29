package com.finallion.mossywood;

import com.finallion.mossywood.data.GeneratorHandler;
import com.finallion.mossywood.registry.ModBlocks;
import com.finallion.mossywood.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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

public class MossyWood implements ModInitializer {
    public static final String MOD_ID = "mossywood";

    // damp, mossy, moss-covered, moss-overgrown
    // vegetated, well-vegetated, covered, overgrown


    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();


        // data
        //GeneratorHandler.generateData();




    }



    public static ItemGroup MOSSY_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "mossy_group"))
            .icon(() -> new ItemStack(ModItems.MOSSY_OAK_PLANKS)).build();

}

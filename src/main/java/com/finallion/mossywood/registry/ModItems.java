package com.finallion.mossywood.registry;

import com.finallion.mossywood.MossyWood;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static List<Item> itemsList = new ArrayList<>();

    public static Item createItem(Item item, Identifier id) {
        if (id != null && !id.equals(new Identifier("minecraft:air"))) {
            Registry.register(Registry.ITEM, id, item);
            itemsList.add(item);
            return item;
        } else {
            return null;
        }
    }

    public static Item createItem(Item item, String id) {
        Registry.register(Registry.ITEM, new Identifier(MossyWood.MOD_ID, id), item);
        itemsList.add(item);
        return item;
    }


    public static void registerItems() {
    }

    // oak
    public static final Item DAMP_OAK_PLANKS = createItem(new BlockItem(ModBlocks.DAMP_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_OAK_PLANKS));
    public static final Item MOSSY_OAK_PLANKS = createItem(new BlockItem(ModBlocks.MOSSY_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_OAK_PLANKS));
    public static final Item MOSS_COVERED_OAK_PLANKS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_OAK_PLANKS));
    public static final Item OVERGROWN_OAK_PLANKS = createItem(new BlockItem(ModBlocks.OVERGROWN_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_OAK_PLANKS));

    public static final Item WAXED_DAMP_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_OAK_PLANKS));
    public static final Item WAXED_MOSSY_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_OAK_PLANKS));
    public static final Item WAXED_MOSS_COVERED_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_OAK_PLANKS));
    public static final Item WAXED_OVERGROWN_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_OAK_PLANKS));

    public static final Item DAMP_OAK_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_OAK_STAIRS));
    public static final Item MOSSY_OAK_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_OAK_STAIRS));
    public static final Item MOSS_COVERED_OAK_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_OAK_STAIRS));
    public static final Item OVERGROWN_OAK_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_OAK_STAIRS));

    public static final Item WAXED_DAMP_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_OAK_STAIRS));
    public static final Item WAXED_MOSSY_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_OAK_STAIRS));
    public static final Item WAXED_MOSS_COVERED_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_OAK_STAIRS));
    public static final Item WAXED_OVERGROWN_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_OAK_STAIRS));

    public static final Item DAMP_OAK_SLAB = createItem(new BlockItem(ModBlocks.DAMP_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_OAK_SLAB));
    public static final Item MOSSY_OAK_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_OAK_SLAB));
    public static final Item MOSS_COVERED_OAK_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_OAK_SLAB));
    public static final Item OVERGROWN_OAK_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_OAK_SLAB));

    public static final Item WAXED_DAMP_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_OAK_SLAB));
    public static final Item WAXED_MOSSY_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_OAK_SLAB));
    public static final Item WAXED_MOSS_COVERED_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_OAK_SLAB));
    public static final Item WAXED_OVERGROWN_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_OAK_SLAB));

    public static final Item DAMP_OAK_LOG = createItem(new BlockItem(ModBlocks.DAMP_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_OAK_LOG));
    public static final Item MOSSY_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSSY_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_OAK_LOG));
    public static final Item MOSS_COVERED_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_OAK_LOG));
    public static final Item OVERGROWN_OAK_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_OAK_LOG));

    public static final Item WAXED_DAMP_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_OAK_LOG));
    public static final Item WAXED_MOSSY_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_OAK_LOG));
    public static final Item WAXED_MOSS_COVERED_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_OAK_LOG));
    public static final Item WAXED_OVERGROWN_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_OAK_LOG));

    public static final Item DAMP_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.DAMP_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_STRIPPED_OAK_LOG));
    public static final Item MOSSY_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSSY_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_STRIPPED_OAK_LOG));
    public static final Item MOSS_COVERED_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_STRIPPED_OAK_LOG));
    public static final Item OVERGROWN_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_STRIPPED_OAK_LOG));

    public static final Item WAXED_DAMP_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_STRIPPED_OAK_LOG));
    public static final Item WAXED_MOSSY_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_STRIPPED_OAK_LOG));
    public static final Item WAXED_MOSS_COVERED_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_OAK_LOG));
    public static final Item WAXED_OVERGROWN_STRIPPED_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STRIPPED_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_STRIPPED_OAK_LOG));


    // dark oak
    public static final Item DAMP_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.DAMP_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_DARK_OAK_PLANKS));
    public static final Item MOSSY_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.MOSSY_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_DARK_OAK_PLANKS));
    public static final Item MOSS_COVERED_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_DARK_OAK_PLANKS));
    public static final Item OVERGROWN_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.OVERGROWN_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_DARK_OAK_PLANKS));

    public static final Item WAXED_DAMP_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_DARK_OAK_PLANKS));
    public static final Item WAXED_MOSSY_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_DARK_OAK_PLANKS));
    public static final Item WAXED_MOSS_COVERED_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_PLANKS));
    public static final Item WAXED_OVERGROWN_DARK_OAK_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DARK_OAK_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_DARK_OAK_PLANKS));

    public static final Item DAMP_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_DARK_OAK_STAIRS));
    public static final Item MOSSY_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_DARK_OAK_STAIRS));
    public static final Item MOSS_COVERED_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_DARK_OAK_STAIRS));
    public static final Item OVERGROWN_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_DARK_OAK_STAIRS));

    public static final Item WAXED_DAMP_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_DARK_OAK_STAIRS));
    public static final Item WAXED_MOSSY_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_DARK_OAK_STAIRS));
    public static final Item WAXED_MOSS_COVERED_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_STAIRS));
    public static final Item WAXED_OVERGROWN_DARK_OAK_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DARK_OAK_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_DARK_OAK_STAIRS));

    public static final Item DAMP_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.DAMP_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_DARK_OAK_SLAB));
    public static final Item MOSSY_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_DARK_OAK_SLAB));
    public static final Item MOSS_COVERED_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_DARK_OAK_SLAB));
    public static final Item OVERGROWN_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_DARK_OAK_SLAB));

    public static final Item WAXED_DAMP_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_DARK_OAK_SLAB));
    public static final Item WAXED_MOSSY_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_DARK_OAK_SLAB));
    public static final Item WAXED_MOSS_COVERED_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_SLAB));
    public static final Item WAXED_OVERGROWN_DARK_OAK_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DARK_OAK_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_DARK_OAK_SLAB));

    public static final Item DAMP_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.DAMP_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_DARK_OAK_LOG));
    public static final Item MOSSY_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSSY_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_DARK_OAK_LOG));
    public static final Item MOSS_COVERED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_DARK_OAK_LOG));
    public static final Item OVERGROWN_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_DARK_OAK_LOG));

    public static final Item WAXED_DAMP_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_DARK_OAK_LOG));
    public static final Item WAXED_MOSSY_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_DARK_OAK_LOG));
    public static final Item WAXED_MOSS_COVERED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_DARK_OAK_LOG));
    public static final Item WAXED_OVERGROWN_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_DARK_OAK_LOG));

    public static final Item DAMP_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.DAMP_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_STRIPPED_DARK_OAK_LOG));
    public static final Item MOSSY_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG));
    public static final Item MOSS_COVERED_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_STRIPPED_DARK_OAK_LOG));
    public static final Item OVERGROWN_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_STRIPPED_DARK_OAK_LOG));

    public static final Item WAXED_DAMP_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_STRIPPED_DARK_OAK_LOG));
    public static final Item WAXED_MOSSY_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_STRIPPED_DARK_OAK_LOG));
    public static final Item WAXED_MOSS_COVERED_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_DARK_OAK_LOG));
    public static final Item WAXED_OVERGROWN_STRIPPED_DARK_OAK_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STRIPPED_DARK_OAK_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_STRIPPED_DARK_OAK_LOG));


    // acacia
    public static final Item DAMP_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.DAMP_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_ACACIA_PLANKS));
    public static final Item MOSSY_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.MOSSY_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_ACACIA_PLANKS));
    public static final Item MOSS_COVERED_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_ACACIA_PLANKS));
    public static final Item OVERGROWN_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.OVERGROWN_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_ACACIA_PLANKS));

    public static final Item WAXED_DAMP_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_ACACIA_PLANKS));
    public static final Item WAXED_MOSSY_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_ACACIA_PLANKS));
    public static final Item WAXED_MOSS_COVERED_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_ACACIA_PLANKS));
    public static final Item WAXED_OVERGROWN_ACACIA_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ACACIA_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_ACACIA_PLANKS));

    public static final Item DAMP_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_ACACIA_STAIRS));
    public static final Item MOSSY_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_ACACIA_STAIRS));
    public static final Item MOSS_COVERED_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_ACACIA_STAIRS));
    public static final Item OVERGROWN_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_ACACIA_STAIRS));

    public static final Item WAXED_DAMP_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_ACACIA_STAIRS));
    public static final Item WAXED_MOSSY_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_ACACIA_STAIRS));
    public static final Item WAXED_MOSS_COVERED_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_ACACIA_STAIRS));
    public static final Item WAXED_OVERGROWN_ACACIA_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ACACIA_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_ACACIA_STAIRS));

    public static final Item DAMP_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.DAMP_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_ACACIA_SLAB));
    public static final Item MOSSY_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_ACACIA_SLAB));
    public static final Item MOSS_COVERED_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_ACACIA_SLAB));
    public static final Item OVERGROWN_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_ACACIA_SLAB));

    public static final Item WAXED_DAMP_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_ACACIA_SLAB));
    public static final Item WAXED_MOSSY_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_ACACIA_SLAB));
    public static final Item WAXED_MOSS_COVERED_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_ACACIA_SLAB));
    public static final Item WAXED_OVERGROWN_ACACIA_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ACACIA_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_ACACIA_SLAB));

    public static final Item DAMP_ACACIA_LOG = createItem(new BlockItem(ModBlocks.DAMP_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_ACACIA_LOG));
    public static final Item MOSSY_ACACIA_LOG = createItem(new BlockItem(ModBlocks.MOSSY_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_ACACIA_LOG));
    public static final Item MOSS_COVERED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_ACACIA_LOG));
    public static final Item OVERGROWN_ACACIA_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_ACACIA_LOG));

    public static final Item WAXED_DAMP_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_ACACIA_LOG));
    public static final Item WAXED_MOSSY_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_ACACIA_LOG));
    public static final Item WAXED_MOSS_COVERED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_ACACIA_LOG));
    public static final Item WAXED_OVERGROWN_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_ACACIA_LOG));

    public static final Item DAMP_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.DAMP_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_STRIPPED_ACACIA_LOG));
    public static final Item MOSSY_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG));
    public static final Item MOSS_COVERED_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_STRIPPED_ACACIA_LOG));
    public static final Item OVERGROWN_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_STRIPPED_ACACIA_LOG));

    public static final Item WAXED_DAMP_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_STRIPPED_ACACIA_LOG));
    public static final Item WAXED_MOSSY_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_STRIPPED_ACACIA_LOG));
    public static final Item WAXED_MOSS_COVERED_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_ACACIA_LOG));
    public static final Item WAXED_OVERGROWN_STRIPPED_ACACIA_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STRIPPED_ACACIA_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_STRIPPED_ACACIA_LOG));


    // jungle
    public static final Item DAMP_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.DAMP_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_JUNGLE_PLANKS));
    public static final Item MOSSY_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.MOSSY_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_JUNGLE_PLANKS));
    public static final Item MOSS_COVERED_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_JUNGLE_PLANKS));
    public static final Item OVERGROWN_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.OVERGROWN_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_JUNGLE_PLANKS));

    public static final Item WAXED_DAMP_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_JUNGLE_PLANKS));
    public static final Item WAXED_MOSSY_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_JUNGLE_PLANKS));
    public static final Item WAXED_MOSS_COVERED_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_PLANKS));
    public static final Item WAXED_OVERGROWN_JUNGLE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_JUNGLE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_JUNGLE_PLANKS));

    public static final Item DAMP_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_JUNGLE_STAIRS));
    public static final Item MOSSY_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_JUNGLE_STAIRS));
    public static final Item MOSS_COVERED_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_JUNGLE_STAIRS));
    public static final Item OVERGROWN_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_JUNGLE_STAIRS));

    public static final Item WAXED_DAMP_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_JUNGLE_STAIRS));
    public static final Item WAXED_MOSSY_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_JUNGLE_STAIRS));
    public static final Item WAXED_MOSS_COVERED_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_STAIRS));
    public static final Item WAXED_OVERGROWN_JUNGLE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_JUNGLE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_JUNGLE_STAIRS));

    public static final Item DAMP_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_JUNGLE_SLAB));
    public static final Item MOSSY_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_JUNGLE_SLAB));
    public static final Item MOSS_COVERED_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_JUNGLE_SLAB));
    public static final Item OVERGROWN_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_JUNGLE_SLAB));

    public static final Item WAXED_DAMP_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_JUNGLE_SLAB));
    public static final Item WAXED_MOSSY_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_JUNGLE_SLAB));
    public static final Item WAXED_MOSS_COVERED_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_SLAB));
    public static final Item WAXED_OVERGROWN_JUNGLE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_JUNGLE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_JUNGLE_SLAB));

    public static final Item DAMP_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.DAMP_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_JUNGLE_LOG));
    public static final Item MOSSY_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.MOSSY_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_JUNGLE_LOG));
    public static final Item MOSS_COVERED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_JUNGLE_LOG));
    public static final Item OVERGROWN_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_JUNGLE_LOG));

    public static final Item WAXED_DAMP_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_JUNGLE_LOG));
    public static final Item WAXED_MOSSY_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_JUNGLE_LOG));
    public static final Item WAXED_MOSS_COVERED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_JUNGLE_LOG));
    public static final Item WAXED_OVERGROWN_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_JUNGLE_LOG));

    public static final Item DAMP_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.DAMP_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_STRIPPED_JUNGLE_LOG));
    public static final Item MOSSY_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG));
    public static final Item MOSS_COVERED_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_STRIPPED_JUNGLE_LOG));
    public static final Item OVERGROWN_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_STRIPPED_JUNGLE_LOG));

    public static final Item WAXED_DAMP_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_STRIPPED_JUNGLE_LOG));
    public static final Item WAXED_MOSSY_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_STRIPPED_JUNGLE_LOG));
    public static final Item WAXED_MOSS_COVERED_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_JUNGLE_LOG));
    public static final Item WAXED_OVERGROWN_STRIPPED_JUNGLE_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STRIPPED_JUNGLE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_STRIPPED_JUNGLE_LOG));




    // birch
    public static final Item DAMP_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.DAMP_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_BIRCH_PLANKS));
    public static final Item MOSSY_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.MOSSY_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_BIRCH_PLANKS));
    public static final Item MOSS_COVERED_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_BIRCH_PLANKS));
    public static final Item OVERGROWN_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.OVERGROWN_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_BIRCH_PLANKS));

    public static final Item WAXED_DAMP_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_BIRCH_PLANKS));
    public static final Item WAXED_MOSSY_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_BIRCH_PLANKS));
    public static final Item WAXED_MOSS_COVERED_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_BIRCH_PLANKS));
    public static final Item WAXED_OVERGROWN_BIRCH_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_BIRCH_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_BIRCH_PLANKS));

    public static final Item DAMP_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_BIRCH_STAIRS));
    public static final Item MOSSY_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_BIRCH_STAIRS));
    public static final Item MOSS_COVERED_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_BIRCH_STAIRS));
    public static final Item OVERGROWN_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_BIRCH_STAIRS));

    public static final Item WAXED_DAMP_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_BIRCH_STAIRS));
    public static final Item WAXED_MOSSY_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_BIRCH_STAIRS));
    public static final Item WAXED_MOSS_COVERED_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_BIRCH_STAIRS));
    public static final Item WAXED_OVERGROWN_BIRCH_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_BIRCH_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_BIRCH_STAIRS));

    public static final Item DAMP_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.DAMP_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_BIRCH_SLAB));
    public static final Item MOSSY_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_BIRCH_SLAB));
    public static final Item MOSS_COVERED_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_BIRCH_SLAB));
    public static final Item OVERGROWN_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_BIRCH_SLAB));

    public static final Item WAXED_DAMP_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_BIRCH_SLAB));
    public static final Item WAXED_MOSSY_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_BIRCH_SLAB));
    public static final Item WAXED_MOSS_COVERED_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_BIRCH_SLAB));
    public static final Item WAXED_OVERGROWN_BIRCH_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_BIRCH_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_BIRCH_SLAB));

    public static final Item DAMP_BIRCH_LOG = createItem(new BlockItem(ModBlocks.DAMP_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_BIRCH_LOG));
    public static final Item MOSSY_BIRCH_LOG = createItem(new BlockItem(ModBlocks.MOSSY_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_BIRCH_LOG));
    public static final Item MOSS_COVERED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_BIRCH_LOG));
    public static final Item OVERGROWN_BIRCH_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_BIRCH_LOG));

    public static final Item WAXED_DAMP_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_BIRCH_LOG));
    public static final Item WAXED_MOSSY_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_BIRCH_LOG));
    public static final Item WAXED_MOSS_COVERED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_BIRCH_LOG));
    public static final Item WAXED_OVERGROWN_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_BIRCH_LOG));

    public static final Item DAMP_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.DAMP_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_STRIPPED_BIRCH_LOG));
    public static final Item MOSSY_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG));
    public static final Item MOSS_COVERED_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_STRIPPED_BIRCH_LOG));
    public static final Item OVERGROWN_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_STRIPPED_BIRCH_LOG));

    public static final Item WAXED_DAMP_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_STRIPPED_BIRCH_LOG));
    public static final Item WAXED_MOSSY_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_STRIPPED_BIRCH_LOG));
    public static final Item WAXED_MOSS_COVERED_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_BIRCH_LOG));
    public static final Item WAXED_OVERGROWN_STRIPPED_BIRCH_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STRIPPED_BIRCH_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_STRIPPED_BIRCH_LOG));


    // spruce
    public static final Item DAMP_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.DAMP_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_SPRUCE_PLANKS));
    public static final Item MOSSY_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.MOSSY_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_SPRUCE_PLANKS));
    public static final Item MOSS_COVERED_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_SPRUCE_PLANKS));
    public static final Item OVERGROWN_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.OVERGROWN_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_SPRUCE_PLANKS));

    public static final Item WAXED_DAMP_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_SPRUCE_PLANKS));
    public static final Item WAXED_MOSSY_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_SPRUCE_PLANKS));
    public static final Item WAXED_MOSS_COVERED_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_PLANKS));
    public static final Item WAXED_OVERGROWN_SPRUCE_PLANKS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_SPRUCE_PLANKS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_SPRUCE_PLANKS));

    public static final Item DAMP_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_SPRUCE_STAIRS));
    public static final Item MOSSY_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_SPRUCE_STAIRS));
    public static final Item MOSS_COVERED_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_SPRUCE_STAIRS));
    public static final Item OVERGROWN_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_SPRUCE_STAIRS));

    public static final Item WAXED_DAMP_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_SPRUCE_STAIRS));
    public static final Item WAXED_MOSSY_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_SPRUCE_STAIRS));
    public static final Item WAXED_MOSS_COVERED_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_STAIRS));
    public static final Item WAXED_OVERGROWN_SPRUCE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_SPRUCE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_SPRUCE_STAIRS));

    public static final Item DAMP_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_SPRUCE_SLAB));
    public static final Item MOSSY_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_SPRUCE_SLAB));
    public static final Item MOSS_COVERED_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_SPRUCE_SLAB));
    public static final Item OVERGROWN_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_SPRUCE_SLAB));

    public static final Item WAXED_DAMP_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_SPRUCE_SLAB));
    public static final Item WAXED_MOSSY_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_SPRUCE_SLAB));
    public static final Item WAXED_MOSS_COVERED_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_SLAB));
    public static final Item WAXED_OVERGROWN_SPRUCE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_SPRUCE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_SPRUCE_SLAB));

    public static final Item DAMP_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.DAMP_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_SPRUCE_LOG));
    public static final Item MOSSY_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.MOSSY_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_SPRUCE_LOG));
    public static final Item MOSS_COVERED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_SPRUCE_LOG));
    public static final Item OVERGROWN_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_SPRUCE_LOG));

    public static final Item WAXED_DAMP_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_SPRUCE_LOG));
    public static final Item WAXED_MOSSY_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_SPRUCE_LOG));
    public static final Item WAXED_MOSS_COVERED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_SPRUCE_LOG));
    public static final Item WAXED_OVERGROWN_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_SPRUCE_LOG));

    public static final Item DAMP_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.DAMP_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.DAMP_STRIPPED_SPRUCE_LOG));
    public static final Item MOSSY_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG));
    public static final Item MOSS_COVERED_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.MOSS_COVERED_STRIPPED_SPRUCE_LOG));
    public static final Item OVERGROWN_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.OVERGROWN_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.OVERGROWN_STRIPPED_SPRUCE_LOG));

    public static final Item WAXED_DAMP_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_DAMP_STRIPPED_SPRUCE_LOG));
    public static final Item WAXED_MOSSY_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSSY_STRIPPED_SPRUCE_LOG));
    public static final Item WAXED_MOSS_COVERED_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_MOSS_COVERED_STRIPPED_SPRUCE_LOG));
    public static final Item WAXED_OVERGROWN_STRIPPED_SPRUCE_LOG = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STRIPPED_SPRUCE_LOG, new Item.Settings().group(MossyWood.MOSSY_GROUP)), Registry.BLOCK.getId(ModBlocks.WAXED_OVERGROWN_STRIPPED_SPRUCE_LOG));

    /*


    STONE



     */

    public static final Item DAMP_STONE = createItem(new BlockItem(ModBlocks.DAMP_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_stone");
    public static final Item DAMP_STONE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_stone_slab");
    public static final Item DAMP_STONE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_stone_stairs");
    public static final Item DAMP_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.DAMP_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_smooth_stone");
    public static final Item DAMP_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_smooth_stone_slab");

    public static final Item DAMP_DIORITE = createItem(new BlockItem(ModBlocks.DAMP_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_diorite");
    public static final Item DAMP_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_diorite_slab");
    public static final Item DAMP_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_diorite_stairs");
    public static final Item DAMP_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_diorite");
    public static final Item DAMP_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_diorite_slab");
    public static final Item DAMP_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_diorite_stairs");

    public static final Item DAMP_GRANITE = createItem(new BlockItem(ModBlocks.DAMP_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_granite");
    public static final Item DAMP_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_granite_slab");
    public static final Item DAMP_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_granite_stairs");
    public static final Item DAMP_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_granite");
    public static final Item DAMP_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_granite_slab");
    public static final Item DAMP_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_granite_stairs");

    public static final Item DAMP_ANDESITE = createItem(new BlockItem(ModBlocks.DAMP_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_andesite");
    public static final Item DAMP_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_andesite_slab");
    public static final Item DAMP_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_andesite_stairs");
    public static final Item DAMP_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_andesite");
    public static final Item DAMP_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_andesite_slab");
    public static final Item DAMP_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_andesite_stairs");

    public static final Item DAMP_DEEPSLATE = createItem(new BlockItem(ModBlocks.DAMP_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_deepslate");
    public static final Item DAMP_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_deepslate");
    public static final Item DAMP_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_deepslate_slab");
    public static final Item DAMP_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.DAMP_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "damp_polished_deepslate_stairs");


    public static final Item MOSSY_STONE = createItem(new BlockItem(ModBlocks.MOSSY_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_stone");
    public static final Item MOSSY_STONE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_stone_slab");
    public static final Item MOSSY_STONE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_stone_stairs");
    public static final Item MOSSY_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.MOSSY_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_smooth_stone");
    public static final Item MOSSY_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_smooth_stone_slab");

    public static final Item MOSSY_DIORITE = createItem(new BlockItem(ModBlocks.MOSSY_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_diorite");
    public static final Item MOSSY_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_diorite_slab");
    public static final Item MOSSY_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_diorite_stairs");
    public static final Item MOSSY_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_diorite");
    public static final Item MOSSY_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_diorite_slab");
    public static final Item MOSSY_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_diorite_stairs");

    public static final Item MOSSY_GRANITE = createItem(new BlockItem(ModBlocks.MOSSY_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_granite");
    public static final Item MOSSY_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_granite_slab");
    public static final Item MOSSY_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_granite_stairs");
    public static final Item MOSSY_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_granite");
    public static final Item MOSSY_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_granite_slab");
    public static final Item MOSSY_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_granite_stairs");

    public static final Item MOSSY_ANDESITE = createItem(new BlockItem(ModBlocks.MOSSY_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_andesite");
    public static final Item MOSSY_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_andesite_slab");
    public static final Item MOSSY_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_andesite_stairs");
    public static final Item MOSSY_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_andesite");
    public static final Item MOSSY_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_andesite_slab");
    public static final Item MOSSY_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_andesite_stairs");

    public static final Item MOSSY_DEEPSLATE = createItem(new BlockItem(ModBlocks.MOSSY_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_deepslate");
    public static final Item MOSSY_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_deepslate");
    public static final Item MOSSY_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_deepslate_slab");
    public static final Item MOSSY_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.MOSSY_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "mossy_polished_deepslate_stairs");




    public static final Item MOSS_COVERED_STONE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_stone");
    public static final Item MOSS_COVERED_STONE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_stone_slab");
    public static final Item MOSS_COVERED_STONE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_stone_stairs");
    public static final Item MOSS_COVERED_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_smooth_stone");
    public static final Item MOSS_COVERED_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_smooth_stone_slab");

    public static final Item MOSS_COVERED_DIORITE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_diorite");
    public static final Item MOSS_COVERED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_diorite_slab");
    public static final Item MOSS_COVERED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_diorite_stairs");
    public static final Item MOSS_COVERED_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_diorite");
    public static final Item MOSS_COVERED_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_diorite_slab");
    public static final Item MOSS_COVERED_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_diorite_stairs");

    public static final Item MOSS_COVERED_GRANITE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_granite");
    public static final Item MOSS_COVERED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_granite_slab");
    public static final Item MOSS_COVERED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_granite_stairs");
    public static final Item MOSS_COVERED_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_granite");
    public static final Item MOSS_COVERED_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_granite_slab");
    public static final Item MOSS_COVERED_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_granite_stairs");

    public static final Item MOSS_COVERED_ANDESITE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_andesite");
    public static final Item MOSS_COVERED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_andesite_slab");
    public static final Item MOSS_COVERED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_andesite_stairs");
    public static final Item MOSS_COVERED_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_andesite");
    public static final Item MOSS_COVERED_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_andesite_slab");
    public static final Item MOSS_COVERED_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_andesite_stairs");

    public static final Item MOSS_COVERED_DEEPSLATE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_deepslate");
    public static final Item MOSS_COVERED_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_deepslate");
    public static final Item MOSS_COVERED_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_deepslate_slab");
    public static final Item MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "moss_covered_polished_deepslate_stairs");




    public static final Item OVERGROWN_STONE = createItem(new BlockItem(ModBlocks.OVERGROWN_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_stone");
    public static final Item OVERGROWN_STONE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_stone_slab");
    public static final Item OVERGROWN_STONE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_stone_stairs");
    public static final Item OVERGROWN_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.OVERGROWN_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_smooth_stone");
    public static final Item OVERGROWN_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_smooth_stone_slab");

    public static final Item OVERGROWN_DIORITE = createItem(new BlockItem(ModBlocks.OVERGROWN_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_diorite");
    public static final Item OVERGROWN_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_diorite_slab");
    public static final Item OVERGROWN_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_diorite_stairs");
    public static final Item OVERGROWN_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_diorite");
    public static final Item OVERGROWN_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_diorite_slab");
    public static final Item OVERGROWN_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_diorite_stairs");

    public static final Item OVERGROWN_GRANITE = createItem(new BlockItem(ModBlocks.OVERGROWN_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_granite");
    public static final Item OVERGROWN_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_granite_slab");
    public static final Item OVERGROWN_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_granite_stairs");
    public static final Item OVERGROWN_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_granite");
    public static final Item OVERGROWN_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_granite_slab");
    public static final Item OVERGROWN_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_granite_stairs");

    public static final Item OVERGROWN_ANDESITE = createItem(new BlockItem(ModBlocks.OVERGROWN_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_andesite");
    public static final Item OVERGROWN_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_andesite_slab");
    public static final Item OVERGROWN_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_andesite_stairs");
    public static final Item OVERGROWN_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_andesite");
    public static final Item OVERGROWN_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_andesite_slab");
    public static final Item OVERGROWN_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_andesite_stairs");

    public static final Item OVERGROWN_DEEPSLATE = createItem(new BlockItem(ModBlocks.OVERGROWN_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_deepslate");
    public static final Item OVERGROWN_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_deepslate");
    public static final Item OVERGROWN_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_deepslate_slab");
    public static final Item OVERGROWN_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.OVERGROWN_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "overgrown_polished_deepslate_stairs");






    public static final Item WAXED_DAMP_STONE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_stone");
    public static final Item WAXED_DAMP_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_stone_slab");
    public static final Item WAXED_DAMP_STONE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_stone_stairs");
    public static final Item WAXED_DAMP_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_smooth_stone");
    public static final Item WAXED_DAMP_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_smooth_stone_slab");

    public static final Item WAXED_DAMP_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_diorite");
    public static final Item WAXED_DAMP_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_diorite_slab");
    public static final Item WAXED_DAMP_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_diorite_stairs");
    public static final Item WAXED_DAMP_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_diorite");
    public static final Item WAXED_DAMP_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_diorite_slab");
    public static final Item WAXED_DAMP_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_diorite_stairs");

    public static final Item WAXED_DAMP_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_granite");
    public static final Item WAXED_DAMP_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_granite_slab");
    public static final Item WAXED_DAMP_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_granite_stairs");
    public static final Item WAXED_DAMP_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_granite");
    public static final Item WAXED_DAMP_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_granite_slab");
    public static final Item WAXED_DAMP_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_granite_stairs");

    public static final Item WAXED_DAMP_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_andesite");
    public static final Item WAXED_DAMP_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_andesite_slab");
    public static final Item WAXED_DAMP_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_andesite_stairs");
    public static final Item WAXED_DAMP_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_andesite");
    public static final Item WAXED_DAMP_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_andesite_slab");
    public static final Item WAXED_DAMP_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_andesite_stairs");

    public static final Item WAXED_DAMP_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_deepslate");
    public static final Item WAXED_DAMP_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_deepslate");
    public static final Item WAXED_DAMP_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_deepslate_slab");
    public static final Item WAXED_DAMP_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_DAMP_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_damp_polished_deepslate_stairs");


    public static final Item WAXED_MOSSY_STONE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_stone");
    public static final Item WAXED_MOSSY_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_stone_slab");
    public static final Item WAXED_MOSSY_STONE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_stone_stairs");
    public static final Item WAXED_MOSSY_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_smooth_stone");
    public static final Item WAXED_MOSSY_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_smooth_stone_slab");

    public static final Item WAXED_MOSSY_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_diorite");
    public static final Item WAXED_MOSSY_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_diorite_slab");
    public static final Item WAXED_MOSSY_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_diorite_stairs");
    public static final Item WAXED_MOSSY_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_diorite");
    public static final Item WAXED_MOSSY_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_diorite_slab");
    public static final Item WAXED_MOSSY_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_diorite_stairs");

    public static final Item WAXED_MOSSY_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_granite");
    public static final Item WAXED_MOSSY_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_granite_slab");
    public static final Item WAXED_MOSSY_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_granite_stairs");
    public static final Item WAXED_MOSSY_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_granite");
    public static final Item WAXED_MOSSY_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_granite_slab");
    public static final Item WAXED_MOSSY_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_granite_stairs");

    public static final Item WAXED_MOSSY_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_andesite");
    public static final Item WAXED_MOSSY_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_andesite_slab");
    public static final Item WAXED_MOSSY_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_andesite_stairs");
    public static final Item WAXED_MOSSY_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_andesite");
    public static final Item WAXED_MOSSY_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_andesite_slab");
    public static final Item WAXED_MOSSY_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_andesite_stairs");

    public static final Item WAXED_MOSSY_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_deepslate");
    public static final Item WAXED_MOSSY_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_deepslate");
    public static final Item WAXED_MOSSY_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_deepslate_slab");
    public static final Item WAXED_MOSSY_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSSY_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_mossy_polished_deepslate_stairs");




    public static final Item WAXED_MOSS_COVERED_STONE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_stone");
    public static final Item WAXED_MOSS_COVERED_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_stone_slab");
    public static final Item WAXED_MOSS_COVERED_STONE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_stone_stairs");
    public static final Item WAXED_MOSS_COVERED_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_smooth_stone");
    public static final Item WAXED_MOSS_COVERED_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_smooth_stone_slab");

    public static final Item WAXED_MOSS_COVERED_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_diorite");
    public static final Item WAXED_MOSS_COVERED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_diorite_slab");
    public static final Item WAXED_MOSS_COVERED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_diorite_stairs");
    public static final Item WAXED_MOSS_COVERED_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_diorite");
    public static final Item WAXED_MOSS_COVERED_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_diorite_slab");
    public static final Item WAXED_MOSS_COVERED_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_diorite_stairs");

    public static final Item WAXED_MOSS_COVERED_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_granite");
    public static final Item WAXED_MOSS_COVERED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_granite_slab");
    public static final Item WAXED_MOSS_COVERED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_granite_stairs");
    public static final Item WAXED_MOSS_COVERED_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_granite");
    public static final Item WAXED_MOSS_COVERED_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_granite_slab");
    public static final Item WAXED_MOSS_COVERED_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_granite_stairs");

    public static final Item WAXED_MOSS_COVERED_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_andesite");
    public static final Item WAXED_MOSS_COVERED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_andesite_slab");
    public static final Item WAXED_MOSS_COVERED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_andesite_stairs");
    public static final Item WAXED_MOSS_COVERED_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_andesite");
    public static final Item WAXED_MOSS_COVERED_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_andesite_slab");
    public static final Item WAXED_MOSS_COVERED_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_andesite_stairs");

    public static final Item WAXED_MOSS_COVERED_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_deepslate");
    public static final Item WAXED_MOSS_COVERED_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_deepslate");
    public static final Item WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_deepslate_slab");
    public static final Item WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_MOSS_COVERED_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_moss_covered_polished_deepslate_stairs");




    public static final Item WAXED_OVERGROWN_STONE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_stone");
    public static final Item WAXED_OVERGROWN_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_stone_slab");
    public static final Item WAXED_OVERGROWN_STONE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_STONE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_stone_stairs");
    public static final Item WAXED_OVERGROWN_SMOOTH_STONE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_SMOOTH_STONE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_smooth_stone");
    public static final Item WAXED_OVERGROWN_SMOOTH_STONE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_SMOOTH_STONE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_smooth_stone_slab");

    public static final Item WAXED_OVERGROWN_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_diorite");
    public static final Item WAXED_OVERGROWN_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_diorite_slab");
    public static final Item WAXED_OVERGROWN_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_diorite_stairs");
    public static final Item WAXED_OVERGROWN_POLISHED_DIORITE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_diorite");
    public static final Item WAXED_OVERGROWN_POLISHED_DIORITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_diorite_slab");
    public static final Item WAXED_OVERGROWN_POLISHED_DIORITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_DIORITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_diorite_stairs");

    public static final Item WAXED_OVERGROWN_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_granite");
    public static final Item WAXED_OVERGROWN_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_granite_slab");
    public static final Item WAXED_OVERGROWN_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_granite_stairs");
    public static final Item WAXED_OVERGROWN_POLISHED_GRANITE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_granite");
    public static final Item WAXED_OVERGROWN_POLISHED_GRANITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_granite_slab");
    public static final Item WAXED_OVERGROWN_POLISHED_GRANITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_GRANITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_granite_stairs");

    public static final Item WAXED_OVERGROWN_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_andesite");
    public static final Item WAXED_OVERGROWN_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_andesite_slab");
    public static final Item WAXED_OVERGROWN_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_andesite_stairs");
    public static final Item WAXED_OVERGROWN_POLISHED_ANDESITE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_andesite");
    public static final Item WAXED_OVERGROWN_POLISHED_ANDESITE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_andesite_slab");
    public static final Item WAXED_OVERGROWN_POLISHED_ANDESITE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_ANDESITE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_andesite_stairs");

    public static final Item WAXED_OVERGROWN_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_deepslate");
    public static final Item WAXED_OVERGROWN_POLISHED_DEEPSLATE = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_deepslate");
    public static final Item WAXED_OVERGROWN_POLISHED_DEEPSLATE_SLAB = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE_SLAB, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_deepslate_slab");
    public static final Item WAXED_OVERGROWN_POLISHED_DEEPSLATE_STAIRS = createItem(new BlockItem(ModBlocks.WAXED_OVERGROWN_POLISHED_DEEPSLATE_STAIRS, new Item.Settings().group(MossyWood.MOSSY_GROUP)), "waxed_overgrown_polished_deepslate_stairs");




}

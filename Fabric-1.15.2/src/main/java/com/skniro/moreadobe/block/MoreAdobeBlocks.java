package com.skniro.moreadobe.block;


import com.skniro.moreadobe.MoreAdobe;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class MoreAdobeBlocks {
    public static final Block Photoshop = registerBlock("photoshop", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block After_Effects = registerBlock("after_effects", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Bridge = registerBlock("bridge", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Dreamweaver = registerBlock("dreamweaver", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Encore = registerBlock("encore", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Fireworks = registerBlock("fireworks", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Flash = registerBlock("flash", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Animate = registerBlock("animate", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Illustrator = registerBlock("illustrator", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Indesign = registerBlock("indesign", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Lightroom = registerBlock("lightroom", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Prelude = registerBlock("prelude", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Premiere_pro = registerBlock("premiere_pro", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Speedgrade = registerBlock("speedgrade", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Audition = registerBlock("audition", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MoreAdobe.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MoreAdobe.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + MoreAdobe.MOD_ID);
    }
}


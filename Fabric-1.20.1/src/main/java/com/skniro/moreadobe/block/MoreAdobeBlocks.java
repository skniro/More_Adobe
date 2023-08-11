package com.skniro.moreadobe.block;


import com.skniro.moreadobe.MoreAdobe;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class MoreAdobeBlocks {
    public static final Block Photoshop = registerBlock("photoshop", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block After_Effects = registerBlock("after_effects", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Bridge = registerBlock("bridge", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Dreamweaver = registerBlock("dreamweaver", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Encore = registerBlock("encore", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Fireworks = registerBlock("fireworks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Flash = registerBlock("flash", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Animate = registerBlock("animate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Illustrator = registerBlock("illustrator", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Indesign = registerBlock("indesign", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Lightroom = registerBlock("lightroom", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Prelude = registerBlock("prelude", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Premiere_pro = registerBlock("premiere_pro", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Speedgrade = registerBlock("speedgrade", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);
    public static final Block Audition = registerBlock("audition", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 6.0F)),MoreAdobe.More_Adobe_Group);



    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(MoreAdobe.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(MoreAdobe.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + MoreAdobe.MOD_ID);
    }
}


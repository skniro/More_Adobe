package com.skniro.moreadobe.block;


import com.skniro.moreadobe.MoreAdobe;
import com.skniro.moreadobe.item.ModCreativeModeTabs;
import com.skniro.moreadobe.item.MoreAdobeItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MoreAdobeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreAdobe.MODID);

    public static final RegistryObject<Block> Photoshop = registerBlock("photoshop",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> After_Effects = registerBlock("after_effects",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Bridge = registerBlock("bridge",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Dreamweaver = registerBlock("dreamweaver",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Encore = registerBlock("encore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Fireworks = registerBlock("fireworks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Flash = registerBlock("flash",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Animate = registerBlock("animate",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Illustrator = registerBlock("illustrator",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Indesign = registerBlock("indesign",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Lightroom = registerBlock("lightroom",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Prelude = registerBlock("prelude",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Premiere_pro = registerBlock("premiere_pro",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Speedgrade = registerBlock("speedgrade",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);
    public static final RegistryObject<Block> Audition = registerBlock("audition",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),ModCreativeModeTabs.More_Adobe_Group);



    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return MoreAdobeItems.ITEMS.register(name, () ->
                new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}


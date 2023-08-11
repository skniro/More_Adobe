package com.skniro.moreadobe;


import com.skniro.moreadobe.block.MoreAdobeBlocks;
import com.skniro.moreadobe.item.MoreAdobeItems;


public class ModContent {


    public static void registerItem(){
        MoreAdobeItems.shield_item();
    }
    public static void registerBlock(){
        MoreAdobeBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
    }
}

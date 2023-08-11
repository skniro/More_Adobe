package com.skniro.moreadobe;


import com.skniro.moreadobe.block.MoreAdobeBlocks;
import com.skniro.moreadobe.item.MoreAdobeItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class ModContent {


    public static void registerItem(){
        MoreAdobeItems.shield_item();
    }
    public static void registerBlock(){
        MoreAdobeBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(MoreAdobe.More_Adobe_Group).register(content -> {
            content.add(MoreAdobeBlocks.Photoshop);
            content.add(MoreAdobeBlocks.After_Effects);
            content.add(MoreAdobeBlocks.Bridge);
            content.add(MoreAdobeBlocks.Dreamweaver);
            content.add(MoreAdobeBlocks.Encore);
            content.add(MoreAdobeBlocks.Fireworks);
            content.add(MoreAdobeBlocks.Flash);
            content.add(MoreAdobeBlocks.Animate);
            content.add(MoreAdobeBlocks.Illustrator);
            content.add(MoreAdobeBlocks.Indesign);
            content.add(MoreAdobeBlocks.Lightroom);
            content.add(MoreAdobeBlocks.Prelude);
            content.add(MoreAdobeBlocks.Premiere_pro);
            content.add(MoreAdobeBlocks.Speedgrade);
            content.add(MoreAdobeBlocks.Audition);
        });
    }
}

package com.skniro.moreadobe;

import com.skniro.moreadobe.block.MoreAdobeBlocks;
import com.skniro.moreadobe.item.ModCreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;


public class ModContent {

    public static void CreativeTab(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.More_Adobe_Group) {
            event.accept(MoreAdobeBlocks.Photoshop.get());
            event.accept(MoreAdobeBlocks.After_Effects.get());
            event.accept(MoreAdobeBlocks.Bridge.get());
            event.accept(MoreAdobeBlocks.Dreamweaver.get());
            event.accept(MoreAdobeBlocks.Encore.get());
            event.accept(MoreAdobeBlocks.Fireworks.get());
            event.accept(MoreAdobeBlocks.Flash.get());
            event.accept(MoreAdobeBlocks.Animate.get());
            event.accept(MoreAdobeBlocks.Illustrator.get());
            event.accept(MoreAdobeBlocks.Indesign.get());
            event.accept(MoreAdobeBlocks.Lightroom.get());
            event.accept(MoreAdobeBlocks.Prelude.get());
            event.accept(MoreAdobeBlocks.Premiere_pro.get());
            event.accept(MoreAdobeBlocks.Speedgrade.get());
            event.accept(MoreAdobeBlocks.Audition.get());
        }
    }
}

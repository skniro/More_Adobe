package com.skniro.moreadobe.datagen;


import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class MoreAdobeLootTableGenerator extends FabricBlockLootTableProvider {
    public MoreAdobeLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        addDrop(MoreAdobeBlocks.Photoshop);
        addDrop(MoreAdobeBlocks.After_Effects);
        addDrop(MoreAdobeBlocks.Bridge);
        addDrop(MoreAdobeBlocks.Dreamweaver);
        addDrop(MoreAdobeBlocks.Encore);
        addDrop(MoreAdobeBlocks.Fireworks);
        addDrop(MoreAdobeBlocks.Flash);
        addDrop(MoreAdobeBlocks.Animate);
        addDrop(MoreAdobeBlocks.Illustrator);
        addDrop(MoreAdobeBlocks.Indesign);
        addDrop(MoreAdobeBlocks.Lightroom);
        addDrop(MoreAdobeBlocks.Prelude);
        addDrop(MoreAdobeBlocks.Premiere_pro);
        addDrop(MoreAdobeBlocks.Speedgrade);
        addDrop(MoreAdobeBlocks.Audition);
    }
}

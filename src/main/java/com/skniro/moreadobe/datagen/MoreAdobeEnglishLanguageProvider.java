package com.skniro.moreadobe.datagen;

import com.skniro.moreadobe.MoreAdobe;
import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MoreAdobeEnglishLanguageProvider extends FabricLanguageProvider {
    public MoreAdobeEnglishLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(MoreAdobeBlocks.Photoshop,"Photoshop");
        translationBuilder.add(MoreAdobeBlocks.After_Effects,"After Effects");
        translationBuilder.add(MoreAdobeBlocks.Bridge, "Bridge");
        translationBuilder.add(MoreAdobeBlocks.Dreamweaver,"Dreamweaver");
        translationBuilder.add(MoreAdobeBlocks.Encore,"Encore" );
        translationBuilder.add(MoreAdobeBlocks.Fireworks,"Fireworks");
        translationBuilder.add(MoreAdobeBlocks.Flash,"Flash");
        translationBuilder.add(MoreAdobeBlocks.Animate,"Animate");
        translationBuilder.add(MoreAdobeBlocks.Illustrator ,"Illustrator");
        translationBuilder.add(MoreAdobeBlocks.Indesign ,"Indesign");
        translationBuilder.add(MoreAdobeBlocks.Lightroom ,"Lightroom");
        translationBuilder.add(MoreAdobeBlocks.Prelude,"Prelude");
        translationBuilder.add(MoreAdobeBlocks.Premiere_pro,"Premier Pro");
        translationBuilder.add(MoreAdobeBlocks.Speedgrade,"SpeedGrade");
        translationBuilder.add(MoreAdobeBlocks.Audition,"Audition");
        translationBuilder.add(MoreAdobe.More_Adobe_Group,"More Adobe");
    }
}

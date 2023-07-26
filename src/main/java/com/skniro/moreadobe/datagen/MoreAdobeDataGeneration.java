package com.skniro.moreadobe.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreAdobeDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.createPack().addProvider(MoreAdobeModelProvider::new);
        fabricDataGenerator.createPack().addProvider(MoreAdobeLootTableGenerator::new);
        fabricDataGenerator.createPack().addProvider(MoreAdobeEnglishLanguageProvider::new);
    }
}

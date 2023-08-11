package com.skniro.moreadobe.datagen;

import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class MoreAdobeModelProvider extends FabricModelProvider {
    public MoreAdobeModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Photoshop);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.After_Effects);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Bridge);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Dreamweaver);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Encore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Fireworks);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Flash);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Animate);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Illustrator);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Indesign);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Lightroom);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Prelude);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Premiere_pro);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Speedgrade);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MoreAdobeBlocks.Audition);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}

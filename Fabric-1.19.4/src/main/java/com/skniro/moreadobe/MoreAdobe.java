package com.skniro.moreadobe;

import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MoreAdobe implements ModInitializer {
    public static final String MOD_ID = "more_adobe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




     public static final ItemGroup More_Adobe_Group = FabricItemGroup.builder(
             new Identifier(MOD_ID, "test_group"))
                     .icon(() -> new ItemStack(MoreAdobeBlocks.Photoshop))
                     .build();

    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}

package com.skniro.moreadobe;

import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MoreAdobe implements ModInitializer {
    public static final String MOD_ID = "more_adobe";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static final ItemGroup More_Adobe_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "test_group"),() -> new ItemStack(MoreAdobeBlocks.Photoshop));

    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}

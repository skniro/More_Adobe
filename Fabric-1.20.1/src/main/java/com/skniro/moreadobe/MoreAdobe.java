package com.skniro.moreadobe;

import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MoreAdobe implements ModInitializer {
    public static final String MOD_ID = "more_adobe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static final RegistryKey<ItemGroup> More_Adobe_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "test_group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, More_Adobe_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MoreAdobeBlocks.Photoshop))
                .displayName(Text.translatable("itemGroup.more_adobe.test_group"))
                .build()); // build() no longer registers by itself
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}

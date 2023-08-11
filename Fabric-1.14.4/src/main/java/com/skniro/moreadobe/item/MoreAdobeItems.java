package com.skniro.moreadobe.item;

import com.skniro.moreadobe.MoreAdobe;
import net.minecraft.item.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreAdobeItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreAdobe.MOD_ID, name), item);
    }

    public static void shield_item(){
        MoreAdobe.LOGGER.debug("register shield item.");
    }
}

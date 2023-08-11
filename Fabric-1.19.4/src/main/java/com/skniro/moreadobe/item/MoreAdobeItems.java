package com.skniro.moreadobe.item;

import com.skniro.moreadobe.MoreAdobe;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreAdobeItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreAdobe.MOD_ID, name), item);
    }

    public static void shield_item(){
        MoreAdobe.LOGGER.debug("register shield item.");
    }
}

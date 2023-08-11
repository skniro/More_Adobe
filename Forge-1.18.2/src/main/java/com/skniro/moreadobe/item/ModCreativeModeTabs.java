package com.skniro.moreadobe.item;

import com.skniro.moreadobe.MoreAdobe;
import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreAdobe.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static final CreativeModeTab More_Adobe_Group = new CreativeModeTab("more_adobe.test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MoreAdobeBlocks.Photoshop.get());
        }
    };
}




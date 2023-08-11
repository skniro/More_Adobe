package com.skniro.moreadobe.item;

import com.skniro.moreadobe.MoreAdobe;
import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = MoreAdobe.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab More_Adobe_Group;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        More_Adobe_Group = event.registerCreativeModeTab(new ResourceLocation(MoreAdobe.MODID, "test_group"),
                builder -> builder.icon(() -> new ItemStack(MoreAdobeBlocks.Photoshop.get()))
                        .title(Component.translatable("itemGroup.more_adobe.test_group")));
    }
}




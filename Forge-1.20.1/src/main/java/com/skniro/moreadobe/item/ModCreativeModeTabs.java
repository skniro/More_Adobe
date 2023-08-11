package com.skniro.moreadobe.item;

import com.skniro.moreadobe.MoreAdobe;
import com.skniro.moreadobe.block.MoreAdobeBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreAdobe.MODID);

    public static final RegistryObject<CreativeModeTab> More_Adobe_Group = CREATIVE_MODE_TABS.register("test_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MoreAdobeBlocks.Photoshop.get()))
                    .title(Component.translatable("itemGroup.more_adobe.test_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MoreAdobeBlocks.Photoshop.get());
                        pOutput.accept(MoreAdobeBlocks.After_Effects.get());
                        pOutput.accept(MoreAdobeBlocks.Bridge.get());
                        pOutput.accept(MoreAdobeBlocks.Dreamweaver.get());
                        pOutput.accept(MoreAdobeBlocks.Encore.get());
                        pOutput.accept(MoreAdobeBlocks.Fireworks.get());
                        pOutput.accept(MoreAdobeBlocks.Flash.get());
                        pOutput.accept(MoreAdobeBlocks.Animate.get());
                        pOutput.accept(MoreAdobeBlocks.Illustrator.get());
                        pOutput.accept(MoreAdobeBlocks.Indesign.get());
                        pOutput.accept(MoreAdobeBlocks.Lightroom.get());
                        pOutput.accept(MoreAdobeBlocks.Prelude.get());
                        pOutput.accept(MoreAdobeBlocks.Premiere_pro.get());
                        pOutput.accept(MoreAdobeBlocks.Speedgrade.get());
                        pOutput.accept(MoreAdobeBlocks.Audition.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

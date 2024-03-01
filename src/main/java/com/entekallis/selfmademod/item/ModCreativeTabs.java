package com.entekallis.selfmademod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final CreativeModeTab roswiniumTab = new CreativeModeTab("Roswinium") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.roswiniumGem.get());
        }
    };
}

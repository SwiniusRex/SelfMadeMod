package com.entekallis.selfmademod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    private static final DeferredRegister<Item> itemRegister =
            DeferredRegister.create(ForgeRegistries.ITEMS, "selfmademod");

    private static final RegistryObject<Item> roswiniumGem = itemRegister.register("roswinium_gem",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus){
        itemRegister.register(eventBus);
    }
}

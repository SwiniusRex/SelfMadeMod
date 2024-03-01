package com.entekallis.selfmademod.item;

import com.entekallis.selfmademod.SelfMadeMod;
import com.entekallis.selfmademod.blocks.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModItems {

    public static final DeferredRegister<Item> itemRegister =
            DeferredRegister.create(ForgeRegistries.ITEMS, SelfMadeMod.MODID);


    /*
    Items
     */
    public static final RegistryObject<Item> roswiniumGem = itemRegister.register("roswinium_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeTabs.roswiniumTab).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus){
        itemRegister.register(eventBus);
    }

}

package com.entekallis.selfmademod.blocks;

import com.entekallis.selfmademod.SelfMadeMod;
import com.entekallis.selfmademod.item.ModCreativeTabs;
import com.entekallis.selfmademod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {



    public static final DeferredRegister<Block> blockRegister =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SelfMadeMod.MODID);


    public static final RoswinStoneSuite roswinStoneSuite = new RoswinStoneSuite();


    /*
    Default BlockBehaviour setter
     */
    public static BlockBehaviour.Properties setBlockProps(Material material, float solidity, float exploResis, boolean needsTool){
        if(needsTool){
            return BlockBehaviour.Properties.of(material).destroyTime(solidity).explosionResistance(exploResis).requiresCorrectToolForDrops();
        }else{
            return BlockBehaviour.Properties.of(Material.STONE).destroyTime(solidity).explosionResistance(exploResis);
        }


    }


    /*
    No touching
     */
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> res = blockRegister.register(name, block);
        registerBlockItem(name, res, tab);
        return res;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab){
        return ModItems.itemRegister.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus e){
        blockRegister.register(e);
    }
}

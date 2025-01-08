package com.entekallis.selfmademod.blocks;

import com.entekallis.selfmademod.item.ModCreativeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

/*
 * Contains every Block of the Roswin Stone suite, like :
 * stairs, slabs, Roswin Stone Bricks... and others
 */
public class RoswinStoneSuite{

    public static final RegistryObject<Block> roswinStone = ModBlocks.registerBlock(
            "roswin_stone",
            ()-> new Block(ModBlocks.setBlockProps(Material.STONE,2f,1.5f, true)),
            ModCreativeTabs.roswiniumTab
    );
    public static final RegistryObject<Block> cobbledRoswinStone =  ModBlocks.registerBlock(
            "cobbled_roswin_stone",
            () -> new Block(ModBlocks.setBlockProps(Material.STONE,2f,1.8f, true)),
            ModCreativeTabs.roswiniumTab
    );


    public static final RegistryObject<Block> cobbledRoswinStoneSlab = ModBlocks.registerBlock(
            "cobbled_roswin_slab",
            ()-> new SlabBlock(ModBlocks.setBlockProps(Material.STONE,2f,1.5f, true)),
            ModCreativeTabs.roswiniumTab
    );

    public static final RegistryObject<Block> cobbledRoswinStoneStairs = ModBlocks.registerBlock(
            "cobbled_roswin_stairs",
            ()-> new StairBlock(()-> RoswinStoneSuite.cobbledRoswinStone.get().defaultBlockState(), ModBlocks.setBlockProps(Material.STONE,2f,1.5f, true)),
            ModCreativeTabs.roswiniumTab
    );

    public static final RegistryObject<Block> cobbledRoswinStoneWall = ModBlocks.registerBlock(
            "cobbled_roswin_wall",
            ()-> new WallBlock(ModBlocks.setBlockProps(Material.STONE,2f,1.5f,true)),
            ModCreativeTabs.roswiniumTab
    );

    public static final RegistryObject<Block> roswinBricks = ModBlocks.registerBlock(
            "roswin_bricks",
            ()-> new Block(ModBlocks.setBlockProps(Material.STONE,2f,1.5f, true)),
            ModCreativeTabs.roswiniumTab
    );

    public static final RegistryObject<Block> roswinBricksSlab = ModBlocks.registerBlock(
            "roswin_bricks_slab",
            ()-> new SlabBlock(ModBlocks.setBlockProps(Material.STONE,2f,1.5f, true)),
            ModCreativeTabs.roswiniumTab
    );

    public static final RegistryObject<Block> roswinBricksStairs = ModBlocks.registerBlock(
            "roswin_bricks_stairs",
            ()-> new StairBlock(()-> RoswinStoneSuite.roswinBricks.get().defaultBlockState(), ModBlocks.setBlockProps(Material.STONE,2f,1.5f, true)),
            ModCreativeTabs.roswiniumTab
    );

    public static final RegistryObject<Block> roswinBricksWall = ModBlocks.registerBlock(
            "roswin_bricks_wall",
            ()-> new WallBlock(ModBlocks.setBlockProps(Material.STONE,2f,1.5f,true)),
            ModCreativeTabs.roswiniumTab
    );


}

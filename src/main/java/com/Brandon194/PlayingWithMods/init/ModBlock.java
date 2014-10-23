package com.Brandon194.PlayingWithMods.init;

import com.Brandon194.PlayingWithMods.blocks.BlockFlag;
import com.Brandon194.PlayingWithMods.blocks.BlockGenerator;
import com.Brandon194.PlayingWithMods.blocks.BlockSpawner;
import com.Brandon194.PlayingWithMods.blocks.BlockWindmillGound;
import com.Brandon194.PlayingWithMods.container.BlockWindmill;
import com.Brandon194.PlayingWithMods.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Brandon194 on 15/10/2014.
 */
public class ModBlock {
    public static final BlockFlag flag = new BlockFlag();
    public static final BlockWindmill mill = new BlockWindmill();
    public static final BlockWindmillGound gMill = new BlockWindmillGound();
    public static final BlockSpawner blockSpawner = new BlockSpawner();
    public static final BlockGenerator bGen = new BlockGenerator();

    public static void init(){
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
        GameRegistry.registerBlock(mill, Names.Blocks.MILL);
        GameRegistry.registerBlock(gMill, Names.Blocks.GMILL);
        GameRegistry.registerBlock(blockSpawner, Names.Blocks.MOB_SPAWNER);
        GameRegistry.registerBlock(bGen, Names.Blocks.GENERATOR);

    }
}

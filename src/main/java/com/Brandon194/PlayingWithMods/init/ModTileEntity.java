package com.Brandon194.PlayingWithMods.init;

import com.Brandon194.PlayingWithMods.TileEntity.TileEntityGenerator;
import com.Brandon194.PlayingWithMods.TileEntity.TileEntityWindmill;
import com.Brandon194.PlayingWithMods.TileEntity.TileEntityWindmillFloor;
import com.Brandon194.PlayingWithMods.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Brandon194 on 15/10/2014.
 */
public class ModTileEntity {
    public static void init() {
        GameRegistry.registerTileEntity(TileEntityWindmill.class, Names.TileEntities.MILL);
        GameRegistry.registerTileEntity(TileEntityWindmillFloor.class, Names.TileEntities.MILL_FLOOR);
        GameRegistry.registerTileEntity(TileEntityGenerator.class, Names.TileEntities.GENERATOR);
    }
}

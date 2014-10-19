package com.Brandon194.PlayingWithMods.init;

import com.Brandon194.PlayingWithMods.item.ItemMapleLeaf;
import com.Brandon194.PlayingWithMods.item.ItemPWM;
import com.Brandon194.PlayingWithMods.item.ItemSpawner;
import com.Brandon194.PlayingWithMods.item.ItemWindmill;
import com.Brandon194.PlayingWithMods.reference.Names;
import com.Brandon194.PlayingWithMods.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Brandon194 on 11/10/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemMapleLeaf mapleLeaf = new ItemMapleLeaf();
    public static final ItemWindmill mill = new ItemWindmill();
    public static final ItemSpawner spawner = new ItemSpawner();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);
        GameRegistry.registerItem(mill, Names.Items.MILL);
        GameRegistry.registerItem(spawner, Names.Items.SPAWNER);
    }
}

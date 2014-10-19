package com.Brandon194.PlayingWithMods.creativeTabs;

import com.Brandon194.PlayingWithMods.init.ModItems;
import com.Brandon194.PlayingWithMods.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Brandon194 on 13/10/2014.
 */
public class CreativeTabPWM {
    public static final CreativeTabs PWM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
        @Override
        public Item getTabIconItem() {return ModItems.mapleLeaf; }
    };
}

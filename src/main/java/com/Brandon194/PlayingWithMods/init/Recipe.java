package com.Brandon194.PlayingWithMods.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Michelin on 15/10/2014.
 */
public class Recipe {
    public static void init(){
        //Shaped recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf) );
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf), "stickWood"));
    }
}

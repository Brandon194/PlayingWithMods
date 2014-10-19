package com.Brandon194.PlayingWithMods.blocks;

import com.Brandon194.PlayingWithMods.creativeTabs.CreativeTabPWM;
import com.Brandon194.PlayingWithMods.reference.Reference;
import com.Brandon194.PlayingWithMods.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Brandon194 on 13/10/2014.
 */
public class BlockPWM extends Block{
    public BlockPWM(Material material){
        super(material);
        this.setCreativeTab(CreativeTabPWM.PWM_TAB);
    }

    public BlockPWM(){
        this(Material.rock);
        this.setCreativeTab(CreativeTabPWM.PWM_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
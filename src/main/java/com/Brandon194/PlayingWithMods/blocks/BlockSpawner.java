package com.Brandon194.PlayingWithMods.blocks;

import com.Brandon194.PlayingWithMods.reference.Names;
import com.Brandon194.PlayingWithMods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockMobSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.MobSpawnerBaseLogic;

/**
 * Created by Brandon194 on 17/10/2014.
 */
public class BlockSpawner extends BlockMobSpawner {
    public BlockSpawner(){
        super(Material.iron);

        this.setBlockTextureName(Names.Blocks.MOB_SPAWNER);
        this.setBlockName(Names.Blocks.MOB_SPAWNER);
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

    public boolean isOpaqueCube(){
        return false;
    }
}

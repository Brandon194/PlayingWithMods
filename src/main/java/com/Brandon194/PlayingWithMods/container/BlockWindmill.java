package com.Brandon194.PlayingWithMods.container;

import com.Brandon194.PlayingWithMods.TileEntity.TileEntityWindmill;
import com.Brandon194.PlayingWithMods.reference.Names;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Brandon194 on 15/10/2014.
 */
public class BlockWindmill extends BlockContainer {
    public BlockWindmill(Material material){
        super(material);
        this.setBlockName(Names.Blocks.MILL);
    }

    public BlockWindmill(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.MILL);
        this.setBlockTextureName("furnace");
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    public TileEntity createNewTileEntity(World world, int Int){
        return new TileEntityWindmill();
    }
}

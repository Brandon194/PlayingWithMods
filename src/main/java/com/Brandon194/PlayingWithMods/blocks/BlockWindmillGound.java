package com.Brandon194.PlayingWithMods.blocks;

import com.Brandon194.PlayingWithMods.TileEntity.TileEntityWindmillFloor;
import com.Brandon194.PlayingWithMods.init.ModBlock;
import com.Brandon194.PlayingWithMods.reference.Names;
import com.Brandon194.PlayingWithMods.utility.LogHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import sun.org.mozilla.javascript.internal.ast.Block;

/**
 * Created by Michelin on 15/10/2014.
 */
public class BlockWindmillGound extends BlockPWM {
    public BlockWindmillGound(){
        super();
        this.setBlockName(Names.Blocks.GMILL);

        this.setBlockBounds(0, 0, 0, 1,0.1F, 1);
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
        updateMultiBlockStructure(world,x,y,z);
    }

    public void onBlockAdded(World world, int x, int y, int z){
        updateMultiBlockStructure(world,x,y,z);
    }

    public void updateMultiBlockStructure(World world, int x, int y, int z){
        isMultiBlockStructure(world, x, y, z);
    }

    public boolean isMultiBlockStructure(World world, int x1, int y1, int z1){
        boolean mStructure = false;
        boolean currCheckStructure = true;

        for(int x2=0;x2<3;x2++) {
            for(int z2=0;z2<3;z2++) {
                if (!mStructure) {
                    currCheckStructure = true;
                    for (int x3 = 0; x3 < 3; x3++) {
                        for (int z3 = 0; z3 < 3; z3++) {
                            if (currCheckStructure && !world.getBlock(x1 + x2 - x3, y1, z1 + z2 - z3).equals(ModBlock.gMill)) {
                                currCheckStructure = false;
                            }
                        }
                    }

                    if(currCheckStructure){
                        for (int x3 = 0; x3 < 3; x3++) {
                            for (int z3 = 0; z3 < 3; z3++) {
                                world.setBlockMetadataWithNotify(x1+x2-x3,y1,z1+z2-z3, x3*3+z3+1, 2);
                            }
                        }
                    }

                }
                mStructure = currCheckStructure;
            }
        }

        if (mStructure) return true;

        if (world.getBlockMetadata(x1,y1,z1) >0) world.setBlockMetadataWithNotify(x1,y1,z1,0,3);

        return false;
    }

    public TileEntity createNewTileEntity(World world, int var2){
        return new TileEntityWindmillFloor();
    }
}

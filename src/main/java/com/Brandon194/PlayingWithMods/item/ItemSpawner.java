package com.Brandon194.PlayingWithMods.item;

import com.Brandon194.PlayingWithMods.init.ModBlock;
import com.Brandon194.PlayingWithMods.reference.Names;
import com.Brandon194.PlayingWithMods.reference.Reference;
import com.Brandon194.PlayingWithMods.utility.LogHelper;
import com.Brandon194.PlayingWithMods.utility.NBTHelper;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Brandon194 on 17/10/2014.
 */
public class ItemSpawner extends ItemPWM {
    public ItemSpawner(){
        super();
        this.setUnlocalizedName(Names.Items.SPAWNER);
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2) {
        if (!world.isRemote) {

            if (world.getBlock(x,y,z) == ModBlock.blockSpawner){

                try {
                    world.setBlockMetadataWithNotify(x, y, z, 0, NBTHelper.getInt(player.getCurrentEquippedItem(), "mobType"));
                }catch(Exception e){
                    
                }


                return true;
            }
        }

        return false;
    }
}

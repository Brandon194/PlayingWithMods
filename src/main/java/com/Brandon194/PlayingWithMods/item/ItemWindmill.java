package com.Brandon194.PlayingWithMods.item;

import com.Brandon194.PlayingWithMods.init.ModBlock;
import com.Brandon194.PlayingWithMods.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Brandon194 on 15/10/2014.
 */
public class ItemWindmill extends ItemPWM {
    public ItemWindmill(){
        super();
        this.setUnlocalizedName(Names.Items.MILL);
        this.setTextureName("diamond");
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2) {
        if (!world.isRemote) {
            System.out.println(world.getBlock(x, y, z));

            return true;
        }

        return false;
    }
}

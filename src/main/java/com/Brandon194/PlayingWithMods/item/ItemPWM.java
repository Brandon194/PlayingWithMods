package com.Brandon194.PlayingWithMods.item;

import com.Brandon194.PlayingWithMods.creativeTabs.CreativeTabPWM;
import com.Brandon194.PlayingWithMods.reference.Reference;
import com.Brandon194.PlayingWithMods.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Brandon194 on 11/10/2014.
 */
public class ItemPWM extends Item {

    public ItemPWM(){
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabPWM.PWM_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizaedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizaedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        LogHelper.debug("ItemIcon: " + itemIcon.getIconName());
    }

    protected String getUnwrappedUnlocalizaedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

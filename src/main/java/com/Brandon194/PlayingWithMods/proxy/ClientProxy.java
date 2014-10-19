package com.Brandon194.PlayingWithMods.proxy;

import com.Brandon194.PlayingWithMods.TileEntity.Render.RenderWindmill;
import com.Brandon194.PlayingWithMods.TileEntity.Render.RenderWindmillFloor;
import com.Brandon194.PlayingWithMods.TileEntity.TileEntityWindmill;
import com.Brandon194.PlayingWithMods.TileEntity.TileEntityWindmillFloor;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Brandon194 on 11/10/2014.
 */
public class ClientProxy extends CommonProxy{
    public void registerProxies(){
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new RenderWindmill());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmillFloor.class, new RenderWindmillFloor());
    }
}

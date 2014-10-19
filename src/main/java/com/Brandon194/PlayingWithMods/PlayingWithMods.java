package com.Brandon194.PlayingWithMods;

import com.Brandon194.PlayingWithMods.handler.ConfigurationHandler;
import com.Brandon194.PlayingWithMods.init.ModBlock;
import com.Brandon194.PlayingWithMods.init.ModItems;
import com.Brandon194.PlayingWithMods.init.Recipe;
import com.Brandon194.PlayingWithMods.proxy.CommonProxy;
import com.Brandon194.PlayingWithMods.proxy.IProxy;
import com.Brandon194.PlayingWithMods.reference.Reference;
import com.Brandon194.PlayingWithMods.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Brandon194 on 11/10/2014.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class PlayingWithMods {

    @Mod.Instance(Reference.MOD_ID)
    public static PlayingWithMods instance;

    @SidedProxy(clientSide = Reference.MOD_CLIENT_PROXY , serverSide = Reference.MOD_SERVER_PROXY )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlock.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

        proxy.registerProxies();

        Recipe.init();
        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post Initialization Complete");
    }
}

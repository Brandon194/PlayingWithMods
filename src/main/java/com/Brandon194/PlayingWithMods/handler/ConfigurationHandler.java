package com.Brandon194.PlayingWithMods.handler;

import com.Brandon194.PlayingWithMods.reference.Reference;
import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Brandon194 on 11/10/2014.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){

        // Create the configuration file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
        else{

        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            // Resync Configs
            if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
                loadConfiguration();
            }
        }
    }

    private static void loadConfiguration(){

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration");

        if (configuration.hasChanged()){
            configuration.save();
        }

        /*
        boolean configValue = false;
        try{

            // Load the configuration file
            configuration.load();

            // Read in properties from configuation file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "ConfigValue", true, "This is an example config value").getBoolean(true);
        }
        catch(Exception e) {
            // Log Exception
        }
        finally{
            // Save the configuration file
            if(configuration.hasChanged()) {
                configuration.save();
            }
        }

        System.out.println(">" + Reference.MOD_NAME + " configValue: " + configValue);
        */
    }
}

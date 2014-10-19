package com.Brandon194.PlayingWithMods.client.gui;

import com.Brandon194.PlayingWithMods.handler.ConfigurationHandler;
import com.Brandon194.PlayingWithMods.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Brandon194 on 11/10/2014.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen){
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}

package com.lionzxy.deltarising;

import cpw.mods.fml.common.Loader;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by lionzxy on 21.07.15.
 */
public class DeltaRisingConfig {
    public static Configuration config;



    public static void preInit(){
        createConfig();
    }
    public static void createConfig(){
        File configFile = new File(Loader.instance().getConfigDir(), "DeltaRising.cfg");
        config = new Configuration(configFile,"0.0.1");
        config.getCategory("general");
        config.getInt("Value Items","general",1,0,1024,"Количество предметов");
        if(config.getBoolean("Creative Tab","general",false,"Disable ore enable Creative Tab")){
            config.getString("Item Name Id","general","minecraft:stone","");
        }

        loadConfig();
    }
    public static void loadConfig(){
        config.save();
        config.load();
    }
    public static int getValueItems(){
        loadConfig();
        return config.getInt("Value Items","general",1,0,1024,"Количество предметов");
    }
    public static Configuration getConfig(){
        loadConfig();
        return config;
    }

}

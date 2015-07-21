package com.lionzxy.deltarising;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lionzxy on 21.07.15.
 */
@Mod(modid = "deltarising", name = "Delta Rising")
public class DeltaRising {
    List<Item> items = new ArrayList<Item>();

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        DeltaRisingConfig.preInit();
        for(int i=0;i<DeltaRisingConfig.getValueItems();i++){
            items.add(i,new DamageItem(
                    DeltaRisingConfig.getConfig().getInt("Max Damage","item"+i,10,1,9999999,""),
                    DeltaRisingConfig.getConfig().getString("Texture Name","item"+i,"texture"+i,""),
                    DeltaRisingConfig.getConfig().getString("UnlocalizedName","item"+i,"defaultname"+i,"")
            ));
            if(DeltaRisingConfig.getConfig().getBoolean("Creative Tab", "general", false, "Disable ore enable Creative Tab")){
                items.get(i).setCreativeTab(DeltaRisingTab.tabGeneral);
            }
            GameRegistry.registerItem(items.get(i),DeltaRisingConfig.getConfig().getString("UnlocalizedName","item"+i,"defaultname"+i,""));
        }
        if(DeltaRisingConfig.getConfig().getBoolean("Creative Tab", "general", false, "Disable ore enable Creative Tab")){
            DeltaRisingTab.postInit();
        }
    }
}

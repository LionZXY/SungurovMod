package com.lionzxy.deltarising;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by lionzxy on 21.07.15.
 */
public class DamageItem extends Item {
    DamageItem(int maxDamage,String nameTexture,String name){
        this.setTextureName("deltarising:"+nameTexture);
        this.setMaxDamage(maxDamage);
        this.setUnlocalizedName(name);
    }
    }


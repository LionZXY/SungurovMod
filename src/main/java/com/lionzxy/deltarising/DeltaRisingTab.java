package com.lionzxy.deltarising;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by lionzxy on 21.07.15.
 */
public class DeltaRisingTab {
    public static final CreativeTabs tabGeneral = new MyTab("tabGeneral");
    public static void postInit() {
        ((MyTab) tabGeneral).setTabIconItem(new ItemStack(Block.getBlockFromName(DeltaRisingConfig.getConfig().getString("Item Name Id","general","minecraft:stone",""))));
    }
}

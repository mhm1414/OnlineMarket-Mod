package com.mhm1414.onlinemarket.init;

import com.mhm1414.onlinemarket.item.ItemCasing;
import com.mhm1414.onlinemarket.item.ItemCore;
import com.mhm1414.onlinemarket.item.ItemHelmet;
import com.mhm1414.onlinemarket.item.ItemOM;
import com.mhm1414.onlinemarket.item.ItemPortableTerminal;
import com.mhm1414.onlinemarket.item.ItemSuit;
import com.mhm1414.onlinemarket.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    
    public static final ItemOM portableTerminal= new ItemPortableTerminal();
    public static final ItemOM core= new ItemCore();
    public static final ItemOM casing= new ItemCasing();
    public static final ItemOM helmet= new ItemHelmet();
    public static final ItemOM suit= new ItemSuit();
    
    public static void init(){
        GameRegistry.registerItem(portableTerminal , "PortableTerminal");
        GameRegistry.registerItem(core , "Core");
        GameRegistry.registerItem(casing , "Casing");
        GameRegistry.registerItem(helmet , "Helmet");
        GameRegistry.registerItem(suit , "Suit");
    }

}

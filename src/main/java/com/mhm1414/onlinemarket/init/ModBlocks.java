package com.mhm1414.onlinemarket.init;

import com.mhm1414.onlinemarket.block.BlockMainMachine;
import com.mhm1414.onlinemarket.block.BlockOM;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    
    public static final BlockOM mainMachine=new BlockMainMachine();
    
    public static void init(){
        
        GameRegistry.registerBlock(mainMachine , "mainMachine");
        
    }

}

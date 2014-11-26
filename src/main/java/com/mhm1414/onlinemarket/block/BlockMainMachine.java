package com.mhm1414.onlinemarket.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class BlockMainMachine extends BlockOM {
    
    public BlockMainMachine(){
        
        super(Material.iron);
        this.setBlockName("mainMachine");
        this.setStepSound(Block.soundTypeMetal);
        this.setResistance(10);
        this.setHardness(3);
    }

}

package com.mhm1414.onlinemarket.block;

import com.mhm1414.onlinemarket.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockOM extends Block {
    
    public BlockOM(Material material){
        
        super(material);
        
    }
    
    public BlockOM(){
        
        this(Material.rock);
        
    }
    
    @Override
    public String getUnlocalizedName(){
        
        return String.format("tile.%s%s" , Reference.MOD_ID.toLowerCase() + ":" , getUnwarppedUnlocalizedName(super.getUnlocalizedName()));
    
    }
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        
        blockIcon= iconRegister.registerIcon(String.format("%s" ,getUnwarppedUnlocalizedName(this.getUnlocalizedName())));
        
    }
    
    private String getUnwarppedUnlocalizedName(String unlocalizedName) {
        
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    
    }


}

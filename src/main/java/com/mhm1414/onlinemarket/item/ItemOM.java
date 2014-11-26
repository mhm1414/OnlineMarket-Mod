package com.mhm1414.onlinemarket.item;

import com.mhm1414.onlinemarket.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemOM extends Item {
    
    public ItemOM(){
        
        super();
        
    }
    
    @Override
    public String getUnlocalizedName(){
        
        return String.format("item.%s%s" , Reference.MOD_ID.toLowerCase() + ":" , getUnwarppedUnlocalizedName(super.getUnlocalizedName()));
    
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        
        return String.format("item.%s%s" , Reference.MOD_ID.toLowerCase() + ":" , getUnwarppedUnlocalizedName(super.getUnlocalizedName()));
    
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        
        itemIcon= iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        
    }
    
    private String getUnwarppedUnlocalizedName(String unlocalizedName) {
        
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    
    }

}

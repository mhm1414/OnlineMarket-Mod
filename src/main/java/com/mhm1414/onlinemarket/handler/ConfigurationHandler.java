package com.mhm1414.onlinemarket.handler;

import java.io.File;

import com.mhm1414.onlinemarket.reference.Reference;
import com.mhm1414.onlinemarket.utility.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static Configuration config;
	public static boolean bmUpNeed=true;
	
	public static void init(File configFile){
		
		if(config == null){
			config = new Configuration(configFile);
			loadConfig();
		}
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			loadConfig();
		}
	}
	
	private static void loadConfig(){
		
		bmUpNeed = config.getBoolean("bmUpNeed", "upgrades", true, "if this value is true then you need an upgrade to access the BALCK MARKET");
			
		
		if(config.hasChanged()){
			config.save();
		}
		
		
	}

}

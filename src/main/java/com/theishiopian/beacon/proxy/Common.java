package com.theishiopian.beacon.proxy;

import com.theishiopian.beacon.init.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Common 
{
	public void preInit(FMLPreInitializationEvent e) 
	{
        
    }

    public void init(FMLInitializationEvent e) 
    {
        
    }

    public void postInit(FMLPostInitializationEvent e) 
    {
       
    }
    
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(ModItems.beacon);
	}
	
	
}
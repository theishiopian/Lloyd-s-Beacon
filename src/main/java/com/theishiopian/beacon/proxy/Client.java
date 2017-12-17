package com.theishiopian.beacon.proxy;


import com.theishiopian.beacon.init.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Client extends Common
{
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		
		ModItems.initModels();
	}
}

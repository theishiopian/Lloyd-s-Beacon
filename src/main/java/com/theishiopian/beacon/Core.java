package com.theishiopian.beacon;

import com.theishiopian.beacon.init.ModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Core.MODID, version = Core.VERSION)
public class Core
{
    public static final String MODID = "lloydsbeacon";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ModItems.init();
    }
}

package com.theishiopian.beacon;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public final class ModSounds
{
	public static final SoundEvent dejavu = createEvent("dejavu");
	
	private static SoundEvent createEvent(String sound) 
	{
		ResourceLocation name = new ResourceLocation("beacon", sound);
		return new SoundEvent(name).setRegistryName(name);
	}
	
	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event)
	{
		event.getRegistry().register(dejavu);
	}
}

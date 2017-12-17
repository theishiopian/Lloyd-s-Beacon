package com.theishiopian.beacon.init;

import com.theishiopian.beacon.items.Beacon;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
	public static Item beacon;
	
	public static void init()
	{
		beacon = new Beacon();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels()
	{
		((Beacon) beacon).initModel();
	}
}

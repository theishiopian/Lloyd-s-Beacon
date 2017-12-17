package com.theishiopian.beacon.items;

import com.theishiopian.beacon.ModSounds;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Beacon extends Item
{
	BlockPos savedloc;
	
	public Beacon()
	{
		setUnlocalizedName("beacon");
		setRegistryName("beacon");
		setCreativeTab(CreativeTabs.TOOLS);
		savedloc = null;
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel()
	{
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if(playerIn.isSneaking())
		{
			//System.out.println("Shift-Right Click");
			savedloc=playerIn.getPosition();
		}
		else
		{
			//System.out.println("Right-Click");
			if(savedloc!=null)
			{
				if(playerIn.attemptTeleport(savedloc.getX(), savedloc.getY(), savedloc.getZ()))
				{
					playerIn.playSound(ModSounds.dejavu, 1, 1);
					playerIn.getCooldownTracker().setCooldown(this, 60);
					savedloc=null;
				}
				
				
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
	
	@Override
	public boolean hasEffect(ItemStack item)
	{
		if(savedloc != null)
		{
			return true;
		}
		return false;
	}
}

package holo.fallingearth.util.handler;

import holo.fallingearth.entity.meteor.EntityMeteor;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MeteorDropHandler 
{
	private static Random rand = new Random();
	
	public static void DropMeteor(World world, EntityPlayer player, int size)
	{
		if (!world.isRemote)
		{
			double xDir = rand.nextInt(64) - 32;
			double zDir = rand.nextInt(64) - 32;
			
			EntityMeteor meteor = new EntityMeteor(world, player.posX + xDir, player.posZ + zDir, size);
			meteor.setDirection(-xDir / 32, -zDir / 32);
			
			
			world.spawnEntityInWorld(meteor);
		}
	}
}

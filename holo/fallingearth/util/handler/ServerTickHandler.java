package holo.fallingearth.util.handler;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{

	public void tickStart(EnumSet var1, Object ... var2) {}

	public void tickEnd(EnumSet var1, Object ... var2)
	{
		onTickInGame();
	}

	public EnumSet ticks()
	{
		return EnumSet.of(TickType.SERVER);
	}

	public String getLabel()
	{
		return "Falling Earth Server Tick Handler";
	}

	public void onTickInGame()
	{
		int ticks = MinecraftServer.getServer().getTickCounter();
		if ((ticks & 24000) == 12000 && ticks > 72000)
		{
			MeteorDropHandler.DropMeteor(1);
		}
	}
}
package holo.fallingearth.util.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageHelper 
{
	public static void initNames()
	{
		LanguageRegistry.addName(ItemHelper.meteoriticSword, "Meteoritic Sword");
		LanguageRegistry.addName(ItemHelper.meteoriticShovel, "Meteoritic Shovel");
		LanguageRegistry.addName(ItemHelper.meteoriticPickaxe, "Meteoritic Pickaxe");
		LanguageRegistry.addName(ItemHelper.meteoriticAxe, "Meteoritic Axe");
		LanguageRegistry.addName(ItemHelper.meteoriticHead, "Meteoritic Helmet");
		LanguageRegistry.addName(ItemHelper.meteoriticBody, "Meteoritic Chestplate");
		LanguageRegistry.addName(ItemHelper.meteoriticLegs, "Meteoritic Legs");
		LanguageRegistry.addName(ItemHelper.meteoriticBoots, "Meteoritic Boots");

		LanguageRegistry.addName(ItemHelper.meteoriticEssence, "Meteoritic Essence");
		LanguageRegistry.addName(ItemHelper.meteorSpawner, "Meteor Caller");

		LanguageRegistry.addName(BlockHelper.risePlate, "Rise Plate");
		LanguageRegistry.addName(BlockHelper.meteorStone, "Meteor Stone");
		LanguageRegistry.addName(BlockHelper.meteoriteSpawner, "Meteorite Spawner");
		LanguageRegistry.addName(BlockHelper.meteorSpawnSpawner, "Meteor Spawn Spawner");

		LanguageRegistry.instance().addStringLocalization("entity.FallingEarth.FallingEarth_Meteor.name",  "Meteor");
		LanguageRegistry.instance().addStringLocalization("entity.FallingEarth.FallingEarth_Meteorite.name",  "Meteorite");
		LanguageRegistry.instance().addStringLocalization("entity.FallingEarth.FallingEarth_MeteorSpawn.name",  "Meteor Spawn");

		LanguageRegistry.instance().addStringLocalization("entity.FallingEarth_Meteor.name",  "Meteor");
		LanguageRegistry.instance().addStringLocalization("entity.FallingEarth_Meteorite.name",  "Meteorite");
		LanguageRegistry.instance().addStringLocalization("entity.FallingEarth_MeteorSpawn.name",  "Meteor Spawn");
	}
}

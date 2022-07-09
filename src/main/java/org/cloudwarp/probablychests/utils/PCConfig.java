package org.cloudwarp.probablychests.utils;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import org.cloudwarp.probablychests.ProbablyChests;


@Config(name = ProbablyChests.MOD_ID)
public class PCConfig implements ConfigData {


	@ConfigEntry.Gui.CollapsibleObject
	public MimicSettings mimicSettings = new MimicSettings();
	@ConfigEntry.Gui.CollapsibleObject
	public WorldGen worldGen = new WorldGen();

	public static class MimicSettings {
		@ConfigEntry.Gui.Tooltip()
		public boolean easierMimics = false;
		@ConfigEntry.Gui.Tooltip()
		public boolean spawnNaturalMimics = true;
		@ConfigEntry.Gui.Tooltip()
		public float naturalMimicSpawnRate = 0.95F;
		@ConfigEntry.Gui.Tooltip()
		public boolean allowPetMimics = true;
	}

	public static class WorldGen {
		@ConfigEntry.Gui.Tooltip()
		public float potSpawnChance = 0.4F;
		@ConfigEntry.Gui.Tooltip()
		public float chestSpawnChance = 0.2F;
		@ConfigEntry.Gui.Tooltip()
		public float surfaceChestSpawnChance = 0.02F;
		@ConfigEntry.Gui.Tooltip()
		public float secretMimicChance = 0.35F;
	}


}
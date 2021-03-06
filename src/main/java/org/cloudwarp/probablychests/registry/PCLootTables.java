package org.cloudwarp.probablychests.registry;

import com.google.common.collect.Sets;
import net.minecraft.util.Identifier;

import java.util.Set;

public class PCLootTables {

	private static final Set<Identifier> PC_LOOT_TABLES = Sets.newHashSet();

	public static Identifier LUSH_CHEST;
	public static Identifier NORMAL_CHEST;
	public static Identifier ROCKY_CHEST;
	public static Identifier STONE_CHEST;
	public static Identifier GOLD_CHEST;
	public static Identifier NETHER_CHEST;
	public static Identifier SHADOW_CHEST;
	public static Identifier ICE_CHEST;
	public static Identifier CORAL_CHEST;

	private static Identifier register (String id) {
		return PCLootTables.registerLootTable(new Identifier(id));
	}

	private static Identifier registerLootTable (Identifier id) {
		if (PC_LOOT_TABLES.add(id)) {
			return id;
		}
		throw new IllegalArgumentException(id + " is already a registered built-in loot table");
	}

	public static void init () {
		LUSH_CHEST = PCLootTables.register("probablychests:chests/lush_pc_chests");
		NORMAL_CHEST = PCLootTables.register("probablychests:chests/normal_pc_chests");
		ROCKY_CHEST = PCLootTables.register("probablychests:chests/rocky_pc_chests");
		STONE_CHEST = PCLootTables.register("probablychests:chests/stone_pc_chests");
		GOLD_CHEST = PCLootTables.register("probablychests:chests/gold_pc_chests");
		NETHER_CHEST = PCLootTables.register("probablychests:chests/nether_pc_chests");
		SHADOW_CHEST = PCLootTables.register("probablychests:chests/shadow_pc_chests");
		ICE_CHEST = PCLootTables.register("probablychests:chests/ice_pc_chests");
		CORAL_CHEST = PCLootTables.register("probablychests:chests/coral_pc_chests");
	}
}

package com.finaty.additional_ores;

import com.finaty.additional_ores.item.ModItemGroups;
import com.finaty.additional_ores.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalOres implements ModInitializer {
	public static final String MOD_ID = "additional_ores";
    public static final Logger LOGGER = LoggerFactory.getLogger("additional-ores");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
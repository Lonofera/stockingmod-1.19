package net.lonofera.stockingsmod ;

import net.fabricmc.api.ModInitializer;
import net.lonofera.stockingsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockingsMod implements ModInitializer {
	public static final String MOD_ID = "stockingsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

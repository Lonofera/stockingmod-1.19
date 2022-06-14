package net.lonofera.stockingsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lonofera.stockingsmod.StockingsMod;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {
    public static final Item FABRIC = registerItem("fabric",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(StockingsMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        StockingsMod.LOGGER.info("Registering mod items for " + StockingsMod.MOD_ID);
    }
}

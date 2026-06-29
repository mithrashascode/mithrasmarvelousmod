package net.mithras.mithrasmarvelousmod;

import net.fabricmc.api.ModInitializer;
import net.mithras.mithrasmarvelousmod.block.ModBlocks;
import net.mithras.mithrasmarvelousmod.item.ModItems;
import net.mithras.mithrasmarvelousmod.registries.ModCompostables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MithrasMarvelousMod implements ModInitializer {
	public static final String MOD_ID = "mithrasmarvelousmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
		ModBlocks.registerModBlocks();
		ModCompostables.registerCompostables();
	}
}

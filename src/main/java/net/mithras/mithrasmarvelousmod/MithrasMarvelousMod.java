package net.mithras.mithrasmarvelousmod;

import net.fabricmc.api.ModInitializer;

import net.mithras.mithrasmarvelousmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MithrasMarvelousMod implements ModInitializer {
	public static final String MOD_ID = "mithrasmarvelousmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

package net.mithras.mithrasmarvelousmod.registries;

import net.fabricmc.fabric.api.registry.CompostableRegistry;
import net.mithras.mithrasmarvelousmod.item.ModItems;

public class ModCompostables {

    public static void registerCompostables() {
        CompostableRegistry.INSTANCE.add(ModItems.BANANA, 0.65f);
        CompostableRegistry.INSTANCE.add(ModItems.ORANGE, 0.65f);
        CompostableRegistry.INSTANCE.add(ModItems.TOMATO_SEEDS, 0.3f);
        CompostableRegistry.INSTANCE.add(ModItems.TOMATO, 0.65f);
        CompostableRegistry.INSTANCE.add(ModItems.LETTUCE_SEEDS, 0.3f);
        CompostableRegistry.INSTANCE.add(ModItems.LETTUCE, 0.65f);
        CompostableRegistry.INSTANCE.add(ModItems.TOMATO_SAUCE, 0.85f);
        CompostableRegistry.INSTANCE.add(ModItems.BAKED_BEETROOT, 0.85f);
        CompostableRegistry.INSTANCE.add(ModItems.BAKED_CARROT, 0.85f);
        CompostableRegistry.INSTANCE.add(ModItems.FRIED_EGG, 0.85f);
    }
}

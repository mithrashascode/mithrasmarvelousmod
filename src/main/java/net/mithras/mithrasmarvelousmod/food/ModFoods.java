package net.mithras.mithrasmarvelousmod.food;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4f).build();
    public static final Consumable ORANGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).build();

    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4).saturationModifier(1f).build();
    public static final Consumable BANANA_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();
}

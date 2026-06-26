package net.mithras.mithrasmarvelousmod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4f).build();
    public static final Consumable ORANGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4).saturationModifier(1f).build();
    public static final Consumable BANANA_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties BUTTER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4f).build();
    public static final Consumable BUTTER_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.4f).build();

    public static final FoodProperties CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2f).alwaysEdible().build();
    public static final Consumable CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(2.4f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 12000),1f)).build();
}

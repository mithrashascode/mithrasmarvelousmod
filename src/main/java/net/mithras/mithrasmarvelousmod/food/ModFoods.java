package net.mithras.mithrasmarvelousmod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import java.util.List;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4f).build();
    public static final Consumable ORANGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8f).build();
    public static final Consumable BANANA_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties BAKED_BEETROOT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.6f).build();
    public static final Consumable BAKED_BEETROOT_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties BAKED_CARROT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6f).build();
    public static final Consumable BAKED_CARROT_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable LETTUCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final Consumable TOMATO_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties BUTTER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4f).build();
    public static final Consumable BUTTER_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.4f).build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4f).build();
    public static final Consumable CHEESE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.4f).build();

    public static final FoodProperties FRIED_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6f).build();
    public static final Consumable FRIED_EGG_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.4f).build();

    public static final FoodProperties CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2f).alwaysEdible().build();
    public static final Consumable CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(2.4f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1200),1f))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1200, 1), 1f)).build();

    public static final FoodProperties HEARTY_SOUP = new FoodProperties.Builder().nutrition(8).saturationModifier(1.0f).alwaysEdible().build();
    public static final Consumable HEARTY_SOUP_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(5.0f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 12000),1f))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 12000), 1f)).build();

}

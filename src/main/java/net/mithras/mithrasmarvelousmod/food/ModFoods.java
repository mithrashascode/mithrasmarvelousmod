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

    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4).saturationModifier(1f).build();
    public static final Consumable BANANA_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).build();

    public static final FoodProperties ENCHANTED_COPPER_ORANGE = new FoodProperties.Builder().nutrition(5).saturationModifier(1f).alwaysEdible().build();
    public static final Consumable ENCHANTED_COPPER_ORANGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 200, 1),
                    new MobEffectInstance(MobEffects.RESISTANCE, 3000, 0), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0),
                    new MobEffectInstance(MobEffects.ABSORPTION, 1200, 3)))).build();

    public static final FoodProperties ENCHANTED_DIAMOND_BANANA = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2f).alwaysEdible().build();
    public static final Consumable ENCHANTED_DIAMOND_BANANA_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 800, 1),
                    new MobEffectInstance(MobEffects.RESISTANCE, 12000, 0), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0),
                    new MobEffectInstance(MobEffects.ABSORPTION, 4800, 3)))).build();

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
}

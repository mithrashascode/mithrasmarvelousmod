package net.mithras.mithrasmarvelousmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Items.*;
import net.mithras.mithrasmarvelousmod.MithrasMarvelousMod;
import net.mithras.mithrasmarvelousmod.block.ModBlocks;
import net.mithras.mithrasmarvelousmod.food.ModFoods;
import java.util.function.Function;
import static net.minecraft.world.item.Items.BOWL;

public class ModItems {
    public static final Item BANANA = registerItem("banana", properties -> new Item(properties
            .food(ModFoods.BANANA, ModFoods.BANANA_CONSUMABLE)));

    public static final Item ORANGE = registerItem("orange", properties -> new Item(properties
            .food(ModFoods.ORANGE, ModFoods.ORANGE_CONSUMABLE)));

    public static final Item BUTTER = registerItem("butter", properties -> new Item(properties
            .food(ModFoods.BUTTER, ModFoods.BUTTER_CONSUMABLE)));

    public static final Item CHEESE = registerItem("cheese", properties -> new Item(properties
            .food(ModFoods.CHEESE, ModFoods.CHEESE_CONSUMABLE)));

    public static final Item BAKED_BEETROOT = registerItem("baked_beetroot", properties -> new Item(properties
            .food(ModFoods.BAKED_BEETROOT, ModFoods.BAKED_BEETROOT_CONSUMABLE)));

    public static final Item BAKED_CARROT = registerItem("baked_carrot", properties -> new Item(properties
            .food(ModFoods.BAKED_CARROT, ModFoods.BAKED_CARROT_CONSUMABLE)));

    public static final Item FRIED_EGG = registerItem("fried_egg", properties -> new Item(properties
            .food(ModFoods.FRIED_EGG, ModFoods.FRIED_EGG_CONSUMABLE)));

    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar", properties -> new Item(properties
            .food(ModFoods.CHOCOLATE_BAR, ModFoods.CHOCOLATE_BAR_CONSUMABLE)));

    public static final Item WHEAT_FLOUR = registerItem("wheat_flour", Item::new);

    public static final Item SOUP_MIX = registerItem("soup_mix", Item::new);

    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds",
            properties -> new BlockItem(ModBlocks.LETTUCE_CROP, properties.useItemDescriptionPrefix()));

    public static final Item LETTUCE = registerItem("lettuce", properties -> new Item(properties
            .food(ModFoods.LETTUCE, ModFoods.LETTUCE_CONSUMABLE)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            properties -> new BlockItem(ModBlocks.TOMATO_CROP, properties.useItemDescriptionPrefix()));

    public static final Item TOMATO = registerItem("tomato", properties -> new Item(properties
            .food(ModFoods.TOMATO, ModFoods.TOMATO_CONSUMABLE)));

    public static final Item TOMATO_SAUCE = registerItem("tomato_sauce", Item::new);

    public static final Item HEARTY_SOUP = registerItem("hearty_soup", properties -> new Item(properties
            .food(ModFoods.HEARTY_SOUP, ModFoods.HEARTY_SOUP_CONSUMABLE).usingConvertsTo(BOWL)));

    public static final Item RAW_PIZZA = registerItem("raw_pizza", Item::new);

    public static final Item PIZZA = registerItem("pizza", properties -> new Item(properties
            .food(ModFoods.PIZZA, ModFoods.PIZZA_CONSUMABLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        MithrasMarvelousMod.LOGGER.info("Registering Mod Items for " + MithrasMarvelousMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(LETTUCE_SEEDS);
            output.accept(TOMATO_SEEDS);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(BANANA);
            output.accept(ORANGE);
            output.accept(LETTUCE);
            output.accept(TOMATO);
            output.accept(BAKED_BEETROOT);
            output.accept(BAKED_CARROT);
            output.accept(FRIED_EGG);
            output.accept(HEARTY_SOUP);
            output.accept(PIZZA);
            output.accept(CHOCOLATE_BAR);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(BUTTER);
            output.accept(CHEESE);
            output.accept(SOUP_MIX);
            output.accept(TOMATO_SAUCE);
            output.accept(WHEAT_FLOUR);
            output.accept(RAW_PIZZA);
        });
    }
}
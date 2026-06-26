package net.mithras.mithrasmarvelousmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.mithras.mithrasmarvelousmod.MithrasMarvelousMod;
import net.mithras.mithrasmarvelousmod.food.ModFoods;

import java.util.function.Function;

public class ModItems {
    public static final Item ORANGE = registerItem("orange", properties -> new Item(properties
            .food(ModFoods.ORANGE, ModFoods.ORANGE_CONSUMABLE)));
    public static final Item BANANA = registerItem("banana", properties -> new Item(properties
            .food(ModFoods.BANANA, ModFoods.BANANA_CONSUMABLE)));
    public static final Item WHEAT_FLOUR = registerItem("wheat_flour", Item::new);
    public static final Item ENCHANTED_GOLDEN_BANANA = registerItem("enchanted_golden_banana", properties -> new Item(properties
            .food(ModFoods.ENCHANTED_GOLDEN_BANANA, ModFoods.ENCHANTED_GOLDEN_BANANA_CONSUMABLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar", properties -> new Item(properties
            .food(ModFoods.CHOCOLATE_BAR, ModFoods.CHOCOLATE_BAR_CONSUMABLE)));
    public static final Item BUTTER = registerItem("butter", properties -> new Item(properties
            .food(ModFoods.BUTTER, ModFoods.BUTTER_CONSUMABLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        MithrasMarvelousMod.LOGGER.info("Registering Mod Items for " + MithrasMarvelousMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(ORANGE);
            output.accept(BANANA);
            output.accept(ENCHANTED_GOLDEN_BANANA);
            output.accept(CHOCOLATE_BAR);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(WHEAT_FLOUR);
            output.accept(BUTTER);
        });
    }
}
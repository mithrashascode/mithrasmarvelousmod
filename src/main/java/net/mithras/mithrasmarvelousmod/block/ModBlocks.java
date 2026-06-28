package net.mithras.mithrasmarvelousmod.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.mithras.mithrasmarvelousmod.MithrasMarvelousMod;
import net.mithras.mithrasmarvelousmod.block.custom.TomatoCropBlock;

import java.util.function.Function;

public class ModBlocks {

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            properties -> new TomatoCropBlock(properties.noCollision().randomTicks().sound(SoundType.CROP)
            .pushReaction(PushReaction.DESTROY)));

    private static void registerBlockItem(String name,Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MithrasMarvelousMod.MOD_ID, name), toRegister);
    }

    public static void registerModBlocks() {
        MithrasMarvelousMod.LOGGER.info("Registering Mod Blocks for " + MithrasMarvelousMod.MOD_ID);
    }
}

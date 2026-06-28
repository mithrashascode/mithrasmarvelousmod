package net.mithras.mithrasmarvelousmod;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.mithras.mithrasmarvelousmod.item.ModItems;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.data.loot.packs.*;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && Blocks.ACACIA_LEAVES.getLootTable().map(blockTable -> blockTable.identifier().equals(key.identifier())).orElse(false)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.ORANGE))
                        .when(LootItemRandomChanceCondition.randomChance(0.01F));
                tableBuilder.withPool(poolBuilder);
            }
        });
        {
            LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
                if (source.isBuiltin() && Blocks.JUNGLE_LEAVES.getLootTable().map(blockTable -> blockTable.identifier().equals(key.identifier())).orElse(false)) {
                    LootPool.Builder poolBuilder = LootPool.lootPool()
                            .add(LootItem.lootTableItem(ModItems.BANANA))
                            .when(LootItemRandomChanceCondition.randomChance(0.02F));
                    tableBuilder.withPool(poolBuilder);
                }
            });
        }

        {
            LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
                if (source.isBuiltin() && Blocks.SHORT_GRASS.getLootTable().map(blockTable -> blockTable.identifier().equals(key.identifier())).orElse(false)) {
                    LootPool.Builder poolBuilder = LootPool.lootPool()
                            .add(LootItem.lootTableItem(ModItems.TOMATO_SEEDS))
                            .when(LootItemRandomChanceCondition.randomChance(0.24F));
                    tableBuilder.withPool(poolBuilder);
                }
            });
        }

        {
            LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
                if (source.isBuiltin() && Blocks.BUSH.getLootTable().map(blockTable -> blockTable.identifier().equals(key.identifier())).orElse(false)) {
                    LootPool.Builder poolBuilder = LootPool.lootPool()
                            .add(LootItem.lootTableItem(ModItems.LETTUCE_SEEDS))
                            .when(LootItemRandomChanceCondition.randomChance(0.4F));
                    tableBuilder.withPool(poolBuilder);
                }
            });
        }

    }
}
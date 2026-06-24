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

    private static final Identifier ACACIA_LEAVES_LOOT_TABLE_ID = Identifier.fromNamespaceAndPath("minecraft", "blocks/acacia_leaves");
    private static final Identifier JUNGLE_LEAVES_LOOT_TABLE_ID = Identifier.fromNamespaceAndPath("minecraft", "blocks/jungle_leaves");

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
                            .when(LootItemRandomChanceCondition.randomChance(1.0F));
                    tableBuilder.withPool(poolBuilder);
                }
            });
        }
    }
}
package net.mithras.mithrasmarvelousmod;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.mithras.mithrasmarvelousmod.item.ModItems;
import net.minecraft.data.loot.packs.*;

public class ModLootTableModifiers {

    private static final Identifier ACACIA_LEAVES_LOOT_TABLE_ID = Identifier.fromNamespaceAndPath("minecraft", "blocks/acacia_leaves");

    public static void modifyLootTables() {
    LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
        if (source.isBuiltin() && ACACIA_LEAVES_LOOT_TABLE_ID.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.lootPool().add(LootItem.lootTableItem(ModItems.ORANGE));
            tableBuilder.withPool(poolBuilder);
        }
    });
    }
}
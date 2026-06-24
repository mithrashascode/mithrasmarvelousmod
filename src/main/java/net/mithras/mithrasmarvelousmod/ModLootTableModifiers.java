package net.mithras.mithrasmarvelousmod;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.mithras.mithrasmarvelousmod.item.ModItems;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
    LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
        if (source.isBuiltin() && ACACIA_LEAVES_LOOT_TABLE_ID.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.lootPool().add(LootItem.lootTableItem(ModItems.ORANGE));
            tableBuilder.withPool(poolBuilder);
        }
    });
    }
}
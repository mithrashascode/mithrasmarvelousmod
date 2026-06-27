package net.mithras.mithrasmarvelousmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.mithras.mithrasmarvelousmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.ORANGE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BANANA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BAKED_CARROT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BAKED_BEETROOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WHEAT_FLOUR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BUTTER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHEESE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FRIED_EGG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHOCOLATE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ENCHANTED_DIAMOND_BANANA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ENCHANTED_COPPER_ORANGE, ModelTemplates.FLAT_ITEM);

    }
}
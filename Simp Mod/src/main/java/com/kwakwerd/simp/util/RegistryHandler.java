package com.kwakwerd.simp.util;

import com.kwakwerd.simp.blocks.BlockItemBase;
import com.kwakwerd.simp.blocks.SimpBlock;
import com.kwakwerd.simp.items.itemBase;
import com.kwakwerd.simp.simp;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, simp.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, simp.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> SIMP_JUICE = ITEMS.register("simp_bux", itemBase::new);

    // Blocks
    public static final RegistryObject<Block> SIMP_BLOCK = BLOCKS.register("simp_block", SimpBlock::new);

    // Block Items
    public static final RegistryObject<Item> SIMP_BLOCK_ITEM = ITEMS.register("simp_block",()-> new BlockItemBase(SIMP_BLOCK.get()));

}

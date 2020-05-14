package com.kwakwerd.simp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SimpBlock extends Block {
    public SimpBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0f, 1.0f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}

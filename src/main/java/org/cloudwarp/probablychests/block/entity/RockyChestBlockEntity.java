package org.cloudwarp.probablychests.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import org.cloudwarp.probablychests.block.PCChestTypes;

public class RockyChestBlockEntity extends PCBaseChestBlockEntity {

	public RockyChestBlockEntity (BlockPos pos, BlockState state) {
		super(PCChestTypes.ROCKY, pos, state);
	}
}

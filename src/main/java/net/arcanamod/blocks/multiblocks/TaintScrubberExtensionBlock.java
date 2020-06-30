package net.arcanamod.blocks.multiblocks;

import net.arcanamod.blocks.ArcanaBlocks;
import net.arcanamod.world.ServerAuraView;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class TaintScrubberExtensionBlock extends Block implements ITaintScrubberExtension {
	private Type type;

	public TaintScrubberExtensionBlock(Block.Properties properties, Type type) {
		super(properties);
		this.type = type;
	}

	@Override
	public boolean isValidConnection(World world, BlockPos pos){
		//If block not exist return.
		if (world.getBlockState(pos).getBlock()!=this) return false;

		if (this.type.equals(Type.SCRUBBER_MK2)){
			if (world.getBlockState(pos.up(2)).getBlock().equals(ArcanaBlocks.TAINT_SCRUBBER_MK1.get()) && !world.getBlockState(pos.up(1)).getBlock().equals(Blocks.AIR)){
				return true;
			} else if (world.getBlockState(pos.up(1)).getBlock().equals(ArcanaBlocks.TAINT_SCRUBBER_MK1.get())) {
				return true;
			}
		}
		if (this.type.equals(Type.BORE)){
			if (world.getBlockState(pos.up(1)).getBlock().equals(ArcanaBlocks.TAINT_SCRUBBER_MK1.get())){
				return true;
			}
		}
		if (this.type.equals(Type.BOOSTER)){

		}
		if (this.type.equals(Type.SUCKER)){
			if (world.getBlockState(pos.down()).getBlock().equals(ArcanaBlocks.TAINT_SCRUBBER_MK1.get())){
				return true;
			}
		}
		return false;
	}

	@Override
	public void sendUpdate(World world, BlockPos pos) {
		if (this.type.equals(Type.SUCKER)){
			if (world.getBlockState(pos.down()).getBlock().equals(ArcanaBlocks.TAINT_SCRUBBER_MK1.get()))
			world.setBlockState(pos.down(),world.getBlockState(pos.down()).with(TaintScrubberBlock.SUPPORTED,isValidConnection(world,pos)));
		}
	}

	/**
	 * Runs extension action.
	 *
	 * @param world World
	 * @param pos   Position of TaintScrubber
	 */
	@Override
	public void run(World world, BlockPos pos, CompoundNBT compound) {
		if (this.type.equals(Type.SUCKER)){
			if (!world.isRemote) {
				ServerAuraView auraView = new ServerAuraView((ServerWorld) world);
				auraView.addTaintAt(pos, -1);
			}
		}
	}

	@Override
	public CompoundNBT getShareableData(CompoundNBT compound) {
		if (this.type.equals(Type.SCRUBBER_MK2)) {
			compound.putInt("range",16);
		}
		if (this.type.equals(Type.BOOSTER)) {
			compound.putInt("speed",compound.getInt("speed")+1);
		}
		return compound;
	}

	/**
	 * For addon dev's:
	 * Arcana Pre-Defined Extensions. You can add own extension implementing ITaintScrubberExtension.
	 */
	public enum Type {
		SCRUBBER_MK2,
		BOOSTER,
		SUCKER,
		BORE
	}
}

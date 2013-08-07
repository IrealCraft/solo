package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Icon;
import net.minecraft.src.IconRegister;
import net.minecraft.src.Material;

/**
 * Nukkit furniture block base class.
 * @author Mathieu Bour (Dierka)
 * @version 1.1
 * @since 2.0R0.1
 */
public abstract class BlockFurnitureAbstract extends Block
{
    public static final String[] woodType = new String[] {"wood", "wood_spruce", "wood_birch", "wood_jungle"};
  
	protected BlockFurnitureAbstract(int id, Material material)
	{
		super(id, material);
		this.setStepSound(Block.soundWoodFootstep);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setLightOpacity(0);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
	}
}

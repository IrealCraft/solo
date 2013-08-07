package net.minecraft.src;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.Icon;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

/**
 * Nukkit table block class.
 * @author Mathieu Bour (Dierka)
 * @version 1.2
 * @since 2.0R0.1
 */
public class BlockTable extends BlockFurnitureAbstract
{
    public BlockTable(int par1)
    {
        super(par1, Material.wood);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }


  public Icon getIcon(int par1, int par2)
	{
		return Block.planks.getIcon(par1, par2 % 4);
	}

    @Override
    public int getRenderType()
    {
        return 71;
    }

    @Override
    public int damageDropped(int par1)
    {
        return par1 % 4;
    }

    @Override
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 0.9F, 0.6F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBounds(0.0F, 0.9F, 0.0F, 1.0F, 1.0F, 1.0F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
    
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < BlockFurnitureAbstract.woodType.length; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }

}

package net.minecraft.src;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Icon;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

/**
 * Nukkit chair block class.
 * @author Mathieu Bour (Dierka)
 * @version 1.3
 * @since 2.0R0.1
 */
public class BlockChair extends BlockFurnitureAbstract
{     
    public BlockChair(int par1)
    {
        super(par1, Material.wood);
		this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
	}
	
	@Override
	public Icon getIcon(int par1, int par2)
	{
		return Block.planks.getIcon(par1, par2 % 4);
	}

	@Override
	public int getRenderType()
	{
		return 70;
	}

    @Override
    public int damageDropped(int par1)
    {
        return par1 % 4;
    }

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
	{
    	int metadata = par1World.getBlockMetadata(par2, par3, par4);
        int direction = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, metadata + (4 * direction), 2);
	}

	@Override
	public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	{
		int direction = par1World.getBlockMetadata(par2, par3, par4);
		this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.4F, 0.3F);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		this.setBlockBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.4F, 0.8F);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		this.setBlockBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.4F, 0.3F);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		this.setBlockBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.4F, 0.8F);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		this.setBlockBounds(0.2F, 0.4F, 0.2F, 0.8F, 0.5F, 0.8F);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);

		if (direction / 4 == 0)
		{
			this.setBlockBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.3F, 0.65F, 0.225F, 0.7F, 0.70F, 0.275F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.3F, 0.85F, 0.225F, 0.7F, 0.90F, 0.275F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else if (direction / 4 == 1)
		{
			this.setBlockBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.7F, 0.5F, 0.7F, 0.8F, 1.0F, 0.8F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.725F, 0.65F, 0.3F, 0.775F, 0.70F, 0.7F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.725F, 0.85F, 0.3F, 0.775F, 0.90F, 0.7F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else if (direction / 4 == 2)
		{
			this.setBlockBounds(0.2F, 0.5F, 0.7F, 0.3F, 1.0F, 0.8F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.7F, 0.5F, 0.7F, 0.8F, 1.0F, 0.8F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.3F, 0.65F, 0.725F, 0.7F, 0.70F, 0.775F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.3F, 0.85F, 0.725F, 0.7F, 0.90F, 0.775F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else if (direction / 4 == 3)
		{
			this.setBlockBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.2F, 0.5F, 0.7F, 0.3F, 1.0F, 0.8F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.225F, 0.65F, 0.3F, 0.275F, 0.70F, 0.7F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.225F, 0.85F, 0.3F, 0.275F, 0.90F, 0.7F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}

		this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
	}

	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int var4 = 0; var4 < 4; var4++)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}

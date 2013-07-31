package net.minecraft.src;

import java.util.Random;

public class BlockFumee extends Block
{
  
    public BlockFumee(int par1)
    {
        super(par1, Material.air);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setTickRandomly(true);
    }
        
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
        {
            return null;
        }
        
        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        public boolean isOpaqueCube()
        {
            return false;
        }

        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        public boolean renderAsNormalBlock()
        {
            return false;
        }
        
        /**
         * The type of render function that is called for this block
         */
        public int getRenderType()
        {
            return 23;
        }
        
        int var6;
        float var7;
        float var8;
        float var9;

        public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            for (int var6 = 0; var6 < 1; ++var6)
            {
                    var7 = (float)par2 + par5Random.nextFloat() * 1.0F;
                    var8 = (float)par3 + par5Random.nextFloat() * 1.0F;
                    var9 = (float)par4 + par5Random.nextFloat() * 1.0F;
                    par1World.spawnParticle("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
            for (int var6 = 0; var6 < 5; ++var6)
            {
                var7 = (float)par2 + par5Random.nextFloat() * 1.0F;
                var8 = (float)par3 + par5Random.nextFloat() * 1.0F;
                var9 = (float)par4 + par5Random.nextFloat() * 1.0F;
                    par1World.spawnParticle("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
            for (int var6 = 0; var6 < 10; ++var6)
            {
                var7 = (float)par2 + par5Random.nextFloat() * 1.0F;
                var8 = (float)par3 + par5Random.nextFloat() * 1.0F;
                var9 = (float)par4 + par5Random.nextFloat() * 1.0F;
                    par1World.spawnParticle("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
            for (int var6 = 0; var6 < 15; ++var6)
            {
                var7 = (float)par2 + par5Random.nextFloat() * 1.0F;
                var8 = (float)par3 + par5Random.nextFloat() * 1.0F;
                var9 = (float)par4 + par5Random.nextFloat() * 1.0F;
                    par1World.spawnParticle("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
            for (int var6 = 0; var6 < 20; ++var6)
            {
                var7 = (float)par2 + par5Random.nextFloat() * 1.0F;
                var8 = (float)par3 + par5Random.nextFloat() * 1.0F;
                var9 = (float)par4 + par5Random.nextFloat() * 1.0F;
                    par1World.spawnParticle("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
            
            if (par5Random.nextInt(24) == 0)
            {
                par1World.playSound((double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), "fire.fire", 1.0F + par5Random.nextFloat(), par5Random.nextFloat() * 0.7F + 0.3F, false);
            }
      }
}

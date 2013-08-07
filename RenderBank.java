package net.minecraft.src;

import org.lwjgl.opengl.GL11;

import net.minecraft.src.Block;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;

/**
 * Nukkit bank rederer
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class RenderBank extends RenderAbstract
{
    public RenderBank(RenderBlocks renderblocks)
    {
        super(renderblocks);
    }

    @Override
    public boolean render(Block par1Block, int par2, int par3, int par4)
    {
        int direction = this.renderblocks.blockAccess.getBlockMetadata(par2, par3, par4);

        if (direction / 4 % 2 == 0)
        {
            this.renderblocks.setRenderBounds(0.1F, 0.0F, 0.3F, 0.2F, 0.4F, 0.4F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.8F, 0.0F, 0.3F, 0.9F, 0.4F, 0.4F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.1F, 0.0F, 0.6F, 0.2F, 0.4F, 0.7F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.8F, 0.0F, 0.6F, 0.9F, 0.4F, 0.7F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.0F, 0.4F, 0.2F, 1.0F, 0.5F, 0.8F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        }
        else
        {
            this.renderblocks.setRenderBounds(0.3F, 0.0F, 0.1F, 0.4F, 0.4F, 0.2F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.3F, 0.0F, 0.8F, 0.4F, 0.4F, 0.9F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.6F, 0.0F, 0.1F, 0.7F, 0.4F, 0.2F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.6F, 0.0F, 0.8F, 0.7F, 0.4F, 0.9F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
            this.renderblocks.setRenderBounds(0.2F, 0.4F, 0.0F, 0.8F, 0.5F, 1.0F);
            this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        }

        return false;
    }

    @Override
    public void render(Tessellator par1Tessellator, Block par2Block, int par3)
    {
        for (int i = 0; i < 5; ++i)
        {
            if (i == 0)
            {
                this.renderblocks.setRenderBounds(0.1F, 0.0F, 0.3F, 0.2F, 0.4F, 0.4F);
            }

            if (i == 1)
            {
                this.renderblocks.setRenderBounds(0.8F, 0.0F, 0.3F, 0.9F, 0.4F, 0.4F);
            }

            if (i == 2)
            {
                this.renderblocks.setRenderBounds(0.1F, 0.0F, 0.6F, 0.2F, 0.4F, 0.7F);
            }

            if (i == 3)
            {
                this.renderblocks.setRenderBounds(0.8F, 0.0F, 0.6F, 0.9F, 0.4F, 0.7F);
            }

            if (i == 4)
            {
                this.renderblocks.setRenderBounds(0.0F, 0.4F, 0.2F, 1.0F, 0.5F, 0.8F);
            }

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, -1.0F, 0.0F);
            this.renderblocks.renderFaceYNeg(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(0));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, 1.0F, 0.0F);
            this.renderblocks.renderFaceYPos(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(1));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, 0.0F, -1.0F);
            this.renderblocks.renderFaceZNeg(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(2));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, 0.0F, 1.0F);
            this.renderblocks.renderFaceZPos(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(3));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(-1.0F, 0.0F, 0.0F);
            this.renderblocks.renderFaceXNeg(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(4));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(1.0F, 0.0F, 0.0F);
            this.renderblocks.renderFaceXPos(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(5));
            par1Tessellator.draw();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        }
    }
}

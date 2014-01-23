package allout58.libs.LayeredTextureBlock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BlockLayeredTexture extends Block
{
    /**
     * The blocks current render pass (0=base,1=overlay)
     */
    public static int renderPass;
    
    public static final Icon blank = new Icon()
    {
        @Override
        @SideOnly(Side.CLIENT)
        public int getIconWidth()
        {
            return 16;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public int getIconHeight()
        {
            return 16;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public float getMinU()
        {
            return 0;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public float getMaxU()
        {
            return 0;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public float getInterpolatedU(double d0)
        {
            return 0;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public float getMinV()
        {
            return 0;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public float getMaxV()
        {
            return 0;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public float getInterpolatedV(double d0)
        {
            return 0;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getIconName()
        {
            return "blank";
        }
    };

    public BlockLayeredTexture(int par1, Material par2Material)
    {
        super(par1, par2Material);
    }

//    @Override
//    public boolean renderAsNormalBlock()
//    {
//        return false;
//    }

//    @Override
//    public int getRenderType()
//    {
//        return ClientProxy.BlockMultiLayerRenderer;
//    }

    @Override
    public final boolean canRenderInPass(int pass)
    {
        BlockLayeredTexture.renderPass = pass;
        return true;
    }

    @Override
    public final int getRenderBlockPass()
    {
        return 1;
    }

//    @Override
//    @SideOnly(Side.CLIENT)
//    public void registerIcons(IconRegister ir)
//    {
//         this.blank = new BlankIcon();
//    }

//    @Override
//    public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int side)
//    {
//        return this.getBlockTextureByPass(world, x, y, z, side, ClientProxy.renderPass);
//    }

    /**
     * Gets the texture for a side for a render pass Override in subclasses to
     * actually
     * 
     * @param world
     * @param x
     * @param y
     * @param z
     * @param side
     * @param pass
     * @return The icon to render
     */
//    public Icon getBlockTextureByPass(IBlockAccess world, int x, int y, int z, int side, int pass)
//    {
//        return this.blank;
//    }
}

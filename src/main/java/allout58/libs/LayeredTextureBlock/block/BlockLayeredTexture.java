package allout58.libs.LayeredTextureBlock.block;

import java.awt.image.BufferedImage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BlockLayeredTexture extends Block
{
    /**
     * The blocks current render pass (0=base,1=overlay)
     */
    public static int renderPass;

    // public final TextureAtlasSprite blank = new
    // TextureAS("layeredtexture_blank");
    public Icon blank = new Icon()
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
            return "LayeredTexture_blank";
        }

    };
//    private DynamicTexture blankTexture;
//    private final int[] blankTextureData;

    public BlockLayeredTexture(int par1, Material par2Material)
    {
        super(par1, par2Material);
//        BufferedImage bi = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
//        for (int i = 0; i < 16; i++)
//        {
//            for (int j = 0; j < 16; j++)
//            {
//                bi.setRGB(i, j, 0);
//            }
//        }
//        blankTexture = new DynamicTexture(bi);
//        blankTextureData = blankTexture.getTextureData();
    }

    // @Override
    // public boolean renderAsNormalBlock()
    // {
    // return false;
    // }

    // @Override
    // public int getRenderType()
    // {
    // return ClientProxy.BlockMultiLayerRenderer;
    // }

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
//        TextureManager tm = Minecraft.getMinecraft().getTextureManager();
        // tm.getDynamicTextureLocation("layered_blank",
        // blankTexture).getResourcePath();
        // blank=

        // this.blank.setFramesTextureData(Lists.newArrayList(new int[][] {
        // blankTextureData}));
        // this.blank.setIconWidth(16);
        // this.blank.setIconHeight(16);
        // if(ir instanceof TextureMap)
        // System.out.println("Register success: "+((TextureMap)ir).setTextureEntry("layered_blank",
        // this.blank));
        // else
        // System.out.println("Failed registration!");
//    }

    // @Override
    // public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int
    // side)
    // {
    // return this.getBlockTextureByPass(world, x, y, z, side,
    // ClientProxy.renderPass);
    // }

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
    // public Icon getBlockTextureByPass(IBlockAccess world, int x, int y, int
    // z, int side, int pass)
    // {
    // return this.blank;
    // }
}

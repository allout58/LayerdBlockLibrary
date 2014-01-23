package allout58.libs.LayeredTextureBlock.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.Icon;

public class BlankIcon implements Icon
{

    @Override
    @SideOnly(Side.CLIENT)
    public
    int getIconWidth()
    {
        return 16;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    int getIconHeight()
    {
        return 16;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    float getMinU()
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    float getMaxU()
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    float getInterpolatedU(double d0)
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    float getMinV()
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    float getMaxV()
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    float getInterpolatedV(double d0)
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public
    String getIconName()
    {
        return "blank";
    }

}

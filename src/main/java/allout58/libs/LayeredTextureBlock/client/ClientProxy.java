package allout58.libs.LayeredTextureBlock.client;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy
{
    public static int renderPass;

    public static int BlockMultiLayerRenderer;

    public static void registerRenderer()
    {
        BlockMultiLayerRenderer = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new BlockLayeredRenderer());
    }
}

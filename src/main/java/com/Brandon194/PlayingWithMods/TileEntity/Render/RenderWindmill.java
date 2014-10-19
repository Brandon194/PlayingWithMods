package com.Brandon194.PlayingWithMods.TileEntity.Render;

import com.Brandon194.PlayingWithMods.PlayingWithMods;
import com.Brandon194.PlayingWithMods.reference.Reference;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Brandon194 on 15/10/2014.
 */
public class RenderWindmill extends TileEntitySpecialRenderer {

    private final ResourceLocation textureWindmill = new ResourceLocation(Reference.MOD_ID.toLowerCase(),"textures/model/windmill.png");

    private int textureWidth = 64;
    private int textureHeight = 32;

    public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float f){
        GL11.glPushMatrix();
            GL11.glTranslatef((float)x,(float)y,(float)z);

            Tessellator tessellator = Tessellator.instance;
            this.bindTexture(textureWindmill);

            tessellator.startDrawingQuads(); //start tessellator
            {
                tessellator.addVertexWithUV(0,0,1,1,1);
                tessellator.addVertexWithUV(1,1,1,1,0);
                tessellator.addVertexWithUV(0,1,0,0,0);
                tessellator.addVertexWithUV(0,0,0,0,1);
            }
            tessellator.draw();  // ends drawing
        GL11.glPopMatrix();
    }
}

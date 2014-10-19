package com.Brandon194.PlayingWithMods.TileEntity.Render;

import com.Brandon194.PlayingWithMods.reference.Reference;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Michelin on 15/10/2014.
 */
public class RenderWindmillFloor extends TileEntitySpecialRenderer {

    private final ResourceLocation textureWindmill = new ResourceLocation(Reference.MOD_ID.toLowerCase(),"textures/model/windmillFloor.png");

    private int textureWidth = 32;
    private int textureHeight = 32;

    private float pixel = 1F/16F;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x,(float)y,(float)z);

        Tessellator tessellator = Tessellator.instance;
        this.bindTexture(textureWindmill);

        tessellator.startDrawingQuads(); //start tessellator
        {
           if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 5 ){
               tessellator.addVertexWithUV(0,0.25F,1,1F/textureWidth*8,1F/textureHeight*(8+16));
               tessellator.addVertexWithUV(1,0.25F,1,1F/textureWidth*8,1F/textureHeight*8);
               tessellator.addVertexWithUV(1,0.25F,0,1F/textureWidth*8,1F/textureHeight*8);
               tessellator.addVertexWithUV(0,0.25F,0,1F/textureWidth*8,1F/textureHeight*(8+16));
           }
        }
        tessellator.draw();  // ends drawing
        GL11.glPopMatrix();
    }
}

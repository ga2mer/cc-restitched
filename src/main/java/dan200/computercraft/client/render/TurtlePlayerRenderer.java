/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2021. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */
package dan200.computercraft.client.render;

import dan200.computercraft.shared.turtle.core.TurtlePlayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import javax.annotation.Nonnull;

public class TurtlePlayerRenderer extends EntityRenderer<TurtlePlayer>
{ //FIXME Make sure this isn't an issue. Context was EntityRenderDispatcher.
    public TurtlePlayerRenderer( EntityRendererFactory.Context context )
    {
        super( context );
    }

    @Override
    public void render( @Nonnull TurtlePlayer entityIn, float entityYaw, float partialTicks, @Nonnull MatrixStack transform,
                        @Nonnull VertexConsumerProvider buffer, int packedLightIn )
    {
    }

    @Nonnull
    @Override
    public Identifier getTexture( @Nonnull TurtlePlayer entity )
    {
        return ComputerBorderRenderer.BACKGROUND_NORMAL;
    }
}

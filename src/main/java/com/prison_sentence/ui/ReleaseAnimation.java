package com.prison_sentence.ui;

import net.runelite.client.ui.overlay.Overlay;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ReleaseAnimation extends Overlay
{
    BufferedImage slack;
    BufferedImage tought;
    BufferedImage snapped;
    BufferedImage fragments;

    long startedAt;

    public ReleaseAnimation()
    {
        this.setMovable(false);
        Stop();
    }

    public void Play() throws IOException
    {
        startedAt = System.nanoTime();
        synchronized (ImageIO.class)
        {
            if (slack == null)
            {
                slack = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Chain_slack.png")));
            }

            if (tought == null)
            {
                tought = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Chain_tought.png")));
            }

            if (snapped == null)
            {
                snapped = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Chain_split.png")));
            }

            if (fragments == null)
            {
                fragments = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Chain_fragments.png")));
            }
        }
    }

    public void Stop()
    {
        startedAt = -1;
    }

    @Override
    public Dimension render(Graphics2D graphics2D) {

        if (startedAt == -1)
            return new Dimension(0, 0);

        float delta = (float)((System.nanoTime() - startedAt) / 1000) / 1000 / 1000;

        Rectangle bounds = graphics2D.getClipBounds();

        final float step0 = 0.0f;
        final float step1 = 0.5f;
        final float step2 = 2.5f;
        final float step3 = 5.0f;

        if (delta < step1)
        {
            float progress = (delta - step0) / (step1 - step0);

            Composite was = graphics2D.getComposite();
            float alpha = progress;
            graphics2D.setComposite(AlphaComposite.SrcOver.derive(alpha));
            graphics2D.drawImage(slack, bounds.x, bounds.y, bounds.width, bounds.height, new Color(0,0,0,0), null);

            graphics2D.setComposite(was);
        }
        else if (delta < step2)
        {
            float progress = (delta - step1) / (step2 - step1);

            int xOffset = (int)((Math.random() - 0.5) * progress * 5);
            int yOffset = (int)((Math.random() - 0.5) * progress * 5);
            graphics2D.drawImage(tought, bounds.x + xOffset, bounds.y + yOffset, bounds.width + xOffset * 2, bounds.height + yOffset * 2, new Color(0,0,0,0), null);
        }
        else if (delta < step3)
        {
            float progress = (delta - step2) / (step3 - step2);

            Composite was = graphics2D.getComposite();
            float alpha = 1 - progress;
            graphics2D.setComposite(AlphaComposite.SrcOver.derive(alpha));
            graphics2D.drawImage(snapped, bounds.x, bounds.y, bounds.width, bounds.height, new Color(0,0,0,0), null);


            int xPixels = (int)(progress * bounds.width * 0.1f) * 2;
            int yPixels = (int)(progress * bounds.height * 0.1f) * 2;

            float fragmentAlpha = Math.min(0.9f, 2.0f - progress * 2);

            graphics2D.setComposite(AlphaComposite.SrcOver.derive(fragmentAlpha));
            graphics2D.drawImage(fragments, bounds.x - xPixels, bounds.y - yPixels / 2, bounds.width + xPixels * 2, bounds.height + yPixels * 2, new Color(0,0,0,0), null);
            graphics2D.setComposite(was);
        }
        else
        {
            Stop();
        }

        return new Dimension(0, 0);
    }
}

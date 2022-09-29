package crudeGraphics;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import org.jetbrains.annotations.NotNull;

//
public abstract class AbstractStaticPainter {
    //

    //
    public AbstractStaticPainter() {
        //
    }

    /**
     * Paints this painter.
     *
     * @param g        Graphics to use.
     * @param observer ImageObserver object.
     * @param drawSize Drawable size {height, width}.
     */
    public abstract void paint(@NotNull Graphics g,
                               @NotNull ImageObserver observer,
                               int @NotNull [] drawSize);
}
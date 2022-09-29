package crudeGraphics;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Contents extends JPanel {
    private final @NotNull List<@Nullable AbstractStaticPainter> staticPainters;

    public Contents(@Nullable List<@Nullable AbstractStaticPainter> staticPainters) {
        setBackground(Color.black);
        setOpaque(true);
        this.staticPainters = Objects.requireNonNullElse(staticPainters, new ArrayList<>());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int @NotNull [] drawSize = getDrawSize();
        paintPainters(g, this, drawSize);
    }

    private void paintPainters(@NotNull Graphics g,
                               @NotNull ImageObserver observer,
                               int @NotNull [] drawSize) {
        for (@Nullable AbstractStaticPainter painter : staticPainters) {
            if (painter != null) {
                painter.paint(g, observer, drawSize);
            }
        }
    }

    private int @NotNull [] getDrawSize() {
        return new int[] {
                this.getWidth(),
                this.getHeight()};
    }
}
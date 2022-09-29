package crudeGraphics.worldMap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;

//TODO: add javadoc
public class WorldMapPainter {
    private final @NotNull WorldMap worldMap;

    //TODO: add javadoc
    public WorldMapPainter() {
        this(null);
    }

    //TODO: add javadoc
    public WorldMapPainter(@Nullable ProjectionType projection) {
        worldMap = new WorldMap(projection);
    }

    //TODO: add javadoc
    public void paintMap(@NotNull Graphics g,
                         @NotNull ImageObserver observer,
                         int @NotNull [] drawSize) {
        try {
            Image resizedMap = worldMap.getImage().getScaledInstance(
                    drawSize[0], drawSize[1],
                    Image.SCALE_SMOOTH);
            g.drawImage(resizedMap, 0, 0, observer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
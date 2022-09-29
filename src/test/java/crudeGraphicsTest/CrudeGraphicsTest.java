package crudeGraphicsTest;

import crudeGraphics.*;
import worldMap.WorldMapPainter;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

public class CrudeGraphicsTest {
    private static final double SIZE_COEFFICIENT = (double) 3 / 5;
    private static final int @NotNull [] WINDOW_SIZE = new int[] {
            (int) (2058 * SIZE_COEFFICIENT),
            (int) (1036 * SIZE_COEFFICIENT)};

    public static void main(String[] args) {
        new Window(WINDOW_SIZE, new Contents(getPainters()));
    }

    private static @NotNull List<@NotNull AbstractStaticPainter> getPainters() {
        return new ArrayList<>() {{
            add(new WorldMapPainter());
            add(new RegionPainter());
            add(new GroundTrackPainter());
        }};
    }
}
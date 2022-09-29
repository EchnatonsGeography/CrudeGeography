package crudeGraphicsTest;

import crudeGraphics.Window;
import crudeGraphics.Contents;

public class CrudeGraphicsTest {
    private static final double SIZE_COEFFICIENT = (double) 3 / 5;
    private static final int[] WINDOW_SIZE = new int[] {
            (int) (2058 * SIZE_COEFFICIENT),
            (int) (1036 * SIZE_COEFFICIENT)};

    public static void main(String[] args) {
        new Window(WINDOW_SIZE, new Contents());
    }
}
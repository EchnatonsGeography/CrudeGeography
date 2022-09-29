package geography;

public class Coordinates {
    public static int[] polarToDrawable(double[] polar, int[] drawSize) {
        double[]
                centerOffset = new double[] {
                drawSize[0] / 2.0,
                drawSize[1] / 2.0},
                scale = new double[] {
                        drawSize[0] / (Math.PI * 2),
                        drawSize[1] / (Math.PI)};

        int
                drawX = (int) (centerOffset[0] + polar[0] * scale[0]),
                drawY = (int) (centerOffset[1] - polar[1] * scale[1]);
        if (drawX >= drawSize[0]) {
            drawX -= drawSize[0];
        }
        return new int[] {drawX, drawY};
    }
}
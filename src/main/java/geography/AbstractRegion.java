package geography;

import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.Polygon;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractRegion {
    private final @NotNull List<@NotNull RegionBorderInfo> borders; //boolean shows if reversed order

    public AbstractRegion(@Nullable List<@NotNull RegionBorderInfo> borders) {
        this.borders = Objects.requireNonNullElse(borders, new ArrayList<>());
    }

    public @NotNull Polygon getPolygon(int[] drawSize) {
        double[][] totalCoordinateArray = getTotalCoordinateArray();
        int pointCount = totalCoordinateArray.length;
        int[]
                xPoints = new int[pointCount],
                yPoints = new int[pointCount];
        for (int i = 0; i < pointCount; i++) {
            int[] parsedCoordinates = parseCoordinates(totalCoordinateArray[i], drawSize);
            xPoints[i] = parsedCoordinates[0];
            yPoints[i] = parsedCoordinates[1];
        }
        return new Polygon(xPoints, yPoints, pointCount);
    }

    private double[][] getTotalCoordinateArray() {
        double[][] totalCoordinateArray = new double[0][2];
        for (RegionBorderInfo borderInfo : borders) {
            int previousArraySize = totalCoordinateArray.length;
            double[][] borderCoordinateArray = borderInfo.getCoordinates();
            totalCoordinateArray = Arrays.copyOf(
                    totalCoordinateArray,
                    previousArraySize + borderCoordinateArray.length);
            System.arraycopy(
                    borderCoordinateArray, 0,
                    totalCoordinateArray, previousArraySize,
                    borderCoordinateArray.length);
        }
        return totalCoordinateArray;
    }

    private static int[] parseCoordinates(double[] polar, int[] drawSize) {
        int[] drawable = Coordinates.polarToDrawable(polar, drawSize);
        return new int[] {drawable[0], drawable[1]};
    }
}
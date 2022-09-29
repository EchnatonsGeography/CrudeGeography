package geography;

import org.jetbrains.annotations.NotNull;

public class RegionBorderInfo {
    private final @NotNull AbstractBorder border;
    private final boolean reverseOrder;

    public RegionBorderInfo(@NotNull AbstractBorder border, boolean reverseOrder) {
        this.border = border;
        this.reverseOrder = reverseOrder;
    }

    public double @NotNull [] @NotNull [] getCoordinates() {
        double[][] original = border.getCoordinates();
        if (reverseOrder) {
            int count = original.length;
            double[][] reversed = new double[count][2];
            for (int i = 0; i < count; i++) {
                reversed[count - 1 - i] = original[i];
            }
            return reversed;
        } else {
            return original;
        }
    }
}
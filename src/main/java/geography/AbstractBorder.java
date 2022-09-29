package geography;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AbstractBorder {
    private final @NotNull List<@NotNull Location> locationList;

    public AbstractBorder(@Nullable List<@NotNull Location> locationList) {
        this.locationList = Objects.requireNonNullElse(locationList, new ArrayList<>());
    }

    public double @NotNull [] @NotNull [] getCoordinates() {
        int memberCount = locationList.size();
        double[][] coordinates = new double[memberCount][2];
        for (int i = 0; i < memberCount; i++) {
            coordinates[i] = locationList.get(i).getCoordinates();
        }
        return coordinates;
    }
}
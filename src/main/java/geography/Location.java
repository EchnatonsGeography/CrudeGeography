package geography;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Location {
    private static final @NotNull String DEFAULT_NAME = "Location";
    private final @NotNull String name;
    private final double latitude, longitude;

    //TODO: add javadoc
    public Location(@Nullable String name, double latitude, double longitude) {
        this.name = Objects.requireNonNullElse(name, DEFAULT_NAME);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //TODO: add javadoc
    @SuppressWarnings("unused")
    public @NotNull String getName() {
        return name;
    }

    //TODO: add javadoc
    @SuppressWarnings("unused")
    public double getLatitude() {
        return latitude;
    }

    //TODO: add javadoc
    @SuppressWarnings("unused")
    public double getLongitude() {
        return longitude;
    }

    //TODO: add javadoc
    public double @NotNull [] getCoordinates() {
        return new double[] {
                Math.toRadians(longitude),
                Math.toRadians(latitude)};
    }
}
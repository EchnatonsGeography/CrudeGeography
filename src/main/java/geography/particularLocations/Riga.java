package geography.particularLocations;

import geography.Location;

public class Riga extends Location {
    private static final double
            LATITUDE = 56.9677,
            LONGITUDE = 24.1056;

    public Riga() {
        super("Riga", LATITUDE, LONGITUDE);
    }
}
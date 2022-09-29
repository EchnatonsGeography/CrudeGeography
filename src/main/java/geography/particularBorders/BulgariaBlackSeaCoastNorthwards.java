package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class BulgariaBlackSeaCoastNorthwards extends AbstractBorder {
    public BulgariaBlackSeaCoastNorthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Rezovo",
                    41.98787210636342, 28.023412437195574));
            add(new Location(
                    "Burgas",
                    42.49952631294505, 27.47629944846577));
            add(new Location(
                    "Emona",
                    42.71430177951919, 27.88451896869753));
            add(new Location(
                    "Albena",
                    43.373029422629244, 28.08263830620665));
            add(new Location(
                    "Balgarevo",
                    43.39844495189739, 28.41279785592614));
            add(new Location(
                    "Vama Veche",
                    43.74862931043579, 28.576014547346777));
        }});
    }
}
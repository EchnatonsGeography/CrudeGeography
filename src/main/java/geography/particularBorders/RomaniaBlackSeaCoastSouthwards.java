package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;
import geography.particularLocations.commonBorderPoints.Cardon;

import java.util.ArrayList;

public class RomaniaBlackSeaCoastSouthwards extends AbstractBorder {
    public RomaniaBlackSeaCoastSouthwards() {
        super(new ArrayList<>() {{
            add(new Cardon());
            add(new Location(
                    "Vama Veche",
                    43.74862931043579, 28.576014547346777));
        }});
    }
}
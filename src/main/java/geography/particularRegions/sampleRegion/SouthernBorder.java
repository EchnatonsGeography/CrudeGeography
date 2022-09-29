package geography.particularRegions.sampleRegion;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

class SouthernBorder extends AbstractBorder {
    protected SouthernBorder() {
        super(new ArrayList<>() {{
            add(new Location(
                    "south 1",
                    10, 30));
            add(new Location(
                    "south 2",
                    10, 50));
            add(new Location(
                    "east",
                    20, 70));
        }});
    }
}
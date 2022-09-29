package geography.particularRegions.sampleRegion;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

class NorthernBorder extends AbstractBorder {
    protected NorthernBorder() {
        super(new ArrayList<>() {{
            add(new Location(
                    "west",
                    20, 10));
            add(new Location(
                    "north 1",
                    30, 30));
            add(new Location(
                    "north 2",
                    30, 50));
        }});
    }
}
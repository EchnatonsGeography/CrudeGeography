package geography.particularBorders.europeanBorders.romania;

import geography.AbstractBorder;
import geography.Location;
import geography.particularLocations.commonBorderPoints.Cardon;

import java.util.ArrayList;

public class UkraineRomaniaSouthEastwards extends AbstractBorder {
    public UkraineRomaniaSouthEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Giurgiulesti",
                    45.4740227215942, 28.203272065434106));
            add(new Cardon());
        }});
    }
}
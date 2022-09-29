package geography.particularBorders.europeanBorders.romania;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RomaniaMoldovaSouthwards extends AbstractBorder {
    public RomaniaMoldovaSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Mamalyha",
                    48.254733697788446, 26.58386479780157));
            add(new Location(
                    "Broscosesti",
                    46.56798817726316, 28.220869397346622));
            add(new Location(
                    "Giurgiulesti",
                    45.4740227215942, 28.203272065434106));
        }});
    }
}
package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;
import geography.particularLocations.commonBorderPoints.KerchStrait;

import java.util.ArrayList;

public class UkraineRussiaSouthwards extends AbstractBorder {
    public UkraineRussiaSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Lenino",
                    52.1884463054773, 31.67390427401385));
            /*add(new Location(
                    "",
                    ));*/
            add(new KerchStrait());
        }});
    }
}
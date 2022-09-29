package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineBelarusEastwards extends AbstractBorder {
    public UkraineBelarusEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Wlodawa",
                    51.54425991477907, 23.576260472190437));
            add(new Location(
                    "Dzerzhinsk",
                    51.66026257219971, 27.511103571600593));
            add(new Location(
                    "Chernobyl",
                    51.287551529789205, 30.218024285375392));
            add(new Location(
                    "Novaya Guta",
                    52.1005657924268, 30.95217982528073));
            add(new Location(
                    "Lenino",
                    52.1884463054773, 31.67390427401385));
        }});
    }
}
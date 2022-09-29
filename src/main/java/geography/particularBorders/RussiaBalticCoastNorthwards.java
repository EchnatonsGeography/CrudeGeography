package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaBalticCoastNorthwards extends AbstractBorder {
    public RussiaBalticCoastNorthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Narva",
                    59.375673218491244, 28.191094467038518));
            add(new Location(
                    "Torfyanovka",
                    60.595849120713524, 27.911457285978965));
        }});
    }
}
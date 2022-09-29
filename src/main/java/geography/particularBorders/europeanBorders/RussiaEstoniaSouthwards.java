package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaEstoniaSouthwards extends AbstractBorder {
    public RussiaEstoniaSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Narva",
                    59.375673218491244, 28.191094467038518));
            add(new Location(
                    "Pededze",
                    57.48090409653002, 27.444619608866613));
        }});
    }
}
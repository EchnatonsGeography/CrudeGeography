package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaLatviaSouthwards extends AbstractBorder {
    public RussiaLatviaSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Pededze",
                    57.48090409653002, 27.444619608866613));
            add(new Location(
                    "Ignalino",
                    56.08382855179491, 28.282544362741156));
        }});
    }
}
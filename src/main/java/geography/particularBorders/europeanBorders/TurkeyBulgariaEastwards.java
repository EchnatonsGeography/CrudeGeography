package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class TurkeyBulgariaEastwards extends AbstractBorder {
    public TurkeyBulgariaEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Triangular point",
                    41.714154397456284, 26.354221977162975));
            add(new Location(
                    "Rezovo",
                    41.98787210636342, 28.023412437195574));
        }});
    }
}
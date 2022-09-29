package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineSlovakiaSouthwards extends AbstractBorder {
    public UkraineSlovakiaSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Krzemieniec trojstyk",
                    49.088011565839544, 22.565581483980623));
            add(new Location(
                    "Zahony",
                    48.40294400367127, 22.158623609999534));
        }});
    }
}

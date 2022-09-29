package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class PolandUkraineSouthwards extends AbstractBorder {
    public PolandUkraineSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Wlodawa",
                    51.54425991477907, 23.576260472190437));
            add(new Location(
                    "Belz",
                    50.39395807028242, 24.012911429147273));
            add(new Location(
                    "Kwaszenina",
                    49.54841334903126, 22.65805440214823));
            add(new Location(
                    "Syanky",
                    49.024202558241115, 22.900395407320133));
            add(new Location(
                    "Krzemieniec trojstyk",
                    49.088011565839544, 22.565581483980623));
        }});
    }
}
package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaBelarusSouthwards extends AbstractBorder {
    public RussiaBelarusSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Ignalino",
                    56.08382855179491, 28.282544362741156));
            add(new Location(
                    "Usvyaty",
                    55.745260653736985, 30.736526055626495));
            add(new Location(
                    "Chocimsk",
                    53.40399822312029, 32.584461113828254));
            add(new Location(
                    "Polesie",
                    53.105822201164315, 31.29936331989768));
            add(new Location(
                    "Lenino",
                    52.1884463054773, 31.67390427401385));
        }});
    }
}
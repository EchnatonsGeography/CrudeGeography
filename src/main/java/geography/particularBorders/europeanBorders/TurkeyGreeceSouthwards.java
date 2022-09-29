package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class TurkeyGreeceSouthwards extends AbstractBorder {
    public TurkeyGreeceSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Triangular point",
                    41.714154397456284, 26.354221977162975));
            add(new Location(
                    "Petrades",
                    41.34482951417996, 26.613521432064363));
            add(new Location(
                    "Enez",
                    40.72675544348787, 26.06009062568937));
            add(new Location(
                    "Chios",
                    38.368087284070114, 26.13569497043882));
            add(new Location(
                    "Rhodes",
                    36.42394324211933, 28.191466741877512));
        }});
    }
}
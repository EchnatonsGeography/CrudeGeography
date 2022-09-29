package geography.particularBorders.europeanBorders.romania;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineRomaniaNorthEastwards extends AbstractBorder {
    public UkraineRomaniaNorthEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "HRU tripoint",
                    47.954549575139, 22.895619888682656));
            add(new Location(
                    "Shepit",
                    47.79680792210181, 25.158985808121876));
            add(new Location(
                    "Mamalyha",
                    48.254733697788446, 26.58386479780157));
        }});
    }
}
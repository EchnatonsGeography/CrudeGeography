package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineHungarySouthwards extends AbstractBorder {
    public UkraineHungarySouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Zahony",
                    48.40294400367127, 22.158623609999534));
            add(new Location(
                    "HRU tripoint",
                    47.954549575139, 22.895619888682656));
        }});
    }
}

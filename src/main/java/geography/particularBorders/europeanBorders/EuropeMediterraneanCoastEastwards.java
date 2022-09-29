package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class EuropeMediterraneanCoastEastwards extends AbstractBorder {
    public EuropeMediterraneanCoastEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Tarifa",
                    36.00769668902404, -5.6056759752078404));
            /*add(new Location(
                    "",
                    ));*/
            add(new Location(
                    "Rhodes",
                    36.42394324211933, 28.191466741877512));
        }});
    }
}
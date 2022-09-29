package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaNorwayNorthwards extends AbstractBorder {
    public RussiaNorwayNorthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Rayakoski",
                    69.00837003051305, 29.021868309561373));
            add(new Location(
                    "Grense Jakobselv",
                    69.77507465364747, 30.832087655105873));
        }});
    }
}
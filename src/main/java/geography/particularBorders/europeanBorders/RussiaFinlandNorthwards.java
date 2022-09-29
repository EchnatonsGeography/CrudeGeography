package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaFinlandNorthwards extends AbstractBorder {
    public RussiaFinlandNorthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Torfyanovka",
                    60.595849120713524, 27.911457285978965));
            add(new Location(
                    "Niemijarvi",
                    62.83966260059415, 31.476338870877136));
            add(new Location(
                    "near lake Jongeri",
                    63.77437091478117, 30.106360113039425));
            add(new Location(
                    "Jamsa",
                    65.98160897347606, 29.98865713759338));
            add(new Location(
                    "Rayakoski",
                    69.00837003051305, 29.021868309561373));
        }});
    }
}
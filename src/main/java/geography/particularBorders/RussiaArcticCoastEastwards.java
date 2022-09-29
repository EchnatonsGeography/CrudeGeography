package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaArcticCoastEastwards extends AbstractBorder {
    public RussiaArcticCoastEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Grense Jakobselv",
                    69.77507465364747, 30.832087655105873));
            add(new Location(
                    "Vayda-Guba",
                    69.94451905397477, 31.96682513021414));
            add(new Location(
                    "Zaliv Borzova",
                    76.17357135235912, 60.611917701451965));
            add(new Location(
                    "Komsmolets island",
                    81.23835587977716, 95.47619126973152));
            add(new Location(
                    "Wrangel island",
                    71.54106022386985, 179.67298649544915));
            // doesn't support going around the globe
            //TODO: fix, and improve this list

            add(new Location(
                    "Beringovskii",
                    63.00723923831595, 179.33072880895395));
        }});
    }
}
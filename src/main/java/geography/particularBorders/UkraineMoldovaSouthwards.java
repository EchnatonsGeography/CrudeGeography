package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineMoldovaSouthwards extends AbstractBorder {
    public UkraineMoldovaSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Mamalyha",
                    48.254733697788446, 26.58386479780157));
            add(new Location(
                    "Mohyliv-Podilskyi",
                    48.44978768141209, 27.789870758312986));
            add(new Location(
                    "Plopi",
                    47.95749638887957, 29.159235386802365));
            add(new Location(
                    "Palanca",
                    46.417319010399176, 30.088222345496472));
            add(new Location(
                    "Basarabeasca",
                    46.35823489003968, 28.961674096593594));
            add(new Location(
                    "Giurgiulesti",
                    45.4740227215942, 28.203272065434106));
        }});
    }
}
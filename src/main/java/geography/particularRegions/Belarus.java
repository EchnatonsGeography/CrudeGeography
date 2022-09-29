package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.RussiaBelarusSouthwards;
import geography.particularBorders.UkraineBelarusEastwards;
import geography.particularBorders.europeanBorders.BelarusWestNorthwards;

import java.util.ArrayList;

public class Belarus extends AbstractRegion {
    public Belarus() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaBelarusSouthwards(), false));
            add(new RegionBorderInfo(new UkraineBelarusEastwards(), true));
            add(new RegionBorderInfo(new BelarusWestNorthwards(), false));
        }});
    }
}
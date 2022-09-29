package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.*;
import geography.particularBorders.europeanBorders.RussiaEstoniaSouthwards;
import geography.particularBorders.europeanBorders.RussiaFinlandNorthwards;
import geography.particularBorders.europeanBorders.RussiaLatviaSouthwards;
import geography.particularBorders.europeanBorders.RussiaNorwayNorthwards;

import java.util.ArrayList;

public class Russia extends AbstractRegion {
    public Russia() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaLatviaSouthwards(), true));
            add(new RegionBorderInfo(new RussiaEstoniaSouthwards(), true));
            add(new RegionBorderInfo(new RussiaBalticCoastNorthwards(), false));
            add(new RegionBorderInfo(new RussiaFinlandNorthwards(), false));
            add(new RegionBorderInfo(new RussiaNorwayNorthwards(), false));
            add(new RegionBorderInfo(new RussiaArcticCoastEastwards(), false));
            add(new RegionBorderInfo(new RussiaSouthCounterClockwise(), true));
            add(new RegionBorderInfo(new UkraineRussiaSouthwards(), true));
            add(new RegionBorderInfo(new RussiaBelarusSouthwards(), true));
        }});
    }
}
package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.*;
import geography.particularBorders.europeanBorders.PolandUkraineSouthwards;
import geography.particularBorders.europeanBorders.UkraineHungarySouthwards;
import geography.particularBorders.europeanBorders.UkraineSlovakiaSouthwards;
import geography.particularBorders.europeanBorders.romania.UkraineRomaniaNorthEastwards;
import geography.particularBorders.europeanBorders.romania.UkraineRomaniaSouthEastwards;

import java.util.ArrayList;

public class Ukraine extends AbstractRegion {
    public Ukraine() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new UkraineRomaniaSouthEastwards(), true));
            add(new RegionBorderInfo(new UkraineMoldovaSouthwards(), true));
            add(new RegionBorderInfo(new UkraineRomaniaNorthEastwards(), true));
            add(new RegionBorderInfo(new UkraineHungarySouthwards(), true));
            add(new RegionBorderInfo(new UkraineSlovakiaSouthwards(), true));
            add(new RegionBorderInfo(new PolandUkraineSouthwards(), true));
            add(new RegionBorderInfo(new UkraineBelarusEastwards(), false));
            add(new RegionBorderInfo(new UkraineRussiaSouthwards(), false));
            add(new RegionBorderInfo(new UkraineBlackSeaCoastEastwards(), true));
        }});
    }
}
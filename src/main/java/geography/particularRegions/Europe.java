package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.*;
import geography.particularBorders.europeanBorders.*;
import geography.particularBorders.europeanBorders.romania.RomaniaMoldovaSouthwards;
import geography.particularBorders.europeanBorders.romania.UkraineRomaniaNorthEastwards;
import geography.particularBorders.europeanBorders.romania.UkraineRomaniaSouthEastwards;

import java.util.ArrayList;

public class Europe extends AbstractRegion {
    public Europe() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaNorwayNorthwards(), true));
            add(new RegionBorderInfo(new RussiaFinlandNorthwards(), true));
            add(new RegionBorderInfo(new RussiaBalticCoastNorthwards(), true));
            add(new RegionBorderInfo(new RussiaEstoniaSouthwards(), false));
            add(new RegionBorderInfo(new RussiaLatviaSouthwards(), false));
            add(new RegionBorderInfo(new BelarusWestNorthwards(), true));
            add(new RegionBorderInfo(new PolandUkraineSouthwards(), false));
            add(new RegionBorderInfo(new UkraineSlovakiaSouthwards(), false));
            add(new RegionBorderInfo(new UkraineHungarySouthwards(), false));
            add(new RegionBorderInfo(new UkraineRomaniaNorthEastwards(), false));
            add(new RegionBorderInfo(new RomaniaMoldovaSouthwards(), false));
            add(new RegionBorderInfo(new UkraineRomaniaSouthEastwards(), false));
            add(new RegionBorderInfo(new RomaniaBlackSeaCoastSouthwards(), false));
            add(new RegionBorderInfo(new BulgariaBlackSeaCoastNorthwards(), true));
            add(new RegionBorderInfo(new TurkeyBulgariaEastwards(), true));
            add(new RegionBorderInfo(new TurkeyGreeceSouthwards(), false));
            add(new RegionBorderInfo(new EuropeMediterraneanCoastEastwards(), true));
            add(new RegionBorderInfo(new EuropeAtlanticCoastNorthwards(), false));
        }});
    }
}
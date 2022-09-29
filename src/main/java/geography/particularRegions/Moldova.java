package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.UkraineMoldovaSouthwards;
import geography.particularBorders.europeanBorders.romania.RomaniaMoldovaSouthwards;

import java.util.ArrayList;

public class Moldova extends AbstractRegion {
    public Moldova() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new UkraineMoldovaSouthwards(), false));
            add(new RegionBorderInfo(new RomaniaMoldovaSouthwards(), true));
        }});
    }
}
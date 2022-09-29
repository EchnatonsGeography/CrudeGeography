package geography.particularRegions.sampleRegion;

import geography.AbstractRegion;
import geography.RegionBorderInfo;

import java.util.ArrayList;

public class SampleRegion extends AbstractRegion {
    public SampleRegion() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new NorthernBorder(), false));
            add(new RegionBorderInfo(new SouthernBorder(), true));
        }});
    }
}
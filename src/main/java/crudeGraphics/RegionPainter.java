package crudeGraphics;

import geography.AbstractRegion;
import geography.particularRegions.*;
import geography.particularRegions.sampleRegion.SampleRegion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class RegionPainter {
    private static final int COMMON_OPACITY = 150;
    private final List<RegionDrawInfo> regionDrawInfo;

    RegionPainter() {
        regionDrawInfo = new ArrayList<>() {{
            add(new RegionDrawInfo(new SampleRegion(), 0, false));
            add(new RegionDrawInfo(new Europe(), 0, true));
            add(new RegionDrawInfo(new Russia(), 2, true));
            add(new RegionDrawInfo(new Belarus(), 1, true));
            add(new RegionDrawInfo(new Ukraine(), 2, true));
            add(new RegionDrawInfo(new Moldova(), 1, true));
        }};
    }

    void paintRegions(Graphics g, int[] drawSize) {
        for (RegionDrawInfo regionInfo : regionDrawInfo) {
            if (regionInfo.draw) {
                switch (regionInfo.dangerLevel) {
                    case 1 -> g.setColor(new Color(255, 220, 20, COMMON_OPACITY));
                    case 2 -> g.setColor(new Color(255, 30, 20, COMMON_OPACITY));
                    default -> g.setColor(new Color(20, 200, 255, COMMON_OPACITY));
                }
                paintRegion(g, drawSize, regionInfo.region);
            }
        }
    }

    private void paintRegion(Graphics g, int[] drawSize, AbstractRegion region) {
        g.fillPolygon(region.getPolygon(drawSize));
    }

    private static class RegionDrawInfo {
        AbstractRegion region;
        int dangerLevel; // 0; 1; 2
        boolean draw;

        RegionDrawInfo(AbstractRegion region, int dangerLevel, boolean draw) {
            this.region = region;
            this.dangerLevel = dangerLevel;
            this.draw = draw;
        }
    }
}
package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;
import geography.particularLocations.commonBorderPoints.KerchStrait;

import java.util.ArrayList;

public class RussiaSouthCounterClockwise extends AbstractBorder {
    public RussiaSouthCounterClockwise() {
        super(new ArrayList<>() {{
            add(new KerchStrait());
            add(new Location(
                    "Sochi",
                    43.570233889524566, 39.746514173975655));
            add(new Location(
                    "Derbent",
                    42.051154397196896, 48.29154199287194));
            add(new Location(
                    "Astrakhan",
                    46.365573248440185, 48.0623604426328));
            add(new Location(
                    "Gmelinka",
                    50.36361790019497, 46.89722491767021));
            add(new Location(
                    "Pogodayev",
                    51.68107282933388, 51.05869947217407));
            add(new Location(
                    "Orsk",
                    51.18287125686199, 58.515547461632295));
            add(new Location(
                    "Troitsk",
                    54.048521783346786, 61.56927851952059));
            /*add(new Location(
                    "",
                    ));
            add(new Location(
                    "",
                    ));
            add(new Location(
                    "",
                    ));*/
        }});
    }
}
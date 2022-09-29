package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;
import geography.particularLocations.commonBorderPoints.Cardon;
import geography.particularLocations.commonBorderPoints.KerchStrait;

import java.util.ArrayList;

public class UkraineBlackSeaCoastEastwards extends AbstractBorder {
    public UkraineBlackSeaCoastEastwards() {
        super(new ArrayList<>() {{
            add(new Cardon());
            add(new Location(
                    "Yuzhne",
                    46.62527079320756, 31.109867595444207));
            add(new Location(
                    "Foros",
                    44.407635201380806, 33.772198761474584));
            add(new KerchStrait());
        }});
    }
}
package geography.particularBorders.europeanBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class BelarusWestNorthwards extends AbstractBorder {
    public BelarusWestNorthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Wlodawa",
                    51.54425991477907, 23.576260472190437));
            add(new Location(
                    "Brest",
                    52.09188423402427, 23.7670700886953));
            add(new Location(
                    "Niemirow",
                    52.284116859758974, 23.174442715475966));
            add(new Location(
                    "Bialowieza",
                    52.69907626525776, 23.903217148262947));
            add(new Location(
                    "Bobrowniki",
                    53.12168022367773, 23.890711224810268));
            add(new Location(
                    "Rudawka",
                    53.86645052360448, 23.521078037178345));
            add(new Location(
                    "Gudeliai",
                    54.168354141062615, 25.710944672973735));
            add(new Location(
                    "Visaginas",
                    55.58619387843335, 26.45757265292632));
            add(new Location(
                    "Ignalino",
                    56.08382855179491, 28.282544362741156));
        }});
    }
}
package crudeGraphics;

import geography.Coordinates;
import geography.Location;
import geography.particularLocations.Riga;
import geography.particularLocations.GuianaSpaceCenter;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

class GroundTrackPainter extends AbstractStaticPainter {
    private static final int COMMON_OPACITY = 190;

    GroundTrackPainter() {
        super();
    }

    protected void paintGroundTracks(Graphics g, int @NotNull [] drawSize) {
        g.setColor(new Color(20, 255, 20, COMMON_OPACITY));
        drawGroundTrack(g, drawSize, new Riga());
        drawGroundTrack(g, drawSize, new Location(
                "Somewhere in Romania",
                44.87737491123246, 28.72072572239927));
        drawGroundTrack(g, drawSize, new Location(
                "Somewhere in Italy",
                44.42201217577874, 12.222585507407091));
        drawGroundTrack(g, drawSize, new Location(
                "Somewhere in Spain",
                38.38596174661448, -0.5614115111024103));
        g.setColor(new Color(20, 50, 255, COMMON_OPACITY));
        drawGroundTrack(g, drawSize, new GuianaSpaceCenter());
    }

    private void drawGroundTrack(Graphics g, int @NotNull [] drawSize, @NotNull Location start) {
        double @NotNull [] startCoordinates = start.getCoordinates();
        int dataPoints = 200;
        double deltaFi = 2 * Math.PI / dataPoints;
        for (int i = 0; i < dataPoints; i++) {
            double longitudeOffset = deltaFi * i;
            g.setColor(new Color(20, 255, 20, COMMON_OPACITY));
            drawSinglePoint(g, Coordinates.polarToDrawable(
                    new double[] {
                            longitudeOffset + startCoordinates[0],
                            startCoordinates[1] * Math.cos(longitudeOffset)},
                    drawSize));
        }
    }

    private void drawSinglePoint(Graphics g, int @NotNull [] location) {
        int ovalSize = 6;
        g.fillOval(
                (int) (location[0] - ovalSize / 2.0),
                (int) (location[1] - ovalSize / 2.0),
                ovalSize,
                ovalSize);
    }
}
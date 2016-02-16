package javaCh9;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
/**
 * File : StopSign.java
 * --------------------
 * Graphics program creates a 'stop sign' using a GPolygon and GLabel.
 */
public class StopSign extends GraphicsProgram {
	// Private constants.
	private static final double EDGE_LENGTH = 50;
	// Creates GPolygon and GLabel and centers both on screen.
	public void run() {
		// Finds x and y points in center of canvas.
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		GPolygon sign = createOctagon(EDGE_LENGTH);
		sign.setFilled(true);
		sign.setFillColor(Color.RED);
		add(sign, x, y);
		GLabel stop = new GLabel("STOP");
		stop.setFont("SansSerif-bold-36");
		stop.setColor(Color.WHITE);
		add(stop, x - (stop.getWidth() / 2), y + (stop.getAscent() / 2));
	}
	/**
	 * Creates an octagon with side length provided.
	 * @param side Length of each side of the polygon.
	 * @return Returns a GPolygon with 6 sides 'octagon'.
	 */
	private GPolygon createOctagon(double side) {
		GPolygon octagon = new GPolygon();
		octagon.addVertex(-side / 2, side / 2 + side / Math.sqrt(2));
		int angle = 0;
		// Loops for each of the sides.
		for (int i = 0; i < 8; i++) {
			octagon.addPolarEdge(side, angle);
			angle += 45;
		}
		return octagon;
	}
}
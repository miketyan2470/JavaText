/**
 * File : TrainCar.java
 * --------------------
 * Defines the abstract superclass for all train cars.
 */

package javaCh9;

import acm.graphics.*;
import java.awt.*;
/**
 * Defines what is common to all train cars.
 */
public abstract class TrainCar extends GCompound {
	// Private constants.
	protected static final double CAR_WIDTH = 75;
	protected static final double CAR_HEIGHT = 36;
	protected static final double CAR_BASELINE = 10;
	protected static final double CONNECTOR = 6;
	protected static final double WHEEL_RADIUS = 8;
	protected static final double WHEEL_INSET = 16;
	/**
	 * Creates a frame for the carts using the specified color.
	 * @param color Color of the new boxcar.
	 */
	public TrainCar(Color color) {
		double xLeft = CONNECTOR;
		double yBase = -CAR_BASELINE;
		// Creates the connectors and wheels.
		add(new GLine(0, yBase, CAR_WIDTH + 2 * CONNECTOR, yBase));
		addWheel(xLeft + WHEEL_INSET, -WHEEL_RADIUS);
		addWheel(xLeft + CAR_WIDTH - WHEEL_INSET, -WHEEL_RADIUS);
		double  yTop = yBase - CAR_HEIGHT;
		// Creates body of boxcar.
		GRect r = new GRect(xLeft, yTop, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}
	/**
	 * Creates wheels centered at (x, y).
	 * @param x X axis coordinate to center the wheel.
	 * @param y Y axis coordinate to center the wheel.
	 */
	private void addWheel(double x, double y) {
		GOval wheel = new GOval(x - WHEEL_RADIUS, y - WHEEL_RADIUS, 2 * WHEEL_RADIUS, 2 * WHEEL_RADIUS);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}
}
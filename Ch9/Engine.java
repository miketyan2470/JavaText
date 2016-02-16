/**
 * File : Engine.java
 * ------------------
 * Defines Engine class as a subclass of TrainCar superclass.
 */

package javaCh9;

import java.awt.*;
import acm.graphics.*;
/** Creates Object Engine. */
public class Engine extends TrainCar {
	// Private constants.
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;
	/** Creates engine with add-ons to GObject TrainCar. */
	public Engine() {
		super(Color.BLACK);
		drawCab();
		drawSmokeStack();
		drawCowCatch();
	}
	/** Draws 'cab' onto Engine. */
	private void drawCab() {
		double x = (CONNECTOR + (CAR_WIDTH - CAB_WIDTH));
		double y = (-CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT);
		GRect cab = new GRect(x, y, CAB_WIDTH, CAB_HEIGHT);
		cab.setFilled(true);
		cab.setFillColor(Color.BLACK);
		add(cab);
	}
	/** Draws 'smokeStack' onto Engine. */
	private void drawSmokeStack() {
		double x = (CONNECTOR + SMOKESTACK_INSET);
		double y = (-CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT);
		GRect smokeStack = new GRect(x, y, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokeStack.setFilled(true);
		smokeStack.setFillColor(Color.BLACK);
		add(smokeStack);
	}
	/** Draws 'cowCatch' onto Engine. */
	private void drawCowCatch() {
		double x = CONNECTOR;
		double y = (-CAR_BASELINE - (CAR_HEIGHT / 2));
		double x2 = 0;
		double y2 = -CAR_BASELINE;
		double x3 = CONNECTOR / 2;
		double y3 = -CAR_BASELINE;
		add(new GLine(x, y, x2, y2));
		add(new GLine(x, y, x3, y3));
	}
}
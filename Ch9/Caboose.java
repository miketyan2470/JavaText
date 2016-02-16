/**
 * File : Caboose.java
 * -------------------
 * Defines Caboose class as a subclass of TrainCar superclass.
 */

package javaCh9;

import java.awt.*;
import acm.graphics.*;
/**
 * Creates GObject Caboose.
 */
public class Caboose extends TrainCar {
	// Private constants.
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
	// Creates caboose with cupola added.
	public Caboose() {
		super(Color.RED);
		double x = CONNECTOR + ((CAR_WIDTH - CUPOLA_WIDTH) / 2);
		double y = -CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
		GRect cupola = new GRect(x, y, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setFillColor(Color.RED);
		add(cupola);
	}
}
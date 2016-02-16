/**
 * File : Boxcar.java
 * ------------------
 * Defines Boxcar class as a subclass of TrainCar superclass.
 */

package javaCh9;

import java.awt.*;
import acm.graphics.*;
/**
 * Creates GObject Boxcar.
 */
public class Boxcar extends TrainCar {
	// Private constants.
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
	/**
	 * Creates boxcar with specified color and adds doors.
	 * @param color Color of new boxcar.
	 */
	public Boxcar() {
		super(Color.GREEN);
		double xRightDoor = CONNECTOR + CAR_WIDTH / 2;
		double xLeftDoor = xRightDoor - DOOR_WIDTH;
		double yDoor = -CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeftDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRightDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
}
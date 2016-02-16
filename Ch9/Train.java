/**
 * File : Train.java
 * -----------------
 * Defines Train class, which can contain any number of train cars linked end to end.
 */

package javaCh9;

import acm.graphics.*;
/**
 * Defines a GCompound that represents a train by usuing append method to add train
 * cars at the end of train.
 */
public class Train extends GCompound {
	/** Creates new Train with no cars. */
	public Train() {
	}
	/**
	 * Adds a new car to the end of the train.
	 * @param car The new train car.
	 */
	public void append(TrainCar car) {
		double width = getWidth();
		double x = (width == 0) ? 0 : width + TrainCar.CONNECTOR;
		add(car, x, 0);
	}
}
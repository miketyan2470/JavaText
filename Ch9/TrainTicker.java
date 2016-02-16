/**
 * File : TrainTicker.java
 * -----------------------
 * Graphics program that scrolls GCompound Train across the bottom of graphics window
 * once the user clicks mouse. The train will continue to scroll across until completely 
 * out of window and resets out of screen on right side before loop continues.
 */

package javaCh9;

import acm.program.*;

public class TrainTicker extends GraphicsProgram {
	// Private constants.
	private static final double PAUSE_TIME = 20;
	private static final double DELTA_X = 2;
	/**
	 * Generates train that scrolls across the screen.
	 */
	public void run() {
		double xc = getWidth() / 2;
		// Calls Train constructor to create new GCompound.
		Train train = new Train();
		// Calls append method to add traincars.
		train.append(new Engine());
		train.append(new Boxcar());
		train.append(new Caboose());
		add(train, xc - train.getWidth() / 2, getHeight());
		// Event listener waits for user mouse click before train starts loop.
		waitForClick();
		while (train.getX() + train.getWidth() >= 0) {
			train.move(-DELTA_X, 0);
			pause(PAUSE_TIME);
			// Moves train off screen on right side once the whole train has cleared.
			if (train.getX() <= -train.getWidth()) {
				train.move((getWidth() + train.getWidth()), 0);
			}
		}
	}
}
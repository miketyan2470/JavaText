/*
 * File : Ticker.java
 * ------------------
 * Program takes user entered String and scrolls it from right to left in a continuous loop.
 * -String will start off screen and will continue scrolling until completely out of 
 * screen before loop cycles.
 * -PAUSE_TIME constant adjusts scroll speed.
 * -NEWS constant adjusts String to be scrolled.
 */

package javaCh4;

import acm.program.*;
import acm.graphics.*;

public class Ticker extends GraphicsProgram {
	private static final int PAUSE_TIME = 5; // Milliseconds to pause before next movement.
	private static final String NEWS = "DEWEY DEFEATS TRUMAN!"; // Text to be scrolled.
	
	public void run() {
		// Creates 'ticker' with 'NEWS' and places it off screen to the right.
		GLabel ticker = new GLabel(NEWS, getWidth() + 1, getHeight() - 1);
		ticker.setFont("Helvetica-36");
		add(ticker);
		// Sets numbers of pixels to be moved along the x axis.
		double dx = -1;
		// Continues the movement from right to left until whole text is out of screen.
		while (true) {
			ticker.move(dx, 0);
			pause(PAUSE_TIME);
			// Resets the text to the right off screen.
			if (ticker.getX() <= -ticker.getWidth()) {
				ticker.move((getWidth() + ticker.getWidth()), 0);
			}
		}
	}
}
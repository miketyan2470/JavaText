/*
 * File : Target.java
 * ------------------
 * Program generates a 'target' given by exercise 5 in chapter 2.
 * -Uses method 'createFilledCircle' from figure 5-3.
 * -Target is always centered on winder.
 * -Numbers of Circles, Outer Radius, and Inner Radius are constants
 * that can be changed to adjust variables.
 */

package javaCh5;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	//Initializes all constants used throughout class 'Target'.
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
	
	public void run() {
		//Initializes variables used in method 'run'.
		double offset = ((OUTER_RADIUS - INNER_RADIUS) / (N_CIRCLES - 1));
		double center_x = getWidth() / 2;
		double center_y = getHeight() / 2;
		//Loop generates 'circles' until N_CIRCLES is reached.
		for (int i = 0; i <= N_CIRCLES; i++) {
			//Initializes variables used in 'for' iteration.
			double x = (center_x - (OUTER_RADIUS - (offset * i)));
			double y = (center_y - (OUTER_RADIUS - (offset * i)));
			double r = (OUTER_RADIUS - (offset * i));
			//Determines if 'circle' will be RED or WHITE.
			if (i % 2 == 0) {
				add(createFilledCircle(x, y, r, Color.RED));
			} else {
				add(createFilledCircle(x, y, r, Color.WHITE));
			}
		}
	}
	
	//Method will generate a 'circle' given the arguments from method 'run'.
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x, y, r * 2, r * 2);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
}
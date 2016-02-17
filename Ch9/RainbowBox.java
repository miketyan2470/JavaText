/**
 * File : RainbowBox.java
 * ----------------------
 * Graphics program that creates a box that changes colors randomly.
 * - Box is centered in the screen.
 * - Colors are generated randomly.
 * - Square size and interval between colors are set constants.
 */

package javaCh9;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RainbowBox extends GraphicsProgram {
	// Private constants.
	private static final int SQUARE_SIZE = 100;
	private static final int PAUSE = 100;
	// Initializes a new GRect square with the given size.
	private GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
	/**	Initializes the even listeners for mouse. */
	public void init() {
		addMouseListeners();
	}
	/**
	 * Creates a black box that is filled and centered in the 
	 * window. The color of box will change after every given 
	 * interval and new color will be randomly generated.
	 */
	public void run() {
		double x = (getWidth() - SQUARE_SIZE) / 2; 
		double y = (getHeight() - SQUARE_SIZE) / 2;
		square.setFilled(true);
		square.setFillColor(Color.BLACK);
		square.setLocation(x,  y);
		add(square);	
		// Changes the color of box to randomly generated one.
		while (true) {
			square.setFillColor(rgen.nextColor());
			// Pauses the loop for given interval.
			pause(PAUSE);
		}	
	}
	// Initializes random generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
/*
 * File : AnimatedSquare.java
 * --------------------------
 * Program creates a square with starting point 0,0 that is defined in 
 * size by constant SQ_SIZE. The 'for' statement will move the square based 
 * on constants N_STEPS and PAUSE_TIME.
 */

package javaCh4;

import acm.program.*;
import acm.graphics.*;

public class AnimatedSquare extends GraphicsProgram {
	
	public void run() {
		GRect square = new GRect(0,0,SQ_SIZE,SQ_SIZE);
		square.setFilled(true);
		add(square);
		double dx = (double) (getWidth() - SQ_SIZE) / N_STEPS; //Calculates distance to move square based on width of screen and N_STEPS.
		double dy = (double) (getHeight() - SQ_SIZE) / N_STEPS;
		for (int i = 0; i < N_STEPS; i++) {
			square.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
	private static final int SQ_SIZE = 50; //Size in pixels of square.
	private static final int N_STEPS = 500; //Number of steps to reach the final position.
	private static final int PAUSE_TIME = 10; //Milliseconds to 'pause' before next cycle of loop begins. 
}
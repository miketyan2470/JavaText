/*
 * File : BouncingBall.java
 * ------------------------
 * Program creates a ball that 'bounces' off the edges of graphics window.
 * -Ball starts at center of window.
 * -Movements dictated by dx and dy.
 * -Size of 'ball' and speed are constants BALL_SIZE and SPEED respectively.
 */

package javaCh4;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {
	
	private static final int BALL_SIZE = 50; // Size of ball in number if pixels.
	private static final int SPEED = 3; // Milliseconds ball will pause between each movement.
	
	public void run() {
		//Sets the 'startx' and 'starty' as the center winder minus the offset.
		double startx = ((getWidth() / 2) - (BALL_SIZE / 2));
		double starty = ((getHeight() / 2) - (BALL_SIZE / 2));
		//Generates 'ball' that is filled BLACK.
		GOval ball = new GOval (startx, starty, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		ball.setFillColor(Color.BLACK);
		add (ball);
		//Sets values for 'dx' and 'dy' to be used for movement.
		int dx = 1;
		int dy = 1;
		//Infinity loop that will 'bounce' the ball until program is terminated.
		while (true) {
			ball.move(dx, dy);
			pause(SPEED);
			//Gets values for current x-axis and y-axis coordinates.
			double x = ball.getX();
			double y = ball.getY();
			//Modifies direction of movement depending on which boundary is met.
			if ((x >= (getWidth() - BALL_SIZE)) || (x == 0)) {
				dx = -dx;
			}
			if ((y >= (getHeight() - BALL_SIZE)) || (y == 0)) {
				dy = -dy;
			}
		}
	}
}
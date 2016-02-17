package javaCh9;

import java.awt.*;
import acm.graphics.*;
import acm.program.*;
/**
 * File : PacMan.java
 * ------------------
 * Graphics program simulates pacman moving across the screen from left to
 * right while mouth appears to open and close.
 * -Pacman is reset off screen to the left once it has cleared the right edge of 
 * 	window.
 */
public class PacMan extends GraphicsProgram {
	// Private constants.
	private static final int PACMAN_SIZE = 50;
	private static final int SPEED = 100;
	private static final int BASELINE = 10;
	// Instance Variables.
	public GArc pacman;
	public int start = -45;
	public int sweep = -270;
	int x;
	int y;
	/**
	 * Creates pacman on canvas and starts 'animation' process.
	 */
	public void run() {
		setBackground(Color.BLACK);
		addPacman();
		while (true) {
			// Loops the 'closing' mouth animation.
			if (start < 0) {
				start += 15;
				sweep -= 30;
				movePacman();
			}
			// Loops the 'opening' mouth animation.
			if (start == 0) {
				while (start > -45) {	
					start -= 15;
					sweep += 30;
					movePacman();
					if (start == -45) break;
				}	
			}
			// Resets pacman off screen to the left once he has cleared the right edge.
			if (pacman.getX() > getWidth()) {
				pacman.move(-(getWidth() + PACMAN_SIZE), 0);
			}
		}
	}
	/**
	 * Moves pacman according to half of set size.
	 */
	private void movePacman() {
		pacman.move(PACMAN_SIZE / 2, 0);
		pacman.setStartAngle(start);
		pacman.setSweepAngle(sweep);
		pause(SPEED);
	}
	/**
	 * Generates GArc pacman and places it on canvas.
	 */
	private void addPacman() {
		x = BASELINE;
		y = getHeight() - PACMAN_SIZE - BASELINE;
		pacman = new GArc(x, y,PACMAN_SIZE, PACMAN_SIZE, start, sweep);
		pacman.setFilled(true);
		pacman.setFillColor(Color.YELLOW);
		add(pacman);
	}
}
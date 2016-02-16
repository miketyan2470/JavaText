package javaCh10;

import acm.program.*;
import java.awt.event.*;
/**
 * Graphics Program that creates a five-point star centered where user clicks in graphics window.
 */
public class DrawStarMap extends GraphicsProgram {
	// Private constants
	private static final double STAR_SIZE = 20;
	// Initializes mouse listeners.
	public void init() {
		addMouseListeners();
	}
	//Called whenever user clicks mouse.
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
	}
}
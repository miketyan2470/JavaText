package javaCh10;

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
/**
 * File : DrawLines.java
 * ---------------------
 * Graphics program that allows users to draw lines on canvas with mouse clicks.
 */
public class DrawLines extends GraphicsProgram {
	// Initializes variable.
	private GLine line;
	// Initializes mouse listeners in program.
	public void init() {
		addMouseListeners();
	}
	// Called on when mouse is pressed to create a new line.
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	// Called on when mouse dragged to reset end point of line. 
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
}
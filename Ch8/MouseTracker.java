package javaCh8;

import acm.graphics.*; 
import acm.program.*;
import java.awt.event.*;

public class MouseTracker extends GraphicsProgram {
	
	private GLabel label;
	
	public void run() {
		label = new GLabel("");
		label.setFont("SansSerif-36");
		label.setLocation(50, 50);
		add(label, 50, 50);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")");
	}
}
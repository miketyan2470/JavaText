package javaCh10;

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;
/**
 * File : DragObjects.java
 * -----------------------
 * Graphics program that allows user to move objects by dragging with mouse clicks.
 */
public class DragObjects extends GraphicsProgram {
	// Private instance variables.
	private GObject gobj;
	private GPoint last;
	/*
	 * Initializes program with GRect and GOval added onto canvas.
	 * Initializes listeners for mouse events. (non-Javadoc)
	 * @see acm.program.GraphicsProgram#init()
	 */
	public void init() {
		GRect rect = new GRect(100, 100, 150, 100);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(300, 115, 100, 70);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
		addMouseListeners();
	}
	/*
	 * Called on mouse press to record the current coordinates. (non-Javadoc)
	 * @see acm.program.Program#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	/*
	 * Called on mouse drag to move object. (non-Javadoc)
	 * @see acm.program.Program#mouseDragged(java.awt.event.MouseEvent)
	 */
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	/*
	 * Called on mouse click to move object to front of canvas. (non-Javadoc)
	 * @see acm.program.Program#mouseClicked(java.awt.event.MouseEvent)
	 */
	public void mouseClicked(MouseEvent e) {
		if (gobj != null) gobj.sendToFront();
	}
}
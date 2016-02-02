/*
 * File:Exercise6.java
 * -------------------
 * Creates a GraphicProgram that draws a archery
 * target that alternates in red and white colored
 * circles.
 */

package javaCh2;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class Target extends GraphicsProgram {
	
	public void run() {
		
		GOval circle3 = new GOval(50,50,550,550);
		circle3.setColor(Color.BLACK);
		circle3.setFilled(true);
		circle3.setFillColor(Color.RED);
		add(circle3);
		
		GOval circle2 = new GOval(150,150,350,350);
		circle2.setFilled(true);
		circle2.setFillColor(Color.WHITE);
		add(circle2);
		
		GOval circle1 = new GOval(250,250,150,150);
		circle1.setFilled(true);
		circle1.setFillColor(Color.RED);
		add(circle1);
	}

}